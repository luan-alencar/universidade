package david.augusto.luan.entidades;

import java.util.ArrayList;
import java.util.List;

import david.augusto.luan.exceptions.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/*
 *  Disciplina: Programação 2
 * 	Luan Augusto David de Alencar Lima
 */

@Data
@Getter
@Setter
@AllArgsConstructor
public class Universidade {
	private List<Aluno> alunos;
	private List<Disciplina> disciplinas;

	public Universidade() {
		this.alunos = new ArrayList<Aluno>();
		this.disciplinas = new ArrayList<Disciplina>();
	}

	// adicionar alunos
	public void adicionarAlunos(Aluno aluno) {
		alunos.add(aluno);
	}

	// adicionar disciplina
	public void adicionarDisciplina(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}

	// matricular aluno e disciplina
	public void matricular(int matricula, Long id_disciplina)
			throws NaoExisteAlunoComEssaMatriculaException, NaoExisteDisciplinaComEsseCodigoException {
		Aluno aluno = null;
		Disciplina disciplina = null;
		for (Aluno a : alunos) {
			if (matricula == a.getMatricula()) {
				aluno = a;
			}
			throw new NaoExisteAlunoComEssaMatriculaException();
		}
		for (Disciplina d : disciplinas) {
			if (id_disciplina == d.getId_disciplina()) {
				disciplina = d;
			}
			throw new NaoExisteDisciplinaComEsseCodigoException();
		}
		Matricula matric = new Matricula(aluno, disciplina);

	}

	// registrar notas
	public void registrarNotas(int matricula, Long id_disciplina, double prova1, double prova2, double substitutiva,
			double prova_final) {
		// argumentos: matrícula do aluno, código da disciplina, nota da prova 1, nota
		// da prova 2, nota da substitutiva e nota da prova final
		Aluno aluno = null;
		Disciplina disciplina = null;
		for (Aluno a : alunos) {
			if (a.getMatricula() == matricula) {
				aluno = a;
			}
		}

		for (Disciplina d : disciplinas) {
			if (d.getId_disciplina() == id_disciplina) {
				disciplina = d;
			}
		}
		Matricula matric = new Matricula(aluno, disciplina, prova1, prova2, substitutiva, prova_final);
	}

//	public double getCRA(int matricula) {
//		 double nota_total = 0.0;
//		 int creditos_totais = 0;
//		 for (Aluno a : alunos) {
//		   if (a.getMatricula() == matricula) {
//			   nota_total += getNotaFinal() * creditos_totais;
//		   }
//		}
//		creditos_totais += creditos_totais;
//		return nota_total / creditos_totais;
//
//	}
}
