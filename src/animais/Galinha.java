package animais;

import com.sun.jdi.VoidType;

public class Galinha extends Animais {
    public void Galinha(){
        this.setTipo("Aves");
    }

    //método que imprime o som da galinha
    @Override
    public void som(){
        System.out.println("Cocoricó");
    }
}
