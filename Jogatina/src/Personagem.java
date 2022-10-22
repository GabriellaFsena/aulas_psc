import java.util.Random;
public class Personagem {
	//atributos
	String nome;
	int energia, fome, sono;
	Random numero = new Random();
	
	Boolean test;
	
	
	int comida= 0;
	
	//metodos construtores 
	Personagem(String nome) {
		this.nome = nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Boolean teste() {
		return test = numero.nextBoolean();
	}
	public String getNome() {
		return this.nome;
	}
	public void cacar() {
		if(energia > 2) {
		System.out.println("Está caçando"); 
		energia = (energia - 2);  
		fome = (fome + 1);
		sono = (sono + 1); 
		}
	 else { 
		 System.out.println("Sem energia para caçar");
			
		} if (test == true) {
			System.out.println("Voce achou comida");
			comida++;
		}
		else {
			System.out.println("Ops, não achou nadinha");
		}
	}
	
	public void comer() {
		if(fome > 1) {
		System.out.println("Está Comendo"); 
	}else if(comida >= 10) {
		System.out.println("Barriguinha Cheia"); {
			
		} else {
			System.out.println(" ");
			
		}
	}
		
	}
	public void dormir() {
		if(sono > 3) {
		System.out.println("Está dormindo");
		}else {
			System.out.println("Sem sono");
		}
	}
     public void getStatus() {
	System.out.println("A energia está" +  energia);
	System.out.println("A fome  está" + fome);
	System.out.println("O sono está" + sono);
    }

}
