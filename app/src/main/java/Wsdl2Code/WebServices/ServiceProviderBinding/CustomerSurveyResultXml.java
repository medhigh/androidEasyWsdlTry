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
import Wsdl2Code.WebServices.ServiceProviderBinding.CustomerSurveyQuestionXml;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class CustomerSurveyResultXml implements KvmSerializable {
    
    public int answer;
    public boolean answerSpecified;
    public CustomerSurveyQuestionXml customerSurveyQuestion;
    public String id;
    
    public CustomerSurveyResultXml(){}
    
    public CustomerSurveyResultXml(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("Answer"))
        {
            Object obj = soapObject.getProperty("Answer");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                answer = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                answer = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("AnswerSpecified"))
        {
            Object obj = soapObject.getProperty("AnswerSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                answerSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                answerSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("CustomerSurveyQuestion"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("CustomerSurveyQuestion");
            customerSurveyQuestion =  new CustomerSurveyQuestionXml (j);
            
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
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return answer;
            case 1:
                return answerSpecified;
            case 2:
                return customerSurveyQuestion;
            case 3:
                return id;
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
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "Answer";
                break;
            case 1:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "AnswerSpecified";
                break;
            case 2:
                info.type = CustomerSurveyQuestionXml.class;
                info.name = "CustomerSurveyQuestion";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Id";
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
