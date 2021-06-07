/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package base;
import java.util.Scanner;
public class App {
    Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        int one = myApp.readFirst();
        int two = myApp.readSecond();
        int three = myApp.readThird();
        if(!myApp.isEqual(one, two, three)){
            System.out.println("The largest number is " + myApp.findMax(one, two, three));
        }

    }
    private int findMax(int one, int two, int three){
        int max = 0;
        if(one > max)
            max = one;
        if(two > max)
            max = two;
        if(three > max)
            max = three;
        return max;
    }
    private boolean isEqual(int one, int two, int three){
        if((one == two) && (two == three)){
                return true;
        }
        else
            return false;
    }
    private int readFirst(){
        System.out.print("Enter the first number: ");
        return Integer.parseInt(inp.nextLine());
    }
    private int readSecond(){
        System.out.print("Enter the second number: ");
        return Integer.parseInt(inp.nextLine());
    }
    private int readThird(){
        System.out.print("Enter the third number: ");
        return Integer.parseInt(inp.nextLine());
    }
}