CREATE DATABASE library;

CREATE TABLE books (
    id        SERIAL PRIMARY KEY,
    title     VARCHAR(200) NOT NULL,
    author    VARCHAR(120) NOT NULL,
    pages     INTEGER,
    available BOOLEAN DEFAULT TRUE
);

INSERT INTO books (title, author, pages, available) VALUES
('Clean Code', 'Robert C. Martin', 464, TRUE),
('The Pragmatic Programmer', 'Andrew Hunt', 352, TRUE),
('Refactoring', 'Martin Fowler', 448, TRUE),
('The Little Prince', 'Antoine de Saint-Exupéry', 96, TRUE);

SELECT * FROM books WHERE pages > 300;
SELECT title FROM books ORDER BY title ASC;
