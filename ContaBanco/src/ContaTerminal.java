import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua Agencia");
        String agencia = scanner.next();

        System.out.println("Digite sua conta");
        String conta = scanner.next();

        System.out.println("Digite seu saldo");
        String saldo = scanner.next();

        // imprimindo os dados obtidos pelo usuario
        System.out
                .println("Olá " + nome + " " + sobrenome
                        + ", obrigado por criar uma conta em nosso banco, sua agência é "
                        + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
