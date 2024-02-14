package compiler.syntax.nonTerminal;

public class CuerpoPrincipal extends NonTerminal{
	
	private boolean devuelveVacio;
	private boolean devuelveResultado;
	private boolean devuelveparcialVacio;
	private boolean devuelveparcialResultado;
	public CuerpoPrincipal() {
		super();
		devuelveVacio = false;
		devuelveResultado = false;
		devuelveparcialVacio = false;
		devuelveparcialResultado = false;
	}
	
	public boolean devuelveVacio()
	{
		return devuelveVacio;
	}
	public boolean devuelveResultado()
	{
		return devuelveResultado;
	}
	public void setVacio()
	{
		devuelveVacio=true;
	}
	public void setResultado()
	{
		devuelveResultado = true;
	}
	public void setVacioParcial()
	{
		devuelveparcialVacio = true;
	}
	public void setResultadoParcial()
	{
		devuelveparcialResultado= true;
	}
	public boolean devuelveVacioParcial()
	{
		return devuelveparcialVacio;
	}
	public boolean devuelveResultadoParcial()
	{
		return devuelveparcialResultado;
	}
}
