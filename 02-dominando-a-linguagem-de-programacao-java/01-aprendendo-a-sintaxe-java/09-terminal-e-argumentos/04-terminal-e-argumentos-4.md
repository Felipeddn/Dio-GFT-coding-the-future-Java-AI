# Terminal e argumentos - 4 
Instrutor: Gleydson Sampaio

Todo o conteúdo do curso pode ser acessado em:

https://glysns.gitbook.io/java-basico/

Iremos selecionar na opção execução e **abrir configuração**, um arquivo launch.json será aberto, esse arquivo determina como desejamos executar uma classe ou um conjunto de classes.

Nessa configuração iremos inserir os parametros fazendo o seguinte:

iremos mudar adicionar na configuração abaixo:

       {
            "type": "java",
            "name": "AboutMe",
            "request": "launch",
            "mainClass": "AboutMe",
            "projectName": "01-aprendendo-a-sintaxe-java_72f39fc9"
        },
 
as seguintes informações:

           "args": [
                "Felipe",
                "Dantas",
                "33",
                "1.71"        
            ],

e vai ficar dessa forma:
 
      {
            "type": "java",
            "name": "AboutMe",
            "request": "launch",
            "mainClass": "AboutMe",
            "args": [
                "Felipe",
                "Dantas",
                "33",
                "1.71"        
            ],
 
            "projectName": "01-aprendendo-a-sintaxe-java_72f39fc9"
        },
 
agora iremos executar no terminal nossa classe sem passar paramêtros pela IDE.

Fim da aula.
