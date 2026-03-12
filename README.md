# 🤖 AI Agent (Spring Boot + React + Ollama)

An AI-powered chat application built using **Spring Boot**, **React**, **Ollama (LLM)**, and **MySQL**.

This project demonstrates how to build a **full-stack AI system** where users can interact with a local Large Language Model through a modern web interface.

---

# 📌 Features

✅ AI Chat Interface  
✅ React Frontend UI  
✅ Spring Boot REST API  
✅ Ollama LLM Integration (Llama3)  
✅ Chat Persistence using MySQL  
✅ Swagger API Documentation  
✅ Clean MVC Architecture  

---

# 🏗️ System Architecture

React Frontend (Chat UI)
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


React Frontend (Chat UI)
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
│ └── React frontend
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

ollama pull llama3

Run model:

ollama run llama3
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

http://localhost:8080
5️⃣ Run React Frontend
cd ai-agent-ui
npm install
npm start

Frontend runs on:

http://localhost:3000
📸 Application Preview

Example Chat Interface:

User: What is AI?

AI: Artificial Intelligence (AI) refers to the simulation of human intelligence
in machines that are programmed to think and learn.
📚 API Documentation

Swagger UI:

http://localhost:8080/swagger-ui/index.html
🚀 Future Improvements

ChatGPT-style streaming responses

Authentication (JWT)

File upload for AI analysis

Multi-agent tools

Cloud deployment

👨‍💻 Author

Varunendra Kumar Verma

GitHub:
https://github.com/varunendrakumarverma3-dotcom

⭐ If you like this project

Give it a Star ⭐ on GitHub


---

# ⭐ After Updating README

Your GitHub repo will look **10× more professional**.

Next improvement I recommend:

1️⃣ Add **screenshots of your AI chat UI**  
2️⃣ Rename repo from `aiAgnet` → `ai-agent` (typo fix)  
3️⃣ Add **project architecture diagram**

These things make your GitHub look **very strong for internships and placements**.

---

If you want, I can also show you something **very useful for your project**:

> How to turn your AI Agent into a **real autonomous AI system (like AutoGPT)**.
