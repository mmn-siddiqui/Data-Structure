package dts_lab_4;

import java.util.*;

public class DTS_Lab_4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Stack<String> user = new Stack<String>();
        
        
        System.out.println("Enter string : ");
        String use= inp.nextLine();
        
        user.push(use);
        
        System.out.println("String is :  "+user.pop());
        
        
        
    }
    
}
