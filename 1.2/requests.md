# Bookstore API Requests (CRUD)

### 1. Отримати список усіх книг
GET http://localhost:8080/api/books

### 2. Фільтрувати книги за жанром
GET http://localhost:8080/api/books?genre=Поезія

### 3. Отримати детальну інформацію про книгу за ID (200 OK / 404 Not Found)
GET http://localhost:8080/api/books/1

### 4. Створити нову книгу (201 Created)
POST http://localhost:8080/api/books
Content-Type: application/json

{
"title": "Тигролови",
"author": "Іван Багряний",
"price": 380.00,
"year": 2020,
"genre": "Проза",
"coverUrl": "https://example.com/covers/tyhrolovy.jpg",
"description": "Пригодницький роман про боротьбу людини за свободу та гідність."
}

### 5. Оновити існуючу книгу за ID (200 OK / 404 Not Found)
PUT http://localhost:8080/api/books/1
Content-Type: application/json

{
"title": "Clean Code (Оновлене видання)",
"author": "Robert C. Martin",
"price": 690.00,
"year": 2022,
"genre": "Технічна література",
"coverUrl": "https://example.com/covers/clean-code.jpg",
"description": "Оновлений посібник із написання чистого коду."
}

### 6. Видалити книгу за ID (204 No Content / 404 Not Found)
DELETE http://localhost:8080/api/books/2