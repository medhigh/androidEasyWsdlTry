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
import Wsdl2Code.WebServices.ServiceProviderBinding.LocationXml;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class ServiceProviderXml implements KvmSerializable {
    
    public int appointmentsForPatient;
    public boolean appointmentsForPatientSpecified;
    public String contacts;
    public String id;
    public String info;
    public LocationXml locations;
    public String name;
    public double rank;
    public boolean rankSpecified;
    public String region;
    public String speciality;
    
    public ServiceProviderXml(){}
    
    public ServiceProviderXml(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("AppointmentsForPatient"))
        {
            Object obj = soapObject.getProperty("AppointmentsForPatient");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                appointmentsForPatient = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                appointmentsForPatient = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("AppointmentsForPatientSpecified"))
        {
            Object obj = soapObject.getProperty("AppointmentsForPatientSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                appointmentsForPatientSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                appointmentsForPatientSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("Contacts"))
        {
            Object obj = soapObject.getProperty("Contacts");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                contacts = j.toString();
            }else if (obj!= null && obj instanceof String){
                contacts = (String) obj;
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
        if (soapObject.hasProperty("Info"))
        {
            Object obj = soapObject.getProperty("Info");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                info = j.toString();
            }else if (obj!= null && obj instanceof String){
                info = (String) obj;
            }
        }
        if (soapObject.hasProperty("Locations"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Locations");
            locations =  new LocationXml (j);
            
        }
        if (soapObject.hasProperty("Name"))
        {
            Object obj = soapObject.getProperty("Name");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                name = j.toString();
            }else if (obj!= null && obj instanceof String){
                name = (String) obj;
            }
        }
        if (soapObject.hasProperty("Rank"))
        {
            Object obj = soapObject.getProperty("Rank");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                rank = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                rank = (Double) obj;
            }
        }
        if (soapObject.hasProperty("RankSpecified"))
        {
            Object obj = soapObject.getProperty("RankSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                rankSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                rankSpecified = (Boolean) obj;
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
        if (soapObject.hasProperty("Speciality"))
        {
            Object obj = soapObject.getProperty("Speciality");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                speciality = j.toString();
            }else if (obj!= null && obj instanceof String){
                speciality = (String) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return appointmentsForPatient;
            case 1:
                return appointmentsForPatientSpecified;
            case 2:
                return contacts;
            case 3:
                return id;
            case 4:
                return info;
            case 5:
                return locations;
            case 6:
                return name;
            case 7:
                return rank;
            case 8:
                return rankSpecified;
            case 9:
                return region;
            case 10:
                return speciality;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 11;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "AppointmentsForPatient";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "AppointmentsForPatientSpecified";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Contacts";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Info";
                break;
            case 5:
                info.type = LocationXml.class;
                info.name = "Locations";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Name";
                break;
            case 7:
                info.type = Double.class;
                info.name = "Rank";
                break;
            case 8:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "RankSpecified";
                break;
            case 9:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Region";
                break;
            case 10:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Speciality";
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