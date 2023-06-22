package pampers;

public class Calculo extends Fralda {
    int valorUnitario;

    public Calculo(String marca, String modelo, int quantidade, String tamanho, int preco) {
        super(marca, modelo, quantidade, tamanho, preco);
    }



    public static void main(String[] args) {

        Fralda pampers = new Fralda("Pampers", "natural care", 48, "RN", 48);
        System.out.println(pampers.getModelo(), getMarca());


    }
}
