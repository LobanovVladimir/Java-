/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg006.битовые_операции;

/**
 *
 * @author Superuser
 */
public class Битовые_операции {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 13, b = 12;
        String stra = Integer.toBinaryString(a), strb=Integer.toBinaryString(b);
        System.out.println(stra);
        System.out.println(strb);
        System.out.println("Побитовое И "+Integer.toBinaryString(a & b));
        System.out.println("Побитовое ИЛИ "+ Integer.toBinaryString(a | b));
        System.out.println("Побитовое искл. ИЛИ "+Integer.toBinaryString(a ^ b)); 
        System.out.println(Integer.toBinaryString(~a)); // отрицание
        System.out.println(Integer.toBinaryString(a>>1)); // сдвиг вправо
        System.out.println(Integer.toBinaryString(a<<1));
    }   
    
}
