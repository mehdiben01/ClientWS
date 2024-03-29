
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://example.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://example.org/", className = "proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://example.org/", className = "proxy.GetCompteResponse")
    @Action(input = "http://example.org/BanqueService/getCompteRequest", output = "http://example.org/BanqueService/getCompteResponse")
    public Compte getCompte();

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getComptes", targetNamespace = "http://example.org/", className = "proxy.GetComptes")
    @ResponseWrapper(localName = "getComptesResponse", targetNamespace = "http://example.org/", className = "proxy.GetComptesResponse")
    @Action(input = "http://example.org/BanqueService/getComptesRequest", output = "http://example.org/BanqueService/getComptesResponse")
    public List<Compte> getComptes();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "test", targetNamespace = "http://example.org/", className = "proxy.Test")
    @ResponseWrapper(localName = "testResponse", targetNamespace = "http://example.org/", className = "proxy.TestResponse")
    @Action(input = "http://example.org/BanqueService/testRequest", output = "http://example.org/BanqueService/testResponse")
    public String test();

    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod(operationName = "ConversionEuroToDh")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ConversionEuroToDh", targetNamespace = "http://example.org/", className = "proxy.ConversionEuroToDh")
    @ResponseWrapper(localName = "ConversionEuroToDhResponse", targetNamespace = "http://example.org/", className = "proxy.ConversionEuroToDhResponse")
    @Action(input = "http://example.org/BanqueService/ConversionEuroToDhRequest", output = "http://example.org/BanqueService/ConversionEuroToDhResponse")
    public double conversionEuroToDh(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

}
