# Break e Continue
Instrutor: Gleydson Sampaio

Todo o conteúdo do curso pode ser acessado em:

https://glysns.gitbook.io/java-basico/

## Break e Continue 

**Break** significa quebrar, para, frear, interromper. E é isso que se faz quando o Java encontra esse comando pela frente. **Continue**, como o nome diz, ele 'continua' o laço. O comando **break** interrompe o laço, já o **continue** interrompe somente a iteração atual.

```java

//class ExemploBreakContinue.java
public class ExemploBreakContinue {
    public static void main(String[] args){

        for (int numero = 1; numero <= 5; numero++){
            if(numero == 3){
                break;

                System.out.println(numero);
            }
        }
    }
}

``` 

No caso do break o código a partir da condição que o break é considerado encerra.

No caso do continue o código que atende a condição não é executado e a interação volta após esse código desconsiderado.

fim da aula.
