package david.augusto.luan.entidades;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/*
*  Disciplina: Programação 2
*  Luan Augusto David de Alencar Lima
*/

@Data
@Getter
@Setter
@AllArgsConstructor
public class Aluno {
	private int matricula;
	private String nome;
	private List<Matricula> matriculas;

	public Aluno() {
		this.matriculas = new ArrayList<Matricula>();
	}

	public Aluno(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}

}
