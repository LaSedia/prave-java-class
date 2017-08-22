
public class FuncionarioVenda extends Funcionario implements Serializable {
	private static long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
    private long idFuncionarioVenda;

	public long getIdFuncionarioVenda() {
		return idFuncionarioVenda;
	}

	public void setIdFuncionarioVenda(long idFuncionarioVenda) {
		this.idFuncionarioVenda = idFuncionarioVenda;
	}
}
