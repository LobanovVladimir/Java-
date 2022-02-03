/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg104.статические_поля_и_методы;

import javax.swing.JOptionPane;

/**
 *
 * @author vovch
 */
public class Статические_поля_и_методы {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Счётчик равен "+MyMath.get());
        MyMath.deffunction(Integer.parseInt(JOptionPane.showInputDialog(null,"Введите функцию : 1+ 2- 3* 4/ 0? ",JOptionPane.QUESTION_MESSAGE)));
        System.out.println("Счётчик равен "+MyMath.get());
        
    }
    
}
