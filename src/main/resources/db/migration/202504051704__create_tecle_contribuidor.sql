CREATE TABLE CONTRIBUIDOR (
    id BIGSERIAL not null primary key,
    name VARCHAR(150) not null,
    email VARCHAR(150) not null,
    link_github VARCHAR(150) not null,
    CONSTRAINT UK_EMAIL  UNIQUE (email),
    CONSTRAINT UK_LINKGITHUB  UNIQUE (link_github)
);