
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.bigdata.ws.client;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2017-12-13T11:53:34.227+08:00
 * Generated source version: 3.1.12
 * 
 */

@javax.jws.WebService(
                      serviceName = "CustomerTrendsWebServiceService",
                      portName = "CustomerTrendsWebServicePort",
                      targetNamespace = "http://ws.cxf.bigdata.com/",
                      wsdlLocation = "http://localhost:8580/cxf-webservice/cxf-ws/ctWS?wsdl",
                      endpointInterface = "com.bigdata.ws.client.CustomerTrendsWebService")
                      
public class CustomerTrendsWebServicePortImpl implements CustomerTrendsWebService {

    private static final Logger LOG = Logger.getLogger(CustomerTrendsWebServicePortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.bigdata.ws.client.CustomerTrendsWebService#showCustomertrends()*
     */
    public java.lang.Object showCustomertrends() { 
        LOG.info("Executing operation showCustomertrends");
        try {
            java.lang.Object _return = new java.lang.Object();
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}