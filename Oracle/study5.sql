-- 1
CREATE TABLE TB_CATEGORY(
       NAME VARCHAR2(10),
       USE_YN CHAR(1) DEFAULT 'Y'
);

-- 2
CREATE TABLE TB_CLASS_TYPE(
       NO VARCHAR2(5) PRIMARY KEY,
       NAME VARCHAR2(10) 
);