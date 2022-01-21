/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg002.переменные.и.их.типы;

import javax.swing.JOptionPane;

/**
 *
 * @author Superuser
 */
public class ПеременныеИИхТипы {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a = "53.5";
        double num = Double.parseDouble(a);
        System.out.println(num);
        char b = 'В';
        System.out.println(b);
        JOptionPane.showMessageDialog(null,a+" "+b);
    }
    
}
