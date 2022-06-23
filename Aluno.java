package Main;

public class Aluno {
    private String nome;
    private int idade;
    private FichaDoAluno ficha;

    public Aluno(String nome, int idade, FichaDoAluno ficha) {
        this.nome = nome;
        this.idade = idade;
        this.ficha = ficha;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public FichaDoAluno getFicha() {
        return ficha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setFicha(FichaDoAluno ficha) {
        this.ficha = ficha;
    }
}
