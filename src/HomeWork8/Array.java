package HomeWork8;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int[] runningSumv1 = {1, 2, 3, 4};
        int[] runningSumv2 = {1, 1, 1, 1, 1};
        int[] runningSumv3 = {3, 1, 2, 10, 1};

        System.out.println("Array: " + Arrays.toString(runningSumv1) + ", after running: "
                + Arrays.toString(runSum(runningSumv1)));
        System.out.println("Array: " + Arrays.toString(runningSumv2) + ", after running: "
                + Arrays.toString(runSum(runningSumv2)));
        System.out.println("Array: " + Arrays.toString(runningSumv3) + ", after running: "
                + Arrays.toString(runSum(runningSumv3)));

        scannerNumbersArrays();

    }

    public static int[] runSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }


    public static int scanSizeArray() {
        System.out.print("Enter size of array: ");
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        while (scan >= 1000 && scan <= 1) {
            System.out.print("Constraints: 1 <= nums.length <= 1000." +
                    "\nTry again.\n");
            scan = scanner.nextInt();
        }
        return scan;
    }

    public static int[] scannerNumbersArrays() {

        Scanner scanner = new Scanner(System.in);

        int numsWithConstraints;
        int[] numsAr = new int[scanSizeArray()];
        for (int i = 0; i <= numsAr.length - 1; i++) {
            System.out.print("Enter number of array: ");
            int nums = scanner.nextInt();
            while (nums >= -1000000 && nums >= 1000000) {
                System.out.print("Constraints: -10^6 <= nums[i] <= 10^6." +
                        "\nTry again.\n" +
                        "Enter number of array: ");
                nums = scanner.nextInt();

            }
            numsWithConstraints = nums;
            numsAr[i] = numsWithConstraints;


        }
        System.out.println("Array: " + Arrays.toString(numsAr) + ", after running: "
                + Arrays.toString(runSum(numsAr)));
        return numsAr;

    }
}

