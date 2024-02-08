package br.com.alura.comex;

import br.com.alura.comex.modelos.Cliente;
import br.com.alura.comex.modelos.Endereco;
import br.com.alura.comex.modelos.Produtos;

public class Exercicios {
    public static void main(String[] args) {
        // Exercicio 02
        Produtos produtos = new Produtos();
        produtos.nome = "Carteira";
        produtos.descricao = "Carteira de couro preta";
        produtos.precoUnitario = 72.20;
        produtos.quantidade = 3;

        // Exercicio 03
        Produtos produtos2 = new Produtos();
        produtos.nome = "Notebook";
        produtos.descricao = "Notebook Dell corei5";
        produtos.precoUnitario = 1472.20;
        produtos.quantidade = 10;

        if (produtos.equals(produtos2)){
            System.out.println("São iguais");
        }
        else {
            System.out.println("Não são iguais");
        }

        //Exercicio 04
        System.out.println(produtos.toString());

        //Exercicio 05
        Endereco endereco = new Endereco();
        endereco.bairro = "Heathrow";
        endereco.cidade = "Londres";
        endereco.rua = "Hounslow";
        endereco.complemento = " TW6";
        endereco.estado = "Londres";
        endereco.numero = 10;

        //Exercicio 06 e 07
        Cliente cliente = new Cliente("Renan");
        cliente.setEmail("Renangoesjunior@outlook.com");
        cliente.setTelefone("(xx) xxxxxx-xxxx");
        cliente.setCpf("134.456.789-10");
        cliente.setProfissao("Desenvolvedor");
        cliente.setEndereco(endereco);

        System.out.println(cliente.toString());
        System.out.println("A");

    }
}
