import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // TODO: Conhecer e importar a classe scanner
        // Exibir mensagens para o usuário
        // Obter pela classe scanner os valores digitados pelo usuario
        // Exibir a mensagem final no terminal
        Conta contaBancaria = new Conta();
        Scanner scan = new Scanner(System.in);

        int opcao;

        System.out.println("Escolha uma das opções a seguir: \n");
        System.out.println("1 - Criar conta: \n");       
        System.out.println("2 - Acessar conta: \n");
        opcao = scan.nextInt();

        if (opcao == 1) {
            System.out.println("\nDigite seu nome completo: \n");
            contaBancaria.nomeCliente = scan.next();
            System.out.println("\nDigite o número da sua conta bancária: \n");
            contaBancaria.numeroConta = scan.nextInt();
            System.out.println("\nDigite o número da sua agência: \n");
            contaBancaria.agencia = scan.next();
            System.out.println("\n***** Bem Vindo(a) ao banco S' Digital *****\n");
            System.out.println(
                    "\n Olá " + contaBancaria.getNomeCliente()
                    + " , obrigado por criar uma conta em nosso banco,"
                    + " sua agência é " + contaBancaria.getAgencia() 
                    + " conta " + contaBancaria.getNumeroConta()
                    + " e seu saldo " + contaBancaria.getSaldo() 
                    + " já está disponível para saque.\n");

        } else {
            System.out.println("\nAcesso a sua conta digital:\n");

            System.out.println("Digite seu nome completo: \n");
            contaBancaria.nomeCliente = scan.next();
            System.out.println("\nDigite o número da sua conta bancária: \n");
            contaBancaria.numeroConta = scan.nextInt();
            System.out.println("\nDigite o número da sua agência: \n");
            contaBancaria.agencia = scan.next();

            System.out.println("\n***** Bem Vindo(a) ao banco S' Digital *****\n");
            System.out.println(contaBancaria + "\n");
            System.out.println("\n***** Obrigada por usar o Banco S' Digital. Volte Sempre! *****\n");
        }

        scan.close();

    }

}
