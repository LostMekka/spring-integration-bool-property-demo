create table demo_user
(
    id int auto_increment,
    name varchar(255) not null,
    is_admin int(1) not null,
    constraint demo_pk primary key (id)
);

insert into demo_user (id, name, is_admin) values
(1, 'Anna', true),
(2, 'Beatrice', true),
(3, 'Cloe', false),
(4, 'Diana', false),
(5, 'Emma', false);
