package Restaurante;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Item> list;
    private LocalDateTime horario;

    public Pedido() {
        this.list = new ArrayList<>();
        this.horario = LocalDateTime.now();
    }

    public List<Item> getList() {
        return list;
    }
    public Double valorTotal() {
        Double valorTotal = 0D;
        for (Item item : list) {
            valorTotal += item.getValor();
        }

        return valorTotal;
    }
    public void setList(List<Item> list) {
        this.list = list;
    }

    public void adicionarItem(Item e) {
        this.list.add(e);
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }
    
}
