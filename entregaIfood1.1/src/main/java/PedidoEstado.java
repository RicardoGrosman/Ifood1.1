public abstract class PedidoEstado {
    public abstract String getEstado();

    public void finalizarPreparo(Pedido pedido) {}
    public void entregar(Pedido pedido) {}
    public void cancelar(Pedido pedido) {}
}