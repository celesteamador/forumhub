create table users(
    id bigint not null auto_increment,
    name varchar(50) not null,
    email varchar(50) not null unique,
    password varchar(100) not null unique,
    profile_id bigint not null,

    primary key (id),

    constraint fk_users_profile_id foreign key (profile_id) references profiles(id)

);
