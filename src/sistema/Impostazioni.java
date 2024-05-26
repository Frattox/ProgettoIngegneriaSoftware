package sistema;

import elementi.Posizione;

public interface Impostazioni {

    void setGiocatori(int n);

    void setTabellone(int r, int c);

    void setNumSerpenti(int n);

    void setNumScale(int n);

    void setPosSerpente(Posizione da, Posizione a);

    void setPosScala(Posizione da, Posizione a);

    void setNumDadi(int n);

}
