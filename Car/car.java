
public class car {
    // Private Attributes (Encapsulation)
    private String brand;
    private String color;
    private int speed;
    private int fuelLevel;
    private boolean engineOn;
    private boolean autopilotEnabled;

    public car() {
        this.brand = "Unknown";
        this.color = "Unpainted";
        this.speed = 0;
        this.fuelLevel = 50; // default 50%
        this.engineOn = false;
        this.autopilotEnabled = false;
    }

    
    public void setDetails(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }


    public void startEngine() {
        if (fuelLevel <= 0) {
            System.out.println(brand + ": Cannot start! Fuel tank is empty.");
            return;
        }
        this.engineOn = true;
        System.out.println(this.brand + " engine started.");
    }

    public void stopEngine() {
        this.speed = 0;
        this.engineOn = false;
        this.autopilotEnabled = false;
        System.out.println(this.brand + " engine stopped.");
    }

    public void drive() {
        if (!engineOn) {
            System.out.println("Error: Cannot drive " + brand + "! Start engine first.");
            return;
        }
        this.speed += 20;
        this.fuelLevel -= 5;
        System.out.println(brand + " is driving. Speed: " + speed + " km/h | Fuel: " + fuelLevel + "%");
    }

    
    public void turboMode() {
        if (!engineOn) {
            System.out.println("Error: Engine is OFF. Turbo cannot be activated!");
            return;
        }
        this.speed += 50;
        this.fuelLevel -= 15;
        System.out.println("⚡ TURBO ACTIVATED on " + brand + "! Speed surged to " + speed + " km/h!");
    }

    public void refuel(int amount) {
        this.fuelLevel = Math.min(100, this.fuelLevel + amount);
        System.out.println(brand + " refueled. Current fuel: " + fuelLevel + "%");
    }

    public void toggleAutopilot() {
        if (!engineOn) {
            System.out.println("Cannot engage Autopilot while engine is off.");
            return;
        }
        this.autopilotEnabled = !this.autopilotEnabled;
        System.out.println(brand + " Autopilot set to: " + autopilotEnabled);
    }

    public void displayState() {
        System.out.println("--- " + brand + " Status ---");
        System.out.println("Color: " + this.color);
        System.out.println("Speed: " + this.speed + " km/h");
        System.out.println("Fuel Level: " + this.fuelLevel + "%");
        System.out.println("Engine On: " + this.engineOn);
        System.out.println("Autopilot: " + this.autopilotEnabled);
        System.out.println();
    }
}
