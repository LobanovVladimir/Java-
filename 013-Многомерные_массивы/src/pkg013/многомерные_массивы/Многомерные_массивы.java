/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg013.многомерные_массивы;

/**
 *
 * @author vovch
 */
public class Многомерные_массивы {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] a = new int [2][3];
        a[0][0]=1;
        a[0][1]=2;
        a[0][2]=3;
        a[1][0]=4;
        a[1][1]=5;
        a[1][2]=6;
        
        int sum=0,buff=0;
        int[] newmass = new int[2];
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
               System.out.print(a[i][j]+" ");
               if (i==0) buff+=a[i][j];
               sum+=a[i][j];
            }
            System.out.println();
        }
        newmass[0]=buff;
        newmass[1]=sum-buff;
        System.out.print("Сумма значений данного массива "+sum+" а суммы построчного массива выглядят так:");
        for (int i = 0; i < 2; i++) {
            System.out.print(newmass[i]+" ");
        }
        System.out.println();
    }
    
}
