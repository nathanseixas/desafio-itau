# desafio-itau

Este desafio do banco do Itau é de 4 meses atras, resolvi ele para por em pratica meus conhecimentos em Java.

Vou deixar qui o README do desafio:


1. Introdução
Sua missão, caso você aceite, é criar uma API REST que recebe Transações e retorna Estatísticas sob essas transações. Para este desafio,
a API deve ser criada utilizando-se de Java ou Kotlin e Spring Boot.

Um bom lugar para se começar é o Spring Starter.

Dica: Não existe uma forma certa ou errada de resolver o desafio! Vamos avaliar coisas como a qualidade do seu código,
o quão fácil é de compreender o código, organização do projeto, quantidade e qualidade dos testes, preocupação com segurança e vários outros fatores :)

2. Definição do desafio
Neste desafio você deve criar uma API REST no GitHub ou GitLab. Leia com atenção todas as instruções a seguir!

2.1. Restrições Técnicas
Seu projeto:

DEVE estar no GitHub ou GitLab
NÃO DEVE fazer fork de nenhum outro projeto
DEVE ter pelo menos 1 commit por cada endpoint (mínimo de 3 commits)
Queremos ver a evolução do seu projeto com o tempo ;)
Todos os commits DEVEM ser feitos pelo mesmo usuário que criou o projeto
Entendemos que algumas pessoas tem usuários pessoais e profissionais, ou um usuário diferente usado para estudar. Atenção com isso se você for uma dessas pessoas!
DEVE seguir exatamente os endpoints descritos a seguir
Por exemplo, /transacao não é a mesma coisa que /transacoes
DEVE aceitar e responder com objetos exatamente como descritos a seguir
Por exemplo, dataHora não é a mesma coisa que data-hora ou dtTransacao
NÃO DEVE utilizar quaisquer sistemas de banco de dados (como H2, MySQL, PostgreSQL, ...) ou cache (como Redis, Memcached, Infinispan, ...)
DEVE armazenar todos os dados em memória
DEVE aceitar e responder apenas com JSON
Atenção! Por motivos de segurança, não podemos aceitar projetos enviados como arquivos. Você DEVE disponibilizar seu projeto publicamente para que possamos acessá-lo e corrigi-lo! Após receber uma resposta de nós, sinta-se livre para tornar seu projeto privado :)

2.2. Endpoints da API
A seguir serão especificados os endpoints que devem estar presentes na sua API e a funcionalidade esperada de cada um deles.

2.2.1. Receber Transações: POST /transacao
Este é o endpoint que irá receber as Transações. Cada transação consiste de um valor e uma dataHora de quando ela aconteceu:

{
    "valor": 123.45,
    "dataHora": "2020-08-07T12:34:56.789-03:00"
}
