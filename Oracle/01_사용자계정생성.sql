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