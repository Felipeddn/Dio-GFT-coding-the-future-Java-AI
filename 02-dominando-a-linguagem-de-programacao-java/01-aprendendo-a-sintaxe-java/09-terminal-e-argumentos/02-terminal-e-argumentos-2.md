# Terminal e argumentos - 2
Instrutor: Gleydson Sampaio

Todo o conteúdo do curso pode ser acessado em:

https://glysns.gitbook.io/java-basico/

## Terminal e argumentos 

Nem sempre executamos nosso programa Java pela IDE, já pensou nossos clientes tendo que instalar o Eclipse ou o VS Code para rodar o sistema em sua empresa? 

Com a JVM devidamente configurada, nós podemos criar um executável do nosso programa e disponibilizar o instalador para qualquer sistema operacional.

No nosso caso iremos aprender como executar um programa Java via terminal como MS - DOS ou terminal do VS Code.

Vamos criar uma classe chamada MinhaClasse.java com o código abaixo:

```java

public class MinhaClasse{
    public static void main(String[] args){
        System.out.println("oi, fui executado pelo terminal");
    }
}
```

Observe que nosso projeto Java criado por uma IDE, ele terá uma pasta chamada bin. É nesta pasta que ficarão os arquivos **.class**, o nosso bytecode.

projeto > bin

Mesmo usando uma IDE, nós sempre precisaremos identificar aonde se encontram as classes do nosso projeto, no meu caso está **C:\estudos\dio-trilha-java-basico\java-terminal.**

## Terminal 

Vamos ilustrar como executar uma classe, depois de compilada, sem precisar usar a IDE.

1. Abra o MS-DOS ou Power Shell 

2. Localize o diretório do seu projeto: **cd C:\Estudos\DigitalInnovationOne\GFTCodingTheFuture\02-dominando-a-linguagem-de-programacao-java\01-aprendendo-a-sintaxe-java\java-projetos\08-java-doc\java-doc-aulas**

3. acesse a pasta bin: **cd bin** 
4. Agora digite o comando: java MinhaClasse (nome da sua classe sem a extensão **.class**)

Comandos DOS equivalentes aos comandos linux

dir = ls
cls = clear 

Não consegui usar não.

Odiei do fundo da alma essa aula, simplesmente não apareceu a "MinhaClasse" no diretório bin, odiei demais.

Fim da aula
