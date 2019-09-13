
import java.util.ArrayList;

public abstract class FormaDeEntregaStrategy {
    public abstract double getValorEntrega(int peso) throws TipoEntregaInvalido;
}
