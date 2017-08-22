import java.util.GregorianCalendar;

@Entity
public class ProdutoUni extends Produto implements Serializable {
	private static long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long idProdutoUni;
	private GregorianCalendar fabricacao = new GregorianCalendar();
	private GregorianCalendar validade = new GregorianCalendar();
	private GregorianCalendar DataChegadaEstoque = new GregorianCalendar();
    private int numeroPedido;
    private int quantidadeEstoque;
    private String notaFiscal;
    
	public long getIdProdutoUni() {
		return idProdutoUni;
	}
	public void setIdProdutoUni(long idProdutoUni) {
		this.idProdutoUni = idProdutoUni;
	}
	public GregorianCalendar getFabricacao() {
		return fabricacao;
	}
	public void setFabricacao(GregorianCalendar fabricacao) {
		this.fabricacao = fabricacao;
	}
	public GregorianCalendar getValidade() {
		return validade;
	}
	public void setValidade(GregorianCalendar validade) {
		this.validade = validade;
	}
	public GregorianCalendar getDataChegadaEstoque() {
		return DataChegadaEstoque;
	}
	public void setDataChegadaEstoque(GregorianCalendar DataChegadaEstoque) {
		this.DataChegadaEstoque = DataChegadaEstoque;
	}
	public int getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public String getNotaFiscal() {
		return notaFiscal;
	}
	public void setNotaFiscal(String notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
    


}
