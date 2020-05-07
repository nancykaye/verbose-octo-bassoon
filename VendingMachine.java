/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;
import java.util.Scanner;
/**
 *
 * @author nancykaye
 */
public class VendingMachine {

    /**
     * 
     */
    
        public static void printProducts(){
            System.out.println("1.Product1($7.5)");
            System.out.println("2.Product2($1.5)");
            System.out.println("3.Product3($2.75)");
            System.out.println("4.Product4($0.8)");
            System.out.println("5.Product5($6.25)");
        }
        public static void printMoney(){
            System.out.println("1.5 dollar bill");
            System.out.println("2.1 dollar bill");
            System.out.println("3.50 centscoin");
            System.out.println("4.25 cents coin");
            System.out.println("5.10 cents coin");
            System.out.println("6.5 cents coin");
            System.out.println("7.1 cents coin");
        }
        
        public static int getProductPrice(int option){
            switch(option){
                case 1:
                    return 750;
                case 2:
                    return 150;
                case 3:
                    return 275; 
                case 4: 
                    return 80;
                case 5: 
                    return 625;
                default:
                    return 0;
                    
            }
        
        }
      public static int getMoneyByOption(int option){
          switch(option){
              case 1:
                  return 500;
              case 2:
                  return 100;
              case 3: 
                  return 50;
              case 4: 
                  return 25;
              case 5:
                  return 10; 
              case 6: 
                  return 5;
              case 7: 
                  return 1;
              default: 
                  return 0;
          }
      }
      public static int getInput(int max){
          Scanner in = new Scanner(System.in);
          while(true){
              System.out.print("Choose an option(0 to stop):");
              int temp; 
              temp=in.nextInt();
              if(temp>=0&&temp<=max){
                  return temp;
              }
              else{
                  System.out.println("Invalid choice. try again");
              }
          }
    }
    public static void displayChange(int money){
        int quarters=money/25;
        money%=25;
        int tens=money/10;
        money%=10;
        int fives=money/5;
        money%=5;
        int ones=money;
        System.out.println(quarters+"25cent coins");
        System.out.println(tens+"ten cent coins");
        System.out.println(fives+"five cent coins");
        System.out.println(ones+"one cent coins");
    }
    
    public static void main(String[]args){
        System.out.println("Enter your money details");
        printMoney();
        int money=0, choice, price;
        while(true){
            choice=getInput(7);
            if(choice==0){
                break;
            }
            else{
                money+=getMoneyByOption(choice);
                System.out.println(money+"cents entered till now");
            }
        }
       for (int i=0; i<5; ++i){
           printProducts();
           choice=getInput(5);
           if(choice==0){
               break;
           }
           price=getProductPrice(choice);
           if(price>money){
               System.out.println("not enough money, try again");
           }
           else{
               System.out.println("Take your product");
               System.out.println("You paid:"+money+"cents");
               System.out.println("Item cost"+price+"cents");
               money-=price;
               break;
           }
       } 
       System.out.println("Change Received");
       displayChange(money);
    }
}
