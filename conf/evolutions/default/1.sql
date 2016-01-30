# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table doril (
  problem_id                bigint not null,
  problem_name              varchar(255),
  solve_name                varchar(255),
  create_date               timestamp not null,
  update_date               timestamp not null,
  constraint pk_doril primary key (problem_id))
;

create table shimon (
  id                        bigint not null,
  problem_name              varchar(255),
  solve_name                varchar(255),
  create_date               timestamp not null,
  update_date               timestamp not null,
  constraint pk_shimon primary key (id))
;

create table user (
  id                        bigint not null,
  user_id                   varchar(255),
  password                  varchar(255),
  logintimes                integer,
  is_admin                  boolean,
  create_date               timestamp not null,
  update_date               timestamp not null,
  constraint pk_user primary key (id))
;

create table user_model (
  id                        bigint not null,
  user_id                   bigint,
  param1                    integer not null,
  param2                    integer not null,
  param3                    integer not null,
  param4                    integer not null,
  param5                    integer not null,
  param6                    integer not null,
  create_date               timestamp not null,
  update_date               timestamp not null,
  constraint pk_user_model primary key (id))
;

create sequence doril_seq;

create sequence shimon_seq;

create sequence user_seq;

create sequence user_model_seq;

alter table user_model add constraint fk_user_model_user_1 foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_user_model_user_1 on user_model (user_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists doril;

drop table if exists shimon;

drop table if exists user;

drop table if exists user_model;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists doril_seq;

drop sequence if exists shimon_seq;

drop sequence if exists user_seq;

drop sequence if exists user_model_seq;

