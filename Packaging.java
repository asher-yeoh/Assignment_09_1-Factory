public class Packaging extends Machine {

    Packaging() {
        this.name = "PACKAGING";
    }

    public void operate(String productToBeBuilt) {
        System.out.println("The " + this.name + " machine wraps the " + productToBeBuilt + " with plastic films.");
        System.out.println("The " + this.name + " machine packs the wrapped " + productToBeBuilt + " into a carton box.");
        System.out.println("The " + this.name + " machine prints the product details and barcode label and attaches to the carton box.");    
    }
}