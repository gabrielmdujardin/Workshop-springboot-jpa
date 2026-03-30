## Projeto Web Services com Spring Boot e JPA/Hibernate


Este projeto é uma aplicação de web services REST desenvolvida com Spring Boot e JPA/Hibernate, com foco na construção de uma API organizada em camadas, persistência de dados, operações CRUD, tratamento de exceções e uso de banco de dados para testes. A aplicação também trabalha com um modelo de domínio contendo usuários, pedidos, produtos, categorias, pagamentos e itens de pedido.

Objetivos do projeto

Os principais objetivos deste projeto são:

criar uma aplicação Java com Spring Boot;
implementar o modelo de domínio;
estruturar as camadas lógicas da aplicação;
configurar banco de dados de teste com H2;
popular o banco com dados iniciais;
implementar operações CRUD;
realizar tratamento de exceções.
Tecnologias utilizadas
Java
Spring Boot
Spring Web
Spring Data JPA
Hibernate
H2 Database
PostgreSQL
Maven
Postman
Modelo de domínio

## O projeto foi estruturado com as seguintes entidades principais:

User
Order
Product
Category
Payment
OrderItem
OrderStatus (enum)

Além disso, o modelo contempla relacionamentos importantes, como:

usuário com vários pedidos;
pedido com pagamento;
produto e categoria em associação muitos-para-muitos;
pedido e produto relacionados por OrderItem, que armazena atributos extras, como quantidade e preço.
Arquitetura da aplicação

A aplicação segue uma arquitetura em camadas, organizada da seguinte forma:

Resource Layer → responsável pelos controladores REST;
Service Layer → concentra as regras de negócio;
Data Access Layer → responsável pelos repositórios e acesso a dados;
Entities → representam o modelo de domínio.

Essa organização facilita a manutenção, o entendimento do código e a separação de responsabilidades dentro do projeto.

Funcionalidades implementadas

Entre as funcionalidades abordadas no projeto, estão:

cadastro e busca de usuários;
inserção, atualização e remoção de dados;
persistência com JPA/Hibernate;
população inicial do banco de dados;
cálculo de subtotal e total em pedidos;
tratamento de exceções para recursos não encontrados e erros de integridade.
Perfis e banco de dados

O projeto trabalha com perfis de ambiente diferentes:

test → utilizando banco H2 em memória;
dev → utilizando PostgreSQL local;
prod → configurado para deploy com variáveis de ambiente.
Como executar o projeto
Pré-requisitos
Java
Maven
IDE de sua preferência
Postman para testar os endpoints
Passos básicos
Clone o repositório.
Abra o projeto na sua IDE.
Configure o perfil ativo no arquivo application.properties.
Execute a aplicação.
Teste os endpoints com o Postman.
Caso esteja usando o perfil de teste, acesse o console do H2 em /h2-console.
Console H2

No ambiente de teste, o projeto utiliza o H2 Database com console habilitado, facilitando a visualização das tabelas e dos dados persistidos durante a execução da aplicação.

Estrutura geral do projeto

Uma organização esperada para o projeto é:

entities → entidades do domínio
repositories → interfaces de acesso a dados
services → regras de negócio
resources → controladores REST
config → configuração e seed de dados
resources/exceptions e services/exceptions → tratamento de exceções
Tratamento de exceções

O projeto contempla tratamento de exceções para cenários como:

recurso não encontrado;
erro de banco de dados;
falhas em operações de exclusão e atualização.

Isso torna a API mais robusta e melhora a resposta enviada ao cliente da aplicação.

