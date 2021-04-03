DROP TABLE IF EXISTS todos;
CREATE TABLE todos(id serial PRIMARY KEY, subject VARCHAR(255), description VARCHAR(10000));
