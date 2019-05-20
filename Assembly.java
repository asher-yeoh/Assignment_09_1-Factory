public class Assembly extends Machine {

    Assembly() {
        this.name = "ASSEMBLY";
    }

    public void operate(String productToBeBuilt) {
        System.out.println("The " + this.name + " machine assembles the picked materials to build one(1) " + productToBeBuilt + ".");
    }
}