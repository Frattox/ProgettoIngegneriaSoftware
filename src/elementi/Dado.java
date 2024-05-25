package elementi;

import java.util.Random;

public class Dado {
    private final int facciate;

    public final int FACCIATE_DEFAULT = 6;

    public Dado(){this.facciate=FACCIATE_DEFAULT;}

    public Dado(int facciate){this.facciate=facciate;}

    public int lancia(){return (int)(1 + Math.random()*this.facciate);}


}
