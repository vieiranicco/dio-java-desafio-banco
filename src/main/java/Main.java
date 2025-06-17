import java.util.Scanner;
import java.util.Locale;

public class Main {

    private final static String accountMessage = "Por favor, digite o número da sua Conta";
    private final static String agencyMessage = "Por favor, digite o número da sua Agencia";
    private final static String clientNameMessage = "Por favor, digite o seu Nome completo";
    private final static String depositMessage = "Digite o valor a ser depositado";

    public static void main (String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println(accountMessage);
        int account = scanner.nextInt();
        System.out.println(agencyMessage);
        int agency = scanner.nextInt();
        scanner.nextLine();
        System.out.println(clientNameMessage);
        var clientName = scanner.nextLine();
        System.out.println(depositMessage);
        double deposit = scanner.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo de R$%.2f já está disponível para saque.", clientName, agency, account, deposit);
        scanner.close();

    }
}