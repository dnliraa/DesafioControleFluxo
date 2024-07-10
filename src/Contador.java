import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class Contador {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Contador");
		
			try {
						
				System.out.print("Entre com o parametro 1:");
				int parameter1 = sc.nextInt();
				System.out.print("Entre com o parametro 2:");
				int parameter2 = sc.nextInt();
				if(parameter1>parameter2) {
					throw new ParametrosInvalidosException();
				}
				int num= parameter2-parameter1;
				
				for(int i=1; i<=num; i++) {
					System.out.println(i);
				}
				
			} catch (InputMismatchException e) {
				System.out.println("Erro os parametros devem ser numeros inteiros");
				}
			catch(ParametrosInvalidosException e) {
				System.out.println("Erro o parametro 2 deve ser maior do que o parametro 1");
			}
			
			sc.close();
			
			
		
	}

}
