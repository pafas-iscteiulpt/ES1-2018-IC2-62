
public class Main {

	public static void main(String[] args) {
		
		Empregado e1 = new Empregado ( "Frodo" , 56);
		Empregado e2 = new Empregado ( "Bilbo" , 57);
		Empregado e3 = new Director ( "Gandalf" , 58, "Marketing");
		Director e4 = new Director ( "Sauron" , 59, "Vendas");
		
		
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		
	}

}
