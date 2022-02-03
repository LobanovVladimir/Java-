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
public class User {
    private int id;
    private String login,password;
    private Info information;
    
        public User(int id,String login, String password){
            this.id=id;
            this.login = login;
            this.password = password;
            this.information = new Info();
        }

    User() {
        this.information = new Info();
    }
    
    public void setInfo(String info){
        this.information.setData(info);
        this.information.showData();
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
    public class Info{
        private String data;
        public int nums;
        public boolean act;
        
        public Info(){
            data = "still null";
            nums = 0;
            act= false;
        }
        public void setData(String text){
            data=text;
        }
        public void showData(){
            System.out.println(data);
        }
    }
}
