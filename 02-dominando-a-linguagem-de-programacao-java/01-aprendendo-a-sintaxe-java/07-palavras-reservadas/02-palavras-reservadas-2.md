# PALAVRAS RESERVADAS - 2 

Instrutor: Gleydson Sampaio

Todo o conteúdo do curso pode ser acessado em:

https://glysns.gitbook.io/java-basico/

## Palavras reservadas 

Palavras reservadas são identificadores de uma linguagem que já possuem uma finalidade específica, portanto não podem ser utilizados para nomear variáveis, classes, métodos ou atributos.

A linguagem Java possui 52 palavras reservadas. Todas essas palavras classificadas em grupos e escrita em letra minúscula, sendo identificada com uma cor especial pela maioria das IDE's. Abaixo temos a lista de palavras agrupadas por suas finalidades.

## Palavras reservadas em Java

### Controle de pacotes

1. **import**: importa pacotes ou classes para dentro do código.

2. **package**: específica a que pacote todas as classes de um arquivo pertence 

### Modificadores de acesso 

3. **public**: acesso de qualquer classe.

4. **private**: acesso apenas dentro da classe.

5. **protected**: acesso por classes no mesmo pacote e subclasses.

### Primitivos 

6. **boolean**: um valor indicando verdadeiro ou falso.

7. **byte**: um inteiro de 8 bits (signed).

8. **char**: um caractere unicode de (16-bit unsigned).

9. **double**: um número de ponto flutuante de 64 bits (signed).

10. **float**: um número de ponto flutuante de 32 bits (signed).

11. **int**: um inteiro de 16 bits (signed).

12. **long**: um inteiro de 64 bits (signed).

13. **short**:um inteiro de 32 bits (signed).

14. **void**: indica que um método **nao tem retorno de valor**.

### Modificadores de classes, variáveis ou métodos.

15. **abstract**: classe que nao pode ser instanciada ou método que precisa ser implementado por uma subclasse não abstrata.

16. **class**: especifica uma classe.

17. **extends**: indica a superclasses que a subclasse está entendendo.

18. **final**: impossibilita que uma classes seja extendida, que um método seja sobreescrito, ou que uma variável seja reinicializada.

19. **implements**: indica as interfaces que uma classe irá implementar.

20. **interface**: especifica uma interface.

21. **<span style="color=red">native</span>**: indica que o método está escrito em uma linguagem dependente de plataforma, como a linguagem C, por exemplo.

22. **new**: instancia um novo objeto, chamando seu construtor.

23. **static**: faz um método ou variável pertencer à classe ao invés dás instâncias.

24. **<span style="color=red">strictfp</span>**: usado em frente a um método ou classe para indicar que os números de ponto flutuante seguirão as regras de ponto flutuante em todas as expressões.

25. **synchronized**: indica que um método só pode ser acessado por uma thread de cada vez.

26. **transient**: impede a serialização de campos.

27. **<span style="color=red">volatile</span>**: indica que uma variável pode ser alterada durante o uso de threads.

### Controle de fluxo dentro de um bloco de código 

28. **break**: sai do bloco de código em que ele está.

29. **case**: executa um bloco de código dependendo do teste do switch.

30. **continue**: pula a execução do código que viria após essa linha e vai para a próxima passagem do loop.

31. **default**: executa esse bloco de código caso nenhum dos testes de switch- case seja verdadeiro.

32. **do**: executa um bloco de código uma vez, e então realiza um teste em conjunto com o **while** para determinar se o bloco deverá ser executado novamente.

33. **else**: executa um bloco de código alternativo caso o teste "**if**" seja falso.

34. **for**: usado para realizar um loop condicional de um bloco de código.

35. **if**: usado para realizar um teste lógico de verdadeiro ou falso.

36. **instanceof**: determina se um objeto é uma instância de determinada classe, superclasse ou interface.

37. **return**: retorna um método sem executar qualquer código, que venha depois desta linha (também pode retornar uma variável).

38. **switch**: indica a variável a ser comparada nas expressões case.

39. **while**: executa um bloco de código repetidamente enquanto a condição for verdadeira.

### Tratamento de erros

40. **<span style="color=red">assert</span>**: testa uma expressão condicional, para verificar uma suposição do programador.

41. **catch**: declara o bloco de código usado para tratar uma exceção.

42. **finally**: bloco de códigos, Após um try-catch, que é executado independente do fluxo de programa seguido ao lidar com uma exceção.

43. **throw**: usado para passar uma exceção para o método que o chamou.

44. **throws**: indica que um método pode passar uma exceção para o método que o chamou.

45. **try**: bloco de código que tentará ser executado, mas que pode causar uma exceção.

## Variáveis de referência 

46. **super**: refere-se a superclasse imediata.

47. **this**: refere-se a instância atual do objeto.

### Palavras reservadas não utilizadas

48. **const**: Não utilize para declarar constantes, use public static final.

49. **goto**: não implementada na linguagem Java, por ser considerada prejudicial.

### Literais reservados 

50. **null**

51. **true**

52. **false**

De acordo com o Java Language Specification, **null**, **true** e **false** são tecnicamente chamados de valores literias, e não keywords. Se você tentar criar algum identificador com estes valores, você também terá um erro de compilação.
