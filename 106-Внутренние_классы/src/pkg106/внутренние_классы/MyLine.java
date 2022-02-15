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
public class MyLine {
    public MyPoint PointStart = new MyPoint();
    public MyPoint PointEnd= new MyPoint();
    class MyPoint{
        public int x;
        public int y;
    }
    public MyLine(int xbeg, int ybeg, int xend, int yend){
        PointStart.x=xbeg;
        PointStart.y=ybeg;
        PointEnd.x=xend;
        PointEnd.y=yend;
    }
}
