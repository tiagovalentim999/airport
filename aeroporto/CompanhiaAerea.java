package aeroporto;

public class CompaniaAerea {

    private String nome;
    private double lucro;

    public CompaniaAerea(String nome, double lucro){
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
