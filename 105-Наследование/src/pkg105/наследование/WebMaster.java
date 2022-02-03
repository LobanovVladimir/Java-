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
public class WebMaster extends User {
    private String web_site;
    
    public void setWeb(String site){
        this.web_site=site;
    }
    public String getWeb(){
        return web_site;
    }
    
    public WebMaster(int Id, String login, String password, String web){
        super(Id,login,password);
        web_site=web;
    }
}
