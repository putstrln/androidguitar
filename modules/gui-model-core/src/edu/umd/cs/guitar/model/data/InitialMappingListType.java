//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.02 at 03:44:47 PM EDT 
//


package edu.umd.cs.guitar.model.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InitialMappingListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InitialMappingListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IntialMapping" type="{}InitialMappingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitialMappingListType", propOrder = {
    "intialMapping"
})
public class InitialMappingListType {

    @XmlElement(name = "IntialMapping")
    protected List<InitialMappingType> intialMapping;

    /**
     * Gets the value of the intialMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intialMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntialMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InitialMappingType }
     * 
     * 
     */
    public List<InitialMappingType> getIntialMapping() {
        if (intialMapping == null) {
            intialMapping = new ArrayList<InitialMappingType>();
        }
        return this.intialMapping;
    }

    /**
     * Sets the value of the intialMapping property.
     * 
     * @param intialMapping
     *     allowed object is
     *     {@link InitialMappingType }
     *     
     */
    public void setIntialMapping(List<InitialMappingType> intialMapping) {
        this.intialMapping = intialMapping;
    }

}
