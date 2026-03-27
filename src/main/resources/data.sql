CREATE TABLE products (
    id varchar(255) not null primary key,
    name varchar(50) not null,
    desc varchar(300) not null,
    price numeric(18, 2)
);