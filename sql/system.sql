create user boardtest1 identified by boardtest1
grant resource, connect to boardtest1
alter user boardtest default tablespace users
alter user boardtest temporary tablespace temp