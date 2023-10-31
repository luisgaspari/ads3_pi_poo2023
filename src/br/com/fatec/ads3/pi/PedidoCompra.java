package br.com.fatec.ads3.pi;

/**
 * Classe responsável por manter o cadastro dos pedidos de compras
 * @author Alessandra Thais Freitas, Lucas Felipe de Jesus, Luis Antonio Gaspari
 */
public class PedidoCompra {
	private int codPedido;
	private String dataPedido;
	private String dataEntrega;
	private String formaPagamento;
	private double valorTotal;
	private int codFornecedor;

	/**
	 * Método utilizado para realizar a inclusão do pedido de compra no banco de dados
	 */
	public void criarPedido() {
	}

	/**
	 * Método utilizado para consultar o pedido de compra
	 * @param codigo código do pedido utilizado na consulta
	 */
	public void consultarPedido(int codigo) {
		this.codPedido = codigo;
	}

	/**
	 * Método utilizado para atualizar o pedido de compra
	 * @param codigo código do pedido que será atualizado
	 */
	public void atualizarPedido(int codigo) {
		this.codPedido = codigo;
	}

	/**
	 * Método utilizado para excluir o pedido de compra
	 * @param codigo código do pedido que será excluído
	 */
	public void excluirPedido(int codigo) {
		this.codPedido = codigo;
	}

	public int getCodPedido() {
		return codPedido;
	}

	public void setCodPedido(int codPedido) {
		this.codPedido = codPedido;
	}

	public String getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}

	public String getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getCodFornecedor() {
		return codFornecedor;
	}

	public void setCodFornecedor(int codFornecedor) {
		this.codFornecedor = codFornecedor;
	}

	public String toString() {
		return "PedidoCompra [codPedido=" + codPedido + ", dataPedido=" + dataPedido + ", dataEntrega=" + dataEntrega
				+ ", formaPagamento=" + formaPagamento + ", valorTotal=" + valorTotal + ", codFornecedor="
				+ codFornecedor + "]";
	}

}
