public class Lasagna {
    public int expectedMinutesInOven() {
        return 40 ;
    }

    public int remainingMinutesInOven(int minutes_passed) {
        int time_remaining = expectedMinutesInOven() - minutes_passed ;
        return time_remaining ;
    }

    public int preparationTimeInMinutes(int layers) {
        int minutes_preparation = 2 ;
        return minutes_preparation * layers ;
    }

    public int totalTimeInMinutes(int layers, int current_cook_time) {
       return preparationTimeInMinutes(layers) + current_cook_time ;
    }
}
