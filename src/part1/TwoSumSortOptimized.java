package part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TwoSumSortOptimized {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(new File("input.txt"));
        int length = Integer.parseInt(reader.nextLine());
        int[] arr = getIntegersArr(reader.nextLine());
        int neededSum = Integer.parseInt(reader.nextLine());

        int i = 0;
        int j = length - 1;
        int sum;
        while (j > i) {
            sum = arr[i] + arr[j];
            if (sum == neededSum) {
                System.out.println(String.valueOf(arr[i]) + ' ' + arr[j]);
                return;
            }

            if (sum > neededSum) {
                j--;
            } else {
                i++;
            }
        }

        System.out.println("None");
    }

    private static int[] getIntegersArr(String str) {
        String[] arr = str.split(" ");
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(result);
        return result;
    }
}
