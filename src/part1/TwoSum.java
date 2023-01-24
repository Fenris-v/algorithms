package part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(new File("input.txt"));
        int length = Integer.parseInt(reader.nextLine());
        String[] arr = reader.nextLine().split(" ");
        int neededSum = Integer.parseInt(reader.nextLine());

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (Integer.parseInt(arr[i]) + Integer.parseInt(arr[j]) == neededSum) {
                    System.out.println(arr[i] + ' ' + arr[j]);
                    return;
                }
            }
        }

        System.out.println("None");
    }
}
