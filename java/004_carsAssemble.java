public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double baseProductionRate = speed * 221 ;
        if (speed <= 4) {
            return baseProductionRate ;
        } else if (speed <= 8) {
            return baseProductionRate * 0.90 ;
        } else if (speed == 9) {
            return baseProductionRate * 0.80 ;
        }
        return baseProductionRate * 0.77 ;
    }

    public int workingItemsPerMinute(int speed) {
        int carsProducedPerMinute = (int) (productionRatePerHour(speed) / 60) ;
        return carsProducedPerMinute ;
    }
}
