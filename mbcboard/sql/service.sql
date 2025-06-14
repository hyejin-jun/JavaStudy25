-- 테이블 생성

create table board(
bno number(5) primary key,  -- 기본키 생성
btitle varchar2 (18) not null,
bcontent varchar2(1000) not null,
bwriter varchar2 (16) not null,
bdate date not null 
)

drop table board

create sequence board_seq increment by 1 start with 1 nocycle nocache  -- 자동 번호 생성


drop sequence board_seq  -- 자동 번호 삭제

select * from board

insert into board (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '허그', '하루만 니 애인이 되고 싶어', '라이즈', sysdate)
insert into board (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '드라우닝', '다정한 말로 나를 죽여 놓고', '조승연', sysdate)
insert into board (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '너에게닿기를', '따사로운 햇살 속에서 종소리가 울려 퍼지네', '권정열', sysdate)



