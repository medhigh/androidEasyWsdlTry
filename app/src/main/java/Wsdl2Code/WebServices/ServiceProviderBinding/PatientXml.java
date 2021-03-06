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

public class PatientXml implements KvmSerializable {
    
    public String email;
    public String id;
    public String insuranceNumber;
    public String name;
    public String phoneNumber;
    public double rank;
    public boolean rankSpecified;
    public String taxNumbers;
    
    public PatientXml(){}
    
    public PatientXml(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Email"))
        {
            Object obj = soapObject.getProperty("Email");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                email = j.toString();
            }else if (obj!= null && obj instanceof String){
                email = (String) obj;
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
        if (soapObject.hasProperty("InsuranceNumber"))
        {
            Object obj = soapObject.getProperty("InsuranceNumber");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                insuranceNumber = j.toString();
            }else if (obj!= null && obj instanceof String){
                insuranceNumber = (String) obj;
            }
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
        if (soapObject.hasProperty("PhoneNumber"))
        {
            Object obj = soapObject.getProperty("PhoneNumber");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                phoneNumber = j.toString();
            }else if (obj!= null && obj instanceof String){
                phoneNumber = (String) obj;
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
        if (soapObject.hasProperty("TaxNumbers"))
        {
            Object obj = soapObject.getProperty("TaxNumbers");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                taxNumbers = j.toString();
            }else if (obj!= null && obj instanceof String){
                taxNumbers = (String) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return email;
            case 1:
                return id;
            case 2:
                return insuranceNumber;
            case 3:
                return name;
            case 4:
                return phoneNumber;
            case 5:
                return rank;
            case 6:
                return rankSpecified;
            case 7:
                return taxNumbers;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 8;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Email";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "InsuranceNumber";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Name";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "PhoneNumber";
                break;
            case 5:
                info.type = Double.class;
                info.name = "Rank";
                break;
            case 6:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "RankSpecified";
                break;
            case 7:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "TaxNumbers";
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
