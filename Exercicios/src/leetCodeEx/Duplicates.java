package leetCodeEx;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Digite um número: ");
		int tamanho = sc.nextInt();
		int vetor[] = new int[tamanho];
		int copia=0;
		boolean resp = false;
		Random random = new Random();
		Set<Integer> numerosEncontrados = new HashSet<>();
		for(int i=0;i<vetor.length;i++) {
			vetor[i]=random.nextInt(9)+1;
			numerosEncontrados.add(vetor[i]);
		}		
		
		System.out.println("Vetor: " + Arrays.toString(vetor));
		
		for(int i=0;i<vetor.length;i++) {
			if(numerosEncontrados.contains(vetor[i])) {
				resp=true;
				break;
			}
		}
		System.out.println(resp);
	}

}
