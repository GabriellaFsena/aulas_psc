import java.util.Scanner;
public class Jogo {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		boolean status = true;
      
     while(status) {
	
    	 System.out.println("Opções: " +
		"			\n1 - Caçador" +
		"   \n2 - Soneca" +
		"\n3 - Comilao" + 
		"\n Selecione uma opção");
	
    String entrada = tc.next();
    
		switch(entrada) {
			case "1":
				int numero = Integer.parseInt(entrada);
				System.out.println("-------------");
				System.out.println("Digitou 1");
				System.out.println("-------------");
				status= false;
				break;
				
			case "2":
				System.out.println("-------------");
				System.out.println("Digitou 2");
				System.out.println("-------------");
				break;
			case "3":
				System.out.println("-------------");
				System.out.println("Digitou 3");
				System.out.println("-------------");
				break;
	default:
        System.out.println("Opção inválida!");
     	}
	}
}
}