package t3Point;

public class Point {
    private int x =0;
    private  int y=0;

    public Point(int x, int y) {
        if (x>=0) {
            this.x = x;
        }
        if (y>=0) {
            this.y = y;
        }
    }

    public void print (){
        System.out.println("{" + x+"," + y + "}");
        return;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x>0) {
            this.x = x;
        }
        else {
            this.x = 0;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
