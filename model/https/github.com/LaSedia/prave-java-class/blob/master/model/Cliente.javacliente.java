@Entity
public class Cliente implements Serializable {
	private static long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long idCliente;
    private String nome;
    private String email;
    
    
    public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}   
    

}
