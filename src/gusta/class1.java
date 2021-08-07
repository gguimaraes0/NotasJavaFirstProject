package gusta;
import java.util.Scanner;

public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado = new Scanner(System.in);
		
		double n1 = 0;
		double n2 = 0;
		
		System.out.println("Digite a sua n1 ");
		n1 = teclado.nextDouble();
		
		System.out.println("Digite a sua n2");
		n2 = teclado.nextDouble();
		
		double nf = (n1+n2)/2;
		
		System.out.println("Deseja saber sua nota final?s/n");
		char result = teclado.next().charAt(0);		
		if(result == 's')
		{
			System.out.println("A resposta de " + n1 +" / " + n2 +" = " + nf);			
		}
		else
		{
			System.out.println("Ta com medo né");
		}
		teclado.close();
		
		
		

	}

}
