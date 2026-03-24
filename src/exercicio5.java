
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double horaaula, horastrabalhadas, desconto, bruto, salario;


        System.out.println("Digite o valor da hora-aula --> ");
        horaaula = sc.nextDouble();
        System.out.println("Digite o número de aulas trabalhadas --> ");
        horastrabalhadas = sc.nextDouble();

        bruto = horaaula * horastrabalhadas;
        System.out.println("O valor do salário bruto é: " + bruto);


        System.out.println("Digite o valor do desconto do INSS");
        desconto = sc.nextDouble();
        desconto = bruto * desconto/ 100;

        salario = bruto - desconto;
        System.out.println(" O valor do salário líquido é"+
                String.format("%.2f" , salario));
    }
}
