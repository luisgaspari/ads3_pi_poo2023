package br.com.fatec.ads3.pi;

/**
 * Classe responsável por manter o cadastro de fornecedor
 * @author Alessandra Thais Freitas, Lucas Felipe de Jesus, Luis Antonio Gaspari
 */
public class Fornecedor {
	private int codFornecedor;
	private String nome;
	private String cnpj;
	private String telefone;
	private String email;
	private String endereco;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;

	/**
	 * Método utilizado para realizar a inclusão do fornecedor no banco de dados
	 */
	public void criarFornecedor() {
	}

	/**
	 * Método utilizado para consultar o fornecedor, por nome
	 * @param nome nome do fornecedor utilizado na consulta
	 */
	public void consultarFornecedor(String nome) {
		this.nome = nome;
	}

	/**
	 * Método utilizado para consultar o fornecedor, por código
	 * @param codigo código do fornecedor utilizado na consulta
	 */
	public void consultarFornecedor(int codigo) {
		this.codFornecedor = codigo;
	}

	/**
	 * Método utilizado para atualizar os dados do fornecedor
	 * @param codigo código do fornecedor que será atualizado
	 */
	public void atualizarFornecedor(int codigo) {
		this.codFornecedor = codigo;
	}

	/**
	 * Método utilizado para excluir os dados do fornecedor
	 * @param codigo código do fornecedor que será excluído
	 */
	public void excluirFornecedor(int codigo) {
		this.codFornecedor = codigo;
	}

	public int getCodFornecedor() {
		return codFornecedor;
	}

	public void setCodFornecedor(int codFornecedor) {
		this.codFornecedor = codFornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
		return "Fornecedor [codFornecedor=" + codFornecedor + ", nome=" + nome + ", cnpj=" + cnpj + ", telefone=" + telefone
				+ ", email=" + email + ", endereco=" + endereco + ", bairro=" + bairro + ", cidade=" + cidade + ", uf="
				+ uf + ", cep=" + cep + "]";
	}
	
}
