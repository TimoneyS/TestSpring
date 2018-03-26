CREATE TABLE dog (
    id          INT NOT null PRIMARY KEY auto_increment,
    name        VARCHAR(20),
    birthday    DATETIME,
    color       VARCHAR(10),
    sex         INT
);