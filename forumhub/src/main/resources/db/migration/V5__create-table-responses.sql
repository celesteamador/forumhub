create table responses(
    id bigint not null auto_increment,
    message varchar(250) not null,
    topic_id bigint not null,
    creationDate datetime not null,
    author bigint not null,
    solution tinyint not null,

    primary key(id),

    constraint fk_responses_topic_id foreign key (topic_id) references topics(id),
    constraint fk_responses_author foreign key (author) references users(id)

);
