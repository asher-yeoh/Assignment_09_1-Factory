import java.util.*;

public class BumBag extends Bag {

    BumBag(String fabric) {
        this.type = "bum bag";
        this.fabric = fabric;

        this.materials = new ArrayList<>();
        this.materials.add(new Material("buckle", 3, "unit(s)"));
        this.materials.add(new Material("zipper", 4, "unit(s)"));
        this.materials.add(new Material("strap", 1, "unit"));
        this.materials.add(new Material("string", 40, "g"));
        this.materials.add(new Material("rubber", 50, "g"));
        this.materials.add(new Material(fabric, 400, "g"));
    }
}