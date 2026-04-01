# 🤖 AI Agent (Spring Boot + React + Ollama)

An AI-powered chat application built using **Spring Boot**, **Angular**, **Ollama (LLM)**, and **MySQL**.

This project demonstrates how to build a **full-stack AI system** where users can interact with a local Large Language Model through a modern web interface.

---

# 📌 Features

✅ AI Chat Interface  
✅ Angular Frontend UI  
✅ Spring Boot REST API  
✅ Ollama LLM Integration (Llama3)  
✅ Chat Persistence using MySQL  
✅ Swagger API Documentation  
✅ Clean MVC Architecture  

---

# 🏗️ System Architecture

Angular Frontend (Chat UI)
│
▼
Spring Boot REST API
│
▼
AI Client Service
│
▼
Ollama LLM (Llama3)
│
▼
MySQL Database (Chat History)


ai-agent
│
├── src
│ ├── controller
│ ├── service
│ ├── client
│ ├── entity
│ ├── repository
│ └── memory
│
├── ai-agent-ui
│ └── Angular frontend
│
├── pom.xml
└── README.md


---

# ⚙️ Installation & Setup

## 1️⃣ Clone Repository

```bash
git clone https://github.com/varunendrakumarverma3-dotcom/aiAgnet.git
cd aiAgnet
2️⃣ Run Ollama

Install Ollama:

https://ollama.com

Pull model:

ollama pull phi3

Run model:

ollama run phi3
3️⃣ Setup MySQL Database

Create database:

CREATE DATABASE aiagent_db;

Update application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/aiagent_db
spring.datasource.username=root
spring.datasource.password=yourpassword
4️⃣ Run Spring Boot Backend
mvn spring-boot:run

Backend runs on:

http://localhost:4200
5️⃣ Run Angular Frontend
cd ai-agent-ui
npm install
npm start

Frontend runs on:

http://localhost:4200
📸 Application Preview

Example Chat Interface:

User: What is AI?

AI: Artificial Intelligence (AI) refers to the simulation of human intelligence
in machines that are programmed to think and learn.

📚 API Documentation

Swagger UI:

http://localhost:8080/swagger-ui/index.html

👨‍💻 Author

Varunendra Kumar Verma

GitHub:
https://github.com/varunendrakumarverma3-dotcom
