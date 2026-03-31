public class Lasagna {

    // Expected oven time
    public int expectedMinutesInOven() {
        return 40;
    }

    // Preparation time (2 minutes per layer)
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    // Remaining time in oven
    public int remainingMinutesInOven(int minutesInOven) {
        return expectedMinutesInOven() - minutesInOven;
    }

    // Total time spent cooking
    public int totalTimeInMinutes(int layers, int minutesInOven) {
        return preparationTimeInMinutes(layers) + minutesInOven;
    }
}