# Debugging Java
Instrutor: Camila Cavalcante

link do repositório referente a aula: 

Erros de programação são denominados bugs e o processo de encontrar e corrigir bugs é chamado depuração ou debugging.

De forma geral, a depuração é uma tarefa difícil e trabalhosa e a dificuldade varia de acordo com o ambiente de desenvolvimento, o que inclui a linguagem de programação e as ferramentas disponíveis, como depuradores.

Existem duas grandes categorias que englobam a natureza do erro:

* Erros de Sintaxe:

Erro que trata mais da forma, da escrita que fazemos do código.

É um erro nas regras estabelecidas da linguagem:
1. Parênteses, chaves, colchetes que abrem mas não fecham.
2. Duas instruções sem um ponto-e-vírgula entre elas;
3. Uma palavra-chave sendo usada numa posição inesperada.

* Erros de Semântica:

Erro que trata mais da lógica do código.

É um erro na "lógica do código", em sua semântica, o código está sintaticamente correto, porém não faz o que se esperava dele.
1. Tentar dividir um número por uma String ou por zero.
2. Atribuir um valor incoerente a um tipo de dado. Por exemplo: int n = "Camila".
3. Tentar fechar um arquivo que não foi aberto.

## Depuração/Debugging

Linguagens de alto nível tornam a depuração mais fácil, pois fornecem mais ferramentas para identificar erros, como o tratamento de exceções.

Os depuradores funcionam assumindo o controle do temo de execução de um programa e permitindo que você o observe e controle. Para fazer isso, ele mostra a pilha do programa e permite que você a atravesse em qualquer direção. Quando você está em um depurador, obtém uma imagem mais completa de um quadro de pilha do que quando olha os rastreamentos de pilha em uma mensagem de log.

## Pilha de Execução de um Programa Java/Stack Trace

### Pilha de execução:

Toda invocação de método é empilhada eum estrutura de dados que isola a área de memória de cada um. Quando um método termina (retorna), ele volta para o método que o invocou.

### Stack Trace:

É a matriz onde encontramos a pilha de exceção. Em outras palavras, podemos dizer que o rastreamento da pilha busca (rastreio) para a próxima linha onde a exceção pode surgir.

Fim da aula.
