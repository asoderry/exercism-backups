public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int productionRatePerHour = speed * 221;

        if (speed > 0 && speed <= 4) {
            return productionRatePerHour;
        } else if (speed >= 5 && speed <= 8) {
            return productionRatePerHour * 0.9;
        } else if (speed == 9) {
            return productionRatePerHour * 0.8;
        } else if (speed == 10) {
            return productionRatePerHour * 0.77;
        } else return 0;
    }

    public int workingItemsPerMinute(int speed) {
        double productionRatePerHour = productionRatePerHour(speed);

        return (int) productionRatePerHour / 60;
    }
}
