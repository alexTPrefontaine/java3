/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j3day01hello;

import java.util.Scanner;

/**
 *
 * @author alext
 */
public class J3Day01Hello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("How many numbers?");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num < 0){
            System.out.println("Please input positive numbers");
        }
        System.out.println("Enter min number");
        int min = scan.nextInt();
        System.out.println("Enter max number");
        int max = scan.nextInt();
        System.out.println("Result: ");
        for (int i = 0; i < num; i++) {
            System.out.print((int)(Math.random() * (max - min + 1) + min) + ", ");
        };
        
    }
    
}
