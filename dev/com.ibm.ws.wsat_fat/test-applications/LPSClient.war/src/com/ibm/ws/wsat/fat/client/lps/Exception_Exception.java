//
// Generated By:JAX-WS RI IBM 2.2.1-07/09/2014 01:52 PM(foreman)- (JAXB RI IBM 2.2.3-07/07/2014 12:54 PM(foreman)-)
//


package com.ibm.ws.wsat.fat.client.lps;

import javax.xml.ws.WebFault;

@WebFault(name = "Exception", targetNamespace = "http://server.fat.wsat.ws.ibm.com/")
public class Exception_Exception
    extends java.lang.Exception
{
	private static final long serialVersionUID = 4180513203254663360L;
	/**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.ibm.ws.wsat.fat.client.lps.Exception faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public Exception_Exception(String message, com.ibm.ws.wsat.fat.client.lps.Exception faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public Exception_Exception(String message, com.ibm.ws.wsat.fat.client.lps.Exception faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.ibm.ws.wsat.fat.client.lps.Exception
     */
    public com.ibm.ws.wsat.fat.client.lps.Exception getFaultInfo() {
        return faultInfo;
    }

}
