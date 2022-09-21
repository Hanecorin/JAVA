use playdata;

-- DDL
drop table if exists book;
drop table if exists customer;
drop table if exists rent;

-- ���� ���� ���̺�
create table book (
	book_no int primary key, -- å ��ȣ
    book_name char(50) not null, -- ����
    writer char(20), -- ����
    publisher char(20), -- ���ǻ�
    inventory int not null -- ���
);

-- ȸ�� ���� ���̺�
create table customer (
	customer_id int primary key, -- ȸ�� id
    customer_name char(20) not null, -- �̸�
    phone_num int not null -- ��ȭ��ȣ
);

-- �뿩 ���� ���̺�
create table rent (
	rent_no int primary key, -- �뿩��ȣ 
    rent_date date not null, -- �뿩��
	book_no int, -- å ��ȣ
    book_name char(50), -- ����
    customer_id int, -- ȸ�� id
    customer_name char(20) -- ȸ�� �̸�
);

-- ���̺� ����
alter table rent add foreign key (book_no) references book (book_no);
alter table rent add foreign key (customer_id) references customer (customer_id);



-- DML

-- book ���̺� ���� �Է�
insert into book values (1, '���̽� ö���Թ�', '������', '��Ű�Ͻ�', 3);
insert into book values (2, '�̰��� MySQL�̴�', '���糲', '�Ѻ��̵��', 3);
insert into book values (3, 'Do it!�ڹ� ���α׷��� �Թ�', '������', '�������ۺ���', 3);
insert into book values (4, '������ ����ũ�μ���Ʈ �ڵ� ���ۼ�', '�� ī��', '���', 3);
insert into book values (5, '��ü���� ����Ʈ���� ����', '������', '�Ѻ���ī����', 3);

select * from book;

-- customer ���̺� ���� �Է�
insert into customer values (101, '��Ը�', 01012345678);
insert into customer values (102, '��μ�', 01011235813);
insert into customer values (103, '�ֿ켺', 01024681012);
insert into customer values (104, '�ѿ���', 01035791113);

select * from customer;

-- rent ���̺� ���� �Է�
insert into rent values (1001, STR_TO_DATE('2022-8-12','%Y-%m-%d'), 1, '���̽� ö���Թ�', 101, '��Ը�');
insert into rent values (1002, STR_TO_DATE('2022-8-12','%Y-%m-%d'), 2, '�̰��� MySQL�̴�', 102, '��μ�');
insert into rent values (1003, STR_TO_DATE('2022-8-13','%Y-%m-%d'), 3, 'Do it!�ڹ� ���α׷��� �Թ�', 103, '�ֿ켺');
insert into rent values (1004, STR_TO_DATE('2022-8-14','%Y-%m-%d'), 4, '������ ����ũ�μ���Ʈ �ڵ� ���ۼ�', 104, '�ѿ���');
insert into rent values (1005, STR_TO_DATE('2022-8-15','%Y-%m-%d'), 1, '���̽� ö���Թ�', 103, '�ֿ켺');

select * from rent;

commit;