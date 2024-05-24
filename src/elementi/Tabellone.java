package elementi;

public abstract class Tabellone {
    protected int R,C;
    protected final int R_DEFAULT=10, C_DEFAULT=10;

    //Crea il tabellone di default
    protected Tabellone(){this.R = R_DEFAULT; this.C = C_DEFAULT;}

    //Crea il tabellone personalizzato
    protected Tabellone(int R, int C){this.R=R; this.C=C;}


    //PATTERN FACTORY METHOD: tabellone default
    public abstract Tabellone create();

    //PATTERN FACTORY METHOD: tabellone personalizzato
    public abstract Tabellone create(int R, int C);


}
