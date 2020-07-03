package com.jcodee.demobackground.easy;
//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.6.0.0
//
// Created by Quasar Development 
//
//---------------------------------------------------



import java.util.Hashtable;
import org.ksoap2.serialization.*;

public class PIIOpcion extends AttributeContainer implements KvmSerializable
{
    
    public String Acronimo;
    
    public String Descripcion;
    
    public Long Id;
    
    public Long Orden;
    
    public Double Peso;
    
    public Long PreguntaId;
        
    private transient Object __source;
    

    
    
    public void loadFromSoap(Object paramObj, PIIExtendedSoapSerializationEnvelope __envelope)
    {
        if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;
        __source=inObj; 
        
        if(inObj instanceof SoapObject)
        {
            SoapObject soapObject=(SoapObject)inObj;
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0< size;i0++)
            {
                PropertyInfo info=soapObject.getPropertyInfo(i0);
                if(!loadProperty(info,soapObject,__envelope))
                {
                }
            } 
        }



    }

    
    protected boolean loadProperty(PropertyInfo info,SoapObject soapObject,PIIExtendedSoapSerializationEnvelope __envelope)
    {
        Object obj = info.getValue();
        if (info.name.equals("Acronimo"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.Acronimo = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.Acronimo = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("Descripcion"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.Descripcion = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.Descripcion = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("Id"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.Id = new Long(j.toString());
                    }
                }
                else if (obj instanceof Long){
                    this.Id = (Long)obj;
                }
            }
            return true;
        }
        if (info.name.equals("Orden"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.Orden = new Long(j.toString());
                    }
                }
                else if (obj instanceof Long){
                    this.Orden = (Long)obj;
                }
            }
            return true;
        }
        if (info.name.equals("Peso"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.Peso = new Double(j.toString());
                    }
                }
                else if (obj instanceof Double){
                    this.Peso = (Double)obj;
                }
            }
            return true;
        }
        if (info.name.equals("PreguntaId"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.PreguntaId = new Long(j.toString());
                    }
                }
                else if (obj instanceof Long){
                    this.PreguntaId = (Long)obj;
                }
            }
            return true;
        }
        return false;
    }
    
    public Object getOriginalXmlSource()
    {
        return __source;
    }    
    

    @Override
    public Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return this.Acronimo!=null?this.Acronimo:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.Descripcion!=null?this.Descripcion:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.Id!=null?this.Id:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.Orden!=null?this.Orden:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.Peso!=null?this.Peso:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.PreguntaId!=null?this.PreguntaId:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 6;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Acronimo";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.FichasMonitoreo";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Descripcion";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.FichasMonitoreo";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.LONG_CLASS;
            info.name = "Id";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.FichasMonitoreo";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.LONG_CLASS;
            info.name = "Orden";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.FichasMonitoreo";
        }
        if(propertyIndex==4)
        {
            info.type = Double.class;
            info.name = "Peso";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.FichasMonitoreo";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.LONG_CLASS;
            info.name = "PreguntaId";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.FichasMonitoreo";
        }
    }

    @Override
    public void setProperty(int arg0, Object arg1)
    {
    }

    
}
