package agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> list;

    public Agenda() {
        this.list = new ArrayList<>();
    }

    public void adicionarContato(Contato e) {
        list.add(e);
    }

    public void buscarContato(String nome) {
        for (Contato contato : list) {
            if (contato.getNome().toUpperCase().equals(nome.toUpperCase())) {
                System.out.println(contato.getNome());
            }
        }
    }

    public void excluitContato(Contato e ) {list.remove(e);}

    public void updateContato(Contato e) {
        int index = list.indexOf(e);

        list.get(index).setEmail(null);
        list.get(index).setNome(null);
        list.get(index).setTelefone(null);

    }
    public List<Contato> getList() {
        return list;
    }

    public void setList(List<Contato> list) {
        this.list = list;
    }

    
}
