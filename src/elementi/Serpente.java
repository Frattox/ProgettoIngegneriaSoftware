package elementi;

public class Serpente extends Mezzo{
    private Serpente(){}

    public Serpente(Posizione from, Posizione to) {
        if(from==null || to==null || from.compareTo(to)<=0)
            throw new IllegalStateException();
        this.from = from.clone();
        this.to = to.clone();
    }
}
