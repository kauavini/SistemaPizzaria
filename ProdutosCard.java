public abstract class ProdutosCard {
    private int codigo;
    private String nome;
    private double preco_venda;

    public ProdutosCard(int codigo, String nome, double preco_venda){
        this.codigo = codigo;
        this.nome = nome;
        this.preco_venda = preco_venda;
    }

    public abstract double valorCusto();
    

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco_venda() {
        return preco_venda;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco_venda(double preco_venda) {
        this.preco_venda = preco_venda;
    }
    
}
