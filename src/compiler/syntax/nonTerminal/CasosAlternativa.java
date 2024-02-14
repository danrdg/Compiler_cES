package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class CasosAlternativa extends NonTerminal {
	ArrayList<CasoAlt> casos = new ArrayList<>();
	
	public CasosAlternativa()
	{
		super();
	}
	
	public void addCaso(CasoAlt caso) {
		casos.add(caso);
	}
	public ArrayList<CasoAlt> devolverCasos()
	{
		return casos;
	}
	public void actualizarCasos(ArrayList<CasoAlt> lista)
	{
		this.casos = lista;
	}

}
