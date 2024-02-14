# Compiler_cES
Compilador para el lenguaje de programación "cES".
Compuesto por un analizador léxico codificado en FLEX, un analizador sintáctico y semántico codificado en CUP, ambos sobre la base de JAVA.

# Especificaciones Léxicas
Un programa escrito en cES es una secuencia ordenada de TOKENS. Un TOKEN es una entidad léxica indivisible que tiene un sentido único dentro del
lenguaje. 
En términos generales es posible distinguir diferentes tipos de TOKENS:
1.  “/*” y “*/” para comentarios anidados
2.  Constantes enteras
3.  Cadenas de caracteres
4.  Identificadores. Desde el punto de vista léxico son una secuencia ordenada de letras y dígitos que comienzan obligatoriamente por una letra
5.  Palabras clave reservadas:
```
caso          Usado en sentencias “alternativas”. Delimita un caso
entero        Tipo entero
escribe       Muestra por pantalla un texto
escribeEnt    Muestra por pantalla un entero
alternativas  Cabecera de una sentencia condicional “alternativas”
mientras      Cabecera de una sentencia de flujo “mientras”
pordefecto    Caso por defecto en una sentencia “alternativas”
principal     Nombre de la función principal devuelve Instrucción de retorno en funciones
si            Cabecera de una sentencia condicional “si”
sino          Parte optativa de una sentencia condicional “si”
tipo          Marca la declaración de un tipo
vacio         Tipo vacio

```
6. Delimitadores
```
“   Delimitador de constante literal de cadena.
( ) Delimitadores de expresiones y de parámetros
[ ] Delimitador de rango en una declaración de un vector.
,   Delimitador en listas de identificadores
;   Delimitador en secuencias de sentencias.
:   Delimitador en una sentencia “alternativas”.

```
7.Operadores
```
Operadores aritméticos + (suma) * (producto)
Operadores relacionales < (menor) == (igual)
Operadores lógicos && (conjunción lógica) ! (negación lógica)
Operadores especiales ++ (autoincremento)
Operadores de asignación = (asignación) += (asignación con suma)
Operadores de acceso [] (acceso a elemento de vector)
```

# Especificaciones Sintácticas
## Declaraciones de constantes
   En cES todas las constantes simbólicas son de tipo entero. La sintaxis para la declaración de constantes simbólicas enteras es la siguiente: #constante nombre valor

