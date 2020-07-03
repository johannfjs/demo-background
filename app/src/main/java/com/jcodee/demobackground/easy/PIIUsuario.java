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

public class PIIUsuario extends PIIPersona implements KvmSerializable
{
    
    public Long ActorId;
    
    public Long CargoId;
    
    public java.util.Date FechaUltimoAccesos;
    
    public PIIArrayOfMenu Menus;
    
    public String NombreCargo;
    
    public String NombreUnidadTerritorial;
    
    public String NombreUsuario;
    
    public Long PersonaId;
    
    public PIIResponse ResultadoRequest;
    
    public PIIArrayOfPerfil Roles;
    
    public Long ServicioId;
    
    public PIIArrayOflong ServicioUnidadAcceso;
    
    public Long ServicioUnidadId;
    
    public PIIArrayOflong UnidadTerritorialAcceso;
        

    
    
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
        if (info.name.equals("ActorId"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.ActorId = new Long(j.toString());
                    }
                }
                else if (obj instanceof Long){
                    this.ActorId = (Long)obj;
                }
            }
            return true;
        }
        if (info.name.equals("CargoId"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.CargoId = new Long(j.toString());
                    }
                }
                else if (obj instanceof Long){
                    this.CargoId = (Long)obj;
                }
            }
            return true;
        }
        if (info.name.equals("FechaUltimoAccesos"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.FechaUltimoAccesos = PIIHelper.ConvertFromWebService(j.toString());
                    }
                }
                else if (obj instanceof java.util.Date){
                    this.FechaUltimoAccesos = (java.util.Date)obj;
                }
            }
            return true;
        }
        if (info.name.equals("Menus"))
        {
            if(obj!=null)
            {
                Object j = obj;
                this.Menus = (PIIArrayOfMenu)__envelope.get(j,PIIArrayOfMenu.class,false);
            }
            return true;
        }
        if (info.name.equals("NombreCargo"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.NombreCargo = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.NombreCargo = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("NombreUnidadTerritorial"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.NombreUnidadTerritorial = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.NombreUnidadTerritorial = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("NombreUsuario"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.NombreUsuario = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.NombreUsuario = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("PersonaId"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.PersonaId = new Long(j.toString());
                    }
                }
                else if (obj instanceof Long){
                    this.PersonaId = (Long)obj;
                }
            }
            return true;
        }
        if (info.name.equals("ResultadoRequest"))
        {
            if(obj!=null)
            {
                Object j = obj;
                this.ResultadoRequest = (PIIResponse)__envelope.get(j,PIIResponse.class,false);
            }
            return true;
        }
        if (info.name.equals("Roles"))
        {
            if(obj!=null)
            {
                Object j = obj;
                this.Roles = (PIIArrayOfPerfil)__envelope.get(j,PIIArrayOfPerfil.class,false);
            }
            return true;
        }
        if (info.name.equals("ServicioId"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.ServicioId = new Long(j.toString());
                    }
                }
                else if (obj instanceof Long){
                    this.ServicioId = (Long)obj;
                }
            }
            return true;
        }
        if (info.name.equals("ServicioUnidadAcceso"))
        {
            if(obj!=null)
            {
                Object j = obj;
                this.ServicioUnidadAcceso = (PIIArrayOflong)__envelope.get(j,PIIArrayOflong.class,false);
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
        if (info.name.equals("UnidadTerritorialAcceso"))
        {
            if(obj!=null)
            {
                Object j = obj;
                this.UnidadTerritorialAcceso = (PIIArrayOflong)__envelope.get(j,PIIArrayOflong.class,false);
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
            return this.ActorId!=null?this.ActorId:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return this.CargoId!=null?this.CargoId:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return this.FechaUltimoAccesos!=null?PIIHelper.getDateTimeFormat().format(this.FechaUltimoAccesos):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return this.Menus!=null?this.Menus:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return this.NombreCargo!=null?this.NombreCargo:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return this.NombreUnidadTerritorial!=null?this.NombreUnidadTerritorial:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return this.NombreUsuario!=null?this.NombreUsuario:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return this.PersonaId!=null?this.PersonaId:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return this.ResultadoRequest!=null?this.ResultadoRequest:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return this.Roles!=null?this.Roles:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+10)
        {
            return this.ServicioId!=null?this.ServicioId:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+11)
        {
            return this.ServicioUnidadAcceso!=null?this.ServicioUnidadAcceso:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+12)
        {
            return this.ServicioUnidadId!=null?this.ServicioUnidadId:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+13)
        {
            return this.UnidadTerritorialAcceso!=null?this.UnidadTerritorialAcceso:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+14;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.LONG_CLASS;
            info.name = "ActorId";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.Seguridad";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.LONG_CLASS;
            info.name = "CargoId";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.Seguridad";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "FechaUltimoAccesos";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.Seguridad";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "Menus";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.Seguridad";
        }
        if(propertyIndex==count+4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "NombreCargo";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.Seguridad";
        }
        if(propertyIndex==count+5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "NombreUnidadTerritorial";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.Seguridad";
        }
        if(propertyIndex==count+6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "NombreUsuario";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.Seguridad";
        }
        if(propertyIndex==count+7)
        {
            info.type = PropertyInfo.LONG_CLASS;
            info.name = "PersonaId";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.Seguridad";
        }
        if(propertyIndex==count+8)
        {
            info.type = PIIResponse.class;
            info.name = "ResultadoRequest";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.Seguridad";
        }
        if(propertyIndex==count+9)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "Roles";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.Seguridad";
        }
        if(propertyIndex==count+10)
        {
            info.type = PropertyInfo.LONG_CLASS;
            info.name = "ServicioId";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.Seguridad";
        }
        if(propertyIndex==count+11)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "ServicioUnidadAcceso";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.Seguridad";
        }
        if(propertyIndex==count+12)
        {
            info.type = PropertyInfo.LONG_CLASS;
            info.name = "ServicioUnidadId";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.Seguridad";
        }
        if(propertyIndex==count+13)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "UnidadTerritorialAcceso";
            info.namespace= "http://schemas.datacontract.org/2004/07/CunaMas.Component.Entities.Seguridad";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }

    @Override
    public void setProperty(int arg0, Object arg1)
    {
    }

    
}
