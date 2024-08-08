
import java.util.*;

public class Main {
    public static void main(String[] args) {


        SUV suv1 = new SUV("ford", 1990,"red");
        Sedan sedan = new Sedan("porsch", 1390,"white");
        suv1.print();
        sedan


        //suv1.print();
        //suv1.setName("mashin");
        //System.out.println(suv1.getName());

/*
        suv1.name = "ford";
        suv1.year = 1998;
        suv1.colour = "red";
        suv1.print();

        SUV suv2 = new SUV("206",1382,"black");
        suv2.print();



        //int[] numbers = {5, 2, 8, 1, 3};
        //System.out.println(" the max number is " + FindMax(numbers));
        //System.out.println(" the min number is " + FindMin(numbers));
        //System.out.println(" the sum of the numbers are equala to " + FindSum(numbers));
        //System.out.println(" the average of the numbers equals to " + FindAverage(numbers));

        //int[] reversedArray = reverseArray(numbers);
        //int valuOfIndex2 = reversedArray[2];
        /*for (int value : reversedArray) {
            System.out.print(value + " ");
       }*/
        //for(int i = 0; i < reversedArray.length;i++){
         //   System.out.print(reversedArray[i]);
        //}

        /*if (FindMax(numbers) == 8) {
            System.out.println("*FindMax test passed");
        } else {
            System.out.println("!FindMax test not passed");
        }
        if (FindMin(numbers) == 1) {
            System.out.println("*FindMin test passed");
        } else {
            System.out.println("!FindMin test not passed");
        }
        if (FindSum(numbers) == 19) {
            System.out.println("*FindSum test passed");
        } else {
            System.out.println("!FindSum test not passed");
        }
        if (FindAverage(numbers) == 3.8) {
            System.out.println("*FindAverage test passed");
        } else {
            System.out.println("!FindAverage test not passed");
        }*/

    }
    public static int[] reverseArray(int[] numbers) {
        int[] reversedArray = new int[numbers.length];

        for (int i = numbers.length - 1; i >= 0; i--) {
            reversedArray[numbers.length - 1 - i] = numbers[i];
        }
        return reversedArray;
    }


    public static int FindMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int FindMin(int[] numbers) {
        int min = numbers[0];
        //int[] numbers = {5,2,8,1,3};
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int FindSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static double FindAverage(int[] numbers) {
        //{5, 2, 8, 1, 3}
        //i = 0, for condition = true, numbers[i] = 5, sum = 5
        //i = 1, for condition = true, numbers[i] = 2, sum = 7
        //i = 2, for condition = true, numbers[i] = 8, sum = 15
        //i = 3, for condition = true, numbers[i] = 1, sum = 16
        //i = 4, for condition = true, numbers[i] = 3, sum = 19
        //i = 5, for condition = false, exit loop, sum = 19

        double average = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        average = (double)sum/numbers.length;
        return average;
    }

}
