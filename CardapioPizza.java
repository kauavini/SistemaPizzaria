public class CardapioPizza extends ProdutosCard {
    private String ingredientes;
    
    public CardapioPizza(int codigo, String nome, double preco_venda, String ingredientes){
        super(codigo, nome, preco_venda);
        this.ingredientes = ingredientes;

    }

    public double valorCusto(){
        return (double) getPreco_venda() * 0.6;
    }
}