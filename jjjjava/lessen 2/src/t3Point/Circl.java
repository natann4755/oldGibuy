package t3Point;

public class Circl {
   private Point p;
   private int Radus;

    public Circl(Point p, int radus) {
        this.p = p;
        Radus = radus;
    }

    public void print (){
//        p.print();
//        System.out.println( "r=" + Radus);

      System.out.println(p.getX()+" "+p.getY()+" r "+Radus);
    }

    public void chengh(int nx, int ny){
        p.setX(p.getX()+nx);
        p.setY(p.getY()+ny);
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public int getRadus() {
        return Radus;
    }

    public void setRadus(int radus) {
        Radus = radus;
    }
}
