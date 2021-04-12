package legoset;

import java.io.FileOutputStream;
import java.net.URL;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import jaxb.JAXBHelper;


public class Main {

    public static void main(String[] args) throws Exception {

        var legoset = new LegoSet();
        legoset.setName("Imperial TIE Fighter");
        legoset.setTheme("Star Wars");
        legoset.setSubtheme("Solo");
        legoset.setYear(Year.of(2018));
        legoset.setPieces(519);
        legoset.setPackaging( LegoSet.pack.BOX);
        legoset.setTags(Set.of("Starfighter","Stormtrooper", "Star Wars", "Solo"));

        var minifigs = new ArrayList<Minifig>();
        minifigs.add(new Minifig("Imperial Mudtropper", 2));
        minifigs.add(new Minifig("Imperial Pilot", 1));
        minifigs.add(new Minifig("Mimban Stormtrooper", 1));

        legoset.setMinifigs(minifigs);
        legoset.setRatings(new Ratings(4.4,468));
        legoset.setNumber(75211);
        legoset.setUrl(new URL("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter"));




        JAXBHelper.toXML(legoset, new FileOutputStream("legoset.xml"));
    }
}
