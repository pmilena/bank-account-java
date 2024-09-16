import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String nome = "Tony Stark da Silva";
        String tipoConta = "Corrente";
        double saldo = 5840.54;
        String operacoesDisponiveis = """
                *Operações*
                
                1- Consultar Saldo
                2- Receber Valor
                3- Transferir Valor
                4- Sair
                
                Digite a opção desejada:
                """;

        System.out.println("""
                **********************************************
                Dados do Cliente
                **********************************************
                Nome: %s
                Tipo de Conta: %s
                Saldo inicial: %.2f
                """.formatted(nome, tipoConta, saldo));

        Scanner operacoes = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 4) {
            System.out.println(operacoesDisponiveis);
            opcao = operacoes.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("R$ " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser recebido: ");
                    double valorRecebido = operacoes.nextDouble();
                    saldo += valorRecebido;
                    System.out.println("Saldo Atual: R$ " + saldo);
                    break;

                case 3:
                    System.out.println("Digite o valor que deseja transferir: ");
                    double valorTransferido = operacoes.nextDouble();

                    if (saldo > valorTransferido) {
                        saldo -= valorTransferido;
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                    System.out.println("Saldo Atual: R$ " + saldo);
                    break;
                default:
                    if (opcao!=4) {
                        System.out.println("Você digitou um número inválido. Tente novamente.");
                    }
                    break;
            }
        }
                System.out.println("Você saiu!");
    }
}











