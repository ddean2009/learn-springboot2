CREATE TABLE book (
    id   BIGINT      NOT NULL AUTO_INCREMENT,
    title VARCHAR(128) NOT NULL,
    category_id BIGINT,
    PRIMARY KEY (id)
);