/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105.наследование;

/**
 *
 * @author vovch
 */
public class UserSocial extends User {
    private String name;
    private int age;
    
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public UserSocial(int id,String login,String password, String name, int age){
        super(id,login,password);
        this.name=name;
        this.age = age;
    }
    
}
