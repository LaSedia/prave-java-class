import java.util.GregorianCalendar;

public class perfil {
	private int idPerfil;
	private GregorianCalendar dataInicio = new GregorianCalendar();
	private GregorianCalendar dataFim = new GregorianCalendar();
	
	public int getIdPerfil() {
		return idPerfil;
	}
	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}
	public GregorianCalendar getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(GregorianCalendar dataInicio) {
		this.dataInicio = dataInicio;
	}
	public GregorianCalendar getDataFim() {
		return dataFim;
	}
	public void setDataFim(GregorianCalendar dataFim) {
		this.dataFim = dataFim;
	}
	
}
