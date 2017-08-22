@Entity
public class telefone implements Serializable {
	private static long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
    private long idTelefone;
    private int telefone;
    
	public long getIdTelefone() {
		return idTelefone;
	}
	public void setIdTelefone(long idTelefone) {
		this.idTelefone = idTelefone;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

}
