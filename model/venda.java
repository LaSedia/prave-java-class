import java.util.GregorianCalendar;

@Entity
public class venda implements Serializable {
	private static long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long idVenda;
	private GregorianCalendar dataVenda = new GregorianCalendar();
    private int status;
    
	public long getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(long idVenda) {
		this.idVenda = idVenda;
	}
	public GregorianCalendar getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(GregorianCalendar dataVenda) {
		this.dataVenda = dataVenda;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

}
