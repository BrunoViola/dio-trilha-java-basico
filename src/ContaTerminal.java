import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double saldo = 237.48;

        System.out.println("Seja bem vindo ao sistema do seu Banco");
        
        System.out.println("Neste momento queremos saber o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o código de identificação da sua agência: ");
        String agencia = sc.nextLine();

        System.out.println("Por favor, informe o número da sua conta: ");
        int numeroConta = sc.nextInt();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nome, agencia, numeroConta, saldo);


    }
}
