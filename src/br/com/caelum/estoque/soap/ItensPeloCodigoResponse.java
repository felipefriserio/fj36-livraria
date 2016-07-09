
package br.com.caelum.estoque.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItensPeloCodigoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItensPeloCodigoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItensEstoque" type="{http://caelum.com.br/estoque/v1}itemEstoque" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItensPeloCodigoResponse", propOrder = {
    "itensEstoque"
})
public class ItensPeloCodigoResponse {

    @XmlElement(name = "ItensEstoque")
    protected List<ItemEstoque> itensEstoque;

    /**
     * Gets the value of the itensEstoque property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itensEstoque property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItensEstoque().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemEstoque }
     * 
     * 
     */
    public List<ItemEstoque> getItensEstoque() {
        if (itensEstoque == null) {
            itensEstoque = new ArrayList<ItemEstoque>();
        }
        return this.itensEstoque;
    }

}
