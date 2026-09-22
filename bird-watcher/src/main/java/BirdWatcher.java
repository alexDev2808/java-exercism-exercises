
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for( int bird: this.birdsPerDay ) {
            if (bird == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        for ( int bird: this.birdsPerDay ) {
            if (numberOfDays > 0) {
                count += bird;
            }
            numberOfDays--;
        }
        return count;
    }

    public int getBusyDays() {
        int count = 0;
        for ( int bird: this.birdsPerDay ) {
            if ( bird >= 5 ) {
                count += 1;
            }
        }
        return count;
    }
}
