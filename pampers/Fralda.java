package pampers;

public class Fralda {
    private static String marca;
    private String modelo;
    private int quantidade;
    private String tamanho;
    private int preco;

    public Fralda(String marca, String modelo, int quantidade, String tamanho, int preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.quantidade = quantidade;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public static String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Fralda{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", quantidade=" + quantidade +
                ", tamanho='" + tamanho + '\'' +
                ", preco=" + preco +
                '}';
    }
}

