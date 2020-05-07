/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brokengps;
import java.io.*;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
/**
 *
 * @author nancykaye
 */
public class BrokenGPS {

    /**
     * 
     */
    public static int randInt(int min,int max){
        Random rand= new Random();
        int randomNum=rand.nextInt((max-min)+1)+min;
        return randomNum;
        
        
    }
    public static double getDistanceFromOrig(double X,double Y){
        double distance;
        distance=Math.sqrt(X*X+Y*Y);
        return distance;
    }
    public static void main(String[]args){
        try{
            Scanner input=new Scanner(System.in);
            
            double X=0,Y=0;
            
            int timeLimit=60;//time limit in minute
            final int NORTH=0;
            final int EAST=1;
            final int SOUTH=2;
            final int WEST=3;
            int DIR=0;
            
            while(timeLimit>0){
                if(timeLimit>=5){
                    timeLimit-=5;
                    DIR=randInt(0,3);
                    //System.out.print(DIR);
                    if(DIR==NORTH){
                        Y=Y+5;
                        System.out.println("MOVED NORTH");
                    }
                    if(DIR==EAST){
                        X=X+5;
                        System.out.println("MOVED EAST");
                    }
                    if(DIR==WEST){
                        X=X-5;
                        System.out.println("MOVED WEST");
                    }
                    if(DIR==SOUTH){
                        Y=Y-5;
                        System.out.println("MOVED SOUTH");
                    }
                }else{
                    if(DIR==NORTH){
                        Y=Y+timeLimit*1;
                        timeLimit=0;
                        //System.out.println("MOVED NORTH");
                    }
                    if(DIR==EAST){
                        X=X+timeLimit*1;
                        timeLimit=0;
                        //System.out.println("MOVED WEST");
                    }
                    if(DIR==WEST){
                        X=X-timeLimit*1;
                        timeLimit=0;
                        //System.out.println("MOVED WEST");
                    }
                    if(DIR==SOUTH){
                        Y=Y-timeLimit*1;
                        timeLimit=0;//timelimit x speed in mile/min
                        //System.out.print.ln("MOVED SOUTH");
                        
                        
                    }
                }
            }
           System.out.println("Distance of Car After Traveling 1 Hr is"+getDistanceFromOrig(X,Y)+"miles");
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
