-- ����� ���� �����ϴ� ���� : ������ �������� �� �� �ִ� ����
-- [ǥ����] CREATE USER ������ IDENTIFIED BY ��й�ȣ;
CREATE USER kh IDENTIFIED BY kh;

-- ������ ������� ����� �������� �ּ����� ����(�����Ͱ���, ����) �ο�
-- [ǥ����] GRANT ���� 1, ���� 2, ... TO ������;
-- RESOURCE�� ��ü(����, ����, ����), ������(�Է�, ����, ��ȸ, ����) ���� 
-- CONNECT ������ ������ �ش� ������ ������ ���� ����
GRANT RESOURCE, CONNECT TO kh;

-- TABLESPACE�� ���� ���� �ο�
GRANT UNLIMITED TABLESPACE TO kh;

-- DDL 관련 계정
CREATE USER study IDENTIFIED by study;
GRANT RESOURCE, CONNECT TO study;
GRANT UNLIMITED TABLESPACE TO study;

-- DDL 관련 계정
CREATE USER ddl IDENTIFIED by ddl;
GRANT RESOURCE, CONNECT TO ddl;
GRANT UNLIMITED TABLESPACE TO ddl;

CREATE USER jdbc IDENTIFIED BY jdbc;
GRANT RESOURCE, CONNECT TO jdbc;
GRANT UNLIMITED TABLESPACE TO jdbc;

CREATE USER youtube IDENTIFIED BY youtube;
GRANT RESOURCE, CONNECT TO youtube;
GRANT UNLIMITED TABLESPACE TO youtube;