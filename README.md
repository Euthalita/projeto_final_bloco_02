# Farmácia - Spring Boot
Este projeto é uma aplicação de uma loja farmacêutica utilizando Java, Spring Boot e um modelo de arquitetura em camadas (Controller, Model, Repository). A aplicação permite gerenciar Produtos e Categorias de medicamentos.

---
## Funcionalidades

* Cadastro de Produtos: Cadastro de medicamentos com informações como nome, preço, descrição e categoria.
* Cadastro de Categorias: Cadastro de diferentes categorias de medicamentos (ex: Analgésicos, Antiinflamatórios, etc).
* Listagem de Produtos: Exibição de todos os produtos cadastrados.
* Listagem de Categorias: Exibição de todas as categorias de medicamentos cadastrados.
* CRUD completo para Produtos e Categorias: Operações de criar, ler, atualizar e deletar produtos e categorias.
---
### Tecnologias Utilizadas
* Java 17
* Spring Boot (com Spring Web, Spring Data JPA, Validation, Spring Boot DevTools e MySQL Driver)
* Banco de Dados: MySQL
* Maven
---
### Estrutura do Projeto
O projeto está dividido nas seguintes camadas:

* Controller: Responsável pela interação com o usuário (API REST).
* Model: Define as entidades e objetos do sistema.
* Repository: Interage com o banco de dados para persistir e recuperar dados
