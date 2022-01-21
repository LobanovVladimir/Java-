/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg007.условный_оператор;

import javax.swing.JOptionPane;

/**
 *
 * @author vovch
 */
public class Условный_оператор {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String imput;
        double num1,num2;
        imput = JOptionPane.showInputDialog(null, "Введите первое число",JOptionPane.QUESTION_MESSAGE); // Ввод данных
        if((imput == null)||(imput.equals(""))){ // проверка на пустоту
            System.out.println("Вы не ввели ничего"); // Вывод пустого значения
        }
        else{
                num1 = Double.parseDouble(imput);
                imput = JOptionPane.showInputDialog(null, "Введите второе число, отличное от нуля",JOptionPane.QUESTION_MESSAGE); // Ввод данных
                if((imput == null)||(imput.equals(""))) // проверка на пустоту
                { 
                    System.out.println("Вы не ввели ничего"); // Вывод пустого значения
                }
                else
                {
                    num2 = Double.parseDouble(imput); // парсим второе число
                    if(num2==0) // проверка значения второго числа
                        System.out.println("Результат : бесконечность");
                    else
                        System.out.println(num1/num2);
                }
        }
        
        
    }
    
}
