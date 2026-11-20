# Bookstore API Requests

### 1. Отримати список усіх книг (картки)
GET http://localhost:8080/api/books

### 2. Отримати детальну інформацію про книгу за ID (існуючий ID, наприклад 1)
GET http://localhost:8080/api/books/1

### 3. Перевірити обробку відсутньої книги (очікуваний статус 404 Not Found)
GET http://localhost:8080/api/books/999