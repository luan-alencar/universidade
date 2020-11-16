package david.augusto.luan.entidades;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
*  Disciplina: Programação 2
*  Luan Augusto David de Alencar Lima
*/

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Matricula {

	private Aluno aluno;
	private String periodo;
	private Disciplina disciplina;
	private double prova1;
	private double prova2;
	private double media;
	private double substitutiva;
	private double prova_final;
	private List<Aluno> alunos;

	public Matricula(Aluno aluno, Disciplina disciplina, double prova1, double prova2, double substitutiva,
			double prova_final) {
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.alunos = new ArrayList<>();
	}

	public Matricula(Aluno aluno, Disciplina disciplina) {
		this.aluno = aluno;
		this.disciplina = disciplina;
	}

	// saber se está aprovado ou não
	public boolean isAprovado() {
		if (this.media < 7) {
			return true;
		}
		if (getNotaFinal() >= 5.0) {
			return true;
		}
		return false;
	}

	// nota final
	public double getNotaFinal() {
		if (this.prova1 < this.substitutiva) {
			this.prova1 = this.substitutiva;
		} else if (this.prova2 < this.substitutiva) {
			this.prova2 = this.substitutiva;
		}
		this.media = (this.prova1 + this.prova2) / 2;
		double mf = media * 0.6 + prova_final * 0.4;
		return mf;
	}

	public double getCRA(int matricula) {
		double nota_total = 0.0;
		int creditos_totais = 0;
		for (Aluno a : alunos) {
			if (a.getMatricula() == matricula) {
				nota_total += getNotaFinal() * creditos_totais;
			}
		}
		creditos_totais += creditos_totais;
		return nota_total / creditos_totais;

	}

	public void exibirHistorico(int matricula) {
		for (Aluno a : alunos) {
			if (a.getMatricula() == matricula) {
				System.out.println(this.getDisciplina() + " - " + this.isAprovado() + " - " + this.getMedia());
			}
		}
	}
	
	public static void main(String[] args) {
		
		// cadastrando nova matricula de aluno
		Universidade facisa = new Universidade();
		Aluno a1 = new Aluno(1923080024 ,"Luan");
		facisa.adicionarAlunos(a1);
		
		
	}
}
