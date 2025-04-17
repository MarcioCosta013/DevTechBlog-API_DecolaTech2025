[JAVA_BADGE]:https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white

[SPRING_BADGE]: https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white

<h1 id="portugues" align="center"> Projeto API DevTech Blog </h1>

<p>
  <img alt="Version" src="https://img.shields.io/badge/version-0.0.0-blue.svg?cacheSeconds=2592000" />

</p>

![java][JAVA_BADGE]
![spring][SPRING_BADGE]

[Repositorio do Frontend](https://github.com/MarcioCosta013/DevTechBlog-UI_DecolaTech2025)

**English version**: [Click here](#ingles).

  >Backend do site do Blog DEVTECH...


<h3> ✨ Funcionalidades </h3>

- **CRUD de Contribuidor** : Criar, ler, atualizar e excluir Contribuidores
- **CRUD de Sites**: Criar, ler, atualizar e excluir Sites
- **Relacionamento entre Entidades**: Sites vinculados a um Contribuidor que o compartilhou... (Many-to-One)

<h3> 🛠️ Tecnologias </h3>

- **Java 21**
- **Spring Boot 3**
    - Spring Data JPA
    - Spring Validation
- **Flyway** (Migration)
- **Swagger/OpenAPI** (Documentação)
- **Lombok**
- **PostgreSQL** (Banco de dados)
- **Maven** (Gerenciamento de dependências)


<h3> 📂 Estrutura do Projeto </h3>

````
src/
├── main/
│ ├── java/
│ │ └── com/
│ │ ├── devtechblog/
│ │ │ ├── config/ # Configurações (CorsConfig, SwaggerConfig)
│ │ │ ├── controller/ # Controladores (ContribuidorController, SitesController)
│ │ │ ├── dtos/ # Classes Records DTOs (ContribuidorDTO, SitesDTO)
│ │ │ ├── entity/ # Entidades JPA (ContribuidorEntity, SiteEntity)
│ │ │ ├── exception/ #Excesão personalisada (NotFoundException)
│ │ │ ├── repository/ # Repositórios Spring Data (ContribuidorRepository, TemaRepository)
│ │ │ └── service/ # Lógica de negócio (ContribuidorService, SiteService)
│ │ └── 
│ ├── resources/
│ │ ├── db.migration/
│ │ │ ├── V202504051704__create_tecle_contribuidor.sql
│ │ │ └── V202504051714__create_table_sites.sql
│ │ ├── application.yml
│ │ └── application-dev.yml
└── 
````

## Instruções para Executar o Projeto


1. Clone o repositório: `git clone https://github.com/MarcioCosta013/DevTechBlog-API.git`
2. Instale as dependências: `mvn clean install`
3. Execute o projeto: `mvn spring-boot:run`
4. Acesse o Swagger: `http://localhost:8080/swagger-ui.html`

## Documentação da API

- Swagger/OpenAPI: `http://localhost:8080/swagger-ui.html`

## 😎 Autor

 **Marcio Costa**

* Github: [MarcioCosta013](https://github.com/MarcioCosta013)
* LinkedIn: [linkedin.com\/in\/marcio-jcosta\/](https://linkedin.com/in/https:\/\/www.linkedin.com\/in\/marcio-jcosta\/)
* Instagran: [@marcio_costa013](https://www.instagram.com/marcio_costa013/)


## 🤝 Contribuição

Contribuições, problemas e solicitações de recursos são bem-vindos!<br />Fique à vontade para conferir [issues page](https://github.com/MarcioCosta013/DecolaTech2025-angular-blog/issues). 

## 🤩 Mostre seu apoio

Dê uma ⭐️ se este projeto te ajudou!


</br></br></br></br></br></br></br>


[JAVA_BADGE]:https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white

[SPRING_BADGE]: https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white

<h1 id="ingles" align="center"> DevTech Blog API Project </h1>

<p>
  <img alt="Version" src="https://img.shields.io/badge/version-0.0.0-blue.svg?cacheSeconds=2592000" />
</p>

![java][JAVA_BADGE]
![spring][SPRING_BADGE]

[Frontend Repository](https://github.com/MarcioCosta013/DevTechBlog-UI_DecolaTech2025)

**Versão em Portuguese**: [Click aqui](#portugues).

> Backend of the DEVTECH Blog site...

<h3> ✨ Features </h3>

- **Contributor CRUD**: Create, Read, Update, and Delete Contributors
- **Sites CRUD**: Create, Read, Update, and Delete Sites
- **Entity Relationships**: Sites linked to a Contributor who shared them (Many-to-One)

<h3> 🛠️ Technologies </h3>

- **Java 21**
- **Spring Boot 3**
    - Spring Data JPA
    - Spring Validation
- **Flyway** (Database Migration)
- **Swagger/OpenAPI** (Documentation)
- **Lombok**
- **PostgreSQL** (Database)
- **Maven** (Dependency Management)

<h3> 📂 Project Structure </h3>

````
src/
├── main/
│ ├── java/
│ │ └── com/
│ │ ├── devtechblog/
│ │ │ ├── config/ # Configuration files (CorsConfig, SwaggerConfig)
│ │ │ ├── controller/ # Controllers (ContribuidorController, SitesController)
│ │ │ ├── dtos/ # DTO Record Classes (ContributorDTO, SitesDTO)
│ │ │ ├── entity/ # # JPA Entities (ContributorEntity, SiteEntity)
│ │ │ ├── exception/ # Custom Exception (NotFoundException)
│ │ │ ├── repository/ #  Spring Data Repositories (ContribuidorRepository, TemaRepository)
│ │ │ └── service/ # Business Logic (ContribuidorService, SiteService)
│ │ └── 
│ ├── resources/
│ │ ├── db.migration/
│ │ │ ├── V202504051704__create_tecle_contribuidor.sql
│ │ │ └── V202504051714__create_table_sites.sql
│ │ ├── application.yml
│ │ └── application-dev.yml
└── 
````


## Instructions to Run the Project

1. Clone the repository: `git clone https://github.com/MarcioCosta013/DevTechBlog-API.git`
2. Install the dependencies: `mvn clean install`
3. Run the project: `mvn spring-boot:run`
4. Access Swagger: `http://localhost:8080/swagger-ui.html`

## API Documentation

- Swagger/OpenAPI: `http://localhost:8080/swagger-ui.html`

## 😎 Author

**Marcio Costa**

* Github: [MarcioCosta013](https://github.com/MarcioCosta013)
* LinkedIn: [linkedin.com\/in\/marcio-jcosta\/](https://linkedin.com/in/https:\/\/www.linkedin.com\/in\/marcio-jcosta\/)
* Instagram: [@marcio_costa013](https://www.instagram.com/marcio_costa013/)

## 🤝 Contribution

Contributions, issues, and feature requests are welcome!<br />Feel free to check [issues page](https://github.com/MarcioCosta013/DecolaTech2025-angular-blog/issues).

## 🤩 Show Your Support

Give a ⭐️ if this project helped you!


