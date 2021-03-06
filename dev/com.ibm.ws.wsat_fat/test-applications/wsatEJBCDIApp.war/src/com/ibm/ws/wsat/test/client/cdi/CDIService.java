//
// Generated By:JAX-WS RI IBM 2.2.1-07/09/2014 01:52 PM(foreman)- (JAXB RI IBM 2.2.3-07/07/2014 12:54 PM(foreman)-)
//


package com.ibm.ws.wsat.test.client.cdi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "CDIService", targetNamespace = "http://server.test.wsat.ws.ibm.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CDIService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws NamingException_Exception
     * @throws SQLException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "testCDISayHelloToOtherWithMandatory", targetNamespace = "http://server.test.wsat.ws.ibm.com/", className = "com.ibm.ws.wsat.test.client.cdi.TestCDISayHelloToOtherWithMandatory")
    @ResponseWrapper(localName = "testCDISayHelloToOtherWithMandatoryResponse", targetNamespace = "http://server.test.wsat.ws.ibm.com/", className = "com.ibm.ws.wsat.test.client.cdi.TestCDISayHelloToOtherWithMandatoryResponse")
    public String testCDISayHelloToOtherWithMandatory(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws NamingException_Exception, SQLException_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws NamingException_Exception
     * @throws SQLException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "testCDISayHelloToOtherWithNever", targetNamespace = "http://server.test.wsat.ws.ibm.com/", className = "com.ibm.ws.wsat.test.client.cdi.TestCDISayHelloToOtherWithNever")
    @ResponseWrapper(localName = "testCDISayHelloToOtherWithNeverResponse", targetNamespace = "http://server.test.wsat.ws.ibm.com/", className = "com.ibm.ws.wsat.test.client.cdi.TestCDISayHelloToOtherWithNeverResponse")
    public String testCDISayHelloToOtherWithNever(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws NamingException_Exception, SQLException_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws NamingException_Exception
     * @throws SQLException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "testCDISayHelloToOtherWithNotSupported", targetNamespace = "http://server.test.wsat.ws.ibm.com/", className = "com.ibm.ws.wsat.test.client.cdi.TestCDISayHelloToOtherWithNotSupported")
    @ResponseWrapper(localName = "testCDISayHelloToOtherWithNotSupportedResponse", targetNamespace = "http://server.test.wsat.ws.ibm.com/", className = "com.ibm.ws.wsat.test.client.cdi.TestCDISayHelloToOtherWithNotSupportedResponse")
    public String testCDISayHelloToOtherWithNotSupported(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws NamingException_Exception, SQLException_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws NamingException_Exception
     * @throws SQLException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "testCDISayHelloToOtherWithSupports", targetNamespace = "http://server.test.wsat.ws.ibm.com/", className = "com.ibm.ws.wsat.test.client.cdi.TestCDISayHelloToOtherWithSupports")
    @ResponseWrapper(localName = "testCDISayHelloToOtherWithSupportsResponse", targetNamespace = "http://server.test.wsat.ws.ibm.com/", className = "com.ibm.ws.wsat.test.client.cdi.TestCDISayHelloToOtherWithSupportsResponse")
    public String testCDISayHelloToOtherWithSupports(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws NamingException_Exception, SQLException_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws NamingException_Exception
     * @throws SQLException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "testCDISayHelloToOther", targetNamespace = "http://server.test.wsat.ws.ibm.com/", className = "com.ibm.ws.wsat.test.client.cdi.TestCDISayHelloToOther")
    @ResponseWrapper(localName = "testCDISayHelloToOtherResponse", targetNamespace = "http://server.test.wsat.ws.ibm.com/", className = "com.ibm.ws.wsat.test.client.cdi.TestCDISayHelloToOtherResponse")
    public String testCDISayHelloToOther(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws NamingException_Exception, SQLException_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws NamingException_Exception
     * @throws SQLException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "testCDISayHelloToOtherWithRequiresNew", targetNamespace = "http://server.test.wsat.ws.ibm.com/", className = "com.ibm.ws.wsat.test.client.cdi.TestCDISayHelloToOtherWithRequiresNew")
    @ResponseWrapper(localName = "testCDISayHelloToOtherWithRequiresNewResponse", targetNamespace = "http://server.test.wsat.ws.ibm.com/", className = "com.ibm.ws.wsat.test.client.cdi.TestCDISayHelloToOtherWithRequiresNewResponse")
    public String testCDISayHelloToOtherWithRequiresNew(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws NamingException_Exception, SQLException_Exception
    ;

}
