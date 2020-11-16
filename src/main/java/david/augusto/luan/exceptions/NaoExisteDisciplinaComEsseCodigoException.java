package david.augusto.luan.exceptions;

/*
*  Disciplina: Programação 2
*  Luan Augusto David de Alencar Lima
*/

public class NaoExisteDisciplinaComEsseCodigoException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public NaoExisteDisciplinaComEsseCodigoException() {
		super("Operação não realizada, insira um código válido.");
	}
}
