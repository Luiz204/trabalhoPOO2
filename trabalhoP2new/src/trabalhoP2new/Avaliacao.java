package trabalhoP2new;

public class Avaliacao {
    private String nome;
    private double nota;

    public Avaliacao(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }
}