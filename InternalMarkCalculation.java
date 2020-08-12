/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet;
import java.util.Scanner;
/**
 *
 * @author Vasanth
 */
public class InternalMarkCalculation {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("enter the student details ");
        Scanner obj = new Scanner(System.in);
        int att,temp;
        String name,regno;
        System.out.println("enter you name in Capital letters");
        name = obj.next();
        System.out.println("Enter you regtister number");
        regno = obj.next();
        System.out.println("Enter the number of days you atttended the college");
        att = obj.nextInt();
        temp = att;
        if(att< 126){
            att = 0;
        }
        else if(att<=144 && att> 135){
            att = 3;
        }
        else if(att>= 144 && att< 162){
            att = 4;
        }
        else{
            att =5;} 
          
        studinfo a = new studinfo(name,regno,180);
        System.out.println("\n your name : "+ a.name());
        System.out.println("\n your register number : "+ a.regno());
        System.out.println("\n Total number of days you attended : "+ temp);
        System.out.println("\n Your mark for attendance is : " + att);
        
       }
    
}
class studinfo{
    String names;
    String regnos;
    int totworks;
    int attendances;
    
    studinfo(String name, String regno, int totwork){
    names = name;
    regnos = regno;
    totworks = totwork;
    
    }
            
    String name(){
        return names;
    
}
    String regno(){
        return regnos; 
    }
    
    int totalwork(){
        return totworks;
    }
   
}
