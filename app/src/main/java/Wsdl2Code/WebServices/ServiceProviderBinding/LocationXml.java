package Wsdl2Code.WebServices.ServiceProviderBinding;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 10/22/2015 8:44:42 PM
//    Please dont change this code, regeneration will override your changes
//</wsdl2code-generated>
//
//------------------------------------------------------------------------------
//
//This source code was auto-generated by Wsdl2Code  Version
//
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class LocationXml implements KvmSerializable {
    
    public String address;
    public String id;
    public float latitude;
    public boolean latitudeSpecified;
    public float longitude;
    public boolean longitudeSpecified;
    public String region;
    
    public LocationXml(){}
    
    public LocationXml(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Address"))
        {
            Object obj = soapObject.getProperty("Address");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                address = j.toString();
            }else if (obj!= null && obj instanceof String){
                address = (String) obj;
            }
        }
        if (soapObject.hasProperty("Id"))
        {
            Object obj = soapObject.getProperty("Id");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                id = j.toString();
            }else if (obj!= null && obj instanceof String){
                id = (String) obj;
            }
        }
        if (soapObject.hasProperty("Latitude"))
        {
            Object obj = soapObject.getProperty("Latitude");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                latitude = Float.parseFloat(j.toString());
            }else if (obj!= null && obj instanceof Number){
                latitude = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("LatitudeSpecified"))
        {
            Object obj = soapObject.getProperty("LatitudeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                latitudeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                latitudeSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Longitude"))
        {
            Object obj = soapObject.getProperty("Longitude");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                longitude = Float.parseFloat(j.toString());
            }else if (obj!= null && obj instanceof Number){
                longitude = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("LongitudeSpecified"))
        {
            Object obj = soapObject.getProperty("LongitudeSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                longitudeSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                longitudeSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Region"))
        {
            Object obj = soapObject.getProperty("Region");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                region = j.toString();
            }else if (obj!= null && obj instanceof String){
                region = (String) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return address;
            case 1:
                return id;
            case 2:
                return latitude;
            case 3:
                return latitudeSpecified;
            case 4:
                return longitude;
            case 5:
                return longitudeSpecified;
            case 6:
                return region;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 7;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Address";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 2:
                info.type = Float.class;
                info.name = "Latitude";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "LatitudeSpecified";
                break;
            case 4:
                info.type = Float.class;
                info.name = "Longitude";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "LongitudeSpecified";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Region";
                break;
        }
    }
    
    @Override
    public String getInnerText() {
        return null;
    }
    
    
    @Override
    public void setInnerText(String s) {
    }
    
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}