import java.util.Arrays;

class ArraysTest {

    public static void main(String[] args) {

        int [] ages = new int [4];
        ages[0] = 24;
        ages[1] = 26;
        ages[2] = 27;
        ages[3] = 34;
        System.out.println(Arrays.toString(ages));

        double[] temps = { 65.5, 72.3, 80.0, 93.0, 67.6 };
        System.out.println(Arrays.toString(temps));

        String[] sports = {"badminton", "basketball", "pool", "skiing"};
        System.out.println(Arrays.toString(sports));

        for(String sport : sports) {
            System.out.println("I enjoy playing " + sport.toUpperCase());
        }

        double sum = 0.0;
        for (double temp : temps) {
            sum += temp; //keeps running total from 0
        }

        double avg = sum / temps.length;
        System.out.printf("The average temp is %.2f", avg);

    }
}
