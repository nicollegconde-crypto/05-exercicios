import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario;
        int quilowatts;
        double valorquilowatts, conta;


        System.out.println("Digite o valor do quillowatt:");
        quilowatts = sc.nextInt();
        System.out.println("Digite o valor do salário:");
        salario = sc.nextDouble();

        valorquilowatts = salario / 7 / 100;
        conta= quilowatts * valorquilowatts;

        System.out.println("Valor da conta: " + conta);
        System.out.println("Valor do quilowatts: " + valorquilowatts);
        System.out.println("Valor da conta com 10% de desconto " + conta * 0.90);


    }
}
