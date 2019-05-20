import java.util.*;

public class Picking extends Machine {

    Picking() {
        this.name = "PICKING";
    }

    public void operate(String productToBeBuilt, ArrayList<Material> materialsRequired) {
        System.out.println("The " + this.name + " machine picks up the following required materials for building one(1) " + productToBeBuilt + ":");

        for (int i = 0;i < materialsRequired.size(); i++) {
            System.out.println("- " + materialsRequired.get(i).qty + " " + materialsRequired.get(i).unit + " of " + materialsRequired.get(i).name + ".");
        }
    }
}