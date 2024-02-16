package br.com.alura.comex;

import br.com.alura.comex.modelos.Cliente;
import br.com.alura.comex.modelos.Endereco;
import br.com.alura.comex.modelos.ListaOrdenar;
import br.com.alura.comex.modelos.Pedido;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class TestaPedidoOrdenado {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.bairro = "Heathrow";
        endereco.cidade = "Londres";
        endereco.rua = "Hounslow";
        endereco.complemento = " TW6";
        endereco.estado = "Londres";
        endereco.numero = 10;

        Cliente cliente = new Cliente("Renan");
        cliente.setEmail("Renangoesjunior@outlook.com");
        cliente.setTelefone("(xx) xxxxxx-xxxx");
        cliente.setCpf("134.456.789-10");
        cliente.setProfissao("Desenvolvedor");
        cliente.setEndereco(endereco);

        Pedido pedido1 = new Pedido();
        pedido1.setId(1);
        pedido1.setCliente(cliente);
        pedido1.setPreco(BigDecimal.valueOf(10.00));
        pedido1.setQuantidade(5);
        pedido1.setData(LocalDate.now());

        Pedido pedido2 = new Pedido();
        pedido2.setId(2);
        pedido2.setCliente(cliente);
        pedido2.setPreco(BigDecimal.valueOf(35.00));
        pedido2.setQuantidade(2);
        pedido2.setData(LocalDate.now());

        Pedido pedido3 = new Pedido();
        pedido3.setId(3);
        pedido3.setCliente(cliente);
        pedido3.setPreco(BigDecimal.valueOf(78.30));
        pedido3.setQuantidade(4);
        pedido3.setData(LocalDate.now());

        Pedido pedido4 = new Pedido();
        pedido4.setId(4);
        pedido4.setCliente(cliente);
        pedido4.setPreco(BigDecimal.valueOf(5.30));
        pedido4.setQuantidade(8);
        pedido4.setData(LocalDate.now());

        Pedido pedido5 = new Pedido();
        pedido5.setId(5);
        pedido5.setCliente(cliente);
        pedido5.setPreco(new BigDecimal("98.99"));
        pedido5.setQuantidade(1);
        pedido5.setData(LocalDate.now());

        ListaOrdenar listaPedidos = new ListaOrdenar();
        listaPedidos.adicionarPedido(pedido1);
        listaPedidos.adicionarPedido(pedido2);
        listaPedidos.adicionarPedido(pedido3);
        listaPedidos.adicionarPedido(pedido4);
        listaPedidos.adicionarPedido(pedido5);

        System.out.println(listaPedidos.retornarPedido());

        System.out.println("--------- Lista ordenada --------");
        System.out.println(listaPedidos.retonarListaOrdenada());
        System.out.println("------------ Lista ordenada reversa ----------");
        System.out.println(listaPedidos.retornarListaOrdenadaReversa());
    }

}
