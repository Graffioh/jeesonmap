import java.io.*;

%%

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
string = "[Aa-Zz]+"
number = [0-9]+
comma = ,
closed_bracket = \}
nl = \n | \r | \r\n

%%

{open_bracket} { semantic = yytext(); return OP_BRK; }
{string} { semantic = yytext(); return STR; }
{number} { semantic = yytext(); return NUM; }
{comma} { semantic = yytext(); return COM; }
{closed_bracket} { semantic = yytext(); return CL_BRK; }
{nl} { return ENDINPUT; }
[^] { System.out.println("Error?"); }