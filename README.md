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

## Arquitetura em camadas

![arquitetura camadas](img/camadas.webp)

Em um padrão de arquitetura em camadas, nós organizamos
a aplicação em camadas separadas, onde cada camada tem
uma responsabilidade específica e se comunica apenas com
a camada diretamente abaixo ou acima dela.

