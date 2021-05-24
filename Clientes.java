public class Clientes{
    private int codigo;
    private String nome;
    private String endereco;
    private String phone;

    public Clientes(int codigo, String nome, String endereco, String phone){
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.phone = phone;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getPhone() {
        return phone;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString(){
        return "código " + this.codigo + " nome: " + this.nome + "endereço: " + this.endereco + "telefone: " + this.phone;  
    }    
}