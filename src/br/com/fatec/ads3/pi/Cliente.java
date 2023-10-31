package br.com.fatec.ads3.pi;

/**
 * Classe responsável por manter o cadastro de clientes
 * @author Alessandra Thais Freitas, Lucas Felipe de Jesus, Luis Antonio Gaspari
 */
public class Cliente {
	private int codCliente;
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private String endereco;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;

	/**
	 * Método utilizado para realizar a inclusão do cliente no banco de dados
	 */
	public void criarCliente() {
	}

	/**
	 * Método utilizado para consultar o cliente, por nome
	 * @param nome nome do cliente utilizado na consulta
	 */
	public void consultarCliente(String nome) {
		this.nome = nome;
	}

	/**
	 * Método utilizado para consultar o cliente, por código
	 * @param codigo código do cliente utilizado na consulta
	 */
	public void consultarCliente(int codigo) {
		this.codCliente = codigo;
	}
	
	/**
	 * Método utilizado para atualizar os dados do cliente
	 * @param codigo código do cliente que será atualizado
	 */
	public void atualizarCliente(int codigo) {
		this.codCliente = codigo;
	}

	/**
	 * Método utilizado para excluir os dados do cliente
	 * @param codigo código do cliente que será excluído
	 */
	public void excluirCliente(int codigo) {
		this.codCliente = codigo;
	}

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codFornecedor) {
		this.codCliente = codFornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String toString() {
		return "Cliente [codCliente=" + codCliente + ", nome=" + nome + ", cpf=" + cpf + ", telefone="
				+ telefone + ", email=" + email + ", endereco=" + endereco + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", uf=" + uf + ", cep=" + cep + "]";
	}
	
}
