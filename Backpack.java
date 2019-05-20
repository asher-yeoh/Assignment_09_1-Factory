import java.util.*;

public class Backpack extends Bag {

    Backpack(String fabric) {
        this.type = "backpack";
        this.fabric = fabric;

        this.materials = new ArrayList<>();
        this.materials.add(new Material("buckle", 4, "unit(s)"));
        this.materials.add(new Material("zipper", 6, "unit(s)"));
        this.materials.add(new Material("string", 100, "g"));
        this.materials.add(new Material("rubber", 200, "g"));
        this.materials.add(new Material(fabric, 600, "g"));
    }
}