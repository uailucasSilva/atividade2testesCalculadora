package test.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

public class CalculadoraTest {
	private Calculadora calc;

	// Testar a classe Calculadora, disponibilizado abaixo (Anexo A). Implemente os
	// seguintes
	// testes:
	// • Implemente um teste para o construtor sem parâmetro de entrada. (Utilize o
	// método
	// getMemoria para verificar se o valor da memória é 0). (Professor irá fazer)
	// • O resultadoObtido será retornado pelo método getMemoria();
	@Test
	public void testarConstrutorSemParametroIniciaMemoriaComZero() {
		// definir cenário
		int resultadoEsperado = 0;

		// executar
		calc = new Calculadora();
		int resultadoObtido = calc.getMemoria();

		// comparar
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	// Implemente os testes para o construtor com parâmetro: recebendo o valor 3.
	// • O resultadoObtido será retornado pelo método getMemoria();

	@Test
	public void testarConstrutorComParametroIniciaMemoriaComTres() {
		int resultadoEsperado = 3;
		int parametroConstrutor = 3;

		calc = new Calculadora(parametroConstrutor);
		int resultadoObtido = calc.getMemoria();

		assertEquals(resultadoEsperado, resultadoObtido);
	}

	// Implemente os testes do método somar:somar um número negativo.

	@Test
	public void testarMetodoSomarNumeroNegativo() {
		int parametroConstrutor = 3;
		int valorTeste = -3;
		int resultadoEsperado = 0;

		calc = new Calculadora(parametroConstrutor);
		calc.somar(valorTeste);
		int resultadoObtido = calc.getMemoria();

		assertEquals(resultadoEsperado, resultadoObtido);
	}

	// Implemente os testes do método subtrair: subtrair um número positivo.

	@Test
	public void testarMetodoSubtrairNumeroPositivo() {
		int parametroConstrutor = 3;
		int valorTeste = 3;
		int resultadoEsperado = 0;

		calc = new Calculadora(parametroConstrutor);
		calc.subtrair(valorTeste);
		int resultadoObtido = calc.getMemoria();

		assertEquals(resultadoEsperado, resultadoObtido);
	}

	// Implemente os testes do método multiplicar: multiplicar um número positivo.

	@Test
	public void testarMetodoMultiplicarNumeroPosito() {
		int parametroConstrutor = 3;
		int valorTeste = 3;
		int resultadoEsperado = 9;

		calc = new Calculadora(parametroConstrutor);
		calc.multiplicar(valorTeste);
		int resultadoObtido = calc.getMemoria();

		assertEquals(resultadoEsperado, resultadoObtido);
	}

	// Implemente os testes do método dividir: dividir por valor 0 e dividir por um
	// valor positivo.
	@Test
	public void testarMetodoDividirPorZeroExcecao() {
		int parametroConstrutor = 3;
		int valorTeste = 0;

		calc = new Calculadora(parametroConstrutor);

		Assertions.assertThrows(Exception.class, () -> calc.dividir(valorTeste));
	}

	@Test
	public void testarMetodoDividirPorNumeroPositivo() throws Exception {
		int parametroConstrutor = 3;
		int valorTeste = 3;
		int resultadoEsperado = 1;

		calc = new Calculadora(parametroConstrutor);
		calc.dividir(valorTeste);
		int resultadoObtido = calc.getMemoria();
		assertEquals(resultadoEsperado, resultadoObtido);
	}

	// Implemente os testes do método exponenciação: exponenciar a memória por 1 e
	// por 10.
	// Se a entrada for um valor maior que 10 deverá retornar uma exception
	@Test
	public void testarMetodoExponeciarPorUmSucesso() throws Exception {
		int parametroConstrutor = 3;
		int valorTeste = 1;
		int resultadoEsperado = 3;

		calc = new Calculadora(parametroConstrutor);
		calc.exponenciar(valorTeste);
		int resultadoObtido = calc.getMemoria();
		assertEquals(resultadoEsperado, resultadoObtido);
	}

	@Test
	public void testarMetodoExponeciarPorDezSucesso() throws Exception {
		int parametroConstrutor = 3;
		int valorTeste = 10;
		int resultadoEsperado = 59049;

		calc = new Calculadora(parametroConstrutor);
		calc.exponenciar(valorTeste);
		int resultadoObtido = calc.getMemoria();
		assertEquals(resultadoEsperado, resultadoObtido);
	}

	@Test
	public void testarMetodoExponenciarPorMaiorQueDezExcecao() {
		int parametroConstrutor = 3;
		int valorTeste = 11;

		calc = new Calculadora(parametroConstrutor);
		Assertions.assertThrows(Exception.class, () -> calc.exponenciar(valorTeste));
	}

	// Implemente os testes para o método zerarMemória. (Utilize o método getMemoria
	// para
	// verificar se o valor da memória é 0).

	@Test
	public void testarMetodoZerarMemoria() {
		int parametroConstrutor = 3;
		int resultadoEsperado = 0;

		calc = new Calculadora(parametroConstrutor);
		calc.zerarMemoria();
		int resultadoObtido = calc.getMemoria();
		assertEquals(resultadoEsperado, resultadoObtido);
	}

}
