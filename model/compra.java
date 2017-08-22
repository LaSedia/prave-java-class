import java.util.GregorianCalendar;

@Entity
public class Compra implements Serializable {
	private static long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long idCompra;
	private GregorianCalendar dataCompra = new GregorianCalendar();
    private int status;
    
	public long getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(long idCompra) {
		this.idCompra = idCompra;
	}
	public GregorianCalendar getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(GregorianCalendar dataCompra) {
		this.dataCompra = dataCompra;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
    

}
