public class EmPreparo extends PedidoEstado {
    private static EmPreparo instance = new EmPreparo();
    private EmPreparo() {}
    public static EmPreparo getInstance() { return instance; }

    public String getEstado() { return "Em preparo"; }

    public void finalizarPreparo(Pedido pedido) {
        pedido.setEstado(ACaminho.getInstance());
    }

    public void cancelar(Pedido pedido) {
        pedido.setEstado(Cancelado.getInstance());
    }
}