create table posts
(
    created_at  datetime(6)  null,
    id          bigint auto_increment
        primary key,
    updated_at  datetime(6)  null,
    description varchar(255) null,
    title       varchar(255) null,
    content     longtext     null,
    constraint UKmchce1gm7f6otpphxd6ixsdps
        unique (title)
);

