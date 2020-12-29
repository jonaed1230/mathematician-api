drop database mathematiciandb;
drop user mathematician;
create user mathematician with password 'password';
create database mathematiciandb with template=template0 owner=mathematician;
\connect mathematiciandb;

alter default privileges grant all on tables to mathematician;
alter default privileges grant all on sequences to mathematician;

create table et_users(
  user_id integer primary key not null,
  first_name varchar(20) not null,
  last_name varchar(20) not null,
  email varchar(50) not null,
  password text not null
);

create table et_winnerpanel(
  panel_id integer primary key not null,
  user_id integer not null,
  best_score integer
);
alter table et_winnerpanel add constraint win_user_fk
foreign key(user_id) references et_users(user_id);

create sequence et_users_seq increment 1 start 1;
create sequence et_winnerpanel_seq increment 1 start 1;
