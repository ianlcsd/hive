create database source;
create database target;

create table source.src like default.src;
load data local inpath '../../data/files/kv1.txt' overwrite into table source.src;

create table source.srcpart like default.srcpart;
load data local inpath '../../data/files/kv1.txt' overwrite into table source.srcpart partition (ds='2008-04-08', hr='11');
load data local inpath '../../data/files/kv1.txt' overwrite into table source.srcpart partition (ds='2008-04-08', hr='12');
load data local inpath '../../data/files/kv1.txt' overwrite into table source.srcpart partition (ds='2008-04-09', hr='11');
load data local inpath '../../data/files/kv1.txt' overwrite into table source.srcpart partition (ds='2008-04-09', hr='12');

set hive.fetch.task.conversion=more;

select * from source.src tablesample (10 rows);
select * from source.srcpart tablesample (10 rows);

explain
ALTER TABLE source.src RENAME TO target.src;
ALTER TABLE source.src RENAME TO target.src;

select * from target.src tablesample (10 rows);

explain
ALTER TABLE source.srcpart RENAME TO target.srcpart;
ALTER TABLE source.srcpart RENAME TO target.srcpart;

select * from target.srcpart tablesample (10 rows);