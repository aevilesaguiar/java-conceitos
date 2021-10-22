package animais;

public class Sapo extends Animais {
    public void Sapo(){
        this.setTipo("anfibio");
    }
    //método que imprimeo som do sapo
    @Override
    public void som(){
        System.out.println("Frog");
    }

}
