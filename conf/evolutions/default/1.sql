/*# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions*/

# --- !Ups

create table cars (
  id                        bigint auto_increment not null,
  created_date              timestamp,
  updated_date              timestamp,
  status                    boolean,
  name                      varchar(255),
  issue_date                timestamp,
  constraint pk_cars primary key (id))
;

create table departments (
  id                        bigint auto_increment not null,
  created_date              timestamp,
  updated_date              timestamp,
  status                    boolean,
  name                      varchar(255),
  constraint pk_departments primary key (id))
;

create table roles (
  id                        bigint auto_increment not null,
  created_date              timestamp,
  updated_date              timestamp,
  status                    boolean,
  name                      varchar(255),
  constraint pk_roles primary key (id))
;

create table users (
  id                        bigint auto_increment not null,
  created_date              timestamp,
  updated_date              timestamp,
  status                    boolean,
  name                      varchar(255),
  age                       varchar(255),
  role_id                   bigint,
  department_id             bigint,
  car_id                    bigint,
  constraint pk_users primary key (id))
;

alter table users add constraint fk_users_role_1 foreign key (role_id) references roles (id) on delete restrict on update restrict;
create index ix_users_role_1 on users (role_id);
alter table users add constraint fk_users_department_2 foreign key (department_id) references departments (id) on delete restrict on update restrict;
create index ix_users_department_2 on users (department_id);
alter table users add constraint fk_users_car_3 foreign key (car_id) references cars (id) on delete restrict on update restrict;
create index ix_users_car_3 on users (car_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists cars;

drop table if exists departments;

drop table if exists roles;

drop table if exists users;

SET REFERENTIAL_INTEGRITY TRUE;

