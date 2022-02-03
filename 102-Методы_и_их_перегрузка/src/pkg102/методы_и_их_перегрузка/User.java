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
    
    public void getTextInfo(){
        System.out.println("Пользователь с ID "+id+" имеет логин "+login+" и пароль "+password);
    }
    public String getLogin(){
        return login;
    }
    public String getPassword(){
        return password;
    }
    public int getID(){
        return id;
    }
    public void setLogin(String name){
        this.login=name;
    }
    public void setPassword(String name){
        this.password=name;
    }
    public void setID(int id){
        this.id=id;
    }
    public void setLogin(){
        login="guest";
    }
    public void setID(){
        id=0;
    }
    public void setPassword(){
        password="";
    }
}
