package eletronicocaixa;

import java.util.Scanner;
import java.util.Random;

public class Caixa {

 public static void main(String[] args) {
  // variavel de scannr e rodon
  String nome;
  double inicial;

  Scanner entrada2 = new Scanner(System.in);
  Random numero = new Random();

  int conta = 1 + numero.nextInt(9999);

  // obtendo os dados iniciais do cliente

  System.out.println("Cadastro novo cliente.");
  System.out.println("Entre com seu Nome: ");
  nome = entrada.nextLine();

  System.out.println("Emtre com o valor inicial depositado na conta: ");
  inicial = entrada.nextDouble();

  // criando um conta ao cliente
  Conta minhaConta = new Conta(nome, conta, inicial);
  minhaConta.iniciar();

 }

}