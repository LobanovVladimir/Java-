/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg009.оператор_цикла_while;

import javax.swing.JOptionPane;

/**
 *
 * @author vovch
 */
public class Оператор_цикла_while {

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
        else{
            int num = Integer.parseInt(imput);
            int res = 1;
            while(num!=0){
                res*=num;
                num--;
            }
            System.out.println(res);
        }
            
    }
    
}
