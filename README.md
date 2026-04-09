# 🤖 WhatsApp Chatbot Backend Simulation

## 📌 Project Overview

This project is a simple backend simulation of a WhatsApp chatbot built using Spring Boot.
It receives messages via a REST API and responds with predefined replies.

---

## 🚀 Features

* REST API endpoint: `/webhook`
* Accepts JSON input
* Returns predefined responses:

  * Hi → Hello
  * Bye → Goodbye
  * Others → I don't understand
* Logs all incoming messages using SLF4J

---

## 🛠️ Tech Stack

* Java 17
* Spring Boot
* Maven

---

## 📤 API Usage

### Endpoint:

POST `/webhook`

### Request:

```json
{
  "message": "Hi"
}
```

### Response:

```json
{
  "reply": "Hello"
}
```

---

## 📁 Project Structure

* controller → Handles API requests
* service → Business logic
* model → Request/Response classes

---

## ✅ How to Run

1. Clone the repository
2. Open in IntelliJ
3. Run the main class
4. Test using Postman

---

## 🙌 Author

Abhinav
