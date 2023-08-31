import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Nome do cliente: ");
        String clientName = scanner.nextLine();

        System.out.println("Número da agência: ");
        String agencyNumber = scanner.nextLine();

        System.out.println("Número da conta: ");
        int accountNumber = scanner.nextInt();

        System.out.println("Saldo: ");
        double balance = scanner.nextDouble();

        System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencyNumber + ", conta " + accountNumber + " e seu saldo de R$" +
                balance + " já está disponível para saque!");
    }
}
