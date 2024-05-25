package elementi;

public class Scala extends Mezzo{
    private Scala(){}

    public Scala(Posizione from, Posizione to) {
        if(from==null || to==null || from.compareTo(to)>=0)
            throw new IllegalStateException();
        this.from = from.clone();
        this.to = to.clone();
    }
}
