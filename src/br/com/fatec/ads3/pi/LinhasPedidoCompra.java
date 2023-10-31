package br.com.fatec.ads3.pi;

/**
 * Classe responsável por manter o cadastro das linhas dos pedidos de compras
 * @author Alessandra Thais Freitas, Lucas Felipe de Jesus, Luis Antonio Gaspari
 */
public class LinhasPedidoCompra {
	private int codPedido;
	private int codProduto;
	private double quantidade;
	private double valorTotalProduto;

	/**
	 * Método utilizado para realizar a inclusão das linhas do pedido de compra no banco de dados
	 */
	public void criarLinha() {
	}

	/**
	 * Método utilizado para atualizar a linha do pedido de compra
	 * @param codPedido código do pedido da linha que será atualizada
	 * @param codProduto código do produto da linha que será atualizada
	 */
	public void atualizarLinha(int codPedido, int codProduto) {
		this.codPedido = codPedido;
		this.codProduto = codProduto;
	}

	/**
	 * Método utilizado para excluir a linha do pedido de compra
	 * @param codPedido código do pedido da linha que será excluída
	 * @param codProduto código do produto da linha que será excluída
	 */
	public void excluirLinha(int codPedido, int codProduto) {
		this.codPedido = codPedido;
		this.codProduto = codProduto;
	}

	public int getCodPedido() {
		return codPedido;
	}

	public void setCodPedido(int codPedido) {
		this.codPedido = codPedido;
	}

	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorTotalProduto() {
		return valorTotalProduto;
	}

	public void setValorTotalProduto(double valorTotalProduto) {
		this.valorTotalProduto = valorTotalProduto;
	}

	public String toString() {
		return "LinhasPedidoCompra [codPedido=" + codPedido + ", codProduto=" + codProduto + ", quantidade="
				+ quantidade + ", valorTotalProduto=" + valorTotalProduto + "]";
	}
	
}
