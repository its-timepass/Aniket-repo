package Practical_1;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle:- ");
        int length =sc.nextInt();
        System.out.print("Enter the width of the rectangle:- ");
        int width =sc.nextInt();
        System.out.println("Perimeter of the reactangle is "+( 2*(length+width)));
    }
}
