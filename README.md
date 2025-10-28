# Generic Entity Framework

---

[![Build](https://img.shields.io/badge/build-passing-brightgreen?style=flat-square)](https://github.com/yourusername/generic-entity-framework/actions)
[![License](https://img.shields.io/badge/license-MIT-blue.svg?style=flat-square)](LICENSE)
[![Stars](https://img.shields.io/github/stars/Ani-D22/generic-entity-framework?style=social)](https://github.com/Ani-D22/generic-entity-framework)

---

A **backend-agnostic**, **annotation-driven**, and **generic CRUD framework** built with **Spring Boot** and **Java Generics** — designed to reduce boilerplate in your data access layer.  
This framework aims to provide a pluggable dependency that can be imported into any Spring Boot project to handle entity persistence with minimal setup.

---

## ⚠️ Work in Progress (v0.1.0-alpha)

This version represents the **core foundation** of the project — focusing solely on **entity, repository, and service abstraction**.

It removes controller and DTO layers entirely to keep the framework **lightweight and backend-agnostic**.  
The long-term goal is to evolve this into a **Spring Boot Starter** that can be added via Maven or Gradle and configured using annotations.

🚧 This is a **prototype release**, not yet production-ready. Expect structural improvements and design pattern refinements in later versions.

---

## 🚀 Features

- ✅ Generic CRUD operations (Create, Read, Update, Delete)
- ♻️ Reusable repository and service base classes
- 🧩 JPA-agnostic base entity with soft delete and audit fields
- 🛡️ Supports field-level extensibility and audit logging (planned)
- 🧱 Plug-and-play structure for entity persistence
- 🧠 Built using Java Generics and Spring Data abstraction
- 🪶 Minimal boilerplate, maximum reusability

---

## 💡 Why This Framework?

In most Spring Boot applications, developers repeatedly write the same code for:

- Repositories  
- Services  
- CRUD operations  
- Audit handling and soft deletes  

This framework removes that redundancy.  
You define your entity and extend the generic base classes — **no repetitive repository or service code needed**.

---

## 🧱 Structure

```
    src
    ├── application/
    |   ├── model/
    |   │    └── YourEntity.java               //declaration
    |   ├── repo/
    |   │    └── YourEntityRepository.java     //declaration
    |   └── service/
    |        └── YourEntityService.java        //declaration
    |
    └── generics/
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

**🧭 Roadmap**
##Milestone	        ##Focus	                                                            ##Target
---
v0.1.0-alpha    |	Core repository & service layer refactor                      |	    ✅ Current
v0.2.0          |   Add annotation-driven registration for entities & services    |	    ⏳ Next
v0.3.0          |   Add optional controller layer & auto-doc generation           |     ⏳ Future
v1.0.0          |   Release as Spring Boot Starter with auto-configuration        |    	🏁 Planned

---

**🤝 Contributing**

If you’d like to extend this framework or report issues, feel free to open a pull request or raise an issue.

---

## License

This project is licensed under the [Apache License 2.0](LICENSE).

---

## 🧠 Inspiration & Honourable Mention

This framework is inspired by Apache OFBiz, particularly its Delegator and GenericEntity systems — which enable dynamic CRUD and data manipulation with minimal boilerplate.

However, while OFBiz enforces a rigid, predefined data model, this project gives developers:

Full control over their own entities and schema

The ability to leverage Spring Boot flexibility

A modern, annotation-based Java experience

In short:
“Bringing OFBiz-like generic CRUD power into the simplicity of Spring Boot.”

---
