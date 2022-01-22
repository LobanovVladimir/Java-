/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg011.оператор_switch.pkgcase;

import javax.swing.JOptionPane;

/**
 *
 * @author vovch
 */
public class Оператор_switchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b;
        String c;
        String input;
        double rez = 0;
        boolean check=false;
        do{
            input = JOptionPane.showInputDialog(null, "Введите первое положительное целое число",JOptionPane.QUESTION_MESSAGE);
            if((!(input.equals("")))&&(input!=null)&&(Double.parseDouble(input)%1==0)&&(Double.parseDouble(input)>0))
                break;
        }while(true);
        a=Double.parseDouble(input);
                do{
            input = JOptionPane.showInputDialog(null, "Введите второе положительное целое число",JOptionPane.QUESTION_MESSAGE);
            if((!(input.equals("")))&&(input!=null)&&(Double.parseDouble(input)%1==0)&&(Double.parseDouble(input)>0))
                break;
        }while(true);
        b=Double.parseDouble(input);
        c = JOptionPane.showInputDialog(null,"Введите действие",JOptionPane.QUESTION_MESSAGE);
        switch(c){
            case("+"): rez=a+b; check=true; break;
            case("-"): rez=a-b; check=true; break;
            case("*"): rez=a*b; check=true; break;
            case("/"): rez=a/b; check=true; break;
            default: System.out.println("Вы ввели не знак, операция не будет выполнена");
        }
        if (check==true){
            System.out.println("Результат "+a+c+b+" равен "+rez);
        }
                
    }
    
}
