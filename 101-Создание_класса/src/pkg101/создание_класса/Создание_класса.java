/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg101.создание_класса;

/**
 *
 * @author vovch
 */
public class Создание_класса {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        User Vova = new User(1,"Vova","123");
        User Ann = new User(2,"Крипося","сосу_член");
       // System.out.println("Пользователь с ID "+Vova.id+" имеет логин "+Vova.login+" и пароль "+Vova.password);
        User[] mass = new User[2];
        mass[0] = Vova;
        mass[1] = Ann;
        for (int i = 0; i < mass.length; i++) {
            System.out.println("Пользователь с ID "+mass[i].id+" имеет логин "+mass[i].login+" и пароль "+mass[i].password);
        }
    }
}
