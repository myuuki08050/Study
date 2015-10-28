# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table parent (
  user_id                   varchar(255) not null,
  password                  varchar(255) not null,
  create_date               timestamp not null,
  update_date               timestamp not null,
  constraint pk_parent primary key (user_id))
;

create sequence parent_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists parent;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists parent_seq;

