import java.util.Observer;
import java.util.Observable;

public class Cliente implements Observer {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void update(Observable o, Object arg) {
        if (o instanceof Pedido) {
            Pedido pedido = (Pedido) o;
            System.out.println("Cliente " + nome + " foi notificado: Pedido está " + pedido.getEstado().getEstado());
        }
    }
}
