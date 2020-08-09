package com.company;

public class Main {

    public static void main(String[] args) {
	//Test the method
        FibonacciSequence(20);

    }

    //method that generates FibonacciSequence
    static void FibonacciSequence (int n){

        if ( n > 0){

            //initialize seed values
            int firstValue = 0;
            int secondValue = 1;
            int count = 0;

            //if input is 1 then print out 0
            if(n==1) System.out.println(firstValue);

            //if input is greater than 1
            else{
                String sequenceString = "";
                while(count < n){
                    //build output string
                    sequenceString += firstValue + " ";

                    //generate next value
                    int nextValue = firstValue + secondValue;

                    //re-assign values s
                    firstValue = secondValue;
                    secondValue = nextValue;

                    count++;

                }
                //print Fibonacci Sequence
                System.out.println(sequenceString);
            }
        }
        else{
            //handle invalid input
            System.out.println("Please Enter a Valid Input");
        }
    }
}
