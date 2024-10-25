    /* DIRECTIVES */

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
    System.out.println("SEMANTIC: " + semantic);
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
    System.out.println("TOKEN: " + token);
    return token;
}
%}

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
space = [ \t]+
nl = \n | \r | \r\n

%%
    /* ADDITIONAL CODE */

{open_bracket} { semantic = yytext();
 System.out.println("Recognized open bracket: " + semantic);
 return OP_BRK; }

{string} { semantic = yytext();
System.out.println("Recognized string: " + semantic);
return STR; }

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

{space} { /* Ignore space */ }
{nl} { /* Ignore new line */ }

<<EOF>> { System.out.println("Recognized end of file!"); return ENDINPUT; }

