import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Bem vindo ao banco XXXX!");

            System.out.print("Número da conta: ");
            int numero = sc.nextInt();
            sc.nextLine();
            System.out.print("Agencia da conta: ");
            String agencia = sc.nextLine();
            System.out.print("Nome do cliente: ");
            String nome = sc.nextLine();
            System.out.print("Saldo da conta: ");
            double saldo = sc.nextDouble();

            System.out.printf(
                    "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque",
                    nome, agencia, numero, saldo);
        } catch (InputMismatchException e) {
            System.out.println("Erro na leitura de dados");
        }
        sc.close();
    }
}
