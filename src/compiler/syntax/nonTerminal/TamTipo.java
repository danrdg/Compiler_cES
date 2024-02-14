package compiler.syntax.nonTerminal;
public class TamTipo extends NonTerminal {
	private String valor;
	// Si es un identificador almacena true
	private boolean identificador;
public TamTipo() {
	super();
	this.identificador= false;
}
public void marcaIdentificador ()
{
	this.identificador = true;
}
public void setValor (String valor)
{
	this.valor = valor;
}
public boolean esIdentificador() 
{
	return this.identificador;
}

public String getValor()
{
	return this.valor;
}

}
