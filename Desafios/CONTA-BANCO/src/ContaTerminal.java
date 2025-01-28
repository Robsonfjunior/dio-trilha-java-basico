import java.util.Scanner;

public class ContaTerminal {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        //TODO: Conhcer e importar a classe Scanner
        
        Scanner sc = new Scanner(System.in);

        //Exibir as mensagens para o usuário

        System.out.print("Por favor, digite o número da conta: ");
        String numero = sc.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        int agencia = sc.nextInt();

        System.out.print("Por favor, digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Por favor, digite o vslor do deposito: ");
        double saldo = sc.nextDouble();

        //Obter pela Scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é a %d, conta %s e seu saldo %.2f já está disponível para saque", nome, agencia, numero, saldo);
        
    }
}
