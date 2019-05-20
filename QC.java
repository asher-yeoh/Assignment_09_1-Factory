public class QC extends Machine {

    QC() {
        this.name = "QC";
    }

    public void operate(String productToBeBuilt, String operatorName) {
        System.out.println("The " + this.name + " machine conducts the first phase of QC test on the assembled " + productToBeBuilt + ".");
        System.out.println(operatorName + " inspects the " + productToBeBuilt + " for the second phase of QC test.");
        System.out.println(operatorName + " approves the " + productToBeBuilt + " to pass the QC test.");
    }
}