package elementi;

public class PedinaXY implements Pedina{

    private int x;
    private int y;

    @Override
    public int setX(int x) {
        int ret = this.x;
        this.x = x;
        return ret;
    }

    @Override
    public int setY(int y) {
        int ret = this.y;
        this.y = y;
        return ret;
    }

    @Override
    public int getX() {return this.x;}

    @Override
    public int getY() {return this.y;}

}
