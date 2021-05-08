drop table if exists test;
create table test
(
    id   int         not null comment 'ID',
    name varchar(64) null comment '名称'
)engine=innodb default charset=utf8mb4 comment '测试';
insert into `test`(id,name)values (1, '测试1');
insert into `test`(id,name)values (2, '测试2');