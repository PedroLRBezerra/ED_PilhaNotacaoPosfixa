package main;

import controller.ConvertInToPosfixa;;

public class Principal {

	public static void main(String[] args) {
		
		char expressaoInfixa[];
		ConvertInToPosfixa ctp = new ConvertInToPosfixa();
		
		expressaoInfixa = gerarExpressao();
		System.out.println( ctp.convertInToPosfixa(expressaoInfixa));
		
		
		}

	private static char[] gerarExpressao() {
//		char[] EI= {'(','A','*','(','B','*','C','+','D',')',')'}; //**successful**
//		char[] EI= {'A','*','(','B','+','C',')','/','D','-','E'};// **successful**
//	    char[] EI= {'A','*','(','B','+','(','C','*','(','D','+','(','E','*','(','F','+','G',')',')',')',')',')'};  
//		**^^successful^^**
//		char[] EI= {'A','+','B','*','C'};// **successful**
		char[] EI = {'A','+','(','B','-','(','C','+','(','D','-','(','E','+','F',')',')',')',')'}; // **successful**
		return EI;
	}
}
