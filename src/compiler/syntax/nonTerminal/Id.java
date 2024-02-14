package compiler.syntax.nonTerminal;

public class Id extends NonTerminal {
	private String lexema;
	private int valor;
public Id() {
	super();
}

public Id (String lex, int val)
{
	super();
	lexema = lex;
	valor = val;
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
}
