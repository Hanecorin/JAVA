-- show databases;

-- USE playdata;

-- ��ɱ�� ������Ʈ
DROP TABLE IF EXISTS probono_project;

-- ��� �����
DROP TABLE IF EXISTS activist;

-- ��� ������
DROP TABLE IF EXISTS recipient;
 
-- ��ɱ�� ����
DROP TABLE IF EXISTS probono;



CREATE TABLE activist (
       activist_id          	VARCHAR(20)  PRIMARY KEY,
       name               	VARCHAR(20) NOT NULL,
       password         	VARCHAR(20) NOT NULL,
       major                	VARCHAR(50) NOT NULL
);

CREATE TABLE recipient (
       recipient_id        		VARCHAR(20) PRIMARY KEY,
       name                		VARCHAR(20) NOT NULL,
       password          		VARCHAR(20) NOT NULL,
       receiveHopeContent   VARCHAR(50) NOT NULL
);


CREATE TABLE probono (
       probono_id          	VARCHAR(50) PRIMARY KEY,
       probono_name      VARCHAR(50) NOT NULL,
       probono_purpose  	VARCHAR(200) NOT NULL
);

CREATE TABLE probono_project (
	   probono_project_id     		INT AUTO_INCREMENT PRIMARY KEY,
	   probono_project_name 		VARCHAR(50) NOT NULL,
       probono_id           			VARCHAR(50) NOT NULL,       
       activist_id          				VARCHAR(20) NOT NULL,
       recipient_id           				VARCHAR(20) NOT NULL, 
       project_content      			VARCHAR(100) NOT NULL
);

ALTER TABLE probono_project AUTO_INCREMENT = 10000;
ALTER TABLE probono_project ADD FOREIGN KEY (recipient_id) REFERENCES recipient  (recipient_id);
ALTER TABLE probono_project ADD FOREIGN KEY (activist_id)  REFERENCES activist  (activist_id);
ALTER TABLE probono_project ADD FOREIGN KEY (probono_id) REFERENCES probono  (probono_id);
