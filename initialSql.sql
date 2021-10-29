DROP TABLE employee;

CREATE TABLE employee(
    id BIGSERIAL PRIMARY KEY NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    address VARCHAR(50) NOT NULL,
    contact VARCHAR(50) NOT NULL
)