# Generic Entity Framework

---

[![Build](https://img.shields.io/badge/build-passing-brightgreen?style=flat-square)](https://github.com/yourusername/generic-entity-framework/actions)
[![License](https://img.shields.io/badge/license-MIT-blue.svg?style=flat-square)](LICENSE)
[![Stars](https://img.shields.io/github/stars/Ani-D22/generic-entity-framework?style=social)](https://github.com/Ani-D22/generic-entity-framework)

---

A flexible and reusable framework built with **Spring Boot** for simplifying CRUD operations on entity models using **Java Generics**. This project abstracts the repetitive boilerplate involved in standard REST API development by introducing a generic structure for controllers, services, repositories, and DTOs — making it easy to scale and maintain.

---

## 🚀 Features

- ✅ **Generic CRUD Operations** (Create, Read, Update, Delete)
- 📦 **Generic DTO Support** using inheritance and reflection
- 🔁 **PATCH & PUT support** via partial update mapping
- 🧩 **GenericMapper** to avoid writing entity-specific mappers
- 🏷️ Seamless integration with **JPA** and **Spring Data**
- 📚 OpenAPI / Swagger documentation enabled

---

## 💡 Why Use This Framework?

In traditional Spring Boot projects, every entity requires its own:
- Repository
- Service
- DTO
- Mapper
- Controller

This framework eliminates that redundancy. Define your entity, extend the generic base classes/interfaces, and you’re ready to go.

---

## 🧱 Structure

```
    src
    ├── application/
    |   ├── controller/
    |   │    └── YourEntityController.java     //declaration
    |   ├── dto/
    |   │    ├── YourEntityDTO.java            //declaration
    |   │    └── YourEntityMapper.java         //declaration
    |   ├── model/
    |   │    └── YourEntity.java               //declaration
    |   ├── repo/
    |   │    └── YourEntityRepository.java     //declaration
    |   └── service/
    |        └── YourEntityService.java        //declaration
    |
    ├── generics/
    |   ├── controller/
    |   │    └── GenericController.java
    |   ├── dto/
    |   │    ├── GenericDTO.java
    |   │    └── GenericMapper.java
    |   ├── model/
    |   │    └── BaseModel.java
    |   ├── repo/
    |   │    └── GenericRepository.java
    |   └── service/
    |        └── GenericService.java
```

---

## 📦 Example Usage

**Entity**

```
@Entity
public class Product {
    @Id
    private Long id;
    private String name;
    private Double price;
}
```

**Repository**

```
@Repository
public interface ProductRepository extends GenericRepository<Product, Long> {}
```

**DTO**

```
public class ProductDTO extends GenericDTO<Product> {
    private Long id;
    private String name;
    private Double price;
}
```

**Controller**

```
@RestController
@RequestMapping("/api/products")
public class ProductController extends GenericController<Product, Long> {
    public ProductController(ProductService service) {
        super(service, new GenericMapper());
    }
}
```
---

**🛠️ Requirements**

- Java 17+

- Spring Boot 3.x+

- Maven or Gradle

---

**📄 API Docs**
Once the app is running, visit:

```
http://localhost:8080/swagger-ui/index.html
```
---

**🧪 Test It**
You can test the generic CRUD APIs using:

- Swagger UI

- Postman

- cURL

---

**🤝 Contributing**
If you’d like to extend this framework or report issues, feel free to open a pull request or raise an issue.

---

**📜 License**
This project is licensed under the MIT License.

---
