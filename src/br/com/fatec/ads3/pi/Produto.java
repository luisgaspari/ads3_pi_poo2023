package br.com.fatec.ads3.pi;

/**
 * Classe responsável por manter o cadastro dos produtos
 * @author Alessandra Thais Freitas, Lucas Felipe de Jesus, Luis Antonio Gaspari
 */
public class Produto {
	private int codProduto;
	private String descricao;
	private String fichaTecnica;
	private String unidadeMedida;
	private String tipoProduto;
	private double valorCompra;
	private double valorVenda;
	private double qtdeEstoque;

	/**
	 * Método utilizado para realizar a inclusão do produto no banco de dados
	 */
	public void criarProduto() {
	}

	/**
	 * Método utilizado para consultar o produto, por nome
	 * @param descricao nome do produto utilizado na consulta
	 */
	public void consultarProduto(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * Método utilizado para consultar o produto, por código
	 * @param codigo código do produto utilizado na consulta
	 */
	public void consultarProduto(int codigo) {
		this.codProduto = codigo;
	}

	/**
	 * Método utilizado para atualizar os dados do produto
	 * @param codigo código do produto que será atualizado
	 */
	public void atualizarProduto(int codigo) {
		this.codProduto = codigo;
	}

	/**
	 * Método utilizado para excluir os dados do produto
	 * @param codigo código do produto que será excluído
	 */
	public void excluirProduto(int codigo) {
		this.codProduto = codigo;
	}

	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFichaTecnica() {
		return fichaTecnica;
	}

	public void setFichaTecnica(String fichaTecnica) {
		this.fichaTecnica = fichaTecnica;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public double getQtdeEstoque() {
		return qtdeEstoque;
	}

	public void setQtdeEstoque(double qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}

	public String toString() {
		return "Produto [codProduto=" + codProduto + ", descricao=" + descricao + ", fichaTecnica=" + fichaTecnica
				+ ", unidadeMedida=" + unidadeMedida + ", tipoProduto=" + tipoProduto + ", valorCompra=" + valorCompra
				+ ", valorVenda=" + valorVenda + ", qtdeEstoque=" + qtdeEstoque + "]";
	}

}
