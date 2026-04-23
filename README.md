# 📦 Checkpoint 2 - API REST com Spring Boot (CRUD de Pedidos)

## 📚 Disciplina

Arquitetura Orientada a Serviços e Web Services

## 👨‍🏫 Professor

Carlos Eduardo Machado de Oliveira

---

## 🎯 Objetivo

Este projeto tem como objetivo desenvolver uma **API REST utilizando Spring Boot**, aplicando conceitos de **SOA (Service-Oriented Architecture)** e implementando um **CRUD completo** para gerenciamento de pedidos de clientes.

---

## 🚀 Tecnologias Utilizadas

* Java 21
* Spring Boot
* Spring Web
* Spring Data JPA
* Lombok
* Validation (Bean Validation)
* Banco de dados:

  * H2 Database *(ambiente de desenvolvimento)*
  * MySQL *(opcional)*
* Maven
* Flyway (migração de banco - opcional)

---

## 🏗️ Estrutura do Projeto

O projeto segue uma arquitetura em camadas:

```
src/main/java/br/com/fiap/.../checkpoint2
│
├── controller   → Responsável pelos endpoints da API
├── model        → Entidades do sistema
├── repository   → Interfaces de acesso ao banco (JPA)
├── service      → Regras de negócio
```

---

## 📌 Funcionalidades

A API permite:

* ✅ Criar um pedido
* 📄 Listar todos os pedidos
* 🔍 Buscar pedido por ID
* ✏️ Atualizar um pedido
* ❌ Deletar um pedido

---

## 🧾 Modelo de Dados

### 📦 Order (Pedido)

| Campo      | Tipo       | Descrição               |
| ---------- | ---------- | ----------------------- |
| id         | Long       | Identificador do pedido |
| clientName | String     | Nome do cliente         |
| orderDate  | LocalDate  | Data do pedido          |
| totalValue | BigDecimal | Valor total do pedido   |

📌 Regra importante:

* Caso a data (`orderDate`) não seja informada, ela será automaticamente preenchida com a data atual.

---

## 🔗 Endpoints da API

### 📍 Base URL

```
http://localhost:8080/orders
```

| Método | Endpoint     | Descrição              |
| ------ | ------------ | ---------------------- |
| GET    | /orders      | Lista todos os pedidos |
| GET    | /orders/{id} | Busca pedido por ID    |
| POST   | /orders      | Cria um novo pedido    |
| PUT    | /orders/{id} | Atualiza um pedido     |
| DELETE | /orders/{id} | Remove um pedido       |

---

## ▶️ Como Executar o Projeto

### 🔧 Pré-requisitos

* Java 17 ou superior
* Maven instalado
* IDE (IntelliJ, Eclipse, VS Code)

### ▶️ Passos

```bash
# Clonar o repositório
git clone https://github.com/seu-usuario/seu-repositorio.git

# Entrar na pasta do projeto
cd checkpoint2

# Rodar o projeto
mvn spring-boot:run
```

---

## 🧪 Testando a API

Você pode testar usando:

* Postman
* Insomnia
* cURL
* Navegador (para requisições GET)

---

## 📝 Observações

* O projeto pode utilizar banco **H2 (em memória)** para testes rápidos
* O roteiro fornecido pelo professor é **opcional**, sendo possível seguir apenas o conteúdo visto em aula
* Apenas um integrante precisa realizar a entrega no Teams

---

## 👥 Integrantes do Grupo

* **Maria Alice Freitas Araújo** – RM557516
* **Pedro Henrique Mendes dos Santos** – RM555332
* **João Victor Soave** – RM557595
* **Vinícius Fernandes Tavares Bittencourt** – RM558909
* **Rafael Teofilo Lucena** – RM555600
