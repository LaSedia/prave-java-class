import java.util.GregorianCalendar;

@Entity
public class Perfil implements Serializable {
	private static long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long idPerfil;
	private GregorianCalendar dataInicio = new GregorianCalendar();
	private GregorianCalendar dataFim = new GregorianCalendar();
	
	public long getIdPerfil() {
		return idPerfil;
	}
	public void setIdPerfil(long idPerfil) {
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
