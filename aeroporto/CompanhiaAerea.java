package aeroporto;

public class CompanhiaAerea {

    private String nome;
    private double lucro;

    public CompanhiaAerea(String nome, double lucro){
        this.nome = nome;
        this.lucro = lucro;
    }

    public String getNome() {
        return nome;
    }

    public double getLucro() {
        return lucro;
    }
}
