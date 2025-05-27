# Lista de games DSlist

### Projeto criado na imersão Java com Spring do professor
Nélio Alves.

## Objetivo:
Criar uma aplicação WEB baseado em arquitetura de camadas
(layered architecture), utilizando o banco de dados H2 para
criar um ambiente de teste e PostgreSQL em Docker para simular
um ambiente de produção.

### Ferramentas utilizadas:
* Java
* Spring com Spring Initializr
  * Spring Web
  * Spring Data JPA
  * H2 Database
  * PostgreSQL Driver
* PostgreSQL
* Docker
* Postman

## Arquitetura em camadas:

![arquitetura camadas](img/camadas.webp)

Em um padrão de arquitetura em camadas, nós organizamos
a aplicação em camadas separadas, onde cada camada tem
uma responsabilidade específica e se comunica apenas com
a camada diretamente abaixo ou acima dela.

**A aplicação foi implementada utilizando um conceito de organização em Modules e Packages**

### Esse projeto foi dividido em três camadas:
* Repository
  * Responsável pela persistência de dados (acesso ao banco), trabalha diretamente com as Entities que são ORM's.
* Service
  * Responsável pela regra do negócio, recebe Entities do Repository, trabalha com elas, transforma em DTO's e envia para o Controller.
* Controller
  * Responsável pela entrada e saída de dados da aplicação (via API REST), trabalha exclusivamente com DTO's.

### Estrutura das pastas em camadas:

![arquitetura camadas](img/estruturaPastas.png)

### Modelo de domínio:

![arquitetura camadas](img/dslist-model.png)

### Ambiente de teste H2 Database

![arquitetura camadas](img/h2Teste.png)

### Endpoint GET Games
Endpoint utilizado para puxar todos os games, porém
com informações de somente 5 de 9 campos

![arquitetura camadas](img/getGames.png)

### Endpoint GET GamesByID
Endpoint utilizado para puxar um game específico com
todas as suas informações pelo seu ID

![arquitetura camadas](img/gamesById.png)

### Endpoint GET GamesList
Endpoint utilizado para puxar todas as listas de gêneros
de games

![arquitetura camadas](img/gamesList.png)

### Endpoint GET GamesByList
Endpoint utilizado para puxar os games por lista de gênero

![arquitetura camadas](img/gamesByList.png)

### Requisição para mudar o posição de um game na lista
Foi desenvolvido na aplicação um método para alterar a 
posição de um game dentro da lista

#### consulta SQL para visualizar as posições de um game na lista
![arquitetura camadas](img/orgParaTestPosition.png)
para alterar a posição temos um
método HTTP de POST com dados de origem da posição e
destino da posição

![arquitetura camadas](img/requisicaoParaTrocarPosicao.png)

Assim, alterando a posição do game "Cuphead" na posição
3 para a posição 1

![arquitetura camadas](img/positionChanged.png)

## Ambiente simulado de produção
Para simular um ambiente de produção foi criado um container
no Docker para carregar um banco de dados do PostgreSQL que 
realiza a mesma função do nosso banco de testes H2

![arquitetura camadas](img/postgresTeste.png)

Podemos realizar a mesma requisição para alterar a
posição de algum game na lista

![arquitetura camadas](img/postgresChanged.png)

Através do banco de dados do PostegreSQL inserimos
mais uma lista em nosso banco de dados "ID: 3, name: Esportes" , podemos ver se
de fato foi inserida corretamente através do Postman

![arquitetura camadas](img/newListPostgres.png)

