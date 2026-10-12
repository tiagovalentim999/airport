package aeroporto;

import java.time.LocalTime;

public class VooIndireto extends Voo{

    private double taxa;

    public VooIndireto(String numeroVoo, String portaEmbarque, double custoCliente,
                       LocalTime horaPartida, CompanhiaAerea companhia,
                       Aeroporto destino, Aeronave aeronave, double taxa) {
        super(numeroVoo, portaEmbarque, custoCliente, horaPartida,
                companhia, destino, aeronave);
        this.taxa = taxa;
    }

    @Override
    public double calcularCusto() {
        return 0;
    }

    public double getTaxa() {
        return taxa;
    }

}
