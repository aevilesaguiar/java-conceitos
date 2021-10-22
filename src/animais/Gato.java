package animais;

public class Gato extends Animais {
    public void Gato(){
        this.setTipo("Mamíferos");
    }

    //imprime o som do gato
    @Override
    public void som() {
        System.out.println("Miau");
    }
}
