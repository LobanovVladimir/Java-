/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg012.одномерные_массивы;

/**
 *
 * @author vovch
 */
public class Одномерные_массивы {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [] a={1,2,3,4,5};
        int i=0;
        double sum=0, pr=1;
        while(i!=5){
            sum+=a[i];
            i++;
        }
        for (int j = 0; j < 5; j++) {
            pr*=a[j];
        }
        System.out.println("Сумма равна "+sum+" а произведение "+pr);
    }
    
}
