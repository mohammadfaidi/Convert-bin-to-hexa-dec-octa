/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convert;

import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 *
 * @author moham
 */
class Convert
{
    Scanner scan;
    int num;
    String bin;
    void getVal()
     {
          System.out.println("Binary to HexaDecimal,Octal and Decimal");
          scan = new Scanner(System.in);
          System.out.println("\nEnter the Binary :");
          bin=scan.nextLine();
          
          
          //num = Integer.parseInt(scan.nextLine());
     }
 
    void convert()
      {

           if(bin.matches("[0-1]*")){
           System.out.println("decimal Value after conversion is: "+Integer.parseInt(bin,2));  
           int bnum = Integer.parseInt(bin, 2);
           String ostr = Integer.toOctalString(bnum);
           System.out.println("Octal Value after conversion is: "+ostr);
           int bnum2 = Integer.parseInt(bin, 2);
           String hex=Integer.toHexString(bnum2);
           System.out.println("Hexa Value after conversion is: "+hex);
           }
           else{
           System.out.println("not accepted");
           }
      
           
                   
                   


       }
}
class Decimal_Conversion
{
   public static void main(String args[])
    {
        Convert obj = new Convert();
         obj.getVal();
         obj.convert();
          
    }
}
