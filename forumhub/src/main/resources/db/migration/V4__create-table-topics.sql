create table topics(
    id bigint not null auto_increment,
    title varchar(50) not null,
    message varchar(150) not null,
    creationDate datetime not null,
    status tinyint not null,
    author bigint not null,
    course_id bigint not null,
    responses varchar(250) not null,

    primary key(id),

    constraint fk_topics_course_id foreign key (course_id) references courses(id),
    constraint fk_topics_author foreign key (author) references users(id)

);
