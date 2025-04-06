CREATE TABLE SITES (
    id BIGSERIAL not null primary key,
    titulo VARCHAR(150),
    descricao VARCHAR(250),
    linkSite VARCHAR(150),
    stack VARCHAR(100),
    contribuidor_id BIGSERIAL not null,
    CONSTRAINT UK_LINKSITE  UNIQUE (linkSite),
    CONSTRAINT FK_CONTRIBUIDOR_ID FOREIGN KEY(contribuidor_id) REFERENCES CONTRIBUIDOR(id)
);