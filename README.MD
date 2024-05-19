# Sistema de Coleta de Leads

<p align="left">
  <img alt="RabittMQ" src="https://img.shields.io/badge/rabbitmq-%23FF6600.svg?&style=for-the-badge&logo=rabbitmq&logoColor=white" />
  <img alt="Spring Boot" src="https://img.shields.io/badge/Spring_Boot-brightgreen?logo=spring&style=flat-square" />
  <img alt="Postgresql" src="https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white" />
</p>

Este projeto consiste em dois microserviços, um de gestão de usuario e notificação
## Pré-requisitos

Antes de iniciar, certifique-se de ter as seguintes ferramentas instaladas em seu ambiente de desenvolvimento:

- Maven 3.9.5
- Java 17
- Docker

## Iniciando...

- `git clone https://github.com/kyriosdata/exemplo`
- `cd exemplo`

Agora você poderá executar os vários comandos abaixo.

## Configuração do Ambiente

1. Como primeiro passo é necessario deixar iniciado o Json server e o MySQL iniciados
2. Adicione ao seu servidor de banco de dados MySQL um banco chamado leads_db

### Configurando o Ambiente do Mock

Certifique-se de ter o arquivo `db.json` configurado com os dados desejados para simular o ambiente do servidor JSON (Json Server).

### Configurando o Ambiente Backend (Spring Boot)

1. Abra o projeto `LeedsDeClientesLojasTal-backend` em sua IDE preferida.
2. Certifique-se de que o Java 17 está configurado como JDK padrão.
3. Execute a aplicação Spring Boot para iniciar o servidor backend.

4. Para o build
```bash
./mvnw clean install
```

5. Para execução
```bash
./mvnw spring-boot:run
```

### Configurando o Ambiente Frontend (Angular)

1. Abra o projeto `LeedsDeClientesLojasTal-frontend` em um terminal.
2. Execute o seguinte comando para instalar as dependências do Angular:

```bash
npm install
```

3. Após a instalação, execute o seguinte comando para iniciar o servidor de desenvolvimento do Angular:

```bash
ng serve
```

## Iniciando o Fluxo da Aplicação

Com todos os ambientes configurados e os servidores em execução, você pode acessar a aplicação web em `http://localhost:4200`. Certifique-se de que o servidor backend está em execução para processar as solicitações da aplicação frontend.

A partir deste ponto, você pode interagir com a aplicação para coletar leads e visualizar as informações armazenadas no servidor JSON.

Lembre-se de ajustar as configurações conforme necessário, especialmente se estiver usando diferentes versões das ferramentas mencionadas.

## Observações

- É importante ressaltar que a aplicação contemplou os requisitos solicitados de maneira literal.

- Foi utilizdo também como ferramenta visual, a biblicoteca de componentes POI-UI