@Entity
public class ItemVenda implements Serializable {
	private static long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long idItemVenda;
	private int quantidade;
	private float preco;
	
	public long getIdItemVenda() {
		return idItemVenda;
	}
	public void setIdItemVenda(long idItemVenda) {
		this.idItemVenda = idItemVenda;
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
