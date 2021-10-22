package animais;

public class Main {
    public static void main(String[] args) {
        System.out.println("O som dos meus animais");

        Gato meuGato = new Gato();//instanciando o objeto Gato
        System.out.println("Meu gato faz");
        meuGato.som();//executando o método som do objeto Gato

        Sapo meuSapo = new  Sapo(); //instanciando o objeto Sapo
        System.out.println("Meu sapo faz");
        meuSapo.som();//executando o método som do objeto Sapo

        Galinha minhaGalinha = new Galinha();//instanciando o objeto Galinha
        System.out.println("Minha Galinha faz");
        minhaGalinha.som();//Executando o método som do objeto Galinha
    }
}
