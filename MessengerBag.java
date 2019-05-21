import java.util.*;

public class MessengerBag extends Bag {

    MessengerBag(String fabric) {
        this.type = "messenger bag";
        this.fabric = fabric;

        this.materials = new ArrayList<>();
        this.materials.add(new Material("buckle", 4, "unit(s)"));
        this.materials.add(new Material("strap", 1, "unit"));
        this.materials.add(new Material("zipper", 5, "unit(s)"));
        this.materials.add(new Material("string", 80, "g"));
        this.materials.add(new Material("rubber", 150, "g"));
        this.materials.add(new Material(fabric, 500, "g"));
    }
}