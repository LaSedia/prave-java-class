@Entity
public class Produto implements Serializable {
	private static long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
    private long idProduto;
    private String nome;
    private String descricao;
    private String cor;
    private String modelo;
    private int temperaturaArmazenamento;
    private float precoVenda;
    private int quantidadeMinima;
    private int peso;
    private float localArmazenamento;
    private int status;
    private String tamanho;
    
	public long getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getTemperaturaArmazenamento() {
		return temperaturaArmazenamento;
	}
	public void setTemperaturaArmazenamento(int temperaturaArmazenamento) {
		this.temperaturaArmazenamento = temperaturaArmazenamento;
	}
	public float getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(float precoVenda) {
		this.precoVenda = precoVenda;
	}
	public int getQuantidadeMinima() {
		return quantidadeMinima;
	}
	public void setQuantidadeMinima(int quantidadeMinima) {
		this.quantidadeMinima = quantidadeMinima;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public float getLocalArmazenamento() {
		return localArmazenamento;
	}
	public void setLocalArmazenamento(float localArmazenamento) {
		this.localArmazenamento = localArmazenamento;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
    

}
