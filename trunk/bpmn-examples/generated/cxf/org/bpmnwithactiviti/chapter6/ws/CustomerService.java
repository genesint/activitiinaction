package org.bpmnwithactiviti.chapter6.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.3.3
 * 2011-04-17T09:06:45.557+02:00
 * Generated source version: 2.3.3
 * 
 */
 
@WebService(targetNamespace = "http://ws.chapter6.bpmnwithactiviti.org/", name = "CustomerService")
@XmlSeeAlso({ObjectFactory.class})
public interface CustomerService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "findCustomer", targetNamespace = "http://ws.chapter6.bpmnwithactiviti.org/", className = "org.bpmnwithactiviti.chapter6.ws.FindCustomer")
    @WebMethod
    @ResponseWrapper(localName = "findCustomerResponse", targetNamespace = "http://ws.chapter6.bpmnwithactiviti.org/", className = "org.bpmnwithactiviti.chapter6.ws.FindCustomerResponse")
    public org.bpmnwithactiviti.chapter6.ws.Customer findCustomer(
        @WebParam(name = "customerName", targetNamespace = "")
        java.lang.String customerName,
        @WebParam(name = "contactperson", targetNamespace = "")
        java.lang.String contactperson
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "findCustomerById", targetNamespace = "http://ws.chapter6.bpmnwithactiviti.org/", className = "org.bpmnwithactiviti.chapter6.ws.FindCustomerById")
    @WebMethod
    @ResponseWrapper(localName = "findCustomerByIdResponse", targetNamespace = "http://ws.chapter6.bpmnwithactiviti.org/", className = "org.bpmnwithactiviti.chapter6.ws.FindCustomerByIdResponse")
    public org.bpmnwithactiviti.chapter6.ws.Customer findCustomerById(
        @WebParam(name = "customerId", targetNamespace = "")
        long customerId
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "storeSalesOpportunity", targetNamespace = "http://ws.chapter6.bpmnwithactiviti.org/", className = "org.bpmnwithactiviti.chapter6.ws.StoreSalesOpportunity")
    @WebMethod
    @ResponseWrapper(localName = "storeSalesOpportunityResponse", targetNamespace = "http://ws.chapter6.bpmnwithactiviti.org/", className = "org.bpmnwithactiviti.chapter6.ws.StoreSalesOpportunityResponse")
    public org.bpmnwithactiviti.chapter6.ws.Customer storeSalesOpportunity(
        @WebParam(name = "product", targetNamespace = "")
        java.lang.String product,
        @WebParam(name = "expectedQuantity", targetNamespace = "")
        int expectedQuantity,
        @WebParam(name = "description", targetNamespace = "")
        java.lang.String description,
        @WebParam(name = "customerId", targetNamespace = "")
        long customerId
    );
}
