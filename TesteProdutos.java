package segunda.aep;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteProdutos {

	@Test
	void testarPrecoProduto() {
		Produtos abacaxi = new Produtos("002-AB","Abacaxi","Excelente fruta para fazer suco",14,2.00);
		assertEquals(4.00,abacaxi.calcularTotalVenda(2));
	}
	
	@Test
	void testarValorProdutoAoCriar() {
		
		try {
			Produtos abacate = new Produtos("002-B","Abacate","Excelente fruta para fazer suco",0,2.00);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
