#!/bin/sh

case "$1" in
  "run")
    jflex -d src/main/java/org/example src/main/resources/json_lexer.flex
    jacc src/main/resources/json_parser.jacc
    mv src/main/resources/JsonParser.java src/main/java/org/example
    mv src/main/resources/ParserTokens.java src/main/java/org/example
    javac src/main/java/org/example/*.java
    ;;

  "clean")
    rm src/main/java/org/example/JsonLexer.* src/main/java/org/example/JsonParser.* src/main/java/org/example/ParserTokens.*
    ;;

  "run-resources")
    jflex src/main/resources/json_lexer.flex
    jacc src/main/resources/json_parser.jacc
    javac src/main/resources/*.java
    java src/main/resources/JsonParser.java
    ;;

  "clean-resources")
    rm src/main/resources/JsonLexer.* src/main/resources/JsonParser.* src/main/resources/ParserTokens.*
    ;;

  *)
    echo "Usage: $0 {run|clean}"
    exit 1
    ;;
esac