# ReadMe

## Desafio Final NExT 

## Descrição
Criação de um micro serviço (API-only) para prover dados de projetos

Considerando a migração de um sistema monolito, que permite o acompanhamento detalhado de projetos sendo executados na linha de inovação do cliente, para uma arquitetura de microserviço, extrair (criar) o [micro]serviço que gerencia a criação e manutenção de novos projetos para que possa ser a fonte da verdade em relação a essa informação dentro da instituição e permita prover uma API que será utilizada por outros sistemas dentro do ecossistema digital da empresa.


## Recursos Utilizdos

* JAVA JDK 8
  * Instalar JAVA JDK 8
    * [Website](https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html)
* Apache Maven 3.8.3
  * Instalar Apache Maven
    * [Website](https://maven.apache.org/download.cgi)
* Springboot
  * Dependencias: 
    * Spring Boot Starter Web
    * Spring Boot Starter Test
* IntelliJ IDE (Opcional)

## Inicializando o Projeto

* Importar Projeto
  * Importar o arquivo pom.xml como projeto para a IDE
    * Verificar problema no arquivo pom.xml referente ao maven plugin

* Run main class (DesavioNextCesarApplication)
  * Verificar se houve falha na execução do Spring
  * Executar http://localhost:8080 no navegador
    * Deve retornar tela Whitelabel Error Page na tela
      * Caso retorne este erro, executar próximo passo, caso contrário, repetir passos anteriores

* Inserir http://localhost:8080/greeting no navegador
  * Deve retornar {"id":1,"content":"Hello, World!"} na tela


FIM







