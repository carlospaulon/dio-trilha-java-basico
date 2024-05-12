import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldoCliente;

        System.out.println("Seja bem-vindo ao Banco Terminal, vamos criar a sua conta?!");
        System.out.println("Por favor, digite o número da Conta:");
        numeroConta = sc.nextInt();
        System.out.println("Por favor, digite o número da agência:");
        agencia = sc.next();
        System.out.println("Por favor, informe o seu nome: ");
        sc.nextLine();
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, informe o seu saldo atual: ");
        saldoCliente = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque. " , nomeCliente, agencia, numeroConta, saldoCliente );
        sc.close();
    }
}