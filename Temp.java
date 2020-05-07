/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp;
import java.util.*;
/**
 *
 * @author nancykaye
 */
public class Temp {
    public static void main(String[]args)
    {
        double[][]temp=new double[12][2];
        double high,low;
        int highest,lowest;
        getData(temp);
        high=averageHigh(temp);
        low=averageLow(temp);
        highest=indexHighTemp(temp);
        lowest=indexLowTemp(temp);
        System.out.println("Average high temperature:"+high);
        System.out.println("Average low temperature:"+low);
        System.out.println("Highest high temperature for the year:"+temp[highest][1]);
        System.out.println("Lowest low temperature for the year:"+temp[lowest][0]);
    }
    public static void getData(double temp[][])
    {
        int i;
        Scanner in=new Scanner(System.in);
        String mth[]={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        System.out.println("Enter highest temperature for");
        for(i=0;i<12;i++){
            System.out.print(mth[i]+":");
            temp[i][1]=in.nextDouble();
        }
        
        }
    public static double averageHigh(double temp[][])
    {
        int i;
        double a,tot=0;
        for(i=0;i<12;i++)
            tot+=temp[i][1];
        a=tot/12.;
        return a;
    }
    public static double averageLow(double temp[][])
    {
        int i;
        double a,tot=0;
        for(i=0;i<12;i++)
            tot+=temp[i][0];
        a=tot/12.;
        return a;
    }
    public static int indexHighTemp(double temp[][])
    {
        int i,m=0;
        for(i=1;i<12;i++)
            if(temp[i][1]>temp[m][1])
                m=i;
        return m;
    }
    public static int indexLowTemp(double temp[][])
    {
        int i,m=0;
        for(i=1;i<12;i++)
            if(temp[i][0]<temp[m][0])
                m=i;
        return m;
    }
    
        
    }

    