package br.com.alura.comex;

import br.com.alura.comex.modelos.Cliente;
import br.com.alura.comex.modelos.Endereco;
import br.com.alura.comex.modelos.Pedido;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TestaPedido {
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

        Pedido pedido = new Pedido();
        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();

        pedido1.setId(2);
        pedido1.setCliente(cliente);
        pedido1.setPreco(BigDecimal.valueOf(180.00));
        pedido1.setQuantidade(20);
        pedido1.setData(LocalDate.now());

        pedido2.setId(3);
        pedido2.setCliente(cliente);
        pedido2.setPreco(BigDecimal.valueOf(130.00));
        pedido2.setQuantidade(40);
        pedido2.setData(LocalDate.now());

        pedido.setId(1);
        pedido.setCliente(cliente);
        pedido.setPreco(BigDecimal.valueOf(70.00));
        pedido.setQuantidade(10);
        pedido.setData(LocalDate.now());

        System.out.println(pedido.toString());

    }
}
