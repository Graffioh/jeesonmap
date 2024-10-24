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
%}

open_bracket = \{
string = \"([^\"\\\\]|\\\\[\"\\\\bfnrt])*\"
number = [0-9]+
double_dots = :
comma = ,
closed_bracket = \}
open_square = \[
closed_square = \]
boolean = true|false
null = null
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

{closed_bracket} { semantic = yytext();
System.out.println("Recognized closed bracket: " + semantic);
return CL_BRK; }

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
System.out.println("Recognized boolean: " + semantic);
return NULL; }

{space} { /* Ignore space */ }
{nl} { return ENDINPUT; }
. { System.out.println("Unexpected character: " + yytext()); }
