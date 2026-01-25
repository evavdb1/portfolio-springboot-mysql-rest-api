create table comments
(
    created_at datetime(6) null,
    id         bigint auto_increment
        primary key,
    post_id    bigint      not null,
    updated_at datetime(6) null,
    text       longtext    null,
    constraint FKh4c7lvsc298whoyd4w9ta25cr
        foreign key (post_id) references posts (id)
            on delete cascade
);

