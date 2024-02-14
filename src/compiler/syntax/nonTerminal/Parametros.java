package compiler.syntax.nonTerminal;

public class Parametros extends NonTerminal {
	int contadorParam = 0;
	public Parametros() {
		super();
	}
	public void sumarParam() {
		contadorParam++;
	}
	public void actualizaParam(int i) {
		contadorParam = i;
	}
	public int getParam() {
		return contadorParam;
	}
}
