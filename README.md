# Compiler_cES
Compilador para el lenguaje de programación "cES".
Compuesto por un analizador léxico codificado en FLEX, un analizador sintáctico y semántico codificado en CUP, ambos sobre la base de JAVA.

# Especificaciones
Un programa escrito en cES es una secuencia ordenada de TOKENS. Un TOKEN es una entidad léxica indivisible que tiene un sentido único dentro del
lenguaje. 
En términos generales es posible distinguir diferentes tipos de TOKENS:
1.  “/*” y “*/” para comentarios anidados
2.  Constantes enteras
3.  Cadenas de caracteres
4.  Identificadores. Desde el punto de vista léxico son una secuencia ordenada de letras y dígitos que comienzan obligatoriamente por una letra
5.  Palabras clave reservadas:
  5.1 caso - Usado en sentencias
  5.2 
corte Usado en sentencias
“alternativas”. Delimita un caso
entero Tipo entero
escribe Muestra por pantalla un texto
escribeEnt Muestra por pantalla un entero
alternativas Cabecera de una sentencia
condicional “alternativas”
mientras Cabecera de una sentencia de
flujo “mientras”

# Software used
This application was created with Eclipse IDE: 2022-12
# Setup
There are 3 bat files allowing the user to launch the application.
It is important to launch first basededatos.bet, then servidor.bat and later cliente.bat since the first gives service to the next one.
