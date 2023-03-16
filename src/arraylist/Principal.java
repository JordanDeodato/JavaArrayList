package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Jogador> time = new ArrayList<Jogador>();

		for(int i = 0; i < 11; i++) {
			Jogador jogador1 = new Jogador();
			time.add(jogador1);
		}
		
		System.out.println("Escalação do time");
		
		System.out.println("Nome do atleta: ");
		time.forEach(atleta -> atleta.setNome(input.next()));
		System.out.println("Posição do atleta: ");
		time.forEach(atleta -> atleta.setPosicao(input.next()));
		System.out.println("Peso do atleta: ");
		time.forEach(atleta -> atleta.setPeso(input.nextInt()));
		System.out.println("Altura do atleta: ");
		time.forEach(atleta -> atleta.setAltura(input.nextDouble()));
		System.out.println("Número da camisa do atleta: ");
		time.forEach(atleta -> atleta.setCamisa(input.nextInt()));
		
		System.out.println("\nEscalação do time\n");
		
		time.forEach(atleta -> System.out.println("Nome: " + atleta.getNome() + "  Posição: " + atleta.getPosicao() + "  Peso: " + atleta.getPeso()  + "  Altura: " +  atleta.getAltura()  + "  Número da camisa: " +  atleta.getCamisa()));
		
	}

}
