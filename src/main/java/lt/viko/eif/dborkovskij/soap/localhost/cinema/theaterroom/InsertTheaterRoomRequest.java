//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.06.01 at 05:44:14 PM EEST 
//


package lt.viko.eif.dborkovskij.soap.localhost.cinema.theaterroom;

import lt.viko.eif.dborkovskij.soap.model.TheaterRoom;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="theaterRoom" type="{http://localhost/cinema/theaterRoom}theaterRoom"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "theaterRoom"
})
@XmlRootElement(name = "insertTheaterRoomRequest")
public class InsertTheaterRoomRequest {

    @XmlElement(required = true)
    protected TheaterRoom theaterRoom;

    /**
     * Gets the value of the theaterRoom property.
     * 
     * @return
     *     possible object is
     *     {@link TheaterRoom }
     *     
     */
    public TheaterRoom getTheaterRoom() {
        return theaterRoom;
    }

    /**
     * Sets the value of the theaterRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link TheaterRoom }
     *     
     */
    public void setTheaterRoom(TheaterRoom value) {
        this.theaterRoom = value;
    }

}
