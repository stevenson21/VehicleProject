public class Main {
    public static void main(String[] args) {
        // Creating Manufacture objects
        Manufacture toyota = new Manufacture("Toyota", "Japan");
        Manufacture tesla = new Manufacture("Tesla", "USA");
        Manufacture ford = new Manufacture("Ford", "USA");

        // Creating Engine objects
        CombustionEngine combustionEngine = new CombustionEngine();
        ElectricEngine electricEngine = new ElectricEngine();
        HybridEngine hybridEngine = new HybridEngine();

        // Creating Vehicle objects
        ICEV iceVehicle = new ICEV(toyota, combustionEngine);
        BEV bevVehicle = new BEV(tesla, electricEngine);
        HybridV hybridVehicle = new HybridV(ford, hybridEngine);

        // Creating an array of Vehicles
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = iceVehicle;
        vehicles[1] = bevVehicle;
        vehicles[2] = hybridVehicle;

        // Use the ShowCharacteristics() method to display characteristics of each vehicle
        for (Vehicle vehicle : vehicles) {
            vehicle.showCharacteristics();
            System.out.println();
        }

    }
}
