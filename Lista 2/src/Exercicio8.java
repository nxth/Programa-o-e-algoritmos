 import java.util.Scanner;
public class Exercicio8 {
    private static Scanner ler;
	public static void main(String[] args){
		ler = new Scanner (System.in);
		int [] a = new int [10];
		int [] b = new int [a.length];
		
		for (int i=0; i<a.length; i++){
			System.out.println("Digite o "+i+" numero :");
			a[i] = ler.nextInt();
			}
		for (int i=0; i<a.length; i++){
			b[i]=0;
			for (int j=0; j<=a[i]; j++){
				b[i] += j;
				}
			}
		System.out.print("Numeros inseridos =");
		for (int i=0; i<a.length; i++){
			System.out.print(a[i] +", ");
			}
		System.out.print("Resultado =");
		for (int i=0; i<a.length; i++){
			System.out.println(b[i] +", ");
			}
		System.out.println();
		}
	}