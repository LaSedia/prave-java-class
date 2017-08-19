import java.util.GregorianCalendar;

public class venda {
	private int idVenda;
	private GregorianCalendar dataVenda = new GregorianCalendar();
    private int status;
    
	public int getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(int idVenda) {
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
