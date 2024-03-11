

drop table board;
drop table member;
drop table avatar;
-- avatar 테이블
DROP TABLE AVATAR;
CREATE TABLE avatar(
    ano NUMBER(2)
        CONSTRAINT AVT_NO_PK PRIMARY KEY,
    filename VARCHAR2(300 CHAR)
        CONSTRAINT AVT_FNAME_UK UNIQUE
        CONSTRAINT AVT_FNAME_NN NOT NULL,
    dir VARCHAR2(300 CHAR) DEFAULT '/img/avatar/'
        CONSTRAINT AVT_DIR_NN NOT NULL,
    len NUMBER,
    gen CHAR(1) 
        CONSTRAINT AVT_GEN_CK CHECK(gen IN('F', 'M'))
        CONSTRAINT AVT_GEN_NN NOT NULL,
    isshow CHAR(1) DEFAULT 'Y'
        CONSTRAINT AVT_SHOW_CK CHECK(isshow IN('Y', 'N'))
        CONSTRAINT AVT_SHOW_NN NOT NULL
);


-- 데이터 추가
INSERT INTO 
    avatar(ano, filename, gen)
VALUES(
    11, 'img_avatar1.png', 'M'
);

INSERT INTO 
    avatar(ano, filename, gen)
VALUES(
    12, 'img_avatar2.png', 'M'
);

INSERT INTO 
    avatar(ano, filename, gen)
VALUES(
    13, 'img_avatar3.png', 'M'
);

INSERT INTO 
    avatar(ano, filename, gen)
VALUES(
    21, 'img_avatar4.png', 'F'
);

INSERT INTO 
    avatar(ano, filename, gen)
VALUES(
    22, 'img_avatar5.png', 'F'
);

INSERT INTO 
    avatar(ano, filename, gen)
VALUES(
    23, 'img_avatar6.png', 'F'
);


-- 회원정보테이블
CREATE TABLE member(
    mno NUMBER(4) 
        CONSTRAINT MEMB_NO_PK PRIMARY KEY,
    name VARCHAR2(15 CHAR)
        CONSTRAINT MEMB_NAME_NN NOT NULL,
    id VARCHAR2(10 CHAR)
        CONSTRAINT MEMB_ID_UK UNIQUE
        CONSTRAINT MEMB_ID_NN NOT NULL,
    pw VARCHAR2(12 CHAR)
        CONSTRAINT MEMB_PW_NN NOT NULL,
    mail VARCHAR2(30 CHAR)
        CONSTRAINT MEMB_MAIL_UK UNIQUE
        CONSTRAINT MEMB_MAIL_NN NOT NULL,
    tel VARCHAR2(13 CHAR)
        CONSTRAINT MEMB_TEL_UK UNIQUE
        CONSTRAINT MEMB_TEL_NN NOT NULL,
    joinDate DATE DEFAULT SYSDATE
        CONSTRAINT MEMB_DATE_NN NOT NULL,
    gen CHAR(1) 
        CONSTRAINT MEMB_GEN_CK CHECK(gen IN ('F', 'M'))
        CONSTRAINT MEMB_GEN_NN NOT NULL,
    avatar NUMBER(2)
        CONSTRAINT MEMB_AVT_NN NOT NULL,
    isshow CHAR(1) DEFAULT 'Y'
        CONSTRAINT MEMB_SHOW_CK CHECK (isshow IN ('Y', 'N'))
        CONSTRAINT MEMB_SHOW_NN NOT NULL
);

-- 회원추가
INSERT INTO
    member(mno, name, id, pw, mail, tel, gen, avatar)
VALUES(
    (SELECT NVL(MAX(mno) + 1, 1001) FROM member),
    '김제니', 'jennie', '12345', 'jennie@human.com', '010-1212-1212', 'F', 15
);

INSERT INTO
    member(mno, name, id, pw, mail, tel, gen, avatar, joindate)
VALUES(
    1000,
    '전은석', 'euns', '12345', 
    'euns@human.com', '010-0000-0000', 'M', 12,
    sysdate
);


CREATE TABLE board(
    bno NUMBER(6)
        CONSTRAINT BRD_NO_PK PRIMARY KEY,
    title VARCHAR2(50 CHAR)
        CONSTRAINT BRD_TITLE_NN NOT NULL,
    body VARCHAR2(4000)
        CONSTRAINT BRD_BD_NN NOT NULL,
    writer NUMBER(4)
        CONSTRAINT BRD_MNO_FK REFERENCES member(mno)
        CONSTRAINT BRD_MNO_NN NOT NULL,
    wdate DATE DEFAULT sysdate
        CONSTRAINT BRD_DATE_NN NOT NULL,
    views NUMBER(5) DEFAULT 0
        CONSTRAINT BRD_VIEW_NN NOT NULL,
    isshow CHAR(1) DEFAULT 'Y'
        CONSTRAINT BRD_SHOW_CK CHECK (isshow IN ('Y', 'N'))
        CONSTRAINT BRD_SHOW_NN NOT NULL
);


