package compiler.syntax.nonTerminal;

import java.util.*;

public class DeclaracionParametros extends NonTerminal {
	private List<Parametro> lista;
	public DeclaracionParametros() {
		super();
		lista = new ArrayList<>();
	}
	public void addParametro(Parametro id) {
		 lista.add(id);
	 }
	 public void actualizarLista(ArrayList<Parametro> lista) {
		 this.lista = lista;
	 }
	 public ArrayList<Parametro> extraerLista(){
		 return (ArrayList<Parametro>) this.lista;
	 }

}
