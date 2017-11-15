--ALTERAR TAMANHO DO CAMPO BOOK DE 30 PARA 60 CARACTERES
ALTER TABLE book MODIFY book VARCHAR(60);

-- CADASTRO DE ESTILOS
insert into style (style) values ('Biografias e Memórias');
insert into style (style) values ('Contos');
insert into style (style) values ('Cordel');
insert into style (style) values ('Crônicas');
insert into style (style) values ('Ensaios');
insert into style (style) values ('Eróticos');
insert into style (style) values ('Ficção Científica');
insert into style (style) values ('Novela');
insert into style (style) values ('Poesia');
insert into style (style) values ('Policial');
insert into style (style) values ('Romance');
insert into style (style) values ('Romance Autobiografico');
insert into style (style) values ('Romance Histórico');
insert into style (style) values ('Teatro');
insert into style (style) values ('Terror');
insert into style (style) values ('Tragédia');
insert into style (style) values ('Baseado em fatos reais');
insert into style (style) values ('Livro-reportagem');
insert into style (style) values ('Quadrinhos');

-- INSERT DE AUTORES
INSERT INTO author (author) VALUES ('Stephen King');
INSERT INTO author (author) VALUES ('Edgar Alan Poe');
INSERT INTO author (author) VALUES ('J K Rowling');
INSERT INTO author (author) VALUES ('J. R. R. Tolkien');
INSERT INTO author (author) VALUES ('Isac Asimov');
INSERT INTO author (author) VALUES ('George R. R. Martin');
INSERT INTO author (author) VALUES ('Machado de Assis');
INSERT INTO author (author) VALUES ('Paulo Coelho');
INSERT INTO author (author) VALUES ('Monteiro Lobato');
INSERT INTO author (author) VALUES ('Luis de Camões');
INSERT INTO author (author) VALUES ('José Saramago');
INSERT INTO author (author) VALUES ('Bruce Dickinson');

-- insert de livros
INSERT INTO book (book, publisher, pages, fk_authorId) VALUES ('It the Thing', 'Suma de Letras', 1104, 1);
INSERT INTO book (book, publisher, pages, fk_authorId) VALUES ('Revival', 'Suma de Letras', 475, 1);
INSERT INTO book (book, publisher, pages, fk_authorId) VALUES ('O Iluminado', 'Suma de Letras', 360, 1);
INSERT INTO book (book, publisher, pages, fk_authorId) VALUES ('The Raven', 'New York Mirror', 214, 2);
INSERT INTO book (book, publisher, pages, fk_authorId) VALUES ('Harry Potter e a pedra filosofal', 'Rocco', 211, 3);
INSERT INTO book (book, publisher, pages, fk_authorId) VALUES ('Harry Potter e a camara secreta', 'Rocco', 111, 3);
INSERT INTO book (book, publisher, pages, fk_authorId) VALUES ('Harry Potter e a ordem da fenix', 'Rocco', 770, 3);
INSERT INTO book (book, publisher, pages, fk_authorId) VALUES ('Harry Potter e o calice de fogo', 'Rocco', 445, 3);
INSERT INTO book (book, publisher, pages, fk_authorId) VALUES ('Senhor dos Aneis', 'Tolkien', 1100, 4);
INSERT INTO book (book, publisher, pages, fk_authorId) VALUES ('Eu Robo', 'Mine', 279, 5);
INSERT INTO book (book, publisher, pages, fk_authorId) VALUES ('Game of thrones', 'GGMartin', 2000, 6);
INSERT INTO book (book, publisher, pages, fk_authorId) VALUES ('Memorias Postumas', 'Machado', 280, 7);
INSERT INTO book (book, publisher, pages, fk_authorId) VALUES ('Dom Casmurro', 'Machado', 297, 7);
INSERT INTO book (book, publisher, pages, fk_authorId) VALUES ('Menino Maluquinho', 'Sitio', 400, 9);
INSERT INTO book (book, publisher, pages, fk_authorId) VALUES ('What Does This Button Do?', 'Iron Maiden', 710, 12);


-- INSERT BOOKS STYLE
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (1, 15);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (1, 7);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (2, 15);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (2, 7);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (3, 15);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (3, 7);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (4, 9);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (4, 5);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (5, 2);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (5, 14);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (6, 2);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (6, 14);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (7, 2);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (7, 14);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (8, 2);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (8, 14);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (9, 7);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (10, 7);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (11, 7);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (11, 16);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (12, 2);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (12, 1);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (12, 4);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (13, 2);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (13, 4);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (14, 4);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (14, 18);
INSERT INTO book_style (fk_bookId, fk_styleId) VALUES (15, 1);