import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] inputArray1 = {10, 20, 30, 40, 50};
        float[] outputArray1 = new float[4];
        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];
        for (int summa : inputArray1) {
            sum = sum + summa;
            for (int max1 : inputArray1) {
                if (max1 > max) {
                    max = max1;
                }
                for (int min1 : inputArray1) {
                    if (min1 < min) {
                        min = max;
                    }

                }
            }
        }
        double averageSum = (float) sum / inputArray1.length;
        outputArray1[0] = sum;
        outputArray1[1] = max;
        outputArray1[2] = min;
        outputArray1[3] = (float) averageSum;

        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));


        int[] inputArray2 = {10, 20, 30, 40, 50};
        float[] outputArray2 = new float[5];
        int nalog = 0;
        for (float salary : inputArray2) {
            float tax = salary * 0.13f;
            outputArray2[nalog] = tax;
            nalog++;
            System.out.println(Arrays.toString(inputArray1));
            System.out.println(tax);
        }

        int[] inputArray3 = {1000, 2000, 3000, 4000, 6000};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        int index = 0; // Вспомогательная переменная для отслеживания индекса
        for (int bonus : inputArray3) {
            if (bonus > 5000) {
                outputArray3[index] = true;
            } else {
                outputArray3[index] = false;
            }
            index++;

            System.out.println(Arrays.toString(inputArray3));
            System.out.println(Arrays.toString(outputArray3));
        }

        int[] inputArray4 = {10000, 5000, -6000, 100, 2100};
        boolean outputArray4 = true;

        for (int overdue : inputArray4) {
            if (overdue < 0) {
                outputArray4 = false;
                break;
            }
        }
        System.out.println(outputArray4);

        int[] inputArray5 = {1000, 2000, 3000, 4000, 5000};
        int [] outputArray5 = new int [inputArray5.length];
        int profit1 = 0;

        for (int profit : inputArray5) {
            if (profit > 0) {
                profit1++;
            }
        }
        System.out.println("Месяцев прибыли " + profit1);
        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));
    }
}