public class Aluno {
    private  int matricula; // variavel destinada ao numro da matricula do aluno
    private String nome;

    public Aluno( int numeroMatricula){//método construtor que recebe um atributo
        this.matricula=numeroMatricula;
        System.out.println("Novo Aluno - matricula "+ this.matricula);
    }
    public Aluno( String nomeAluno, int numeroMatricula){//método construtor que recebe dois atributo
        this.nome=nomeAluno;
        this.matricula=numeroMatricula;
        System.out.println("Novo Aluno - matricula "+ this.matricula + " Nome: "+this.nome);

    }
}
