package part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TwoSumRamOptimized {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(new File("input.txt"));
        int length = Integer.parseInt(reader.nextLine());
        int[] arr = getIntegersArr(reader.nextLine());
        int neededSum = Integer.parseInt(reader.nextLine());
        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < length; i++) {
            if (set.contains(neededSum - arr[i])) {
                int firstInt = neededSum - arr[i];
                System.out.println(String.valueOf(firstInt) + ' ' + arr[i]);
                return;
            }

            set.add(arr[i]);
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
