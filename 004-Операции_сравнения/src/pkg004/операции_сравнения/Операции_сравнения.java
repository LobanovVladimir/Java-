/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg004.операции_сравнения;

/**
 *
 * @author Superuser
 */
public class Операции_сравнения {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        double a = 10.5;
        double b = 8.9;
        char c = '>';
        boolean rez = a > b;
        System.out.println("a "+'<'+" b"+" = "+(a<b));
        System.out.println("a "+">"+" b"+" = "+(a>b));
        System.out.println("a "+">="+" b"+" = "+(a>=b));
        System.out.println("a "+"<="+" b"+" = "+(a<=b));
        System.out.println("a "+"!="+" b"+" = "+(a!=b));
       
    }
    
}
