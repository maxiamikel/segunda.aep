package segunda.aep;

public class Produtos {
	private String codProduto;
	private String nomeProduto;
	private String descricaoProduto;
	private int quantidade;
	private double preco;
	public String toString() {
		return "CODIGO:"+getCodProduto() +"\nNOME: "+getNomeProduto()+"\nDESCRIPÇÃO: "+getDescricaoProduto()+"\nCANTIDADE: "+ getQuantidade()+ "\nPREÇO: "+getPreco();
	}
	
	public Produtos(String codProduto,String nomeProduto,String descricaoProduto,int quantidade,double preco) {
		if(codProduto.length()==0 || preco<=0 || quantidade<=0) {
			throw new RuntimeException("Mensagem da execução..\nNão pode ter valor negativo, nem '0' no preço");
		}
		this.codProduto=codProduto;
		this.nomeProduto=nomeProduto;
		this.descricaoProduto=descricaoProduto;
		this.quantidade=quantidade;
		this.preco=preco;
		
	}
	
	
	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}
	public String getCodProduto() {
		return codProduto;
	}
	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}
	public String getDescricaoProduto() {
		return descricaoProduto;
	}
	
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return preco;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public double calcularTotalVenda(int valor) {
		double precoTotalVenda=0.00;
		 return precoTotalVenda=valor*preco;
		}
	

}
