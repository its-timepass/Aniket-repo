package Practical_1;

import java.util.Scanner;

public class Q7 {
    public static void main(String args[]){
        int i,j,n1,n2;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the starting table number: ");
        n1=sc.nextInt();
        System.out.println("Enter the ending table number :");
        n2=sc.nextInt();
        for(i=n1;i<=n2;i++){
            for(j=1;j<=10;j++)
                System.out.println(i+" X "+j +" = "+(i*j));
            
        }
    }   
}
