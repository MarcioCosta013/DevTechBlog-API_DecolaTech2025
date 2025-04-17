[JAVA_BADGE]:https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white

[SPRING_BADGE]: https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white

<h1 align="center"> Projeto API DevTech Blog </h1>

![java][JAVA_BADGE]
![spring][SPRING_BADGE]

[Repositorio do Frontend](https://github.com/MarcioCosta013/DevTechBlog-UI_DecolaTech2025)
<p align="center">
  <b>Backend do site de pedidos...</b>
</p>

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

