/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg106.внутренние_классы;

/**
 *
 * @author vovch
 */
public class Внутренние_классы {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyLine line = new MyLine(5,7,10,3);
        System.out.println("Начальная точка ("+line.PointStart.x+";"+line.PointStart.y+");Конечная точка ("+line.PointEnd.x+";"+line.PointEnd.y+")" );
    }
    
}
