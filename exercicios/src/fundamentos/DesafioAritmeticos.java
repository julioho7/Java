package fundamentos;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		int c1 = (6 * (3 + 2));
		int c2 = (int) Math.pow(c1, 2);
		int c3 = c2 / (3*2); 
		System.out.println(c3);
		
		int c4 = (1 - 5) * (2 - 7) /2;
		int c5 = (int) Math.pow(c4, 2);
		System.out.println(c5);
		
		int c6 = c3 - c5;
		int c7 = (int) Math.pow(c6, 3);
		System.out.println(c7);
		
		int c8 = (int) Math.pow(10, 3);
		int c9 = c7 / c8;
		System.out.println(c9);
		
	}
}
