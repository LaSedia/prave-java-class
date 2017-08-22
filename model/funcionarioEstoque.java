/**
 * 
 */

/**
 * @author leona
 *
 */

@Entity
public class FuncionarioEstoque extends Funcionario implements Serializable {
	private static long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long idFuncionarioEstoque;

	public long getIdFuncionarioEstoque() {
		return idFuncionarioEstoque;
	}

	public void setIdFuncionarioEstoque(long idFuncionarioEstoque) {
		this.idFuncionarioEstoque = idFuncionarioEstoque;
	}
    
}
