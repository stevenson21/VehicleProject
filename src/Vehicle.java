// Superclass Vehicle
abstract class Vehicle {
    private Manufacture manufacture;
    private Engine engine;

    public Vehicle(Manufacture manufacture, Engine engine) {
        this.manufacture = manufacture;
        this.engine = engine;
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

    public void setManufacture(Manufacture manufacture) {
        this.manufacture = manufacture;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    // Abstract method to be implemented by subclasses
    public abstract void showCharacteristics();
}

// Subclass ICEV (Internal Combustion Engine Vehicle)
class ICEV extends Vehicle {
    public ICEV(Manufacture manufacture, CombustionEngine engine) {
        super(manufacture, engine);
    }

    @Override
    public void showCharacteristics() {
        System.out.println("Vehicle Type: ICEV (Internal Combustion Engine Vehicle)");
        System.out.println(getManufacture());
        System.out.println(getEngine());
    }
}

// Subclass BEV (Battery Electric Vehicle)
class BEV extends Vehicle {
    public BEV(Manufacture manufacture, ElectricEngine engine) {
        super(manufacture, engine);
    }

    @Override
    public void showCharacteristics() {
        System.out.println("Vehicle Type: BEV (Battery Electric Vehicle)");
        System.out.println(getManufacture());
        System.out.println(getEngine());
    }
}

// Subclass HybridV (Hybrid Vehicle)
class HybridV extends Vehicle {
    public HybridV(Manufacture manufacture, HybridEngine engine) {
        super(manufacture, engine);
    }

    @Override
    public void showCharacteristics() {
        System.out.println("Vehicle Type: HybridV (Hybrid Vehicle)");
        System.out.println(getManufacture());
        System.out.println(getEngine());
    }
}
