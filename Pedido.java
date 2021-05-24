import java.util.List;

public abstract class Pedido {
    private int codigo_pedido;
    private List<Item> itens;
    private String data;

    public Pedido(int codigo_prod, List<Item> itens, String data){
        this.codigo_pedido = codigo_prod;
        this.itens = itens;
        this.data = data;
    }

    public int getCodigo_pedido() {
        return codigo_pedido;
    }

    public List<Item> getItens() {
        return itens;
    }

    public String getData() {
        return data;
    }

    public void setCodigo_pedido(int codigo_pedido) {
        this.codigo_pedido = codigo_pedido;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public void setData(String data) {
        this.data = data;
    }


    
}
