FROM gradle:8.11.1-jdk-21-and-23
LABEL authors="Marcio Costa"

RUN apt-get update && apt-get install -qq -y --no-install-recommends

ENV INSTALL_PATH /dev-tech-blog

RUN mkdir $INSTALL_PATH

WORKDIR $INSTALL_PATH

COPY . .