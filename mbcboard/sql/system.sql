create user boardtest identified by  boardtest

grant resource, connect to boardtest -- 일반 계정
alter user boardtest default tablespace users
alter user boardtest temporary tablespace temp

drop user boradtest



