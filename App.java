package segunda.aep;

public class App {

	public static void main(String[] args) {
		try {
			Produtos orange= new Produtos("001","Laranja","Produto essenciais para o preparo do suco",2000,9.57);
			System.out.println(orange);
			System.out.println("\n"+orange.calcularTotalVenda(8));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println();

	}

}
