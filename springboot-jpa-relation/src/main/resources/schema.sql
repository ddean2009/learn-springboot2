CREATE TABLE book (
    id   BIGINT      NOT NULL AUTO_INCREMENT,
    title VARCHAR(128) NOT NULL,
    category_id BIGINT,
    PRIMARY KEY (id)
);

CREATE TABLE category (
    id   BIGINT      NOT NULL AUTO_INCREMENT,
    name VARCHAR(128) NOT NULL,
    PRIMARY KEY (id)
);