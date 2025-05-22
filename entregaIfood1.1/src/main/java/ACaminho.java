public class ACaminho extends PedidoEstado {
    private static ACaminho instance = new ACaminho();
    private ACaminho() {}
    public static ACaminho getInstance() { return instance; }

    public String getEstado() { return "A caminho"; }

    public void entregar(Pedido pedido) {
        pedido.setEstado(Entregue.getInstance());
    }

    public void cancelar(Pedido pedido) {
        pedido.setEstado(Cancelado.getInstance());
    }
}