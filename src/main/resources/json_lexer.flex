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
string = [a-zA-Z]+
number = [0-9]+
double_dots = :
comma = ,
closed_bracket = \}
space = [ \t]+
nl = \n | \r | \r\n

%%
    /* ADDITIONAL CODE */

{open_bracket} { semantic = yytext(); return OP_BRK; }
{string} { semantic = yytext(); return STR; }
{number} { semantic = yytext(); return NUM; }
{comma} { semantic = yytext(); return COM; }
{double_dots} { semantic = yytext(); return DD; }
{closed_bracket} { semantic = yytext(); return CL_BRK; }
{space} { /* Ignore space */ }
{nl} { return ENDINPUT; }
. { System.out.println("Unexpected character: " + yytext()); }