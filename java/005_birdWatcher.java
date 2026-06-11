
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4} ;
    }

    public int getToday() {
        return birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        birdsPerDay[6]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds : birdsPerDay) {
            if (birds == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int totalBirds = 0;
        int limit = Math.min(numberOfDays, birdsPerDay.length);
        for (int days = 0; days < limit; days++) {
            totalBirds += birdsPerDay[days];
        }
        return totalBirds ;
    }

    public int getBusyDays() {
        int busyDays = 0 ;   // Number of Days in which 5 or more birds are spotted
        for (int days = 0; days < birdsPerDay.length; days++) {
            if (birdsPerDay[days] >= 5) {
                busyDays++ ;
            }
        }
        return busyDays ;
    }
}
