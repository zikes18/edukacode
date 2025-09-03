# 🚀 API RESTful para Cadastro de Leads - Semana Nacional de Ciência e Tecnologia

Bem-vindo ao repositório da **API de Cadastro de Leads**, desenvolvida para gerenciar inscrições na **Semana Nacional de Ciência e Tecnologia**! Este projeto foi criado com foco em padrões **RESTful**, implementando boas práticas de desenvolvimento, testes e modelagem de sistemas, sob a orientação do professor **Rômulo C. Silvestre** nas disciplinas de **Teste de Software**, **Implementação de Sistemas** e **Modelagem de Sistemas** no **SENAI**.

Esta API foi construída com tecnologias modernas e robustas, garantindo escalabilidade, manutenibilidade e conformidade com os princípios REST. Abaixo, você encontrará detalhes sobre o projeto, como executá-lo e as tecnologias utilizadas.

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Descrição | Ícone |
|------------|-----------|-------|
| **Java**   | Linguagem principal para lógica de negócios | <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" width="20" height="20"/> |
| **Spring Boot** | Framework para construção da API REST | <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original.svg" width="20" height="20"/> |
| **JPA**    | Especificação para mapeamento objeto-relacional | <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" width="20" height="20"/> |
| **Hibernate** | Implementação do JPA para persistência de dados | <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/hibernate/hibernate-original.svg" width="20" height="20"/> |
| **MySQL**  | Banco de dados relacional | <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/mysql/mysql-original.svg" width="20" height="20"/> |
| **Flyway** | Gerenciamento de migrações de banco de dados | <img src="https://flywaydb.org/assets/logo/flyway-logo.png" width="20" height="20"/> |

---

## 📋 Sobre o Projeto

Esta API foi projetada para atender o **cadastro de leads** para a **Semana Nacional de Ciência e Tecnologia**, permitindo operações **CRUD** (Create, Read, Update, Delete) de forma eficiente e segura. O projeto segue os princípios **RESTful**, com endpoints claros, respostas padronizadas e documentação acessível. A API foi desenvolvida com:

- **Modelagem de Sistemas**: Entidades bem definidas, como `Lead`, mapeadas com JPA/Hibernate.
- **Implementação de Sistemas**: Código modular e organizado, utilizando o padrão MVC do Spring Boot.
- **Testes de Software**: Testes unitários e de integração para garantir robustez e confiabilidade.

O projeto é um reflexo do aprendizado prático no **SENAI**, com foco em soluções reais para desafios do mercado.

---

## 📦 Pré-requisitos

Antes de executar a API, certifique-se de ter as seguintes ferramentas instaladas:

- ☕ **Java 17+** (JDK)
- 🐬 **MySQL** (versão 8.0+)
- 🛠️ **Maven** (para gerenciamento de dependências)
- 📝 Um editor de código como **IntelliJ IDEA** ou **VS Code**
- 🌐 Opcional: **Postman** ou **Insomnia** para testar os endpoints

---

## ⚙️ Como Baixar e Executar a API

Siga os passos abaixo para clonar, configurar e executar o projeto localmente:

### 1. Clone o Repositório
```bash
git clone https://github.com/zikes18/edukacode.git
cd edukacode
```

### 2. Configure o Banco de Dados
- Crie um banco de dados MySQL chamado `snct`:
  ```sql
  CREATE DATABASE snct;
  ```
- Atualize as configurações do banco no arquivo `src/main/resources/application.properties`:
  ```properties
  spring.datasource.url=jdbc:mysql://localhost:3306/snct?useSSL=false&serverTimezone=UTC
  spring.datasource.username=seu_usuario
  spring.datasource.password=sua_senha
  spring.jpa.hibernate.ddl-auto=none
  spring.flyway.enabled=true
  ```

### 3. Execute as Migrações do Flyway
O Flyway gerencia as migrações do banco de dados automaticamente ao iniciar a aplicação. A tabela `tblead` será criada automaticamente no banco `snct` com base nos scripts de migração localizados em `src/main/resources/db/migration`.

### 4. Compile e Execute a Aplicação
Use o Maven para compilar e executar o projeto diretamente no **VS Code** ou via terminal:
```bash
mvn clean install
mvn spring-boot:run
```
A API estará disponível em `http://localhost:8080`.

### 5. Teste os Endpoints
Use ferramentas como **Postman** ou **Insomnia** para testar os endpoints. Os endpoints estão disponíveis no caminho `/lead`. Exemplos de endpoints:
- **GET** `/lead`: Lista todos os leads.
- **POST** `/lead`: Cria um novo lead (envie um JSON no corpo da requisição).
- **PUT** `/lead/{id}`: Atualiza um lead existente.
- **DELETE** `/lead/{id}`: Remove um lead.

Exemplo de corpo para o POST:
```json
{
  "nome": "João Silva",
  "email": "joao.silva@email.com",
  "telefone": "(11) 99999-9999",
  "cpf": "123.456.789-00"
}
```

---

## 🧪 Testes

O projeto inclui:
- **Testes Unitários**: Para validar a lógica de negócios.
- **Testes de Integração**: Para garantir a comunicação entre camadas (controladores, serviços e repositórios).
Execute os testes com:
```bash
mvn test
```

---

## 🌟 Por que este Projeto é Especial?

Este projeto demonstra minha capacidade de:
- Desenvolver APIs **RESTful** com **Spring Boot** e boas práticas.
- Modelar sistemas com **JPA/Hibernate** e gerenciar banco de dados com **Flyway**.
- Aplicar testes automatizados para garantir qualidade.
- Trabalhar em equipe, sob orientação de especialistas, para resolver desafios reais.

Estou entusiasmado para contribuir com soluções robustas e escaláveis em projetos futuros! 🚀

---

## 📬 Contato

Se você gostou do projeto ou quer conversar sobre oportunidades, entre em contato comigo:

- 📧 **Email**: seu.email@example.com
- 💼 **LinkedIn**: [Seu LinkedIn](#)
- 🐙 **GitHub**: [zikes18](https://github.com/zikes18)

---

**Desenvolvido com 💻 e ☕ por Josias Alves para o desafio do SENAI.**