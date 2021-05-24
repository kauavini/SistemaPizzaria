public class CardapioBebida extends ProdutosCard {
    
    public CardapioBebida(int codigo, String nome, double preco_venda){
        super(codigo, nome, preco_venda);

    }

    public double valorCusto(){
        return (double) getPreco_venda() * 0.5;
    }
}
