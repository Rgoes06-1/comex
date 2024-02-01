package br.com.alura.comex.modelos;

public class Endereco {
   public String bairro;
   public String cidade;
   public String complemento;
    public String estado;
    public String rua;
    public   int numero;
    @Override
    public String toString() {

        return ">>>> Dados do endereço \n" +
                "Bairro: " + bairro + "\n" +
                "Cidade: " + cidade + "\n" +
                "Complemento: " + complemento + "\n" +
                "Estado: " + estado + "\n" +
                "Rua: " + rua + "\n" +
                "Número: " + numero;

    }
}
