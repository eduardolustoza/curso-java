package exercicios.exercicio6;

public class Exceptions {
/**	1. O que é o tratamento de exceções em Java e qual é o seu objetivo principal? */
  	//O objetivo do tratamento de exceções é permitir que o programa reaja de forma controlada e robusta 
   //diante de erros, evitando parar abruptamente ou apresentar comportamentos inesperados.
	
/**	2. Como é a estrutura básica de um bloco try-catch-finally em Java?*/

//	try {
		//método a ser implementado
//	} catch (Exception e) {
		//tratamento da exceção
//	} finally {
		//bloco que sempre será executado após a execução do try ou do catch
//	} 
	
/**	3. Qual é a diferença entre exceções verificadas e exceções não verificadas em Java? */
 	//Exceções verificadas são aquelas que o compilador obriga você a tratar explicitamente usando try-catch ou
	//declarando-as na assinatura do método com throws.
 	//Exceções não verificadas são aquelas que o compilador não obriga você a tratar.
 
	
	
/**	4. O que acontece se uma exceção não for tratada em Java? */
	//O programa pode encerrar ou funcionar de forma não planejada, levando a erros de processamento 
	//ou mensagens não claras para os usuários.
	
/**	5. Quais são as vantagens de tratar exceções em um programa Java? */
	//Maior robustez, permite tomar ações adequadas em caso de erro
	
/**	6. Explique o papel do bloco "finally" no tratamento de exceções em Java.*/
	//É um bloco que sempre será executado. É usado para fechar conexões com o banco de dados ou fechar arquivos.
	
/**	7. Como podemos capturar exceções específicas em um bloco catch em Java?*/
	//No bloco catch,  adicionamos a exeção específica invés da Exception
	
/**	8. Quando é necessário usar a palavra-chave "throws" na declaração de um método
	em Java? */
	//Quando se desejada lançar a exeção para o método superior ao que está sendo executado, ou seja, o tratamento se dará
	//no método anterior
	
/**	9. É possível ter mais de um bloco catch em um bloco try-catch? Se sim, qual é a
	ordem de execução dos blocos catch?*/
	//Sim. A execução é pela ordem de declaração. Se exceção gerada tiver um catch no primeiro bloco, somente ela será executada. 
	
/**	10. Quando é recomendado o uso do bloco "finally" em relação ao bloco "catch" em
	Java? */
	//finally é útil para garantir que ações críticas de limpeza ou de liberação de recursos sejam sempre realizadas
	//, independentemente do fluxo de exceções. 
	//Isso ajuda a melhorar a integridade e a confiabilidade do seu código.
	
/**	11. É possível ter um bloco "catch" sem um bloco "try" correspondente em Java?Explique*/
		//Não é possível, mas é possível um try com somente o finally.

	
	
}
