package animais;

public class Animais {
    //variavel destinada ao tipo do animal(mamifero/repteis/aves/insetor...)

    private String tipo;
    //variavel destinada ao nome
    private String nome;

    //getter and setter tipo

    public String getTipo() {
        return this.tipo;
    }
  public void setTipo(){
        this.tipo=tipo;
  }

  //getter and setter nome


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void som(){
        System.out.println(" Au, Au!!!");
    }
}
