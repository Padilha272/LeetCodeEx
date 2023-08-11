package leetCodeEx;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class ReversedLinkedList {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Digite um número: ");
		int tamanho = sc.nextInt();
		int array[] = new int[tamanho];
		Random random = new Random();
		
		for(int i=0;i<array.length;i++) {
			array[i]=random.nextInt(9)+1;

		}	
		System.out.println(Arrays.toString(array));
		System.out.print("[ ");
		for(int i=tamanho-1;i>=0;i--) {
			System.out.print(array[i]+" ");

		}
		System.out.println("]");
	}

}
