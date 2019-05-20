public class Shipping extends Machine {

    Shipping() {
        this.name = "SHIPPING";
    }

    public void operate() {
        System.out.println("The " + this.name + " machine prints the manifest label and attaches to the carton box.");
        System.out.println("The " + this.name + " machine places the carton box into a pallet.");
    }
}