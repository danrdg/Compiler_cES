package compiler.semantic.symbol;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for SymbolVariable.
 */

// TODO: Student work
//       Include properties to characterize variables

public class SymbolVariable
    extends SymbolBase
{  
	private int valor;
	private ScopeIF scope;
	private int direccion;
   
    /**
     * Constructor for SymbolVariable.
     * @param scope The declaration scope.
     * @param name The symbol name.
     * @param type The symbol type.
     */
    public SymbolVariable (ScopeIF scope, 
                           String name,
                           TypeIF type)
    {
        super (scope, name, type);
    } 
    public void setValor (int i) {
    	this.valor = i;
    }
    public int getValor() {
    	return valor;
    	
    }
    public int getAddress(){
    	return this.direccion;
    }
    public void setAddress(int valor){
    	this.direccion=valor;
    }

}
