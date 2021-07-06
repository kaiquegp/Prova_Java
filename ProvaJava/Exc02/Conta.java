package ProvaJava;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*1. Modele uma conta. Uma conta bancária mesmo.
A ideia aqui é apenas modelar, isto é, só identifique que informações são importantes.
Desenhe no papel tudo o que uma Conta tem e tudo o que ela faz. Ela deve ter o nome do titular (String), o número (int), a agência (String), o saldo (double) e uma data de 
abertura (String). Além disso, ela deve fazer as seguintes ações: saca, para retirar um valor do saldo; deposita, para adicionar um valor ao saldo; calculaRendimento, para 
devolver o rendimento mensal dessa conta.
Essa atividade deve ser entregue de forma gráfica. Pode utilizar qualquer ferramenta que ache interessante.

2. Transforme o modelo acima em uma classe Java. Teste-a, usando uma outra classe que tenha o main.
Você deve criar a classe da conta com o nome Conta , mas pode nomear como quiser a classe de testes, por exemplo pode chamá-la TestaConta , contudo, ela deve necessariamente 
possuir o método main.*/

public class Conta {
    Scanner sc =  new Scanner(System.in);
    
    String NomeTitu;
    int NumeroConta;
    String Agencia;
    double Saldo;
    String DataAbertura;
    double rendimento;
    
    /*Metodo construtor*/
    public Conta(String NomeTitu, int NumeroConta, String Agencia, double Saldo, String DataAbertura) {
        this.NomeTitu = NomeTitu;
        this.NumeroConta = NumeroConta;
        this.Agencia = Agencia;
        this.Saldo = Saldo;
        this.DataAbertura = DataAbertura;
    }
    
    /*Metodos get e set*/
    public String getNomeTitu() {
        return NomeTitu;
    }

    public void setNomeTitu(String NomeTitu) {
        this.NomeTitu = NomeTitu;
    }

    public int getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(int NumeroConta) {
        this.NumeroConta = NumeroConta;
    }

    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String Agencia) {
        this.Agencia = Agencia;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public String getDataAbertura() {
        return DataAbertura;
    }

    public void setDataAbertura(String DataAbertura) {
        this.DataAbertura = DataAbertura;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
    
    
    /*Metodos com funçoes*/
    
     public void BemVindo(){
        System.out.println("Bem Vindo  ao Banco de dados!");      
        System.out.println("Por favor, digite o seu nome:");
        NomeTitu = sc.nextLine();
        System.out.println("Agora, digite o número da sua conta:");
        NumeroConta = sc.nextInt(); 
        System.out.println("Por último, digite a sua Âgencia:");
        Agencia = sc.next(); 
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data de criação da conta: "+dtf.format(LocalDateTime.now()));
    }
  
    public void Status(){
         System.out.println("Titular:" +NomeTitu+"\nNúmero da conta: "+NumeroConta+"\nAgência: "+Agencia+"\nConta criada em: "+DataAbertura);  
    }
    
     public void Status1(){
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         System.out.println("\nDados da conta");
         System.out.println("Titular:" +NomeTitu +"\nNúmero da conta: "+NumeroConta+"\nAgência: "+Agencia+"\nConta criada com sucesso em: "+dtf.format(LocalDateTime.now()));  
    }
        
    public void Saque( int saque ){
        if (saque <= Saldo){
            Saldo -= saque;
            System.out.println("Seu saque de " +saque+ " Reais foi reaizado com sucesso. \nSaldo Atual: " + Saldo+ " Reais.");
        } else if (saque > Saldo){
            while ( saque > Saldo){
            System.out.println("\nO saque realizado é mmaior que o saldo disponivel, por favor entre com um valor válido: ");
            saque = sc.nextInt();
            } 
            Saldo -= saque;
            System.out.println("Seu saque de " +saque+ " Reais foi reaizado com sucesso. \nSaldo Atual: " + Saldo+ " Reais.");
        } else {
            System.out.println("ERRO[]");
        }
    }
    
    public void Deposito( int dep){
        Saldo += dep;
        System.out.println("Seu Depósito de " +dep+ " Reais foi reaizado com sucesso. \nSaldo Atual: " + Saldo+ " Reais.");
    }
    
     public void Saldo(){
        System.out.println("Saldo Atual: " + Saldo+ " Reais.");
    }
     
     
    public void CalculoRendimento(){
        rendimento = (Saldo/200);
        System.out.println("O rendimento é calculado com o acréscimo de 0.5% do seu saldo.");
        System.out.println("Com o saldo  atual, seu rendimento mensal é de: " + rendimento+ " Reais.");
        System.out.println("Saldo final: "+(Saldo+rendimento)+ " Reais.");
    }
    
    public void Saida(){
       System.out.println("Obrigado pela preferência " +NomeTitu+ ". \nO banco de dados agradece e até a próxima.");      
    }
}
