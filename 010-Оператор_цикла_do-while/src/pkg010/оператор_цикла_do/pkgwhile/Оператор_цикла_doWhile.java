/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg010.оператор_цикла_do.pkgwhile;

import javax.swing.JOptionPane;

/**
 *
 * @author vovch
 */
public class Оператор_цикла_doWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input;
        int check=0;
        do{
            input = JOptionPane.showInputDialog(null, "Введите положительное целое число",JOptionPane.QUESTION_MESSAGE);
            if((!(input.equals("")))&&(input!=null)&&(Double.parseDouble(input)%1==0)&&(Double.parseDouble(input)>0))
                break;
        }while(true);
        
    }
}
