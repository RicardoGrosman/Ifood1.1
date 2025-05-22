public class Cancelado extends PedidoEstado {
    private static Cancelado instance = new Cancelado();
    private Cancelado() {}
    public static Cancelado getInstance() { return instance; }

    public String getEstado() { return "Cancelado"; }
}