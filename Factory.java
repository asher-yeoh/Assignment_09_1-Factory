import java.util.*;

public class Factory {
    ArrayList<Bag> bags;

    Factory (){
        this.bags = new ArrayList<>();
    }

    ArrayList<Bag> products(ArrayList<Bag> bags, ArrayList<Backpack> backpacks, ArrayList<MessengerBag> messengerBags, ArrayList<BumBag> bumBags) {
        bags.addAll(backpacks);
        bags.addAll(messengerBags);
        bags.addAll(bumBags);
        return bags;
    }

    void manufacture(
        ArrayList<Bag> bags,
        String pickingOperatorName,
        String assemblyOperatorName,
        String qcOperatorName,
        String packagingOperatorName,
        String shippingOperatorName,
        String pickingSupervisorName,
        String assemblySupervisorName,
        String qcSupervisorName,
        String packagingSupervisorName,
        String shippingSupervisorName
        ) {
        for (int i=0; i<bags.size();i++) {
            String productToBeBuilt = bags.get(i).fabric + " " + bags.get(i).type;

            System.out.println("Order #" + (i+1));
            System.out.println("Order is received for building one(1) " + productToBeBuilt + ".");

            //STEP 1: PICKING Process
    
            Picking picking = new Picking();
    
            ArrayList<Material> materialsRequired = new ArrayList<>();
            materialsRequired = bags.get(i).materials;
            
            picking.station(pickingOperatorName, pickingSupervisorName);
            picking.operate(productToBeBuilt, materialsRequired);

            //STEP 2: ASSEMBLY Process

            Assembly assembly = new Assembly();

            assembly.station(assemblyOperatorName, assemblySupervisorName);
            assembly.operate(productToBeBuilt);

            //STEP 3: QC Process

            QC qc = new QC();

            qc.station(qcOperatorName, qcSupervisorName);
            qc.operate(productToBeBuilt, qcOperatorName);

            //STEP 4: PACKAGING Process

            Packaging packaging = new Packaging();

            packaging.station(packagingOperatorName, packagingSupervisorName);
            packaging.operate(productToBeBuilt);

            //STEP 5: SHIPPING Process

            Shipping shipping = new Shipping();

            shipping.station(shippingOperatorName, shippingSupervisorName);
            shipping.operate();
            
            System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }

    static void getOperators(ArrayList<Operator> operators) {
        for (int i = 0;i < operators.size(); i++) {
            System.out.println("Employee #" + (i+1) + ": " + " [Employee ID: " + operators.get(i).employeeId + "] - [Name: " + operators.get(i).fullName() + "] - [Dept: " + operators.get(i).dept +"] - [Position: " + operators.get(i).position + "]");
        }    
    }

    static void getSupervisors(ArrayList<Supervisor> supervisors) {
        for (int i = 0;i < supervisors.size(); i++) {
            System.out.println("Employee #" + (i+1) + ": " + " [Employee ID: " + supervisors.get(i).employeeId + "] - [Name: " + supervisors.get(i).fullName() + "] - [Dept: " + supervisors.get(i).dept +"] - [Position: " + supervisors.get(i).position + "]");
        }    
    }

    static String getDeptOperator(ArrayList<Operator> operators, String dept) {
        String operatorFullName = "";

        for (int i = 0;i < operators.size(); i++) {
            if (operators.get(i).dept == dept) {
                operatorFullName = operators.get(i).fullName();
            } 
        }
        return operatorFullName;
    }

    static String getDeptSupervisor(ArrayList<Supervisor> supervisors, String dept) {
        String supervisorFullName = "";

        for (int i = 0;i < supervisors.size(); i++) {
            if (supervisors.get(i).dept == dept) {
                supervisorFullName = supervisors.get(i).fullName();
            } 
        }
        return supervisorFullName;
    }

    public static void main(String[] args) {

        Factory bagFactory = new Factory();
        
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        
        ArrayList<Operator> operators = new ArrayList<>();
        operators.add(new Operator("001", "Hailey", "Kings", "Picking"));
        operators.add(new Operator("002", "Anastasia", "Bloe", "Assembly"));
        operators.add(new Operator("003", "Cyrus", "Prince", "qc"));
        operators.add(new Operator("004", "Oxford", "Rain",  "Packaging"));
        operators.add(new Operator("005", "Gregor", "Wesh", "Shipping"));

        System.out.println("Operator List:");
        getOperators(operators);

        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------");

        ArrayList<Supervisor> supervisors = new ArrayList<>();
        supervisors.add(new Supervisor("011", "Pyjama", "Sam", "Picking"));
        supervisors.add(new Supervisor("012", "Russian", "Blue", "Assembly"));
        supervisors.add(new Supervisor("013", "Spy", "Fox", "qc"));
        supervisors.add(new Supervisor("014", "Freddi", "Fish", "Packaging"));
        supervisors.add(new Supervisor("015", "Putt", "Putt", "Shipping"));

        System.out.println("Supervisor List:");
        getSupervisors(supervisors);

        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------");

        String pickingOperatorName = getDeptOperator(operators,"Picking");
        String assemblyOperatorName = getDeptOperator(operators,"Assembly");
        String qcOperatorName = getDeptOperator(operators,"qc");
        String packagingOperatorName = getDeptOperator(operators,"Packaging");
        String shippingOperatorName = getDeptOperator(operators,"Shipping");

        String pickingSupervisorName = getDeptSupervisor(supervisors,"Picking");
        String assemblySupervisorName = getDeptSupervisor(supervisors,"Assembly");
        String qcSupervisorName = getDeptSupervisor(supervisors,"qc");
        String packagingSupervisorName = getDeptSupervisor(supervisors,"Packaging");
        String shippingSupervisorName = getDeptSupervisor(supervisors,"Shipping");

        //Orders for building backpacks
        ArrayList<Backpack> backpacks = new ArrayList<>();
        backpacks.add(new Backpack("nylon"));
        backpacks.add(new Backpack("leather"));

        //Orders for building messenger bags
        ArrayList<MessengerBag> messengerBags = new ArrayList<>();
        messengerBags.add(new MessengerBag("canvas"));
        messengerBags.add(new MessengerBag("polyester"));

        //Orders for building bum bags
        ArrayList<BumBag> bumBags = new ArrayList<>();
        bumBags.add(new BumBag("cotton"));
        bumBags.add(new BumBag("PVC"));

        bagFactory.bags = bagFactory.products(bagFactory.bags, backpacks, messengerBags, bumBags);

        bagFactory.manufacture(
            bagFactory.bags,
            pickingOperatorName,
            assemblyOperatorName,
            qcOperatorName,
            packagingOperatorName,
            shippingOperatorName,
            pickingSupervisorName,
            assemblySupervisorName,
            qcSupervisorName,
            packagingSupervisorName,
            shippingSupervisorName
            );

    }
}