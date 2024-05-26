package sistema;

import elementi.Posizione;

public interface Simulazione {

    void start();

    void nextStep();

    void previousStep();

    void pause();

    void resume();

    void stop();

    void undo();

    void redo();



}
