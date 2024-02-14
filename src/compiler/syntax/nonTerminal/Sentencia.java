package compiler.syntax.nonTerminal;

import java.util.ArrayList;

import es.uned.lsi.compiler.semantic.ScopeIF;

public class Sentencia extends SentenciaDevuelve {
	boolean esbloque;
	boolean esdevuelve;
	ScopeIF scope;
	ArrayList<Sentencia> sentenciasBloque;
	public Sentencia() {
		super();
		esbloque = false;
		sentenciasBloque = new ArrayList<>();
		esdevuelve = false;
	}
	public boolean esBloque ()
	{
		return esbloque;
	}
	public void setBloque ()
	{
		this.esbloque = true;
	}
	public boolean esDevuelve ()
	{
		return esbloque;
	}
	public void setDevuelve ()
	{
		this.esdevuelve = true;
	}
	public void actualizaSentencias(ArrayList<Sentencia> lista)
	{
		this.sentenciasBloque = lista;
	}
	public ArrayList<Sentencia> devuelveSentencias()
	{
		return this.sentenciasBloque;
	}
	public ScopeIF getScope()
	{
		return scope;
	}
	public void setScope(ScopeIF sco)
	{
		scope = sco;
	}
	}
	

