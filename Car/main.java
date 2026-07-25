public class main {
    public static void main(String[] args) {
        // Instantiating objects (Heap Memory)
        car bmw = new car();
        car tesla = new car();

        bmw.setDetails("BMW M4", "Black");
        tesla.setDetails("Tesla Model S", "Red");

        // Independent state operations
        bmw.startEngine();
        bmw.drive();
        bmw.turboMode();

        tesla.startEngine();
        tesla.toggleAutopilot();

        // Display States
        bmw.displayState();
        tesla.displayState();

        // Stop engines
        bmw.stopEngine();
    }
}
