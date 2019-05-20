public class Machine {
    String name;

    public void station(String operatorName, String supervisorName) {
        System.out.println("\n\n\n============================== Proceed to " + this.name + " machine station. ============================== \n");
        System.out.println("The " + this.name + " machine is operated by " + operatorName + " under the supervision of " + supervisorName + ".");
    }
}