import java.util.Scanner;
public class Exercicio13 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[a.length];
		
		for (int i=0; i<a.length; i++){
			System.out.println("Entre com um n�mero para a " +i+"�  posi��o:");
		 	 a[i] = ler.nextInt();
		 	 
		 	 b[i] = (a[i] % 2 == 0) ? 1 : 0;
		     }
		     
		     System.out.print("Vetor A = ");
		     for (int i=0; i<a.length; i++) {
		    	 System.out.print(a[i] + ", ");
		    	 }
		     System.out.println();
		     System.out.print("Vetor B = ");
		     for (int i=0; i<b.length; i++) {
		    	 System.out.print(b[i] + " ");
		    	 }
		     System.out.println();
		     }
	}


