package com.jcodee.demobackground;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.SoapFault;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpResponseException;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private static final String SOAP_ACTION = "http://tempuri.org/IMaestros/ImportarGeoReferencia";
    private static final String METHOD_NAME = "ImportarGeoReferencia";
    private static final String NAMESPACE = "http://tempuri.org/IMaestros/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startService(new Intent(this, BackgroundService.class));

        //myAsyncTask myRequest = new myAsyncTask();
        //myRequest.execute();

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);

        } else {
            //  Toast.makeText(mContext,"You need have granted permission",Toast.LENGTH_SHORT).show();
            GPSTracker gps = new GPSTracker(this);

            // Check if GPS enabled
            if (gps.canGetLocation()) {

                double lati = gps.getLatitude();
                double longi = gps.getLongitude();
                Log.d("DemoBackground", "latitud: " + lati + " longitud: " + longi);

                // \n is for new line
                //  Toast.makeText(getApplicationContext(), "Your Location is - \nLat: " + lati + "\nLong: " + longi, Toast.LENGTH_LONG).show();
            } else {
                // Can't get location.
                // GPS or network is not enabled.
                // Ask user to enable GPS/network in settings.
                //   gps.showSettingsAlert();
            }
        }

    }

    class myAsyncTask extends AsyncTask<Void, Void, Void> {


        @Override
        protected Void doInBackground(Void... params) {

            String URL = "http://209.45.31.228/MonitoreoService4/Maestros.svc?wsdl";

            //for linear parameter
            SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
            request.addProperty("jsonData", "{\"UsuarioId\": 151,\"UsuarioCrea\": \"LPAZ\",\"FechaCrea\":\"2012-04-21 18:25:43\",\"Longitud\":-77.0282400,\"Latitud\":-12.0431800,\"DesCaptura\": \"Hola Mundo Cruel\",\"FecHoraPosicion\":\"2012-04-21 18:25:43\"}"); // adding method property here serially

            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.implicitTypes = true;
            envelope.setOutputSoapObject(request);
            envelope.dotNet = true;

            HttpTransportSE httpTransport = new HttpTransportSE(URL);
            httpTransport.debug = true;

            try {
                httpTransport.call(SOAP_ACTION, envelope);
            } catch (HttpResponseException e) {
                // TODO Auto-generated catch block
                Log.e("HTTPLOG", e.getMessage());
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                Log.e("IOLOG", e.getMessage());
                e.printStackTrace();
            } catch (XmlPullParserException e) {
                // TODO Auto-generated catch block
                Log.e("XMLLOG", e.getMessage());
                e.printStackTrace();
            } //send request

            Object result = null;
            try {
                result = (Object) envelope.getResponse();
                Log.i("RESPONSE", String.valueOf(result)); // see output in the console
            } catch (SoapFault e) {
                // TODO Auto-generated catch block
                Log.e("SOAPLOG", e.getMessage());
                e.printStackTrace();
            }
            return null;
        }
    }

}
