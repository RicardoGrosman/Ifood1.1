public class PedidoFactory implements IPedidoFactory {
    public Pedido criarPedido() {
        return new Pedido();
    }
}