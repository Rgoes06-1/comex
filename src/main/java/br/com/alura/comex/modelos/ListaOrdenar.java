package br.com.alura.comex.modelos;

import java.util.ArrayList;
import java.util.Comparator;

public class ListaOrdenar {
    ArrayList<Pedido> listaPedido = new ArrayList<>();

    public void adicionarPedido(Pedido pedido) {
        this.listaPedido.add(pedido);
    }

    public ArrayList<Pedido> retornarPedido() {
        return listaPedido;
    }
    public ArrayList<Pedido> retonarListaOrdenada() {
        this.listaPedido.sort(Comparator.comparing(Pedido::getValorTotal));
        return listaPedido;
    }

    public ArrayList<Pedido> retornarListaOrdenadaReversa() {
        this.listaPedido.sort(Comparator.comparing(Pedido::getValorTotal).reversed());
        return listaPedido;
    }


}
