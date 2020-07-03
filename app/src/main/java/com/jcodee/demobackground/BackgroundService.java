package com.jcodee.demobackground;

import android.Manifest;
import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.util.Date;

public class BackgroundService extends Service {

    Handler handler = new Handler();

    public BackgroundService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        handler.postDelayed(new Runnable() {
            public void run() {
                getLocation();
                /*
                 * code will run every 15 minutes
                 */
                Log.d("DemoBackground", "Mensaje" + new Date().getTime());
                handler.postDelayed(this, /*20 * 6*/30 * 1000); //now is every 15 minutes
            }
        }, 0);
        return START_STICKY;
    }

    private void getLocation() {

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
