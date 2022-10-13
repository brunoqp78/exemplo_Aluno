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
	
	//CT01
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
	
	//CT02
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
	
	//CT03
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

	//CT04
	@Test
	public void testarConstrutorAlunoComNomeInvalidoMenorDoisCaracteres() {
		//cenário de teste
		String nomeInvalido = "L";
		double notaValida = 8.5; 
		int frequenciaValida = 30;
				
		//execução	
		Assertions.assertThrows(
				IllegalArgumentException.class, 
				()->{
					Aluno a = new Aluno(nomeInvalido, notaValida, frequenciaValida);
					}
				);
	}		
	
	//CT05
	@Test
	public void testarConstrutorAlunoComNomeInvalidoMaiorCemCaracteres() {
		//cenário de teste
		String nomeInvalido = "Laaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiane";
		double notaValida = 8.5; 
		int frequenciaValida = 30;
				
		//execução	
		Assertions.assertThrows(
				IllegalArgumentException.class, 
				()->{
					Aluno a = new Aluno(nomeInvalido, notaValida, frequenciaValida);
					}
				);
	}			

	//CT06
	@Test
	public void testarConstrutorAlunoComNotaInvalidaMenorZero() {
		//cenário de teste
		String nomeValido = "Laiane";
		double notaInvalida = -0.01; 
		int frequenciaValida = 75;
				
		//execução	
		Assertions.assertThrows(
				IllegalArgumentException.class, 
				()->{
					Aluno a = new Aluno(nomeValido, notaInvalida, frequenciaValida);
					}
				);
	}		
	
	//CT07
	@Test
	public void testarConstrutorAlunoComNotaInvalidaMaiorDez() {
		//cenário de teste
		String nomeValido = "Laiane";
		double notaInvalida = 10.01; 
		int frequenciaValida = 75;
				
		//execução	
		Assertions.assertThrows(
				IllegalArgumentException.class, 
				()->{
					Aluno a = new Aluno(nomeValido, notaInvalida, frequenciaValida);
					}
				);
	}		

	//CT08
	@Test
	public void testarConstrutorAlunoComFrequenciaInvalidaMenorZero() {
		//cenário de teste
		String nomeValido = "Laiane";
		double notaValida = 10; 
		int frequenciaInvalida = -1;
				
		//execução	
		Assertions.assertThrows(
				IllegalArgumentException.class, 
				()->{
					Aluno a = new Aluno(nomeValido, notaValida, frequenciaInvalida);
					}
				);
	}		
	
	//CT09
	@Test
	public void testarConstrutorAlunoComFrequenciaInvalidaMaiorCem() {
		//cenário de teste
		String nomeValido = "Laiane";
		double notaValida = 10; 
		int frequenciaInvalida = 101;
				
		//execução	
		Assertions.assertThrows(
				IllegalArgumentException.class, 
				()->{
					Aluno a = new Aluno(nomeValido, notaValida, frequenciaInvalida);
					}
				);
	}			

	//CT10 - testar setNome
	@Test
	public void testarModificarAlunoComNomeInvalidoMenorDoisCaracteres() {
		//cenário de teste
		//criar um objeto válido
		String nomeValido = "Laiane";
		double notaValida = 8.5; 
		int frequenciaValida = 100;
		Aluno a = new Aluno(nomeValido, notaValida, frequenciaValida);
		
		String nomeInvalido = "L";
		//execução	
		Assertions.assertThrows(
				IllegalArgumentException.class, 
				()->{
					a.setNome(nomeInvalido);
					}
				);
	}		
	
	//CT11 - testar setNome
	@Test
	public void testarModificarAlunoComNomeInvalidoMaiorCemCaracteres() {
		//cenário de teste
		//criar um objeto válido
		String nomeValido = "Laiane";
		double notaValida = 8.5; 
		int frequenciaValida = 100;
		Aluno a = new Aluno(nomeValido, notaValida, frequenciaValida);
		
		String nomeInvalido = "Laaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiane";
		//execução	
		Assertions.assertThrows(
				IllegalArgumentException.class, 
				()->{
					a.setNome(nomeInvalido);
					}
				);
	}		

	//CT12 - testar setNota
	@Test
	public void testarModificarAlunoComNotaInvalidaMenorZero() {
		//cenário de teste
		//criar um objeto válido
		String nomeValido = "Laiane";
		double notaValida = 8.5; 
		int frequenciaValida = 100;
		Aluno a = new Aluno(nomeValido, notaValida, frequenciaValida);
		
		double notaInvalida = -0.1; 
		//execução	
		Assertions.assertThrows(
				IllegalArgumentException.class, 
				()->{
					a.setNota(notaInvalida);
					}
				);
	}		

	//CT13 - testar setNota
	@Test
	public void testarModificarAlunoComNotaInvalidaMaiorDez() {
		//cenário de teste
		//criar um objeto válido
		String nomeValido = "Laiane";
		double notaValida = 8.5; 
		int frequenciaValida = 100;
		Aluno a = new Aluno(nomeValido, notaValida, frequenciaValida);
		
		double notaInvalida = 10.1; 
		//execução	
		Assertions.assertThrows(
				IllegalArgumentException.class, 
				()->{
					a.setNota(notaInvalida);
					}
				);
	}			
	
	//CT14 - testar setFrequencia
	@Test
	public void testarModificarAlunoComFrequenciaInvalidaMenorZero() {
		//cenário de teste
		//criar um objeto válido
		String nomeValido = "Laiane";
		double notaValida = 8.5; 
		int frequenciaValida = 100;
		Aluno a = new Aluno(nomeValido, notaValida, frequenciaValida);
		
		int frequenciaInvalida = -1;
		//execução	
		Assertions.assertThrows(
				IllegalArgumentException.class, 
				()->{
					a.setFrequencia(frequenciaInvalida);
					}
				);
	}				

	//CT15 - testar setFrequencia
	@Test
	public void testarModificarAlunoComFrequenciaInvalidaMaiorCem() {
		//cenário de teste
		//criar um objeto válido
		String nomeValido = "Laiane";
		double notaValida = 8.5; 
		int frequenciaValida = 100;
		Aluno a = new Aluno(nomeValido, notaValida, frequenciaValida);
		
		int frequenciaInvalida = 101;
		//execução	
		Assertions.assertThrows(
				IllegalArgumentException.class, 
				()->{
					a.setFrequencia(frequenciaInvalida);
					}
				);
	}				
}
