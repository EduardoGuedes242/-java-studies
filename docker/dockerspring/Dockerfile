# Use a imagem do JDK 17 como base
FROM openjdk:17-jdk-alpine

# Defina o diretório de trabalho no container
WORKDIR /app

# Copie o arquivo jar gerado pela sua aplicação
COPY target/dockerspring-0.0.1-SNAPSHOT.jar /app/aplicacao.jar

# Exponha a porta que a aplicação vai utilizar
EXPOSE 8080

# Defina o comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "/app/aplicacao.jar"]

