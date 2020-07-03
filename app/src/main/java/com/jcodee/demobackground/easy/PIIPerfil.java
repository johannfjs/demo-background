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

public class PIIPerfil extends PIIEntidadBase implements KvmSerializable
{
    
    public String Codigo;
    
    public String Nombre;
        

    
    
    @Override
    public void loadFromSoap(Object paramObj, PIIExtendedSoapSerializationEnvelope __envelope)
    {
        if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;
        super.loadFromSoap(paramObj, __envelope);



    }

    @Override
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
                        this.Codigo = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.Codigo = (String)obj;
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
        return super.loadProperty(info,soapObject,__envelope);
    }
    
    

    @Override
    public Object getProperty(int propertyIndex) {
        int count = super.getPropertyCount();
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==count+0)
        {
            return this.Codigo!=null?this.Codigo:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.Nombre!=null?this.Nombre:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+2;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Codigo";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.Seguridad";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Nombre";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.Seguridad";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }

    @Override
    public void setProperty(int arg0, Object arg1)
    {
    }

    
}