#  JEE\_Conference\_Modelisation

###  **Technology:** Java (Spring Boot, Spring Data JPA, Spring Security)
###  **Architecture:** Layered Service Architecture (DAO, DTO, Service, Web)

---

##  Project Overview

The **JEE\_Conference\_Modelisation** project is a robust, full-featured backend application for managing all aspects of a major academic or industry conference. Built using the **Spring Boot** framework, the application enforces best practices in Java Enterprise development, including layered architecture, relational data modeling, and secure access control.

This system provides a central API to manage attendees, speakers, sessions, venues, and user interactions (comments, invitations).

##  Technical Stack & Architecture

The technology stack is enterprise-ready, showcasing proficiency in key Java backend tools:

| Category | Technology | Key Libraries/Versions | Functionality Demonstrated |
| :--- | :--- | :--- | :--- |
| **Core Framework** | **Spring Boot** | 3.4.1 (Java 17) | Rapid application development and auto-configuration. |
| **Persistence** | **Spring Data JPA** | Hibernate | Object-Relational Mapping (ORM) and simplified data access via Repositories. |
| **Database** | **MySQL**, H2 | Connector/J | Flexibility for production (MySQL) and in-memory testing (H2). |
| **Security** | **Spring Security** | starter-security, thymeleaf-extras | Robust authentication, authorization, and protection of web endpoints. |
| **Web Layer** | **Spring Web** | starter-web | Exposes RESTful endpoints via Controllers for client-side consumption. |
| **Mapping** | **ModelMapper** | 3.2.1 | Handles the crucial separation between DAO (Entities) and DTO (Data Transfer Objects). |
| **View/Templating** | **Thymeleaf** | starter-thymeleaf | Server-side rendering for web views (e.g., login, dashboard). |

##  Architecture & Design Patterns

The project structure demonstrates mastery of the **Service Layer Pattern** and **Separation of Concerns (SoC)**:

1.  **DAO (Data Access Object):**
    *   **`entities`:** Contains the primary relational models (e.g., `Conference.java`, `Participant.java`, `Session.java`).
    *   **`repositories`:** Contains `Spring Data JPA` interfaces for database CRUD operations.
2.  **DTO (Data Transfer Object):**
    *   Contains classes like `ConferenceDto.java`, ensuring that internal data models are not directly exposed to the external Web/API layer.
3.  **Service Layer:**
    *   **`service`:** Contains interfaces (e.g., `IConferenceService`) and implementation classes (`ConferenceManager`) that encapsulate the business logic and orchestrate data flow.
4.  **Mapper Layer:**
    *   **`mapper`:** Utilizes **ModelMapper** to manage the translation logic between **Entities** and **DTOs**.
5.  **Web Layer:**
    *   **`web`:** Contains the **`ConferenceControler.java`** for mapping URL requests to the appropriate service methods and returning responses (or rendered Thymeleaf views).

##  Core Domain Entities

The relational model is complex and manages numerous interconnected entities, including:
*   `Conference`, `Session`, `Salle` (Venue/Room)
*   `Participant`, `Moderateur`, `Speaker`
*   `Inscription` (Registration), `Invite`, `StatutInscription`
*   `Commentaire`, `Genre`

##  Getting Started

### Prerequisites

*   Java 17 or higher
*   Maven 3.x
*   A MySQL instance (or rely on the in-memory H2 for quick local testing)

### Installation & Execution

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/SdIlias/JEE_Conference_Modelisation.git
    cd JEE_Conference_Modelisation
    ```

2.  **Build the project with Maven:**
    ```bash
    # This fetches dependencies and compiles the project
    mvn clean install
    ```

3.  **Run the Spring Boot application:**
    ```bash
    mvn spring-boot:run
    ```
    The application will start on the configured port (default is usually `8080`).

---

##  Security Configuration

The project includes **Spring Security**, indicating a setup for:
*   User authentication (login/logout).
*   Role-based authorization (e.g., allowing only a `Moderateur` to edit a session).
*   Protection of web resources and API endpoints.

***
