package compiler.semantic.symbol;

import java.util.ArrayList;
import java.util.List;

import compiler.syntax.nonTerminal.Parametro;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for SymbolFunction.
 */

// TODO: Student work
//       Include properties to characterize function calls

public class SymbolFunction
    extends SymbolProcedure
{
      
    /**
     * Constructor for SymbolFunction.
     * @param scope The declaration scope.
     * @param name The symbol name.
     * @param type The symbol type.
     */
	private List<Parametro> lista;
    public SymbolFunction (ScopeIF scope, 
                           String name,
                           TypeIF type)
    {
        super (scope, name, type);
        lista = new ArrayList<>();
        
    } 
    public void addParametro(Parametro id) {
		 lista.add(id);
    }
    public int cuentaParametros() {
    	return lista.size();
    }
}
