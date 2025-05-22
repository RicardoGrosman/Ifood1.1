import java.util.Observable;

public class Pedido extends Observable {
    private PedidoEstado estado;

    public Pedido() {
        this.estado = EmPreparo.getInstance();
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
        setChanged();
        notifyObservers();
    }

    public PedidoEstado getEstado() {
        return estado;
    }

    public void finalizarPreparo() {
        estado.finalizarPreparo(this);
    }

    public void entregar() {
        estado.entregar(this);
    }

    public void cancelar() {
        estado.cancelar(this);
    }
}