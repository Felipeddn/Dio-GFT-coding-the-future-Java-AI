# Anatomia das classes - 5  

Instrutor: Gleydson Sampaio

Todo o conteúdo do curso pode ser acessado em:

https://glysns.gitbook.io/java-basico/

##  Organizando arquivos 

À medida que nosso sistema vai evoluindo, surgem novos arquivos (código fonte) em nossa estrutura de arquivos do projeto. Isso exige que seja realizado uma organização destes arquivos através de pacotes (packages).

Existe uma convenção de subdiretórios, baseado nas finalidades dos nossos projetos.

então as empresas tem seus setores

comercial 
organizacional 
opensource 

Esses setores podem ser reduzidos 
com
org 
open ou opensource 

Supondo que um programador de uma empresa hipotética chamada **HyperTech** faça um projeto **comercial** que produza **notificações** em Java provavelmente ele irá nomear esse projeto da seguinte forma 

com.hypertech.notification

Imagina que cada parte desse projeto tenha diversas finalidades 

a finalidade de iniciar a aplicação, esse programador irá fazer um pacote para isso com o seguinte nome:

com.hypertech.notification.app

um pacote para colocar os modelos

com.hypertech.notification.model

um pacote com os utilitarios

com.hypertech.notification.util

um pacote de serviços com todas as regras de negócios 

com.hypertech.notification.service

Esse exemplo pode se aplicar para qualquer um, veja

supondo que eu fosse criar uma aplicação Java com a finalidade de estudar eu poderia nomear esse diretório e seus subdiretórios da seguinte forma

est.felipe.materia.git

est.felipe.materia.logica

est.felipe.materia.javabasico

Para poder fazer esses níveis no vs code para cada um desses nomes eu preciso criar um diretório

ou seja haverá um diretório chamado est; dentro desse diretório haverá um diretório chamado felipe; dentro da pasta chamada felipe haverá uma pasta chamada materia e dentro dessa pasta chamada materia haverá uma pasta chamada javabasico.

Fim da aula
