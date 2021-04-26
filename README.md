# Programação Orientada a Objetos

## Introdução

Repositório destinado para armazenar conteúdos referentes a disciplina de Programação Orientada a Objetos do curso de Engenharia de Computação - IFPB/Campina Grande.
O curso utiliza com linguagem de programação Java.

## Material utilizado

Estes são os materiais utilizados para desenvolver e rodar meus programas.

### IDE's & Editor(es) de texto

- [IntelliJ IDEA by JetBrains](https://www.jetbrains.com/idea/)

### Ferramentas de UML

- [LucidChart](https://www.lucidchart.com/pages/)
- [Visual Paradigm](https://online.visual-paradigm.com/pt/)

## Programando em Java

O que foi necessário para executar meus programas.

### Pré-Requisitos

Para executar programas em Java é necessário ter o Java (JRE) instalado no computador. Para desenvolver programas em Java é necessário ter o compilador JAVAC - incluso em um dos pacotes JDK (SE, EE, ME) - instalado no computador.

- Para verificar se o java e o javac estão instalados no PC, basta executar os comandos no CMD:
    - `> java --version` `> javac --version`

    > Se os comandos não forem reconhecidos, não está instalado!Caso exiba a versão, está instalado!

### Executando .java pelo CMD

Criando e executando o Java pelo CMD

1. Para executar arquivos .java pelo terminal deve-se ter o Java JDK (Java Development Kit) devidamente instalado no PC.
Para instalar, visitar o site oficial e seguir as intruções.
2. Após ter baixado e configurado o JDK, já será capaz de criar e executar programas Java no Windows.
- Para compilar programas ".java" e executá-los no terminal/cmd:
    - Abrir pasta onde se localiza o arquivo main (principal) .java: <br>
    `> cd "pasta do programa"`
    - Compilar o programa: <br>
    `> javac "nome do programa".java`
    - Para executar: <br>
    `> java "nome do programa"`

### Empacontando arquivos .class em um .jar

1. Compilar o arquivo .class onde se encontra o main:<br>
`> javac "main".java`
2. Executar o comando:<br>
`> jar --create --file "nome desejado para o jar".jar --main-class "nome do class principal" "class principal".class "outras classes".class`
3. Para executar o jar:<br>
`> java -jar "nome do jar".jar`

### Organizando em pastas:

1. Suponham que existam 3 pastas:
    - bin (Para armazenar os bytecodes .class)
    - dist (Para armazenar o(s) .jar)
    - src (Onde ficam os arquivos .java)
2. Para compilar todos os arquivos .java da pasta src e enviar os bytecodes (.class) compilados para a pasta bin, executar o comando: <br>
    `> javac -cp src -d ./bin src/*.java`
3. Para empacotar todas classes da pasta bin e gerar um .jar na pasta dist: <br>
    `> jar --verbose --create --file dist/"nome desejado para o jar".jar --main-class HelloWorld -C bin .`
4. Para verificar os arquivos dentro do jar: <br>
    `> jar -tf dist/"nome desejado para o jar".jar`
5. Para executar o jar: <br>
    `> java -jar dist/"nome desejado para o jar".jar`

