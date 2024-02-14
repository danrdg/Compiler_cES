package compiler.code;

import java.util.Arrays;
import java.util.List;

import compiler.intermediate.Label;
import compiler.intermediate.Temporal;
import compiler.intermediate.Value;
import compiler.intermediate.Variable;
import compiler.semantic.type.TypeSimple;

import es.uned.lsi.compiler.code.ExecutionEnvironmentIF;
import es.uned.lsi.compiler.code.MemoryDescriptorIF;
import es.uned.lsi.compiler.code.RegisterDescriptorIF;
import es.uned.lsi.compiler.intermediate.OperandIF;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;

/**
 * Class for the ENS2001 Execution environment.
 */

public class ExecutionEnvironmentEns2001 
    implements ExecutionEnvironmentIF
{    
    private final static int      MAX_ADDRESS = 65535; 
    private final static String[] REGISTERS   = {
       ".PC", ".SP", ".SR", ".IX", ".IY", ".A", 
       ".R0", ".R1", ".R2", ".R3", ".R4", 
       ".R5", ".R6", ".R7", ".R8", ".R9"
    };
    
    private RegisterDescriptorIF registerDescriptor;
    private MemoryDescriptorIF   memoryDescriptor;
    
    /**
     * Constructor for ENS2001Environment.
     */
    public ExecutionEnvironmentEns2001 ()
    {       
        super ();
    }
    
    /**
     * Returns the size of the type within the architecture.
     * @return the size of the type within the architecture.
     */
    @Override
    public final int getTypeSize (TypeSimple type)
    {      
        return 1;  
    }
    
    /**
     * Returns the registers.
     * @return the registers.
     */
    @Override
    public final List<String> getRegisters ()
    {
        return Arrays.asList (REGISTERS);
    }
    
    /**
     * Returns the memory size.
     * @return the memory size.
     */
    @Override
    public final int getMemorySize ()
    {
        return MAX_ADDRESS;
    }
           
    /**
     * Returns the registerDescriptor.
     * @return Returns the registerDescriptor.
     */
    @Override
    public final RegisterDescriptorIF getRegisterDescriptor ()
    {
        return registerDescriptor;
    }

    /**
     * Returns the memoryDescriptor.
     * @return Returns the memoryDescriptor.
     */
    @Override
    public final MemoryDescriptorIF getMemoryDescriptor ()
    {
        return memoryDescriptor;
    }
    private String operacion (OperandIF op) {
    	if(op instanceof Variable) {
    	return "/" + ((Variable)op).getAddress();   	
    	}
    	if(op instanceof Value){
    	return "#" + ((Value)op).getValue();
    	}
    	if(op instanceof Temporal){
    	return "/" + ((Temporal)op).getAddress();
    	}
    	if(op instanceof Label){
    	return ((Label)op).getName();
    	}
    	return null;
    	}

    /**
     * Translate a quadruple into a set of final code instructions. 
     * @param cuadruple The quadruple to be translated.
     * @return a quadruple into a set of final code instructions. 
     */
    @Override
    public final String translate (QuadrupleIF quadruple)
    {      
        //TODO: Student work
    	if(quadruple.getOperation().equals("NOP")) {
    		StringBuffer b = new StringBuffer();
    		b.append(";" + quadruple.toString() + "\n"); //generar cuadrupla como un comentario (opcional)
    		b.append("NOP");
    		return b.toString();
    		}
    	if(quadruple.getOperation().equals("VARGLOBAL")) {
    		StringBuffer b = new StringBuffer();
    		String o1 = operacion(quadruple.getFirstOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); //generar cuadrupla como un comentario (opcional)
    		b.append("MOVE " + o1 + ", " + r);
    		return b.toString();
    		}
    	if(quadruple.getOperation().equals("ADD")) {
    		StringBuffer b = new StringBuffer();
    		String o1 = operacion(quadruple.getFirstOperand());
    		String o2 = operacion(quadruple.getSecondOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); //generar cuadrupla como un comentario (opcional)
    		b.append("ADD " + o1 + ", " + o2 + "\n");
    		b.append("MOVE " + ".A " + ", " + r);
    		return b.toString();
    		}
    	if(quadruple.getOperation().equals("SUB")) {
    		StringBuffer b = new StringBuffer();
    		String o1 = operacion(quadruple.getFirstOperand());
    		String o2 = operacion(quadruple.getSecondOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); //generar cuadrupla como un comentario (opcional)
    		b.append("SUB " + o1 + ", " + o2 + "\n");
    		b.append("MOVE " + ".A " + ", " + r);
    		return b.toString();
    		}
    	if(quadruple.getOperation().equals("MV")) {
    		StringBuffer b = new StringBuffer();
    		String o1 = operacion(quadruple.getFirstOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); //generar cuadrupla como un comentario (opcional)
    		b.append("MOVE " + o1 + ", " + r);
    		return b.toString();
    		}
    	if(quadruple.getOperation().equals("MVA")) {
    		StringBuffer b = new StringBuffer();
    		String o = operacion(quadruple.getFirstOperand());
    		char c[] = o.toCharArray();
    		c[0] = '#';
    		String o1 = new String(c);
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); //generar cuadrupla como un comentario (opcional)
    		b.append("MOVE " + o1 + ", " + r);
    		return b.toString();
    		}
    	if(quadruple.getOperation().equals("STP")) {
    		StringBuffer b = new StringBuffer();
    		String o1 = operacion(quadruple.getFirstOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); //generar cuadrupla como un comentario (opcional)
    		b.append("MOVE " + r + ", " + ".R1" + "\n");
    		b.append("MOVE " + o1 + ", " + "[.R1]");
    		return b.toString();
    		}
    	if(quadruple.getOperation().equals("MVP")) {
    		StringBuffer b = new StringBuffer();
    		String o1 = operacion(quadruple.getFirstOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); //generar cuadrupla como un comentario (opcional)
    		b.append("MOVE " + o1 + ", " + ".R1" + "\n");
    		b.append("MOVE " + "[.R1]" + ", " + r);
    		return b.toString();
    		}
    	if(quadruple.getOperation().equals("ESCRIBENT")) {
    		StringBuffer b = new StringBuffer();
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); //generar cuadrupla como un comentario (opcional)
    		b.append("WRINT " + r +"\n" );
    		b.append("WRCHAR #10");
    		return b.toString();
    		}
    	if(quadruple.getOperation().equals("ESCRIBECADENA")) {
    		StringBuffer b = new StringBuffer();
    		String o1 = operacion(quadruple.getFirstOperand());
    		b.append(";" + quadruple.toString() + "\n"); //generar cuadrupla como un comentario (opcional)
    		b.append("WRSTR " + "/" + o1 + "\n");
    		b.append("WRCHAR #10");
    		return b.toString();
    		}
    	if(quadruple.getOperation().equals("HALT")) {
    		StringBuffer b = new StringBuffer();
    		b.append(";" + quadruple.toString() + "\n"); //generar cuadrupla como un comentario (opcional)
    		b.append("HALT");
    		return b.toString();
    		}
    	if(quadruple.getOperation().equals("EQ")) {
    		StringBuffer b = new StringBuffer();
    		String o1 = operacion(quadruple.getFirstOperand());
    		String o2 = operacion(quadruple.getSecondOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); //generar cuadrupla como un comentario (opcional)
    		b.append("CMP " + o1 + ", " + o2 + "\n");
    		b.append("BZ $5" + "\n");
    		b.append("MOVE #0 " +  ", " + r + "\n" );
    		b.append("BR $3" + "\n");
    		b.append("MOVE #1 " +  ", " + r  + "\n");
    		return b.toString();
    		}
    	if(quadruple.getOperation().equals("MUL")) {
    		StringBuffer b = new StringBuffer();
    		String o1 = operacion(quadruple.getFirstOperand());
    		String o2 = operacion(quadruple.getSecondOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); //generar cuadrupla como un comentario (opcional)
    		b.append("MUL" + o1 + ", " + o2 + "\n");
    		b.append("MOVE " + ".A " + ", " + r);
    		return b.toString();
    		}
    	if(quadruple.getOperation().equals("INC")) {
    		StringBuffer b = new StringBuffer();
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); //generar cuadrupla como un comentario (opcional)
    		b.append("INC" + r );
    		return b.toString();
    		}
    	if(quadruple.getOperation().equals("NEG")) {
    		StringBuffer b = new StringBuffer();
    		b.append(";" + quadruple.toString() + "\n"); //generar cuadrupla como un comentario (opcional)
    		String r = operacion(quadruple.getResult());
    		b.append("CMP " + r + ", #0 \n");
    		b.append("BZ $5" + "\n");
    		b.append("MOVE #0 " +  ", " + r + "\n" );
    		b.append("BR $3" + "\n");
    		b.append("MOVE #1 " +  ", " + r  + "\n");
    		return b.toString();
    		}
    	if(quadruple.getOperation().equals("LS")) {
    		StringBuffer b = new StringBuffer();
    		String o1 = operacion(quadruple.getFirstOperand());
    		String o2 = operacion(quadruple.getSecondOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); //generar cuadrupla como un comentario (opcional)
    		b.append("CMP " + o1 + ", " + o2 + "\n");
    		b.append("BN $5" + "\n");
    		b.append("MOVE #0 " +  ", " + r  + "\n");
    		b.append("BR $3" + "\n");
    		b.append("MOVE #1 " +  ", " + r );
    		return b.toString();
    		}
    	if(quadruple.getOperation().equals("AND")) {
    		StringBuffer b = new StringBuffer();
    		String o1 = operacion(quadruple.getFirstOperand());
    		String o2 = operacion(quadruple.getSecondOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); //generar cuadrupla como un comentario (opcional)
    		b.append("AND" + o1 + ", " + o2 + "\n");
    		b.append("MOVE " + ".A " + ", " + r);
    		return b.toString();
    		}
    	if(quadruple.getOperation().equals("BR")) {
    		StringBuffer b = new StringBuffer();
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); //generar cuadrupla como un comentario (opcional)
    		b.append("BR " + "/" + r);
    		return b.toString();
    		}
    	if(quadruple.getOperation().equals("INL")) {
    		StringBuffer b = new StringBuffer();
    		String r = operacion(quadruple.getResult());
    		b.append(";" + quadruple.toString() + "\n"); //generar cuadrupla como un comentario (opcional)
    		b.append(r+": NOP");
    		return b.toString();
    		}
    	if(quadruple.getOperation().equals("BRF")) {
    		StringBuffer b = new StringBuffer();
    		String r = operacion(quadruple.getResult());
    		String o1 = operacion(quadruple.getFirstOperand());
    		b.append(";" + quadruple.toString() + "\n"); //generar cuadrupla como un comentario (opcional)
    		b.append("CMP  #0 " + "," + r + "\n");
    		b.append("BZ " + "/" + o1);
    		return b.toString();
    		}
    	if(quadruple.getOperation().equals("BRT")) {
    		StringBuffer b = new StringBuffer();
    		String r = operacion(quadruple.getResult());
    		String o1 = operacion(quadruple.getFirstOperand());
    		b.append(";" + quadruple.toString() + "\n"); //generar cuadrupla como un comentario (opcional)
    		b.append("CMP  #0 " + "," + r + "\n");
    		b.append("BNZ " + "/" + o1);
    		return b.toString();
    		}
    	if(quadruple.getOperation().equals("CADENA")) {
    		StringBuffer b = new StringBuffer();
    		String r = operacion(quadruple.getResult());
    		String o1 = operacion(quadruple.getFirstOperand());
    		b.append(";" + quadruple.toString() + "\n"); //generar cuadrupla como un comentario (opcional)
    		b.append(o1+ " : DATA " + r);
    		return b.toString();
    		}
    	if(quadruple.getOperation().equals("ESCRIBELINEA")) {
    		StringBuffer b = new StringBuffer();
    		b.append(";" + quadruple.toString() + "\n"); //generar cuadrupla como un comentario (opcional)
    		b.append("WRCHAR #10");
    		return b.toString();
    		}
        return quadruple.toString(); 
    }
}
