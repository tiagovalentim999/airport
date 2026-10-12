package aeroporto;

public class Escala {

    private VooIndireto voo;
    private Aeroporto aeroporto;
    private boolean embarque;

    public Escala(VooIndireto voo, Aeroporto aeroporto, boolean embarque) {
        this.voo = voo;
        this.aeroporto = aeroporto;
        this.embarque = embarque;
    }

    public VooIndireto getVoo() {
        return voo;
    }
    public Aeroporto getAeroporto() {
        return aeroporto;
    }
    public boolean isEmbarque() {
        return embarque;
    }

}
