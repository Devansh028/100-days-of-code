# Backend Answers – Day 36 (Model)

================================
Q1: What happens when a request hits the backend?
================================

Answer:

1. Client sends HTTP request
2. Controller receives request
3. Request is validated
4. Service layer executes business logic
5. Repository interacts with database
6. Response is returned to client

---

## Q2: What is an API?

Answer:

- API is an interface that allows communication between two software systems
- It defines request and response structure

---

## Q3: Authentication vs Authorization

Authentication:

- Verifies user identity
- Example: Login with username/password

Authorization:

- Determines what resources user can access
- Example: Admin vs User permissions

---

## Q4: What is JWT?

Answer:

- JSON Web Token
- Used for stateless authentication
- Contains header, payload, and signature
- Sent with every request

---

## Q5: Why is JWT preferred in REST APIs?

Answer:

- Stateless
- No server-side session storage
- Scales well for distributed systems

---

## Q6: Monolith vs Microservices

Monolith:

- Single codebase
- Easy to develop initially
- Hard to scale independently

Microservices:

- Independent services
- Scalable and flexible
- More complex to manage

---

## Q7: What is caching?

Answer:

- Temporary storage of frequently accessed data
- Reduces database load
- Improves response time

---

## Q8: How do you secure backend APIs?

Answer:

- Authentication (JWT / OAuth)
- Authorization
- HTTPS
- Input validation
- Rate limiting
