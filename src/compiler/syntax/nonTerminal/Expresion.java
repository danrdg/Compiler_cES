package compiler.syntax.nonTerminal;

public class Expresion extends NonTerminal {
	
	private boolean esvector = false;
	private boolean esfuncion = false;
	private boolean esAritmetica = false;
	private boolean esLogica = false;
	private int valor = 0;
	private boolean esNumero = false;
	private boolean esConstante= false;
	private boolean esIdentificador = false;
	private String lexema;

	public Expresion() {
		super();
		
	}
	
	public  void setVector()
	{
		esvector = true;
	}
	
	public void setFuncion()
	{
		esfuncion = true;
	}
	
	public void setAritmetica()
	{
		esAritmetica = true;
	}
	
	public void setLogica()
	{
		esLogica = true;
	}
	public void setNoAritmetica()
	{
		esAritmetica = false;
	}
	
	public void setNoLogica()
	{
		esLogica = false;
	}
	
	 public boolean esVector()
	 {
		 return esvector;
	 }
	 public boolean esFuncion()
	 {
		 return esfuncion;
	 }
	 public boolean esAritmetica()
	 {
		 return esAritmetica;
	 }
	 public boolean esLogica()
	 {
		 return esLogica;
	 }
	 public int getValor()
	 {
		 return valor;
	 }
	 public void setValor(int v)
	 {
		 this.valor = v;
	 }
	 public void setNumero()
	 {
		 this.esNumero=true;
	 }
	 public boolean getNumero()
	 {
		 return esNumero;
	 }
	 public void setConstante()
	 {
		 this.esConstante=true;
	 }
	 public boolean getConstante()
	 {
		 return esConstante;
	 }
	 public void setIdentificador()
	 {
		 this.esIdentificador=true;
	 }
	 public boolean esIdentificador()
	 {
		 return esIdentificador;
	 }
	 public void setLexema(String cad)
	 {
		 this.lexema=cad;
	 }
	 public String getLexema()
	 {
		 return lexema;
	 }
	 
}
