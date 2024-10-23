#!/bin/sh

case "$1" in
  "run")
    jflex src/main/resources/json_lexer.flex
    jacc src/main/resources/json_parser.jacc
    javac src/main/resources/*.java
    java src/main/resources/JsonParser.java
    ;;

  "clean")
    rm src/main/resources/JsonLexer.* src/main/resources/JsonParser.* src/main/resources/ParserTokens.*
    ;;

  *)
    echo "Usage: $0 {run|clean}"
    exit 1
    ;;
esac