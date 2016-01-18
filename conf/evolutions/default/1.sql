# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table doril (
  problem_id                integer not null,
  problem_name              varchar(255),
  constraint pk_doril primary key (problem_id))
;

create table shimon (
  problem_id                integer not null,
  problem_name              varchar(255),
  constraint pk_shimon primary key (problem_id))
;

create table user (
  user_id                   varchar(255) not null,
  password                  varchar(255) not null,
  logintimes                integer,
  logindate                 timestamp,
  logoutdate                timestamp,
  constraint pk_user primary key (user_id))
;

create sequence doril_seq;

create sequence shimon_seq;

create sequence user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists doril;

drop table if exists shimon;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists doril_seq;

drop sequence if exists shimon_seq;

drop sequence if exists user_seq;

