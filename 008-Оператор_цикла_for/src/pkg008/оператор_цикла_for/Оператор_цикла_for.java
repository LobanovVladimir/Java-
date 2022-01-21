/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg008.оператор_цикла_for;

import javax.swing.JOptionPane;

/**
 *
 * @author vovch
 */
public class Оператор_цикла_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String imput = JOptionPane.showInputDialog(null, "Введите положительное число",JOptionPane.QUESTION_MESSAGE);
        if((imput==null)||(imput.equals(""))||(Double.parseDouble(imput)%1!=0)||(Double.parseDouble(imput)<0))
        {
            System.out.println("Вы ввели некорректные данные");
        }
        else
        {
            int num = Integer.parseInt(imput);
            int sum=0;
            for (int i = 1; i <= num; i++) 
            {
                sum+=i;
            }
            System.out.println(sum);
        }
    }
    
}
