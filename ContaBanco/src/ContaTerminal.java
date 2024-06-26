import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Entrada do dado agencia
        System.out.println("Digite número da agencia:");
        String agencia = scanner.next();

        //Entrada do dado número conta  
        System.out.println("Digite número da conta:");
        int numeroConta = scanner.nextInt();

        //Entrada de dado nome  
        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        //Entrada do dado saldo
        System.out.println("Digite seu saldo:");
        float saldo = scanner.nextFloat();

        //Imprimindo na tela
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " 
        + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
}
