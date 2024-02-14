package compiler.syntax.nonTerminal;

public class Ref extends NonTerminal {
	String valor;
	boolean identificador = false;
	boolean vector = false;
	public Ref()
	{
		super();
	}
	public Ref(String val)
	{
		this.valor=val;
	}
	
	public String getValor()
	{
		return valor;
	}
	
	public void setIdentificador()
	{
		identificador = true;
	}
	public void setVector()
	{
		vector = true;
	}
	public boolean esIdentificador()
	{
		return identificador;
	}
	public boolean esVector()
	{
		return vector;
	}
}
