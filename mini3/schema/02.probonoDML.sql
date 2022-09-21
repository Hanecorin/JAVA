--use playdata;

delete from activist;
delete from recipient;
delete from probono;
delete from probono_project;


-- activist insert[��� ����� ����]
insert into activist values('giver1', '���ǻ�', 'gp1', 'dermatology');
insert into activist values('giver2', '���帮', 'gp2', 'culture');
insert into activist values('giver3', 'Ű�ٸ�', 'gp3', 'mentor');

SELECT * FROM activist;
 
-- recipient insert[��� ������ ����]
insert into recipient values('receivePeople1', '��������', 'rp1', '������ ġ��');
insert into recipient values('receivePeople2', '����ȭ', 'rp2', '���� ġ��');
insert into recipient values('receivePeople3', '������', 'rp3', '�ɸ� ���');

SELECT * FROM recipient;

-- probono insert[��ɱ�� ���� ����]
insert into probono values('schweitzer', '������ó ������Ʈ', '�ǻ�, ���ǻ�, ���ǻ���� �Ƿ� Ȱ�� �� �Ŀ� �� �Ƿ�, ����, �ǰ��� ���õ� �о�');
insert into probono values('audreyHepbun', '���巹�ݹ� ������Ʈ', '������, ��ȭ���� ���α׷� ����, ���ä����� �� ��ȸ����, �̿�,ȯ�� ķ���� �� ��ȭ���������� �о�');
insert into probono values('daddyLongLegs', 'Ű�ٸ������� ������Ʈ', '�Ῥ, ���, ����, �������н����� �� ������ȸ ����, ��������, �ɸ���� �� ���丵, ���, ����, �Ῥ�о�');

SELECT * FROM probono;

-- probono_project insert[��� ��� ������Ʈ ����]
insert into probono_project (probono_project_name, probono_id, activist_id, recipient_id, project_content) values('������ó ������Ʈ', 'schweitzer', 'giver1', 'receivePeople1', '������ ���� ġ��');
insert into probono_project (probono_project_name, probono_id, activist_id, recipient_id, project_content) values('���帮�ݹ� ������Ʈ', 'audreyHepbun', 'giver2', 'receivePeople2', '��������');
insert into probono_project (probono_project_name, probono_id, activist_id, recipient_id, project_content) values('Ű�ٸ������� ������Ʈ', 'schweitzer', 'giver3', 'receivePeople3', '���б�����');

SELECT * FROM probono_project;


commit;