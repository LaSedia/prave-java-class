import java.util.GregorianCalendar;

public class compra {
	private int idCompra;
	private GregorianCalendar dataCompra = new GregorianCalendar();
    private int status;
    
	public int getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(int idCompra) {
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
