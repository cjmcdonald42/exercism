public class JedliksToyCar {
    // Private fields to maintain the internal state of the car
    private int distance = 0;
    private int battery = 100;

    // 1. Static factory method to buy/create a new car instance
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    // 2. Returns the current distance display string
    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    // 3. Returns the current battery display string
    public String batteryDisplay() {
        if (this.battery == 0) {
            return "Battery empty";
        }
        return "Battery at " + battery + "%";
    }

    // 4, 5, & 6. Drives the car, updating state only if battery is not empty
    public void drive() {
        if (this.battery > 0) {
            this.distance += 20;
            this.battery -= 1;
        }
    }
}