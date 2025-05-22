public class Entregue extends PedidoEstado {
    private static Entregue instance = new Entregue();
    private Entregue() {}
    public static Entregue getInstance() { return instance; }

    public String getEstado() { return "Entregue"; }
}