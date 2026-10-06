import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return this.birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int birdsForGivenDay: this.birdsPerDay)  {
            if (birdsForGivenDay == 0) return true;
        }

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;

        for (int i = 0; i < numberOfDays; i++) {
            if (i >= this.birdsPerDay.length) break;

            total += this.birdsPerDay[i];
        }

        return total;
    }

    public int getBusyDays() {
        int totalBusyDays = 0;

        for (int birdsForGivenDay : this.birdsPerDay) {
            if (birdsForGivenDay >= 5) totalBusyDays++;
        }

        return totalBusyDays;
    }
}
