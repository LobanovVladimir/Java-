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
public class Наследование {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UserSocial us1 = new UserSocial(1,"abc","bca","Vasia",19);
        WebMaster us2 = new WebMaster(2,"log","pass","www_leningrad");
        us1.getTextInfo();
        us2.getTextInfo();
        System.out.println(us1.getName()+" "+us1.getAge());
        
        
    }
    
}
