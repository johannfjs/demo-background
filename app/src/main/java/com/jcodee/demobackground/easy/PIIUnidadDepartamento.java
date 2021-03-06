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

public class PIIUnidadDepartamento extends AttributeContainer implements KvmSerializable
{
    
    public String CodigoDepartamento;
    
    public Integer Estado;
    
    public Long Id;
    
    public Long ServicioUnidadId;
        
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
        if (info.name.equals("CodigoDepartamento"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.CodigoDepartamento = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.CodigoDepartamento = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("Estado"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.Estado = Integer.parseInt(j.toString());
                    }
                }
                else if (obj instanceof Integer){
                    this.Estado = (Integer)obj;
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
        if (info.name.equals("ServicioUnidadId"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.ServicioUnidadId = new Long(j.toString());
                    }
                }
                else if (obj instanceof Long){
                    this.ServicioUnidadId = (Long)obj;
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
            return this.CodigoDepartamento!=null?this.CodigoDepartamento:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.Estado!=null?this.Estado:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.Id!=null?this.Id:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.ServicioUnidadId!=null?this.ServicioUnidadId:SoapPrimitive.NullSkip;
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
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "CodigoDepartamento";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.Global.Maestros";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "Estado";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.Global.Maestros";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.LONG_CLASS;
            info.name = "Id";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.Global.Maestros";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.LONG_CLASS;
            info.name = "ServicioUnidadId";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.Global.Maestros";
        }
    }

    @Override
    public void setProperty(int arg0, Object arg1)
    {
    }

    
}
