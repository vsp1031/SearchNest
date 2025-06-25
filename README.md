# 🔍 SearchNest – Spring Boot + Elasticsearch Product Search App

SearchNest is a Spring Boot application integrated with Elasticsearch to provide lightning-fast product search and management. It supports full CRUD operations along with full-text search capabilities—ideal for inventory or e-commerce platforms.

---

## 🚀 Features

- ✅ Add, update, delete, and retrieve products
- 🔍 Fast full-text search using Elasticsearch
- 🧩 Clean layered architecture: Controller, Service, Repository
- 🌐 RESTful API with JSON communication
- ⚙️ Elasticsearch configured using Spring Data in Spring Boot 3.x
- 📦 Maven project structure

---

## 🧱 Tech Stack

| Layer       | Technology          |
|-------------|---------------------|
| Backend     | Java 17, Spring Boot 3.x |
| Search DB   | Elasticsearch 8.x   |
| REST API    | Spring Web, JSON    |
| Build Tool  | Maven               |
| Tools       | Postman, IntelliJ   |

---

## 📂 Project Structure

src/
└── main/
├── java/com/example/searchnest/
│ ├── controller/ # REST controllers
│ ├── service/ # Business logic
│ ├── repo/ # Elasticsearch repositories
│ ├── model/ # Product entity
│ └── config/ # Elasticsearch config
└── resources/
└── application.properties



---

## ⚙️ Setup Instructions

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/searchnest.git
   cd searchnest

spring.elasticsearch.uris=http://localhost:9200

##SAMPLE PRODUCT JSON
{
  "id": 101,
  "name": "Samsung Galaxy S24",
  "price": 79999
}

| Method | Endpoint       | Description       |
| ------ | -------------- | ----------------- |
| GET    | /products      | Get all products  |
| GET    | /products/{id} | Get product by ID |
| POST   | /products      | Add new product   |
| PUT    | /products/{id} | Update product    |
| DELETE | /products/{id} | Delete product    |


---

📌 **To use this:**
1. Create a file named `README.md` in the root of your project.
2. Paste the above code into it.
3. Commit and push to GitHub.

Let me know if you'd like Swagger setup or CI badges added (e.g. GitHub Actions).

