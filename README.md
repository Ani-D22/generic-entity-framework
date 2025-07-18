# Generic Entity Framework

---

[![Build](https://img.shields.io/badge/build-passing-brightgreen?style=flat-square)](https://github.com/yourusername/generic-entity-framework/actions)
[![License](https://img.shields.io/badge/license-MIT-blue.svg?style=flat-square)](LICENSE)
[![Stars](https://img.shields.io/github/stars/Ani-D22/generic-entity-framework?style=social)](https://github.com/Ani-D22/generic-entity-framework)

---

A flexible and reusable framework built with **Spring Boot** for simplifying CRUD operations on entity models using **Java Generics**. This project abstracts the repetitive boilerplate involved in standard REST API development by introducing a generic structure for controllers, services, repositories, and DTOs — making it easy to scale and maintain.

---

## ⚠️ Work in Progress:

This project is currently in its early prototype stage. It serves as a foundational set of packages, interfaces, and classes intended to be developed into a reusable Spring Boot library. The goal is to provide a plug-and-play dependency that can be integrated into Spring applications via Maven or Gradle and used through custom annotations. At this point, the project is not production-ready and is subject to significant changes.

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
    └── generics/
        ├── controller/
        │    └── GenericController.java
        ├── dto/
        │    ├── GenericDTO.java
        │    └── GenericMapper.java
        ├── model/
        │    └── BaseModel.java
        ├── repo/
        │    └── GenericRepository.java
        └── service/
             └── GenericService.java
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

## License

This project is licensed under the [Apache License 2.0](LICENSE).

---

## 🧠 Inspiration & Honourable Mention

This project is inspired by my experience working with Apache OFBiz, where I was deeply impressed by its powerful Delegator and GenericEntity system.

OFBiz offers an elegant way to perform CRUD operations dynamically with minimal boilerplate — something that is often missing in modern Spring Boot applications. However, OFBiz enforces a tightly coupled, predefined data model that can be restrictive for custom or evolving business needs. You cannot freely modify or remove core entities without unintended consequences.

With this project, I aim to bring the same ease of generic CRUD handling to Spring Boot — a framework often regarded as more flexible and developer-friendly — while giving developers full control over their own domain models and database schema.

---
