# Tipos e variáveis - 3
Instrutor: Gleydson Sampaio

Todo o conteúdo do curso pode ser acessado em:

https://glysns.gitbook.io/java-basico/

## Tipos de dados

No Java, existem algumas palavras reservadas para a representação dos tipos de dados básicos que precisam ser manipulados para a construção de programas. Estes tipos de dados são conhecidos como tipos primitivos (Primitive Types).

Os oitos tipos primitivos em Java são: 

int, byte, short, long, float, double, boolean, char - esses tipos não são considerados objetos e, portanto representam valores brutos. Eles sao armazenados direto na pilha de memória (memory stack).

## Tabela de tipos primitivos e seus valores: 

Tipo | Memória | Valores mínimos | Valores Máximo  
----------------------------
byte | 1 byte | -128 | 127 
short | 2 bytes | -32.768 | 32.767 
int | 4 bytes | -2.147.483.648 | 2.147.483.647 
long|  8 bytes | -9.223.372.036.854.775.808 | 9.223.372.036.854.775.808 

Os tipos primitivos que podem conter partes fracionárias podem ser representados por dois tipos:
float | 4 bytes | -3,4028E + 38 | 3,4028E + 38 
double | 8 bytes | -1,7976E + 308 | 1,7976E + 308

Em relação aos dois tipos de pontos flutuantes apresentados, o tipo **double** são mais utilizados, pela garantia da precisado mesmo.

Apesar de o tipo **float** ocupar metade da memória consumida do que o tipo double, ele é menos utilizado. Ele sofre de uma limitação que compromete seu uso em determinadas situações: somente mantém uma precisão decimal entre 6 e 7 dígitos.

atualmente, com os computadores modernos, se tornou desnecessário utilizar os tipos **short** e **byte**, pois não precisamos nos preocupar tanto assim com o espaço de memória reduzido.

Da mesma forma, dificilmente utilizaremos o tipo **long**, pois não é tão comum trabalharmos com valores tão grandes.

Portanto, para representar números, na grande maioria das vezes utilizamos o tipo **int** para representar números inteiros ou **double** para representar números fracionados.

O ponto mais relevante em compreender a definição dos tipos de dados é o momento da definição do tipo para uma variável. **Qual tipo de dados eu utilizaria para determinar a idade de uma pessoa ou salário de um funcionário?**

para a **idade** uma variável do tipo **short** daria conta e dependendo do escopo da idade até uma variável do tipo **byte** atenderia, mas é comum usarem variáveis do tipo **int**.

Para uma variável representar um salário definir ela do tipo **float** ja serviria porém é comum usarem variáveis do tipo **double** para valores com casas decimais

## Declaração de Variável 

Variável é uma identificação de um espaço em memória utilizado pelo nosso programa. Seguindo as convenções em linguagem de programação, toda variável é composta por: tipo de dados + identificação + Valor atribuído.

A estrutura padrão para se declarar uma variável sempre é:
