DROP TABLE  IF EXISTS people;

CREATE TABLE people  (
    person_id BIGINT NOT NULL PRIMARY KEY,
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    full_name VARCHAR(40)
);