---------------------------------------- 멤버 테이블 부모로 생성하기 ----------------------------------

create table member (
mno number(5) not null,
bwriter nvarchar2(10) not null, 
id nvarchar2(10) primary key, -- 보드 테이블의 bwriter와 fk로 관계 설정 (타입이 일치해야 작동)
pw nvarchar2(10) not null,
regidate date default sysdate not null
)
SELECT * FROM user_sequences; -- 시퀀스 보기


drop table member -- 테이블 삭제용

insert into member (mno, bwriter, id, pw)  -- 더미네이터 입력
values(board_seq.nextval, '뉴진스', 'newJeans', '1234')
insert into member (mno, bwriter, id, pw)  -- 더미네이터 입력
values(board_seq.nextval, '위시', 'wish', '1234')
insert into member (mno, bwriter, id, pw)  -- 더미네이터 입력
values(board_seq.nextval, '투어스', 'tws', '1234')
insert into member (mno, bwriter, id, pw)  -- 더미네이터 입력
values(board_seq.nextval, '아이브', 'ive', '1234')
insert into member (mno, bwriter, id, pw)  -- 더미네이터 입력
values(board_seq.nextval, '라이즈', 'riize', '1234')

select * from member

-------------------------- 멤버 자식의 보드 왜래키 생성 필수 --------------------

drop table board
drop sequence board_seq

create table board (  -- 테이블 만들기
bno number(5) primary key,  -- 기본키는 널이 없어야 하고 예민하지 않아야 함
btitle nvarchar2(30) not null,
bcontent nvarchar2(1000) not null,
bwriter nvarchar2(10) not null,
bdate date not null
)

select * from board

create sequence board_seq increment by 1 start with 1 nocycle nocache  -- 시퀀스 만들기

alter table board add constraint board_member_fk foreign key (bwriter) references member(id)

delete from board -- 조건 없이 delete를 실행하면 모든 데이터 삭제 >> 후에 외래키를 다시 입력

insert into BOARD (bno, btitle, bcontent, bwriter, bdate)  -- 더미네이터 입력
values(board_seq.nextval, '하입보이', '잠에 들려고 잠에 들려 해도 니 생각에 또 새벽 세 시 ', 'newJeans', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '스테이', '넌 아름다워 푸르디푸른 눈빛 그 다정 다정 말투 이대로 변하지 마', 'wish', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '톡섹시', '숨김없이 다 다 다 보여 줘 괜찮아 멋대로 놔 둬 네 마음을', 'riize', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '첫만남', '첫 만남은 너무 어려워 계획대로 되는 게 없어서', 'tws', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '러브다이브', '서로를 비춘 밤 아름다운 까만 눈빛 더 빠져 깊이', 'ive', sysdate)




--------------------- 조인 ------------------

select b.*, m.bwriter from member m inner join board b on m.id = b.bwriter where id = 'newJeans'