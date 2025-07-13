import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe sua idade: ");

        try {
            int idade = sc.nextInt();

            if (idade < 0) {
                System.out.println("Idade inválida. Digite um número positivo.");
            } else if (idade < 16) {
                System.out.println("Você não pode votar ainda.");
            } else if ((idade >= 16 && idade < 18) || idade >= 70) {
                System.out.println("O voto é opcional para você.");
            } else {
                System.out.println("O voto é obrigatório para você.");
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }

        sc.close();
    }
}
