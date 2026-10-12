    package aeroporto;

import java.time.LocalTime;

public class VooDireto extends Voo{

    public VooDireto(String numeroVoo, String portaEmbarque, double custoCliente,
                     LocalTime horaPartida, CompanhiaAerea companhia,
                     Aeroporto destino, Aeronave aeronave) {
        super(numeroVoo, portaEmbarque, custoCliente, horaPartida,
                companhia, destino, aeronave);
    }

    @Override
    public double calcularCusto() {
        return 0;
    }

}
