import java.util.*;

public class ContaTerminal {


    public static void main(String[] args) throws Exception {

        //TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner (System.in);

        //Exibir as mensagens para o nosso usuario
        //Obter pela Scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número de sua Conta! ");
        int numero = sc.nextInt();

        System.out.println("Agora digite a sua agência com o traço. Ex.: 0000-x ");
        //por ter traço não iremos de int, iremos de String
        String agencia = sc.next();
        
        System.out.println("Digite o seu nome e sobrenome! ");
        String nomeCliente = sc.next();

        System.out.println("Por ultimo, digite o seu saldo ");
        double saldo = sc.nextDouble();

        sc.close();

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " ,conta " + numero + " e seu saldo " + saldo + " já está disponível para saque. ");
        

    }
}
