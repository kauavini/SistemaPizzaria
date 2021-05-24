
public class Item {
    private int codigo;
    private ProdutosCard prod;
    private int qtd;
    private double preco;

    public Item(int codigo, ProdutosCard prod, int qtd){
        this.codigo = codigo;
        this.prod = prod;
        this.qtd = qtd;
        this.preco = prod.getPreco_venda();
    }

    public String toString(){
        return "código " + this.codigo + " prod: " + this.prod + "qtd: " + this.qtd + "preço: " + this.preco;
    }
}

