@Entity
public class ItemCompra implements Serializable {
	private static long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long idItemCompra;
	private int quantidade;
	private float preco;
	
	public long getIdItemCompra() {
		return idItemCompra;
	}
	public void setIdItemCompra(long idItemCompra) {
		this.idItemCompra = idItemCompra;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	

}
