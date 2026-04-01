public class BirdWatcher {

    private int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    // 1) Return last week's data (static, fixed)
    public static int[] getLastWeek() {
        return new int[] { 0, 2, 5, 3, 7, 8, 4 };
    }

    // 2) Today's birds = last element
    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    // 3) Increment today's count
    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    // 4) Check if any day had 0 birds
    public boolean hasDayWithoutBirds() {
        for (int birds : birdsPerDay) {
            if (birds == 0) {
                return true;
            }
        }
        return false;
    }

    // 5) Sum of first 'numberOfDays' days
    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }

    // 6) Count busy days (>= 5 birds)
    public int getBusyDays() {
        int busyDays = 0;
        for (int birds : birdsPerDay) {
            if (birds >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
}