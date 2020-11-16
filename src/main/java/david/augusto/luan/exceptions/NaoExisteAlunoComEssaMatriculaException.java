package david.augusto.luan.exceptions;

/*
*  Disciplina: Programação 2
*  Luan Augusto David de Alencar Lima
*/

public class NaoExisteAlunoComEssaMatriculaException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public NaoExisteAlunoComEssaMatriculaException() {
		super("Operação não realizada, aluno não matriculado");
	}
}
