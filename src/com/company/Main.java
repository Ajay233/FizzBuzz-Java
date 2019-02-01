package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(fizz(3));
        int count = 0;
        String[] arr = new String[20];
        for(int i = 1; i <= 20; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("FizzBuzz");
                arr[i-1] = "FizzBuzz";
            } else if (i % 5 == 0) {
                arr[i-1] = "Buzz";
            } else if (i % 3 == 0) {
                arr[i-1] = "Fizz";
            } else
                arr[i-1] = String.valueOf(i);
           count++;
        }
        System.out.println(count + " Numbers evaluated and printed");
        for(int i = 0; i < arr.length; i++){
            System.out.println("Element " + i + " is " + arr[i]);
        }
    }

    public static String fizz(int num) {
        String result;
        if (num % 3 == 0) {
            result = "Fizz";
        } else
            result =  String.valueOf(num);
        return result;
    }

    public static String buzz(int num) {
        String result;
        if (num % 5 == 0) {
            result = "Buzz";
        } else
            result = String.valueOf(num);
        return result;
    }

    public static String fizzBuzz(int num) {
        String result;
        if ((num % 3 == 0) && (num % 5 == 0)) {
            result = "FizzBuzz";
        } else
            result =  String.valueOf(num);
        return result;
    }

    public static String[] fizzBuzzJava(int num) {
        String[] result = new String[num];
        for(int i = 1; i <= num; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)){
                result[i-1] = "FizzBuzz";
            } else if (i % 5 == 0) {
                result[i-1] = "Buzz";
            } else if (i % 3 == 0) {
                result[i-1] = "Fizz";
            } else
                result[i-1] = String.valueOf(i);
        }
        return result;
    }

}
