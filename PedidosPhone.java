import java.util.List;

public class PedidosPhone extends Pedido{
    private Clientes cli;

    public PedidosPhone(int codigo, Clientes cli, List<Item> itens, String data){
        super(codigo, itens, data);
        this.cli = cli;
     }

     public String toString(){
         return super.toString() + "cliente: " + this.cli;
     }
}