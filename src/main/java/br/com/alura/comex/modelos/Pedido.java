package br.com.alura.comex.modelos;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedido {
    private int Id;
    private Cliente cliente;
    private BigDecimal preco;
    private int quantidade;
    private LocalDate data;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    public boolean isMaisBaratoQue(Pedido outroPedido) {
        if(this.getValorTotal().compareTo(outroPedido.getValorTotal()) == -1) {
            return true;
        }else{
            return false;
        }
    }

    public boolean isMaisCaroQue(Pedido outroPedido) {
        if(this.getValorTotal().compareTo(outroPedido.getValorTotal()) == 1) {
            return true;
        }else{
            return false;
        }
    }

    public BigDecimal getValorTotal() {
        return this.preco.multiply(new BigDecimal(this.getQuantidade())) ;
    }
    @Override
    public String toString() {

        return ">>>> Dados do pedido <<<<\n" +
                "ID: " + getId() + "\n" +
                "Cliente: " + getCliente().getNome() + "\n" +
                "Preco: " + getPreco() + "\n"  +
                "Valor total: " + getValorTotal() + "\n" +
                "Data: " + getData() + "\n" +
                "-------------------------------------";
    }
}
