package aeroporto;

import java.time.LocalTime;

public abstract class Voo {

    private String numeroVoo;
    private String portaEmbarque;
    private double custoCliente;
    private LocalTime horaPartida;
    private CompanhiaAerea companhia;
    private Aeroporto destino;
    private Aeronave aeronave;

    public Voo(String numeroVoo, String portaEmbarque, double custoCliente,
               LocalTime horaPartida, CompanhiaAerea companhia,
               Aeroporto destino, Aeronave aeronave) {
        this.numeroVoo = numeroVoo;
        this.portaEmbarque = portaEmbarque;
        this.custoCliente = custoCliente;
        this.horaPartida = horaPartida;
        this.companhia = companhia;
        this.destino = destino;
        this.aeronave = aeronave;
    }

    public abstract double calcularCusto();

    public String getNumeroVoo() {
        return numeroVoo;
    }
    public String getPortaEmbarque() {
        return portaEmbarque;
    }
    public double getCustoCliente() {
        return custoCliente;
    }
    public LocalTime getHoraPartida() {
        return horaPartida;
    }
    public CompanhiaAerea getCompanhia() {
        return companhia;
    }
    public Aeroporto getDestino() {
        return destino;
    }
    public Aeronave getAeronave() {
        return aeronave;
    }

}
