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
import Wsdl2Code.WebServices.ServiceProviderBinding.VectorHospitalXml;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class RequestResultOfArrayOfHospitalXmlkZUuIBUF implements KvmSerializable {
    
    public String errorMessage;
    public VectorHospitalXml result;
    public int resultStatus;
    public boolean resultStatusSpecified;
    
    public RequestResultOfArrayOfHospitalXmlkZUuIBUF(){}
    
    public RequestResultOfArrayOfHospitalXmlkZUuIBUF(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("ErrorMessage"))
        {
            Object obj = soapObject.getProperty("ErrorMessage");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                errorMessage = j.toString();
            }else if (obj!= null && obj instanceof String){
                errorMessage = (String) obj;
            }
        }
        if (soapObject.hasProperty("Result"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Result");
            result = new VectorHospitalXml(j);
        }
        if (soapObject.hasProperty("ResultStatus"))
        {
            Object obj = soapObject.getProperty("ResultStatus");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                resultStatus = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                resultStatus = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("ResultStatusSpecified"))
        {
            Object obj = soapObject.getProperty("ResultStatusSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                resultStatusSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                resultStatusSpecified = (Boolean) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return errorMessage;
            case 1:
                return result;
            case 2:
                return resultStatus;
            case 3:
                return resultStatusSpecified;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 4;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "ErrorMessage";
                break;
            case 1:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Result";
                break;
            case 2:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "ResultStatus";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "ResultStatusSpecified";
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
