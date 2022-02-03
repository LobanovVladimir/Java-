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
public class MyMath {
    
    private static int numer=0;
    private static int a,b;
    
    public static int get(){
        return numer;
    }
    public static int add(int a, int b){
         numer++;
        return a+b;
    }
    public static int sub(int a, int b){
        numer++;
        return a-b;
    }
    public static int mult(int a, int b){
         numer++;
        return a*b;
    }
    public static int div(int a,int b){
         numer++;
        return a/b;
    }
    
    private static void taking(){
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Введите первое число",JOptionPane.QUESTION_MESSAGE)); // Ввод данных;
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Введите второе число",JOptionPane.QUESTION_MESSAGE)); // Ввод данных;
    }
    
    public static void deffunction(int funk){
        switch(funk){
            case 1:{
               taking();
               System.out.println("Результат: "+add(a,b));
               break;
            }
            case 2:{
                taking();
                System.out.println("Результат: "+sub(a,b));
                break;
            }
            case 3:{
                taking();
                System.out.println("Результат: "+mult(a,b));
                break;
            }
            case 4:{
                taking();
                System.out.println("Результат: "+div(a,b));
            }
            default:{
                System.out.println("Работает только с числами 1 -4");
            }
        }
    }
}
