import java.util.Scanner;
public class Jogo {
	public static void main(String[] args) {
	String nome;
	Scanner entrada = new Scanner(System.in);
	nome= entrada.nextLine();
	System.out.println("Bem vindo " + nome);
	Personagem gabi = new Personagem(nome);
		
	gabi.nome = "Gabi";
	gabi.energia = 5;
	gabi.fome = 3;
	gabi.sono = 2;

	gabi.getStatus();
	entrada.close();
}
}