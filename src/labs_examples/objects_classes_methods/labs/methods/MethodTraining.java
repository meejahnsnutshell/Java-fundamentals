package labs_examples.objects_classes_methods.labs.methods;

import java.util.Scanner;

import static java.lang.System.out;

public class MethodTraining {
    public static void main(String[] args) {

        double a = 12;
        double b = 14;

        // Exercise 01
        double result = addition(a,b);
        System.out.println("a + b = " +result);

        //Exercise 02
        System.out.println("before a:" + a);
        System.out.println("before b:" + b);
        someOtherMethod(a, b);
        System.out.println("before a:" + a);
        System.out.println("before b:" + b + "\n");

        // Exercise 03 Return largest number
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];
        for (int i = 0; i < 4; i++){
            System.out.println("Enter a number: "); // prompt user and assign input into array
            numbers[i] = scanner.nextInt();
        }
        int max = ReturnLargest(numbers); // invoke method to return largest number
        System.out.println("\n" + "Max value = " + max);

        // Exercise 04 Count number of consonants
        Scanner consonants = new Scanner(System.in);
        out.println("\n" +"Enter a word to return the number of consonants in that word: ");
        String str = consonants.next();
        int count = CountConsonants(str);
        System.out.println("Number of consonants in word entered = " + count);

        // Exercise 05 Determine if Prime number
        Scanner number = new Scanner(System.in);
        out.println("\n" + "Enter a number to check if Prime: ");
        int n = number.nextInt();
        boolean bool = isPrime(n);
        System.out.println("Is number entered Prime = " +bool);

        // Exercise 06 return largest & smallest numbers in an array
        int[] arr = {55, 27, 26, 98, 7, 31, 19};
        System.out.print("\n" + "Contents of array ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        int[] returnArray = MinMaxArray(arr);
        System.out.println("\n" + "Min & max numbers of entered array = ");
        for (int i : returnArray) {
            System.out.print(i + " ");
        }

        // Exercise 07 method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
        // In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
        //divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the result
        // length of the returned list


        // Exercise 08 method that will reverse an array in place use only one extra temp variable
            int[] nums = {45, 87, 62, 99, 1, 42, 12};
            System.out.print("\n \n" + "Contents of array ");
            for (int j : nums) {
                System.out.print(j + " ");
            }
            ReverseArray(nums); //invoke method to Reverse Array and print result

    } // Main method



    public static int addition(int a, int b) { // method exercise 01 method overloading
        return a + b;}
    public static double addition(double a, double b) {
        return a + b;}
    public static int addition(int a, int b, int c) {
        return a + b + c;}
    public static double addition(double a, double b, double c) {
        return ((int) (a + b + c));}

    public static void someOtherMethod(double a, double b) { // method exercise 02 02) pass by value
        a = a * 10;
        System.out.println(a);
        b = b * 20;
        System.out.println(b);
    }

// Exercise 02 2) pass by reference - see separate file PassingObjects (public class)


    public static int ReturnLargest(int[] numbers){  // method for exercise 03 Return Largest number
        int max = numbers[0];
        for (int i =0; i < 4; i++){
            if (numbers[i] < max)
                continue;
            max = numbers[i];
        }
        System.out.println("Numbers entered = ");
        for (int n : numbers) {
            System.out.print(n);
        }
        return max;
    }

    public static int CountConsonants(String str) { // method for exercise 04 count consonants
        String conson = "bcdfghjklmnpqrstvwxyz";

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < conson.length(); j++) {
                if (str.charAt(i) != conson.charAt(j))
                    continue;
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int n){ // method for exercise 05 check if Prime number
        if (n <= 1)
            return false;
        if (n<= 3)
            return true;

        // Check if can skip middle five numbers
        if (n%2 == 0 || n%3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i +6)
            if (n % i == 0 || n % (i+2) == 0)
                return false;
        return true;
    }

    public static int[] MinMaxArray(int[] arr){ // method for exercise 06 return array of min & max numbers
        int max = arr[0];
        int min = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
            else if(arr[i]<min)
                min=arr[i];

        }
        int[]returnArray = {max,min};
        return returnArray;
    }

    public static void ReverseArray(int[] nums) { //method for exercise 08 Reverse array
        int temp; // temporary variable for storing number

        for (int i = 0; i < nums.length / 2; i++) { // nums.length/2 as each number is swapped with one other
            temp = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = nums[i];
            nums[i] = temp;
        }
        System.out.println("Contents of reverse array ");
        for (int i : nums) { // print each element of the array to verify reverse order
            System.out.print(i + " ");
        }
    }


} // end of Method Training Class









