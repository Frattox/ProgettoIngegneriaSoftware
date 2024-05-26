package sistema;

import elementi.*;

import java.util.Collection;

public interface Sistema {

    Tabellone getTabellone();

    Collection<Dado> getDadi();

    Collection<Pedina> getPedine();

    Collection<Mezzo> getMezzi();

}
