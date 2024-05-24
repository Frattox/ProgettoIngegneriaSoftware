package elementi;

public class TabelloneMatrix extends Tabellone{

    //PATTERN BRIDGE
    private  Casella[][] tabella;

    private TabelloneMatrix()
    {
        super();
        tabella = new Casella[this.R][this.C];
    }

    private TabelloneMatrix(int R, int C)
    {
        super(R,C);
        tabella = new Casella[this.R][this.C];
    }


    @Override
    public Tabellone create(){return new TabelloneMatrix();}

    @Override
    public Tabellone create(int R, int C){return new TabelloneMatrix(R,C);}


}
