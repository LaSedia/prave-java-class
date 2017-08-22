@Entity
public class Fabricante implements Serializable {
	private static long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long idFabricante;
    private String nome;
    
    public long getIdFabricante() {
		return idFabricante;
	}
	public void setIdFabricante(long idFabricante) {
		this.idFabricante = idFabricante;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
