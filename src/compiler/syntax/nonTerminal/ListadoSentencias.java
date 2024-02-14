package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class ListadoSentencias extends NonTerminal {
	ArrayList<Sentencia> lista = new ArrayList<>();
	public ListadoSentencias() {
		super();
	}
	public void addSentencia (Sentencia sent)
	{
		lista.add(sent);
	}
	public ArrayList<Sentencia> devuelveSentencias()
	{
		return lista;
	}
	
	public void actualizaSentencias(ArrayList<Sentencia> list)
	{
		this.lista =  list;
	}
	}


