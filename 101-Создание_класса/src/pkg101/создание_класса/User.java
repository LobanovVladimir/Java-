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
public class User {
    int id;
    String login,password;
    
        public User(int id,String login, String password){
            this.id=id;
            this.login = login;
            this.password = password;
        }

    User() {
        
    }
}
