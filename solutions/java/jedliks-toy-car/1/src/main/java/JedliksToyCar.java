public class JedliksToyCar {
    int battery = 100;
    int distanceDrivenInMeters = 0;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distanceDrivenInMeters + " meters";
    }

    public String batteryDisplay() {
        return battery != 0 ? "Battery at " + battery + "%" : "Battery empty";
    }

    public void drive() {
        if (battery == 0) return;

        distanceDrivenInMeters += 20;
        battery -= 1;
    }
}
