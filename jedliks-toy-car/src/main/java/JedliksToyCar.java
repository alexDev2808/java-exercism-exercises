public class JedliksToyCar {
    public int drivenDistance = 0;
    public int remainingBattery = 100;
    public int coveredDistanceInMeters = 20;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", drivenDistance);
    }

    public String batteryDisplay() {
        return remainingBattery > 0 ?
                String.format("Battery at %d%%", remainingBattery) : "Battery empty";
    }

    public void drive() {
        if ( remainingBattery > 0 ) {
            drivenDistance += coveredDistanceInMeters;
            remainingBattery -= 1;
        }
    }
}
