package legoset;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"count", "avg"})
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ratings {

    @XmlAttribute
    private double avg;
    @XmlAttribute
    private int count;

}
