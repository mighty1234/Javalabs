//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.11.13 at 09:24:58 AM CET 
//


package ua.nure.romenskiy.lab2.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Wood complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Wood"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://nure.ua/romenskiy/Lab2/entity}parent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="typeWood" type="{http://nure.ua/romenskiy/Lab2/entity}typeWood"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Wood", propOrder = {
    "typeWood"
})
public class Wood
    extends Parent
{

    @XmlElement(required = true)
    protected String typeWood;

    /**
     * Gets the value of the typeWood property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeWood() {
        return typeWood;
    }

    /**
     * Sets the value of the typeWood property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeWood(String value) {
        this.typeWood = value;
    }

}
