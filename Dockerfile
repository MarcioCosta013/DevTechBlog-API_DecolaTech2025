FROM maven:3.9.6-eclipse-temurin-21 AS build
LABEL authors="Marcio Costa"

WORKDIR /app

COPY . .

# Compila o projeto e empacota em um JAR
RUN mvn clean package -DskipTests

# Etapa final: roda o app
FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copia o JAR gerado na etapa de build
COPY --from=build /app/target/*.jar app.jar

# Expõe a porta (ajuste conforme seu app)
EXPOSE 8080

# Comando para iniciar a aplicação
ENTRYPOINT ["java", "-Dspring.profiles.active=default", "-Dfile.encoding=UTF-8", "-jar", "app.jar"]
