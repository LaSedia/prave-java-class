
public class FuncionarioGerente extends Funcionario implements Serializable {
	private static long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
    private long idFuncionarioGerente;

	public long getIdFuncionarioGerente() {
		return idFuncionarioGerente;
	}

	public void setIdFuncionarioGerente(long idFuncionarioGerente) {
		this.idFuncionarioGerente = idFuncionarioGerente;
	}
    

}
