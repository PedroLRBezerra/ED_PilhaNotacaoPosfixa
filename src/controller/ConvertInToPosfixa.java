package controller;

public class ConvertInToPosfixa {

	StatickStack pilha = new StatickStack(12);
	String posfixa = "";

	public String convertInToPosfixa(char[] infixa) {
		int infixaLength=infixa.length;
		for(int x=0;x<infixaLength;x++) {
			NI(infixa[x]);
		}
		if(!pilha.isEmpty()){
			while(!pilha.isEmpty()) {
				this.posfixa+=pilha.showTop().toString();
				pilha.desempilhar();
			}
		}
		return posfixa;
	}

	private void NI(char c) {
		if ((c == '(') || (c == '*') || (c == '/') || (c == '+') || (c == '-') || (c == ')')) {
			compareValue(c);
		} else {
			this.posfixa += c;
		}
	}

	private void compareValue(char c) {
		if (pilha.isEmpty()) {
			pilha.empilhar(c);
		} else {
			int valueC = setValue(Character.toString(c)), valueLastPilha = setValue(pilha.showTop().toString());
			if (valueC == 3) {
				if(c=='(') {
					pilha.empilhar(c);
				}
				else {
					while(!"(".equals(pilha.showTop().toString()) ) {
						this.posfixa+=pilha.showTop().toString();
						pilha.desempilhar();
					}
					pilha.desempilhar();
				}
			} else {
				if (valueLastPilha < valueC || valueLastPilha == 3) {
//					this.posfixa += c;
					pilha.empilhar(c);
				} else {
					this.posfixa+=pilha.showTop().toString();
					pilha.desempilhar();
					pilha.empilhar(c);
				}
			}
		}
	}

	private int setValue(String c) {
		if ((c.contentEquals("+")) || (c.equals("-")) ) {
			return 1;
		}
		if ((c.contentEquals("*")) || (c.equals("/")) ){
			return 2;
		}
		if ((c.contentEquals("(")) || (c.equals(")")) ) {
			return 3;
		}
		return 0;
	}

}
