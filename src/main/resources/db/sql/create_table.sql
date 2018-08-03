CREATE TABLE orders (kind VARCHAR(2048),usr VARCHAR(2048),id SERIAL PRIMARY KEY );
CREATE TABLE users(fio VARCHAR(2048), id serial PRIMARY KEY);


alter table orders
  add FOREIGN KEY (usr) REFERENCES users(id)