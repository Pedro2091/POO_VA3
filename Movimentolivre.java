package Main;

public class Movimentolivre extends Atividade{
    private String nome;
    private float carga;
    private int repeticoes;

    public Movimentolivre(String nome, float carga, int repeticoes) {
        this.nome = nome;
        this.carga = carga;
        this.repeticoes = repeticoes;
    }

    public void relatorioExercicio(){
        System.out.println("\nNome: " + this.nome + "\nCarga: " + this.carga + "\nNúmero de repetições: " + this.repeticoes + "\n");
    }

    public String getNome() {
        return nome;
    }

    public float getCarga() {
        return carga;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

}
