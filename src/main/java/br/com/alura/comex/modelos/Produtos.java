package br.com.alura.comex.modelos;

public class Produtos {
    public String nome;
    public String descricao;
    public double precoUnitario;
    public int quantidade;

    @Override
    public String toString() {

        return ">>>> Dados do projeto \n" + "Nome: " + nome + "\n" +
                "Descrição: " + descricao + "\n" +
                "Preço Unitário: " + precoUnitario + "\n" +
                "Quantidade: " + quantidade;
    }
}
