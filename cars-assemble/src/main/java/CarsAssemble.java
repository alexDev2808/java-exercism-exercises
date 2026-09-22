public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int prodBase = 221;
        double production = prodBase * speed;
        if ( speed == 0 ) {
            return 0;
        }
        if (speed >= 1 && speed <= 4) {
            return production;
        } else if (speed > 4 && speed <= 8) {
            return production * 0.9;
        } else if ( speed == 9 )  {
            return production * 0.8;
        } else {
            return production * 0.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        double production = productionRatePerHour(speed);
        return (int) production / 60;
    }
}
