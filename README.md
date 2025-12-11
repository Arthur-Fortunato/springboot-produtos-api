## 📜 Spring Boot Produtos API

Uma API RESTful simples e completa, desenvolvida para o **Gerenciamento de Produtos**. O projeto é focado em operações CRUD (Create, Read, Update, Delete) e faz a integração entre Spring Boot e MySQL.

---

### 🚀 Tecnologias Utilizadas

O projeto foi construído usando tecnologias modernas e amplamente utilizadas:

| Categoria | Tecnologia | Versão Principal |
| :--- | :--- | :--- |
| **Linguagem** | Java | 17+ (recomendada) |
| **Framework** | Spring Boot | Última Estável |
| **Web** | Spring Web | Integrado |
| **Persistência** | Spring Data JPA | Integrado |
| **Banco de Dados** | MySQL | Dialeto MySQL 8 |
| **Build Tool** | Maven | Integrado |

---

### 📦 Funcionalidades e Endpoints

A API expõe um conjunto de endpoints RESTful que permitem a manipulação completa da entidade `Produto`.

| Método HTTP | Endpoint | Descrição |
| :--- | :--- | :--- |
| **`POST`** | `/produtos` | **Cria** um novo produto no banco de dados. |
| **`GET`** | `/produtos` | **Lista** todos os produtos cadastrados. |
| **`GET`** | `/produtos/{id}` | **Busca** e retorna um produto específico pelo seu ID. |
| **`PUT`** | `/produtos/{id}` | **Atualiza** completamente um produto existente (baseado no ID). |
| **`DELETE`** | `/produtos/{id}` | **Remove** um produto específico pelo seu ID. |

---

### 🛠️ Como Executar o Projeto

Siga os passos abaixo para configurar e rodar a API no seu ambiente local.

#### 1. Configuração do Banco de Dados

1.  Certifique-se de ter o **MySQL** instalado e em execução.
2.  Crie um novo *schema* (banco de dados) com o nome: `produtos`.
    > ⚠️ Se você deseja utilizar um nome de banco diferente, certifique-se de ajustar a propriedade `spring.datasource.url` no arquivo `application.properties`.

#### 2. Configuração do Projeto

1.  Ajuste as credenciais de acesso ao seu MySQL no arquivo de configuração principal:
    `src/main/resources/application.properties`

- **Agora é só rodar o código.**

### A API ficará disponível em:
- 👉 http://localhost:8080/produtos
