//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.26 at 12:45:39 AM EST 
//


package edu.umd.cs.guitar.gen;

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
 *         &lt;element name="Events" type="{}EventsType"/>
 *         &lt;element name="EventGraph" type="{}EventGraphType"/>
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
    "events",
    "eventGraph"
})
@XmlRootElement(name = "EFG")
public class EFG {

    @XmlElement(name = "Events", required = true)
    protected EventsType events;
    @XmlElement(name = "EventGraph", required = true)
    protected EventGraphType eventGraph;

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link EventsType }
     *     
     */
    public EventsType getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsType }
     *     
     */
    public void setEvents(EventsType value) {
        this.events = value;
    }

    /**
     * Gets the value of the eventGraph property.
     * 
     * @return
     *     possible object is
     *     {@link EventGraphType }
     *     
     */
    public EventGraphType getEventGraph() {
        return eventGraph;
    }

    /**
     * Sets the value of the eventGraph property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventGraphType }
     *     
     */
    public void setEventGraph(EventGraphType value) {
        this.eventGraph = value;
    }

}
