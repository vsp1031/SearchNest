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


---

## 🎯 Interview Pitch: SearchNest Project

### ✅ 1. Project Name
**SearchNest** – A product search and management backend using Spring Boot and Elasticsearch.

---

### ✅ 2. Tech Stack Used

- **Language:** Java 17  
- **Framework:** Spring Boot 3  
- **Database:** Elasticsearch 8.x  
- **Libraries:** Spring Data Elasticsearch  
- **Build Tool:** Maven  
- **API Testing:** Postman

---

### ✅ 3. Why I Made This Project

The main goal was to create a fast and scalable product management system that supports **real-time search**. Traditional relational databases struggle with full-text search performance as data grows, so I integrated **Elasticsearch** to overcome this bottleneck — making it suitable for large-scale inventory or e-commerce platforms.

---

### ✅ 4. Project Explanation (Short)

SearchNest is a RESTful backend application for managing product data. It supports:
- Full **CRUD operations**
- **Full-text search** using Elasticsearch
- Clean layered architecture: **Controller**, **Service**, **Repository**, and **Model**
- Manually configured Elasticsearch client to support **Spring Boot 3.x**

The app is optimized for fast keyword-based searches, and uses Elasticsearch indexes to store and retrieve product documents with minimal latency.

---

## 💬 Common Interview Questions (Spring Boot + Elasticsearch)

---

### 🟦 Spring Boot:

**Q1. What is Spring Boot and why did you choose it?**  
Spring Boot is a framework that simplifies Spring application development by providing auto-configuration, embedded servers, and production-ready features.  
I chose it because it eliminates boilerplate code, speeds up development, and integrates well with tools like Elasticsearch.

---

**Q2. Explain the layered architecture in your app.**  
The application follows a 4-layer architecture:
- **Controller:** Handles HTTP requests.
- **Service:** Contains business logic.
- **Repository:** Interfaces with Elasticsearch.
- **Model:** Represents the data structure (e.g., Product).

---

**Q3. How does Spring Boot handle dependency injection?**  
Spring Boot uses annotations like `@Autowired`, `@Component`, `@Service`, and `@Repository` to inject dependencies automatically using its IoC (Inversion of Control) container.

---

**Q4. What is the role of `@Service`, `@Repository`, and `@RestController`?**  
- `@Service` – Marks business logic classes.  
- `@Repository` – Indicates DAO layer and enables exception translation.  
- `@RestController` – Combines `@Controller` and `@ResponseBody` to expose RESTful APIs.

---

**Q5. How do you expose and test REST APIs?**  
APIs are exposed using annotations like `@GetMapping`, `@PostMapping`, etc.  
They are tested using tools like **Postman** or **cURL** with JSON input/output.

---

### 🟧 Elasticsearch:

**Q6. Why did you use Elasticsearch instead of a relational DB?**  
Elasticsearch is optimized for full-text search and real-time querying, making it ideal for fast product searches, unlike relational databases which are slower for text-based queries.

---

**Q7. What is an index, document, and field in Elasticsearch?**  
- **Index** – Like a database storing documents.  
- **Document** – A JSON record (like a row).  
- **Field** – Key-value pairs inside a document (like a column).

---

**Q8. What does `@Document(indexName = "...")` do in your model?**  
It maps a Java class to an Elasticsearch index.  
Example: `@Document(indexName = "products")` binds the `Product` class to the `products` index.

---

**Q9. How do you manually configure Elasticsearch in Spring Boot 3?**  
By extending `ElasticsearchConfiguration` and overriding `clientConfiguration()` to connect manually to Elasticsearch (e.g., `localhost:9200`), since auto-configuration is no longer available in Spring Boot 3.x.

---

**Q10. How does Spring Data Elasticsearch simplify ES integration?**  
It provides ready-made repositories like `ElasticsearchRepository` to perform CRUD/search operations without writing boilerplate REST client code.  
It also maps Java classes to ES documents using annotations.

---

**Q11. Can you explain full-text search vs keyword match in ES?**  
- **Full-text search**: Breaks text into tokens (e.g., "iPhone 15") and performs analyzed search.  
- **Keyword match**: Performs exact matching, useful for IDs, tags, categories.

---

**Q12. What happens if Elasticsearch is down? Any fallback strategy?**  
If ES is down, search-related API calls will fail.  
In production, you can add fallbacks using:
- **Caching** (e.g., Redis)
- **Circuit breakers** (e.g., Resilience4j)
- **Message queues** (e.g., Kafka) to retry or delay processing

---
