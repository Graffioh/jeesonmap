// Output created by jacc on Fri Oct 25 11:27:42 CEST 2024


import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

class JsonParser implements ParserTokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private String[] yysv;
    private String yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new String[yyss];
        yytok = (lexer.getToken()
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 29:
                    switch (yytok) {
                        case OP_BRK:
                            yyn = 5;
                            continue;
                        case OP_SQR:
                            yyn = 6;
                            continue;
                    }
                    yyn = 61;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 30:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 58;
                            continue;
                    }
                    yyn = 61;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 31:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 61;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 32:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 61;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 33:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 61;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 34:
                    switch (yytok) {
                        case CL_BRK:
                            yyn = 10;
                            continue;
                        case STR:
                            yyn = 11;
                            continue;
                    }
                    yyn = 61;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 35:
                    yyn = yys6();
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 36:
                    switch (yytok) {
                        case DD:
                            yyn = 21;
                            continue;
                    }
                    yyn = 61;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 37:
                    switch (yytok) {
                        case COM:
                        case CL_BRK:
                            yyn = yyr18();
                            continue;
                    }
                    yyn = 61;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 38:
                    switch (yytok) {
                        case CL_BRK:
                            yyn = 22;
                            continue;
                        case COM:
                            yyn = 23;
                            continue;
                    }
                    yyn = 61;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 39:
                    switch (yytok) {
                        case ENDINPUT:
                        case CL_SQR:
                        case COM:
                        case CL_BRK:
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 61;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 40:
                    switch (yytok) {
                        case DD:
                            yyn = yyr16();
                            continue;
                    }
                    yyn = 61;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 41:
                    switch (yytok) {
                        case CL_SQR:
                        case COM:
                        case CL_BRK:
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 61;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 42:
                    switch (yytok) {
                        case CL_SQR:
                        case COM:
                        case CL_BRK:
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 61;
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 43:
                    switch (yytok) {
                        case CL_SQR:
                        case COM:
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 61;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 44:
                    switch (yytok) {
                        case CL_SQR:
                            yyn = 24;
                            continue;
                        case COM:
                            yyn = 25;
                            continue;
                    }
                    yyn = 61;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 45:
                    switch (yytok) {
                        case CL_SQR:
                        case COM:
                        case CL_BRK:
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 61;
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 46:
                    switch (yytok) {
                        case ENDINPUT:
                        case CL_SQR:
                        case COM:
                        case CL_BRK:
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 61;
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 47:
                    switch (yytok) {
                        case CL_SQR:
                        case COM:
                        case CL_BRK:
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 61;
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 48:
                    switch (yytok) {
                        case CL_SQR:
                        case COM:
                        case CL_BRK:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 61;
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 49:
                    switch (yytok) {
                        case CL_SQR:
                        case COM:
                        case CL_BRK:
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 61;
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 50:
                    yyn = yys21();
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 51:
                    switch (yytok) {
                        case ENDINPUT:
                        case CL_SQR:
                        case COM:
                        case CL_BRK:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 61;
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 52:
                    switch (yytok) {
                        case STR:
                            yyn = 11;
                            continue;
                    }
                    yyn = 61;
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 53:
                    switch (yytok) {
                        case ENDINPUT:
                        case CL_SQR:
                        case COM:
                        case CL_BRK:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 61;
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 54:
                    yyn = yys25();
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 55:
                    switch (yytok) {
                        case COM:
                        case CL_BRK:
                            yyn = yyr17();
                            continue;
                    }
                    yyn = 61;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 56:
                    switch (yytok) {
                        case COM:
                        case CL_BRK:
                            yyn = yyr19();
                            continue;
                    }
                    yyn = 61;
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 57:
                    switch (yytok) {
                        case CL_SQR:
                        case COM:
                            yyn = yyr15();
                            continue;
                    }
                    yyn = 61;
                    continue;

                case 58:
                    return true;
                case 59:
                    yyerror("stack overflow");
                case 60:
                    return false;
                case 61:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        String[] newyysv = new String[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yys6() {
        switch (yytok) {
            case OP_BRK:
                return 5;
            case OP_SQR:
                return 6;
            case BOOL:
                return 16;
            case CL_SQR:
                return 17;
            case NULL:
                return 18;
            case NUM:
                return 19;
            case STR:
                return 20;
        }
        return 61;
    }

    private int yys21() {
        switch (yytok) {
            case OP_BRK:
                return 5;
            case OP_SQR:
                return 6;
            case BOOL:
                return 16;
            case NULL:
                return 18;
            case NUM:
                return 19;
            case STR:
                return 20;
        }
        return 61;
    }

    private int yys25() {
        switch (yytok) {
            case OP_BRK:
                return 5;
            case OP_SQR:
                return 6;
            case BOOL:
                return 16;
            case NULL:
                return 18;
            case NUM:
                return 19;
            case STR:
                return 20;
        }
        return 61;
    }

    private int yyr1() { // start : json
        {
        yyrv = yysv[yysp-1];
        System.out.println("Final JSON: " + yyrv);
    }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr2() { // json : object
        {
        yyrv = yysv[yysp-1];
        System.out.println("Parsed object: " + yyrv);
    }
        yysv[yysp-=1] = yyrv;
        return 2;
    }

    private int yyr3() { // json : array
        {
        yyrv = yysv[yysp-1];
        System.out.println("Parsed array: " + yyrv);
    }
        yysv[yysp-=1] = yyrv;
        return 2;
    }

    private int yyr16() { // key : STR
        {
        yyrv = yysv[yysp-1];
        System.out.println("Found key: " + yyrv);
    }
        yysv[yysp-=1] = yyrv;
        return 7;
    }

    private int yyr4() { // object : OP_BRK pair_list CL_BRK
        {
        yyrv = "{" + yysv[yysp-2] + "}";
        System.out.println("Built object: " + yyrv);
    }
        yysv[yysp-=3] = yyrv;
        return yypobject();
    }

    private int yyr5() { // object : OP_BRK CL_BRK
        {
        yyrv = "{}";
    }
        yysv[yysp-=2] = yyrv;
        return yypobject();
    }

    private int yypobject() {
        switch (yyst[yysp-1]) {
            case 0: return 3;
            default: return 12;
        }
    }

    private int yyr17() { // pair : key DD value
        {
        yyrv = yysv[yysp-3] + ": " + yysv[yysp-1];
        System.out.println("Built pair: " + yyrv);
    }
        yysv[yysp-=3] = yyrv;
        switch (yyst[yysp-1]) {
            case 5: return 8;
            default: return 27;
        }
    }

    private int yyr18() { // pair_list : pair
        {
        yyrv = yysv[yysp-1];
        System.out.println("Starting pair list: " + yyrv);
    }
        yysv[yysp-=1] = yyrv;
        return 9;
    }

    private int yyr19() { // pair_list : pair_list COM pair
        {
        yyrv = yysv[yysp-3] + ", " + yysv[yysp-1];
        System.out.println("Growing pair list: " + yyrv);
    }
        yysv[yysp-=3] = yyrv;
        return 9;
    }

    private int yyr6() { // array : OP_SQR value_list CL_SQR
        {
        yyrv = "[" + yysv[yysp-2] + "]";
        System.out.println("Built array: " + yyrv);
    }
        yysv[yysp-=3] = yyrv;
        return yyparray();
    }

    private int yyr7() { // array : OP_SQR CL_SQR
        {
        yyrv = "[]";
    }
        yysv[yysp-=2] = yyrv;
        return yyparray();
    }

    private int yyparray() {
        switch (yyst[yysp-1]) {
            case 0: return 4;
            default: return 13;
        }
    }

    private int yyr8() { // value : STR
        {
        yyrv = yysv[yysp-1];
        System.out.println("Value (string): " + yyrv);
    }
        yysv[yysp-=1] = yyrv;
        return yypvalue();
    }

    private int yyr9() { // value : NUM
        {
        yyrv = yysv[yysp-1];
        System.out.println("Value (number): " + yyrv);
    }
        yysv[yysp-=1] = yyrv;
        return yypvalue();
    }

    private int yyr10() { // value : array
        {
        yyrv = yysv[yysp-1];
        System.out.println("Value (array): " + yyrv);
    }
        yysv[yysp-=1] = yyrv;
        return yypvalue();
    }

    private int yyr11() { // value : object
        {
        yyrv = yysv[yysp-1];
        System.out.println("Value (object): " + yyrv);
    }
        yysv[yysp-=1] = yyrv;
        return yypvalue();
    }

    private int yyr12() { // value : BOOL
        {
        yyrv = yysv[yysp-1];
        System.out.println("Value (boolean): " + yyrv);
    }
        yysv[yysp-=1] = yyrv;
        return yypvalue();
    }

    private int yyr13() { // value : NULL
        {
        yyrv = yysv[yysp-1];
        System.out.println("Value (null): " + yyrv);
    }
        yysv[yysp-=1] = yyrv;
        return yypvalue();
    }

    private int yypvalue() {
        switch (yyst[yysp-1]) {
            case 21: return 26;
            case 6: return 14;
            default: return 28;
        }
    }

    private int yyr14() { // value_list : value
        {
        yyrv = yysv[yysp-1];
        System.out.println("Starting value list: " + yyrv);
    }
        yysv[yysp-=1] = yyrv;
        return 15;
    }

    private int yyr15() { // value_list : value_list COM value
        {
        yyrv = yysv[yysp-3] + ", " + yysv[yysp-1];
        System.out.println("Growing value list: " + yyrv);
    }
        yysv[yysp-=3] = yyrv;
        return 15;
    }

    protected String[] yyerrmsgs = {
    };

private JsonLexer lexer;

public JsonParser(Reader reader) {
    lexer = new JsonLexer(reader);
}

public void yyerror(String error) {
    System.err.println("Error: " + error);
}

public static void main(String args[]) throws IOException {
    FileInputStream jsonFile = new FileInputStream("src/main/resources/jeeson.json");
    JsonParser parser = new JsonParser(new InputStreamReader(jsonFile, Charset.forName("Cp1252")));

    parser.lexer.nextToken();
    parser.parse();

    System.out.println("Parsing completed.");
}

}
