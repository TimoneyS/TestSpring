create table author (
    id        int,
    username  varchar(32),
    realname  varchar(32),
    create_date timestamp
);

create table question (
    id          int PRIMARY KEY,
    title       varchar(255),
    content     clob,
    author_id   int,
    create_date timestamp
);

create table reply (
    id          int,
    content     clob,
    question_id int,
    author_id   int,
    create_date timestamp
);