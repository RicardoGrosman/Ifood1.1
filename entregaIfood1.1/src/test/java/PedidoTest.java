import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    private Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido();
    }

    @Test
    public void deveComecarEmEmPreparo() {
        assertEquals(EmPreparo.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveFinalizarPreparoQuandoEmPreparo() {
        pedido.setEstado(EmPreparo.getInstance());
        pedido.finalizarPreparo();
        assertEquals(ACaminho.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveCancelarQuandoEmPreparo() {
        pedido.setEstado(EmPreparo.getInstance());
        pedido.cancelar();
        assertEquals(Cancelado.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveEntregarQuandoEmPreparo() {
        pedido.setEstado(EmPreparo.getInstance());
        pedido.entregar();
        assertEquals(EmPreparo.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveEntregarQuandoACaminho() {
        pedido.setEstado(ACaminho.getInstance());
        pedido.entregar();
        assertEquals(Entregue.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveCancelarQuandoACaminho() {
        pedido.setEstado(ACaminho.getInstance());
        pedido.cancelar();
        assertEquals(Cancelado.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveFinalizarPreparoQuandoACaminho() {
        pedido.setEstado(ACaminho.getInstance());
        pedido.finalizarPreparo();
        assertEquals(ACaminho.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveFinalizarPreparoQuandoEntregue() {
        pedido.setEstado(Entregue.getInstance());
        pedido.finalizarPreparo();
        assertEquals(Entregue.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveEntregarQuandoEntregue() {
        pedido.setEstado(Entregue.getInstance());
        pedido.entregar();
        assertEquals(Entregue.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveCancelarQuandoEntregue() {
        pedido.setEstado(Entregue.getInstance());
        pedido.cancelar();
        assertEquals(Entregue.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveFinalizarPreparoQuandoCancelado() {
        pedido.setEstado(Cancelado.getInstance());
        pedido.finalizarPreparo();
        assertEquals(Cancelado.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveEntregarQuandoCancelado() {
        pedido.setEstado(Cancelado.getInstance());
        pedido.entregar();
        assertEquals(Cancelado.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveCancelarQuandoCancelado() {
        pedido.setEstado(Cancelado.getInstance());
        pedido.cancelar();
        assertEquals(Cancelado.getInstance(), pedido.getEstado());
    }
}