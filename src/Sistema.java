public class Sistema {
    public static void main(String[] args) {
        System.out.println("Realizando a soma de 2 valores");
        //defiindo os 2 valores para realizar a soma
        int numero1 = 23;
        int numero2 = 44;
        System.out.println("A soma de " + numero1 +" e "+ numero2 + " é "+ Calculadora.soma(numero1,numero2) );

        System.out.println("Instanciando a classe Aluno");

      Aluno joao = new Aluno(25484);
      Aluno renato = new Aluno("Renato", 35874);

    }
}
