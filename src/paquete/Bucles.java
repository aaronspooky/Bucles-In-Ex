package paquete;

public class Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n\t i \t j"); //cabecera de salida
		for(int i = 0; i < 4; i++){
			System.out.println("Externo\t " +i);
			for(int j = 0; j < i; j++){
				System.out.println("Interno\t\t " +j);
			}
		}

	}

}
