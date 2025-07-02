# 💻 Produtos API - Spring Boot CRUD

API RESTful simples para gerenciamento de produtos, desenvolvida com Spring Boot e banco de dados em memória H2.

## 🎯 Funcionalidades

- Criar, consultar, atualizar e deletar produtos (CRUD)
- Busca de produtos por nome
- Identificador único gerado automaticamente (UUID)

## 🚀 Tecnologias Utilizadas

- Java 21
- Spring Boot 3.2.4
- Spring Data JPA
- Banco de dados H2 (em memória)
- Maven
- Lombok

 ## 🛠️ Como rodar o projeto

1. Clone este repositório:

```bash
git clone https://github.com/seu_usuario/seu_repositorio.git
cd seu_repositorio
```
2. Compile e rode com Maven:
```bash
./mvnw spring-boot:run
```

3. Acesse a API em:
```bash
http://localhost:8080/produtos
```

4. Acesse o console do banco H2 em:
```bash
http://localhost:8080/h2-console
```

5. Use o JDBC URL: jdbc:h2:mem:produtos
Usuário: sa
Senha: password
