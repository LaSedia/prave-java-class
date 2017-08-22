
public class GestorDaConda extends Funcionario implements Serializable {
	private static long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
    private long idGestorDaConta;

	public long getIdGestorDaConta() {
		return idGestorDaConta;
	}

	public void setIdGestorDaConta(long idGestorDaConta) {
		this.idGestorDaConta = idGestorDaConta;
	}	

}
