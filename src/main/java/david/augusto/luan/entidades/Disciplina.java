package david.augusto.luan.entidades;

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
public class Disciplina {

	private Long id_disciplina;
	private String nome;
	private int credito;
}
