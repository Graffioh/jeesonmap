# jeesonmap
JSON parser that generate a map from a [JSON](https://www.json.org/json-en.html) using [JFlex](https://www.jflex.de/) and [Jacc](https://web.cecs.pdx.edu/~mpj/jacc/)

## Installation

You need to install JFlex ([installation guide](https://www.jflex.de/manual.html#Installing)) and Jacc ([installation guide](https://github.com/zipwith/jacc/tree/master?tab=readme-ov-file#installation))

Then you clone the repository

~~~sh
git clone https://github.com/yourusername/jeesonmap.git
cd jeesonmap
~~~

## Usage

## Modify jeeson.json as per your preferences

~~~sh
src/main/java/resources/jeeson.json
~~~

Example jeeson.json content:

~~~json
{
  "key1": "value1",
  "key2": [1, true, null, "four", { "nestedKey": false }],
  "keyArrayEmpty": [],
  "keyObjectEmpty": {}
}
~~~

### Create the parser and compile the code

From the root directory, run the following command to generate the necessary files and compile the code:

```sh
./src/main/resources/create_parser.sh run
```

### Run Main.java

After generating the parser, you can run the `Main.java` file:

```sh
java src/main/java/org/jeesonmap/Main.java
```

### Clean generated Lexer and Parser files

To clean up the generated Lexer and Parser files, run:

```sh
./src/main/resources/create_parser.sh clean
```

## Blog post coming soon...

