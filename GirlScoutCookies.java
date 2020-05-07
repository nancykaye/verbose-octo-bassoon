/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package girlscoutcookies;
import java.io.*;
import java.util.*;
/**
 *
 * @author nancykaye
 */
public class GirlScoutCookies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] BoxesCategory=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.print("Total number of girls in the troop: ");
        int numOfGirlScouts=sc.nextInt();
        for(int i=0; i<numOfGirlScouts; i++)
        {
            System.out.print("Boxes of cookies for girl #"+(i+1)+":");
            int boxes=sc.nextInt();
            if(boxes>=0 && boxes<=10)
                BoxesCategory[0]++;
            else if(boxes>=11 && boxes<=20)
                BoxesCategory[1]++;
            else if(boxes>=21 && boxes<=30)
                BoxesCategory[2]++;
            else if(boxes>=31 && boxes<=40)
                BoxesCategory[3]++;
            else if(boxes>40)
                BoxesCategory[4]++;
        }
        System.out.println("Total Boxes\tNumber of Girl Scouts");
        System.out.println("0 to 10\t"+BoxesCategory[0]);
        System.out.println("11 to 20\t"+BoxesCategory[1]);
        System.out.println("21 to 30\t"+BoxesCategory[2]);
        System.out.println("31 to 40\t"+BoxesCategory[3]);
        System.out.println("41 or more\t"+BoxesCategory[4]);
    }
        }
   
    

