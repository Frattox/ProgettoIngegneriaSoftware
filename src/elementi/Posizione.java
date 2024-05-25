package elementi;

public class Posizione implements Cloneable{
    private int x;
    private int y;

    private Posizione(){}

    public Posizione(int x, int y) {
        if(x<0 || y<0) throw new IllegalStateException();
        this.x = x;
        this.y = y;
    }

    public int getX() {return x;}

    public void setX(int x) {this.x = x;}

    public int getY() {return y;}

    public void setY(int y) {this.y = y;}

    public int compareTo(Posizione p) {
        if(this.x==p.x)
            return Integer.compare(this.y,p.y);
        return Integer.compare(this.x,p.x);
    }


    @Override
    public Posizione clone() {
        try {
            Posizione clone = (Posizione) super.clone();
            clone.x = this.x;
            clone.y = this.y;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
