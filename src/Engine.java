// Superclass Engine
abstract class Engine {
    private String engineType;

    public Engine(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Engine Type: " + engineType;
    }
}

// Subclass CombustionEngine
class CombustionEngine extends Engine {
    public CombustionEngine() {
        super("Combustion Engine");
    }

}

// Subclass ElectricEngine
class ElectricEngine extends Engine {
    public ElectricEngine() {
        super("Electric Engine");
    }
}

// Subclass HybridEngine
class HybridEngine extends Engine {
    public HybridEngine() {
        super("Hybrid Engine");
    }
}
