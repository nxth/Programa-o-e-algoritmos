import java.util.Scanner;
public class Exercicio12{
	private static Scanner ler;
	public static void main(String[] args) {
		ler = new Scanner(System.in); 
		int [] a = new int[10];
		boolean palindromo = true;
		 
		 for (int i=0; i<a.length; i++){
			 System.out.println("Entre com um n�mero para a "+i+"� posi��o:");
			 a[i] = ler.nextInt();
			 }
		 
		 for (int i=0; i<a.length/2; i++) {
			 if (a[i] != a[a.length - 1 - i]) {
				 palindromo = false;
				 break;
				 }
			 }
		 System.out.print("Vetor A = ");
		 for (int i=0; i<a.length; i++) {
			 System.out.print(a[i] + " ");
			 }
		 System.out.println();
		 if(palindromo) {
			 System.out.println("� Palindromo");
			 }
		 else {
			 System.out.println("N�o � palindromo");
			 }
		 }
	}	



