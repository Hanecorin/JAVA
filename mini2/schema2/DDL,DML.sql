use playdata;

-- DDL
drop table if exists book;
drop table if exists customer;
drop table if exists rent;

-- 도서 정보 테이블
create table book (
	book_no int primary key, -- 책 번호
    book_name char(50) not null, -- 제목
    writer char(20), -- 저자
    publisher char(20), -- 출판사
    inventory int not null -- 재고
);

-- 회원 정보 테이블
create table customer (
	customer_id int primary key, -- 회원 id
    customer_name char(20) not null, -- 이름
    phone_num int not null -- 전화번호
);

-- 대여 정보 테이블
create table rent (
	rent_no int primary key, -- 대여번호 
    rent_date date not null, -- 대여일
	book_no int, -- 책 번호
    book_name char(50), -- 제목
    customer_id int, -- 회원 id
    customer_name char(20) -- 회원 이름
);

-- 테이블 병합
alter table rent add foreign key (book_no) references book (book_no);
alter table rent add foreign key (customer_id) references customer (customer_id);



-- DML

-- book 테이블 정보 입력
insert into book values (1, '파이썬 철저입문', '최은석', '위키북스', 3);
insert into book values (2, '이것이 MySQL이다', '우재남', '한빛미디어', 3);
insert into book values (3, 'Do it!자바 프로그래밍 입문', '박은종', '이지스퍼블리싱', 3);
insert into book values (4, '스프링 마이크로소프트 코딩 공작소', '존 카넬', '길벗', 3);
insert into book values (5, '객체지향 소프트웨어 공학', '최은만', '한빛아카데미', 3);

select * from book;

-- customer 테이블 정보 입력
insert into customer values (101, '김규리', 01012345678);
insert into customer values (102, '김민성', 01011235813);
insert into customer values (103, '최우성', 01024681012);
insert into customer values (104, '한예찬', 01035791113);

select * from customer;

-- rent 테이블 정보 입력
insert into rent values (1001, STR_TO_DATE('2022-8-12','%Y-%m-%d'), 1, '파이썬 철저입문', 101, '김규리');
insert into rent values (1002, STR_TO_DATE('2022-8-12','%Y-%m-%d'), 2, '이것이 MySQL이다', 102, '김민성');
insert into rent values (1003, STR_TO_DATE('2022-8-13','%Y-%m-%d'), 3, 'Do it!자바 프로그래밍 입문', 103, '최우성');
insert into rent values (1004, STR_TO_DATE('2022-8-14','%Y-%m-%d'), 4, '스프링 마이크로소프트 코딩 공작소', 104, '한예찬');
insert into rent values (1005, STR_TO_DATE('2022-8-15','%Y-%m-%d'), 1, '파이썬 철저입문', 103, '최우성');

select * from rent;

commit;