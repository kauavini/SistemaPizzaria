import java.util.LinkedList;
import java.util.List;

public class SistemaPizzaria {
    private List<Clientes> clientes;
    private List<PedidoPizzaria> pedidoPizzaria;
    private List<PedidosPhone> pedidoTelefone;
    private List<ProdutosCard> produtos;
    
    public SistemaPizzaria(){
        this.clientes = new LinkedList<Clientes>();
        this.pedidoPizzaria = new LinkedList<PedidoPizzaria>();
        this.pedidoTelefone = new LinkedList<PedidosPhone>();
        this.produtos = new LinkedList<ProdutosCard>();
    }

    // funções para o CLIENTE

    public boolean AddCli(Clientes cli){
        clientes.add(cli);
        return true;
    }

    public String Pesquisar(int cod){
        for(Clientes cli: clientes){
            if(cli.getCodigo() == cod){
                return cli.toString();
            }

        }
        return null;
    }

    public boolean Atualizar(int cod, String nome, String endereco, String phone){
        int i = 0;
        for(Clientes cli: clientes){
            if(cli.getCodigo() == cod){
                clientes.set(i, new Clientes(cli.getCodigo(), nome, endereco, phone));
                return true;
            }
            i++;
          }
          return false;
        }


    public boolean RemoveCli(int cod){
        for(Clientes cli: clientes){
            if(cli.getCodigo() == cod){
                clientes.remove(cli);
                
                return true;
             }
        }
        return false;
    }

    public void EmitirRelat(){
        for(Clientes cli: clientes){
            System.out.println(cli.toString());
            }
    }

    // funções para o CARDÁPIO

    public boolean AddCard(ProdutosCard card){
        produtos.add(card);
        return true;
    }

    public String PesquisarCard(int cod){
        for(ProdutosCard prod: produtos){
            if(prod.getCodigo() == cod){
                return prod.toString();
            }

        }
        return null;
    }

    public boolean AtualizarCardPizza(int cod, String nome, double preco_venda, String ingredientes){
        int i = 0;
        for(ProdutosCard prod: produtos){
            if(prod.getCodigo() == cod){
                produtos.set(i, new CardapioPizza(prod.getCodigo(), nome, preco_venda, ingredientes));
                 return true;
            }
            i++;
        }
        return false;
    }

    public boolean AtualizarCardBebida(int cod, String nome, double preco_venda){
        int i = 0;
        for(ProdutosCard prod: produtos){
            if(prod.getCodigo() == cod){
                produtos.set(i, new CardapioBebida(prod.getCodigo(), nome, preco_venda));
                return true;
            }
            i++;
        }
        return false;
     }    


    public boolean RemoveCard(int cod){
        for(ProdutosCard prod: produtos){
            if(prod.getCodigo() == cod){
                clientes.remove(prod);
                
                return true;
             }
        }
        return false;
    }

    public void EmitirRelatCard(){
        for(ProdutosCard prod: produtos){
            System.out.println(prod.toString());
            }
    }

    // funções para o PEDIDO NA PIZZARIA

    public boolean AddPedidoPizzaria(PedidoPizzaria ped){
        pedidoPizzaria.add(ped);
        return true;
    }

    public String pesquisarPedidoPizzaria(int cod){
        for(PedidoPizzaria ped: pedidoPizzaria){
            if(ped.getCodigo_pedido() == cod){
                return ped.toString();
            }

        }
        return null;
    }

    public boolean AtualizarPedidoPizzaria(int cod, List<Item> itens, String data){
        int i = 0;
        for(PedidoPizzaria ped: pedidoPizzaria){
            if(ped.getCodigo_pedido() == cod){
                pedidoPizzaria.set(i, new PedidoPizzaria(ped.getCodigo_pedido(), itens, data));
                 return true;
            }
            i++;
        }
        return false;
    }
  


    public boolean RemoverPedidoPizzaria(int cod){
        for(PedidoPizzaria ped: pedidoPizzaria){
            if(ped.getCodigo_pedido() == cod){
                clientes.remove(ped);
                
                return true;
             }
        }
        return false;
    }

    public void EmitirRelatPedidoPizzaria(){
        for(PedidoPizzaria ped: pedidoPizzaria){
            System.out.println(ped.toString());
            }
    }

    // funções para o PEDIDO NO TELEFONE

    public boolean AddPedidoPhone(PedidosPhone ped){
        pedidoTelefone.add(ped);
        return true;
    }

    public String pesquisarPedidoPhone(int cod){
        for(PedidosPhone ped: pedidoTelefone){
            if(ped.getCodigo_pedido() == cod){
                return ped.toString();
            }

        }
        return null;
    }

    public boolean AtualizarPedidoPhone(int cod, Clientes cli, List<Item> itens, String data){
        int i = 0;
        for(PedidosPhone ped: pedidoTelefone){
            if(ped.getCodigo_pedido() == cod){
                pedidoTelefone.set(i, new PedidosPhone(ped.getCodigo_pedido(), cli, itens, data));
                 return true;
            }
            i++;
        }
        return false;
    }
  


    public boolean RemoverPedidoPhone(int cod){
        for(PedidosPhone ped: pedidoTelefone){
            if(ped.getCodigo_pedido() == cod){
                clientes.remove(ped);
                
                return true;
             }
        }
        return false;
    }

    public void EmitirRelatPedidoPhone(){
        for(PedidosPhone ped: pedidoTelefone){
            System.out.println(ped.toString());
            }
    }





// para todos os PEDIDOS

public List<Pedido> EmitirRelatorioTodosPedidos(){
    List<Pedido> ped = new LinkedList<Pedido>();
    for(PedidoPizzaria pedP: pedidoPizzaria){
        ped.add(pedP);
        }
    for(PedidosPhone pedT: pedidoTelefone){
        ped.add(pedT);
    }

    return ped;
    }
}
