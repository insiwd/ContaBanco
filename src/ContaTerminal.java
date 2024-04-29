import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Integer numero;
        Integer agencia;
        String nomeCliente;
        Double saldo;

        System.out.print("Por favor, digite o número da agência: ");
        agencia = sc.nextInt();

        System.out.print("Por favor, digite seu número: ");
        numero = sc.nextInt();

        sc.nextLine();

        System.out.print("Por favor, digite seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        saldo = sc.nextDouble();

        System.out.println();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo, " + saldo + ", já está disponível para saque");

        sc.close();
    }
}
