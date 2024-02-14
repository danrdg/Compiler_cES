package compiler.syntax.nonTerminal;

import java.util.*;

public class ListadoIds extends NonTerminal {
	private List<Id> lista; 
	public ListadoIds() {
		super();
		lista = new ArrayList<>();
	}
	 public void addId(Id id) {
		 lista.add(id);
	 }
	 public void actualizarLista(ArrayList<Id> lista) {
		 this.lista = lista;
	 }
	 public ArrayList<Id> extraerLista(){
		 return (ArrayList<Id>) this.lista;
	 }

}
