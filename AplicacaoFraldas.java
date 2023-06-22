import java.util.Scanner;

public class AplicacaoFraldas {
    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o peso do bebê: ");
        double peso = scanner.nextDouble();

        String tamanhoFralda = calcularTamanhoFralda(peso);
        String marcaFralda = calcularMarcaFralda(peso);

        System.out.println("Recomendação de fralda:");
        System.out.println("Tamanho: " + tamanhoFralda);
        System.out.println("Marca: " + marcaFralda);
    }

    public static String calcularTamanhoFralda(double peso) {
        if (peso <= 4) {
            return "RN";
        } else if (peso <= 6) {
            return "P";
        } else if (peso <= 9.5) {
            return "M";
        } else if (peso <= 12.5) {
            return "G";
        } else {
            return "GG";
        }
    }


    public static String calcularMarcaFralda(double peso) {
        String result = "Mamypoko";
        if (peso <= 4) {
            result = "Huggies";
        } else if (!(peso <= 5)) if (peso <= 6) {
            result = "Baby sec";
        } else if (peso <= 9.5) {
            result = "Pampers";
        }
        return result;
    }
}
