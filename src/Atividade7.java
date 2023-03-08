public class Atividade7 {
	public static void main(String[] args) {
		int[] numeros = new int[100];
		
		for(int i = 0; i <= numeros.length - 1;i++) {
			numeros[i] = (int) (Math.random() * 101);
		}
		for(int i = 0; i <= numeros.length - 1;i++) {
			boolean primo = true;
			
		for(int j = 2; i <= numeros[i];j++) {
			if(numeros[i] % j == 0) {
				primo = false;
				break;
		}
	}
		if(primo) {
			System.out.println(numeros[i]);
		}
}
}
}
