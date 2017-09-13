import java.util.Scanner;

/**
 * Created by Bartek on 2017-09-13.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Podaj trzy liczby: ");
        Scanner scanner1 = new Scanner(System.in);
        int[] numChart = new int[3];
        for (int i = 0; i < numChart.length; i++)
            numChart[i] = scanner1.nextInt();
        int max = numChart[0];
        for (int i = 0; i < numChart.length; i++) {
            if (max >= numChart[i])
                max = max;
            else
                max = numChart[i];
        }

        System.out.println("Największa liczba to: " + max);

        int min = numChart[0];
        for (int i = 0; i < numChart.length; i++) {
            if (min <= numChart[i])
                min = min;
            else
                min = numChart[i];
        }
        System.out.println("Najmniejsza liczba to: " + min);
    }
}
