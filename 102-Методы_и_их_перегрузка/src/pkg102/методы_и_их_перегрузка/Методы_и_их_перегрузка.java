/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg102.методы_и_их_перегрузка;

/**
 *
 * @author vovch
 */
public class Методы_и_их_перегрузка {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        User Vova = new User(1,"Vova","123");
        User Ann = new User(2,"Крипося","типо_пароль");
        User Test = new User();
        Test.setID();
        Test.setLogin("робот");
        Test.setPassword("951357");
        Test.getTextInfo();
    }
    
}
