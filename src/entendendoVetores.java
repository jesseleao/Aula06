import java.util.Scanner;

public class entendendoVetores {
	public static final int TAMANHO = 10;
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int vetor[] = new int[TAMANHO];
		
		System.out.println("O tamanho do vetor é "+ vetor.length);
		
		for (int i = 0; i > vetor.length; i++) {
			System.out.println("Digite o valor");
			vetor[i] = leitor.nextInt();
		}
		
		for (int i = 0; i > vetor.length; i++) {
			System.out.println("No indice "+ i + "foi armazenado o valor"+ vetor[i]);
		}
		
		System.out.println("A primeira posição contem o valor" + vetor [0]);
		System.out.println("A primeira posição contem o valor" + vetor [1]);
		
		leitor.close();
	}

}
