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

public class PIIParametro extends AttributeContainer implements KvmSerializable
{
    
    public Long Id;
    
    public String Nombre;
    
    public Double ValorNumerico;
    
    public String ValorTexto;
        
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
        if (info.name.equals("Nombre"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.Nombre = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.Nombre = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("ValorNumerico"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.ValorNumerico = new Double(j.toString());
                    }
                }
                else if (obj instanceof Double){
                    this.ValorNumerico = (Double)obj;
                }
            }
            return true;
        }
        if (info.name.equals("ValorTexto"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.ValorTexto = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.ValorTexto = (String)obj;
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
            return this.Id!=null?this.Id:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.Nombre!=null?this.Nombre:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.ValorNumerico!=null?this.ValorNumerico:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.ValorTexto!=null?this.ValorTexto:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 4;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.LONG_CLASS;
            info.name = "Id";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.FichasMonitoreo";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Nombre";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.FichasMonitoreo";
        }
        if(propertyIndex==2)
        {
            info.type = Double.class;
            info.name = "ValorNumerico";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.FichasMonitoreo";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ValorTexto";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.FichasMonitoreo";
        }
    }

    @Override
    public void setProperty(int arg0, Object arg1)
    {
    }

    
}
