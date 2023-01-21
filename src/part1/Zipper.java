package part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zipper {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner reader = new Scanner(file);
        int length = Integer.parseInt(reader.nextLine());
        String[] firstArr = reader.nextLine().split(" ");
        String[] secondArr = reader.nextLine().split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(firstArr[i]).append(' ').append(secondArr[i]).append(' ');
        }

        System.out.println(stringBuilder);
    }
}
