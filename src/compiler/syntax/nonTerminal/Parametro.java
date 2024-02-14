package compiler.syntax.nonTerminal;

public class Parametro extends NonTerminal {
	private String lexema;
	private int valor;
	private String tipo;
public Parametro() {
	super();
}

public Parametro (String lex, int val)
{
	super();
	lexema = lex;
	valor = val;
}
public Parametro (String lex, int val, String tip) {
	super();
	lexema = lex;
	valor = val;
	tipo = tip;
}
public void setLexema(String id) {
	this.lexema = id;
}
public String getLexema() {
	return lexema;
}
public int getValor() {
	return valor;
}
public void setValor(int val) {
	this.valor = val;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String val) {
	this.tipo = val;
}
}



