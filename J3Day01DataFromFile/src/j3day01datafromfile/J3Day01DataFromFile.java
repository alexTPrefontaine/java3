/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j3day01datafromfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author alext
 */
public class J3Day01DataFromFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> namesList = new ArrayList<>();
        ArrayList<Double> numsList = new ArrayList<>();
        File myObj = new File("data.txt");
        Scanner scan = new Scanner(myObj);
        String dup = "";
        int average = 0;
        while(scan.hasNextLine()){
            String data = scan.nextLine();
            try {
                Double num = Double.parseDouble(data);
                numsList.add(num);
            }
            catch(NumberFormatException e) {
                if(namesList.contains(data)){
                    if(!(dup.equals(""))){
                        dup = dup.concat(", ");
                    }
                    dup = dup.concat(data);
                    continue;
                }
                namesList.add(data);
            }
        }
        System.out.print("Names sorted: ");
        Collections.sort(numsList);
        Collections.sort(namesList);
        for(int i = 0; i < namesList.size(); i++){
            average += namesList.get(i).length();
            if(i==namesList.size()-1){
                System.out.print(namesList.get(i));
                break;
            }
            System.out.print(namesList.get(i) + ", ");
            average /= namesList.size();
        }
        System.out.println("");
        System.out.print("Numbers sorted: ");
        for(int i = 0; i < numsList.size(); i++){
            if(i==numsList.size()-1){
                System.out.print(numsList.get(i));
                break;
            }
            System.out.print(numsList.get(i) + ", ");
        }
        System.out.println("");
        System.out.println("Average name lengths: " + average);
        System.out.println("Duplicate names: " + dup);
    }
    
}
