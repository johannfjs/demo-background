    package com.jcodee.demobackground.easy;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.6.0.0
//
// Created by Quasar Development 
//
//---------------------------------------------------




import org.ksoap2.serialization.*;
import java.util.Vector;
import java.util.Hashtable;


public class PIIArrayOfTamizajeAnemia extends Vector< PIITamizajeAnemia> implements KvmSerializable
{
    private transient Object __source;

    public void loadFromSoap(Object inObj, PIIExtendedSoapSerializationEnvelope __envelope)
    {
        if (inObj == null)
            return;
        __source=inObj;
        SoapObject soapObject=(SoapObject)inObj;
        int size = soapObject.getPropertyCount();
        for (int i0=0;i0< size;i0++)
        {
            Object obj = soapObject.getProperty(i0);
            if (obj!=null && obj instanceof AttributeContainer)
            {
                AttributeContainer j =(AttributeContainer) soapObject.getProperty(i0);
                PIITamizajeAnemia j1= (PIITamizajeAnemia)__envelope.get(j,PIITamizajeAnemia.class,false);
                add(j1);
            }
        }
    }

    public Object getSourceObject()
    {
        return __source;
    }
    
    @Override
    public Object getProperty(int arg0) {
        return this.get(arg0)!=null?this.get(arg0):SoapPrimitive.NullNilElement;
    }
    
    @Override
    public int getPropertyCount() {
        return this.size();
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        info.name = "TamizajeAnemia";
        info.type = PIITamizajeAnemia.class;
    	info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.FichasMonitoreo";
    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }

    
}