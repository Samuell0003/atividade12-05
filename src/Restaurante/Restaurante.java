package Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nome;
    private String endereco;
    private List<Item> menu;
    private List<Pedido> listPedido;

    
    public Restaurante(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.menu = new ArrayList<>();
        this.listPedido = new ArrayList<>();
    }

    public void adicionarItemMenu(Item e) {
        menu.add(e);
    }

    public void adicionarPedido(Pedido e) {
        listPedido.add(e);
    }

    public Double valorTotalPedido() {
        Double valorTotal = 0D;
        for (Pedido pedido : listPedido) {
            valorTotal += pedido.valorTotal();
        }

        return valorTotal;
    }

    public void exibirMenu() {
        for (Item e : menu) {
            System.out.println(e.getNome());
            System.out.println(e.getDescricao());
            System.out.println("R$ "+e.getValor());
        }
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public List<Item> getMenu() {
        return menu;
    }
    public void setMenu(List<Item> menu) {
        this.menu = menu;
    }
    public List<Pedido> getListPedido() {
        return listPedido;
    }
    public void setListPedido(List<Pedido> listPedido) {
        this.listPedido = listPedido;
    }
}
