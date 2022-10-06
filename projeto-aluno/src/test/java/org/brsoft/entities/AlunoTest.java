package org.brsoft.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Regras para validar o Aluno
		- nome precisa ter entre 2 e 100 caracteres
		- nota precisa ser um valor entre 0 e 10
		- frequencia precisa ser um valor entre 0 e 100.
		- aluno esta aprovado caso tenha nota >= 6 e frequencia >= 75.

		Se os valores forem inválidos
			- nome, nota e frequencia crie exceção IllegalArgumentException
 * @author turin-turambar
 *
 */

public class AlunoTest {
	
	@Test
	public void testarConstrutorAlunoComDadosValidosEAlunoAprovado() {
		//cenário de teste
		String nomeValido = "Laiane Angelina Ribeiro";
		double notaValida = 6.0; //aprovado no limite
		int frequenciaValida = 75; //aprovado no limite
		boolean resultadoEsperado = true;
		Aluno a; 
				
		//execução		
		a = new Aluno(nomeValido, notaValida, frequenciaValida);
		boolean resultadoObtido = a.estaAprovado();
		String nomeObtido = a.getNome();
		double notaObtida = a.getNota();
		int frequenciaObtida = a.getFrequencia();
		
		//comparação
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);
		Assertions.assertEquals(nomeValido, nomeObtido);
		Assertions.assertEquals(notaValida, notaObtida);
		Assertions.assertEquals(frequenciaValida, frequenciaObtida);
	}
	
	@Test
	public void testarConstrutorAlunoComDadosValidosEAlunoReprovadoPorNota() {
		//cenário de teste
		String nomeValido = "Laiane Angelina Ribeiro";
		double notaValida = 5.5; //nota que reprova o aluno
		int frequenciaValida = 99;
		boolean resultadoEsperado = false; //resultado esperado da função estaAprovado
		Aluno a; 
				
		//execução		
		a = new Aluno(nomeValido, notaValida, frequenciaValida);
		boolean resultadoObtido = a.estaAprovado();
		String nomeObtido = a.getNome();
		double notaObtida = a.getNota();
		int frequenciaObtida = a.getFrequencia();
		
		//comparação
		Assertions.assertEquals(resultadoEsperado, resultadoObtido, "O aluno deveria estar reprovado!!!");
		Assertions.assertEquals(nomeValido, nomeObtido);
		Assertions.assertEquals(notaValida, notaObtida);
		Assertions.assertEquals(frequenciaValida, frequenciaObtida);
	}
	
	@Test
	public void testarConstrutorAlunoComDadosValidosEAlunoReprovadoPorFrequencia() {
		//cenário de teste
		String nomeValido = "Laiane Angelina Ribeiro";
		double notaValida = 8.5; 
		int frequenciaValida = 30; //frequencia que reprova o aluno
		boolean resultadoEsperado = false; //resultado esperado da função estaAprovado
		Aluno a; 
				
		//execução		
		a = new Aluno(nomeValido, notaValida, frequenciaValida);
		boolean resultadoObtido = a.estaAprovado();
		String nomeObtido = a.getNome();
		double notaObtida = a.getNota();
		int frequenciaObtida = a.getFrequencia();
		
		//comparação
		Assertions.assertEquals(resultadoEsperado, resultadoObtido, "O aluno deveria estar reprovado!!!");
		Assertions.assertEquals(nomeValido, nomeObtido);
		Assertions.assertEquals(notaValida, notaObtida);
		Assertions.assertEquals(frequenciaValida, frequenciaObtida);
	}	
	
}
