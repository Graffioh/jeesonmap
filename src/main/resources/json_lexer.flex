    /* DIRECTIVES */
package org.jeesonmap;
import java.io.*;

%%
    /* RULES */

%class JsonLexer
%implements ParserTokens

%function yylex
%int

%{
private int token;
private String semantic;
private boolean eof = false;

/* get the current token code*/
public int getToken()
{
    return token;
}
/* get the current token value */
public String getSemantic()
{
    return semantic;
}

/* get the next token code */
public int nextToken()
{
    try
    {
        token = yylex();
    }
    catch (java.io.IOException e)
    {
        System.out.println(
            "IO exception occured:\n" + e);
    }
    return token;
}

public int getLine() {
    return yyline + 1;
}

public int getColumn() {
    return yycolumn + 1;
}
%}

%line
%column

open_bracket = \{
string = \"([^\"\\\\]|\\\\[\"\\\\bfnrt])*\"
number = [0-9]+
double_dots = :
comma = ,
open_square = \[
closed_square = \]
boolean = true|false
null = null
closed_bracket = \}
unquoted_key = [a-zA-Z][a-zA-Z0-9_]*[ \t]*:
space = [ \t]+
nl = \n | \r | \r\n

%%
    /* ADDITIONAL CODE */

{open_bracket} { semantic = yytext();
 System.out.println("Recognized open bracket: " + semantic);
 return OP_BRK; }

{string} {
    semantic = yytext().substring(1, yytext().length() - 1);  
    System.out.println("Recognized string: " + semantic);
    return STR;
}

{number} { semantic = yytext();
System.out.println("Recognized number: " + semantic);
return NUM; }

{comma} { semantic = yytext();
System.out.println("Recognized comma: " + semantic);
return COM; }

{double_dots} { semantic = yytext();
System.out.println("Recognized double dots: " + semantic);
return DD; }

{open_square} { semantic = yytext();
    System.out.println("Recognized open square bracket: " + semantic);
    return OP_SQR; }

{closed_square} { semantic = yytext();
    System.out.println("Recognized closed square bracket: " + semantic);
    return CL_SQR; }

{boolean} { semantic = yytext();
System.out.println("Recognized boolean: " + semantic);
return BOOL; }

{null} { semantic = yytext();
System.out.println("Recognized null: " + semantic);
return NULL; }

{closed_bracket} { semantic = yytext();
System.out.println("Recognized closed bracket: " + semantic);
return CL_BRK; }

{unquoted_key} {
    semantic = yytext();
    throw new RuntimeException("Error: Unquoted key '" + semantic + "' at line " + getLine() + ", column " + getColumn() + ". Keys must be enclosed in double quotes.");
}

{space} { /* Ignore space */ }
{nl} { /* Ignore new line */ }

. {
  throw new RuntimeException("Illegal character '" + yytext() + "' at line " + getLine() + ", column " + getColumn());
}

<<EOF>> { System.out.println("Recognized end of file!"); return ENDINPUT; }

