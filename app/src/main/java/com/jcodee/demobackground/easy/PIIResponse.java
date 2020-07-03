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

public class PIIResponse extends AttributeContainer implements KvmSerializable
{
    
    public Integer Codigo;
    
    public String ExtraData;
    
    public Long Id;
    
    public String Mensaje;
    
    public Boolean Resultado;
        
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
        if (info.name.equals("Codigo"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.Codigo = Integer.parseInt(j.toString());
                    }
                }
                else if (obj instanceof Integer){
                    this.Codigo = (Integer)obj;
                }
            }
            return true;
        }
        if (info.name.equals("ExtraData"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.ExtraData = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.ExtraData = (String)obj;
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
        if (info.name.equals("Mensaje"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.Mensaje = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.Mensaje = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("Resultado"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.Resultado = new Boolean(j.toString());
                    }
                }
                else if (obj instanceof Boolean){
                    this.Resultado = (Boolean)obj;
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
            return this.Codigo!=null?this.Codigo:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.ExtraData!=null?this.ExtraData:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.Id!=null?this.Id:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.Mensaje!=null?this.Mensaje:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.Resultado!=null?this.Resultado:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 5;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "Codigo";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.Global";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ExtraData";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.Global";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.LONG_CLASS;
            info.name = "Id";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.Global";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Mensaje";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.Global";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "Resultado";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.Global";
        }
    }

    @Override
    public void setProperty(int arg0, Object arg1)
    {
    }

    
}