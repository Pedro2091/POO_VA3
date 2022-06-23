package Main;

import java.util.ArrayList;

public class FichaDoAluno {
    private Treino treino;
    private ArrayList<AvaliacaoFisica> avaliacoes;

    public FichaDoAluno(Treino treino, ArrayList<AvaliacaoFisica> avaliacoes) {
        this.treino = treino;
        this.avaliacoes = avaliacoes;
    }

    public void relatorio(){
        System.out.println("\n\nIMC: " + this.avaliacoes.get(avaliacoes.size() - 1).calcularIMC() + "\nExercícios: ");
        for(int i=0; i < this.treino.pegarTodosExercicios().size(); i++){
            this.treino.pegarTodosExercicios().get(i).relatorioExercicio();
        }
        System.out.println("\n\n");
    }

    public Treino getTreino() {
        return treino;
    }

    public ArrayList<AvaliacaoFisica> getAvaliacoes() {
        return avaliacoes;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
    }

    public void setAvaliacoes(ArrayList<AvaliacaoFisica> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}
