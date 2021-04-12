package legoset;

import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;
import movie.YearAdapter;

import java.net.URL;
import java.time.Year;
import java.util.List;
import java.util.Set;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"name", "theme", "subtheme", "year", "pieces", "packaging", "tags", "minifigs", "ratings", "number", "url"})
@Data
public class LegoSet {

    public enum pack{
        BOX,
        POLYBAG
    }

    private String name;
    private String theme;
    private String subtheme;
    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;
    private int pieces;
    private pack packaging;
    @XmlElementWrapper(name="tags")
    @XmlElement(name="tag")
    private Set<String> tags;
    @XmlElementWrapper(name="minifigs")
    @XmlElement(name="minifig")
    private List<Minifig> minifigs;
    private Ratings ratings;
    @XmlAttribute
    private int number;
    @XmlAttribute
    private URL url;
}
