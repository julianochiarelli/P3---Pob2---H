
import java.util.ArrayList;

public abstract class FormaDeEntregaStrategy {
    public abstract double getValorEntrega(Pedido pedido) throws TipoEntregaInvalido;
}
