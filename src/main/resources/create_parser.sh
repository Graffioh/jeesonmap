#!/bin/sh

case "$1" in
  "run")
    jflex -d src/main/java/org/jeesonmap src/main/resources/json_lexer.flex
    jacc src/main/resources/json_parser.jacc
    mv src/main/resources/JeesonParser.java src/main/java/org/jeesonmap
    mv src/main/resources/JeesonParserTokens.java src/main/java/org/jeesonmap
    javac src/main/java/org/jeesonmap/*.java
    ;;

  "clean")
    rm src/main/java/org/jeesonmap/JeesonLexer.* src/main/java/org/jeesonmap/JeesonParser.* src/main/java/org/jeesonmap/JeesonParserTokens.*
    ;;

  *)
    echo "Usage: $0 {run|clean}"
    exit 1
    ;;
esac