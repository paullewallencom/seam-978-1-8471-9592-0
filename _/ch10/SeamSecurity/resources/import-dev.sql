insert into User (user_id, userName, password, enabled) values (1, 'david', 'secret', 1);
insert into User (user_id, userName, password, enabled) values (2, 'guest', 'guest', 1);

insert into Role(role_id, name) values (1, 'admin');
insert into Role(role_id, name) values (2, 'user');
insert into Role(role_id, name) values (3, 'guest');

insert into UserRoleLink(user_id, role_id) values (1, 1);
insert into UserRoleLink(user_id, role_id) values (1, 2);
insert into UserRoleLink(user_id, role_id) values (2, 3);