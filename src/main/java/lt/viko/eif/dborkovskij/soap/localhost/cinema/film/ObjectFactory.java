//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.06.01 at 05:44:14 PM EEST 
//


package lt.viko.eif.dborkovskij.soap.localhost.cinema.film;

import lt.viko.eif.dborkovskij.soap.localhost.cinema.film.entity.Film;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the localhost.cinema.film package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: localhost.cinema.film
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertFilmResponse }
     * 
     */
    public InsertFilmResponse createInsertFilmResponse() {
        return new InsertFilmResponse();
    }

    /**
     * Create an instance of {@link ServiceStatus }
     * 
     */
    public ServiceStatus createServiceStatus() {
        return new ServiceStatus();
    }

    /**
     * Create an instance of {@link GetFilmResponse }
     * 
     */
    public GetFilmResponse createGetFilmResponse() {
        return new GetFilmResponse();
    }

    /**
     * Create an instance of {@link Film }
     * 
     */
    public Film createFilm() {
        return new Film();
    }

    /**
     * Create an instance of {@link GetFilmsRequest }
     * 
     */
    public GetFilmsRequest createGetFilmsRequest() {
        return new GetFilmsRequest();
    }

    /**
     * Create an instance of {@link InsertFilmRequest }
     * 
     */
    public InsertFilmRequest createInsertFilmRequest() {
        return new InsertFilmRequest();
    }

    /**
     * Create an instance of {@link UpdateFilmResponse }
     * 
     */
    public UpdateFilmResponse createUpdateFilmResponse() {
        return new UpdateFilmResponse();
    }

    /**
     * Create an instance of {@link UpdateFilmRequest }
     * 
     */
    public UpdateFilmRequest createUpdateFilmRequest() {
        return new UpdateFilmRequest();
    }

    /**
     * Create an instance of {@link GetFilmsResponse }
     * 
     */
    public GetFilmsResponse createGetFilmsResponse() {
        return new GetFilmsResponse();
    }

    /**
     * Create an instance of {@link DeleteFilmRequest }
     * 
     */
    public DeleteFilmRequest createDeleteFilmRequest() {
        return new DeleteFilmRequest();
    }

    /**
     * Create an instance of {@link DeleteFilmResponse }
     * 
     */
    public DeleteFilmResponse createDeleteFilmResponse() {
        return new DeleteFilmResponse();
    }

    /**
     * Create an instance of {@link GetFilmRequest }
     * 
     */
    public GetFilmRequest createGetFilmRequest() {
        return new GetFilmRequest();
    }

    /**
     * Create an instance of {@link TheaterRoom }
     * 
     */
    public TheaterRoom createTheaterRoom() {
        return new TheaterRoom();
    }

}
