-- 회원테이블
CREATE TABLE shopmember (
	userid 		VARCHAR2(20) PRIMARY KEY,
	password	VARCHAR2(20) NOT NULL,
	username	VARCHAR2(20) NOT NULL,
	address		VARCHAR2(100),
	phone		VARCHAR2(50)
);

COMMENT ON COLUMN shopmember.userid IS '회원 아이디';
COMMENT ON COLUMN shopmember.password IS '비밀번호';
COMMENT ON COLUMN shopmember.username IS '이름';
COMMENT ON COLUMN shopmember.address IS '주소';
COMMENT ON COLUMN shopmember.phone IS '전화번호';


-- 상품 정보 테이블
CREATE TABLE book (
	bookcode	NUMBER 			PRIMARY KEY,
	title		VARCHAR2(50)	NOT NULL,
	price		NUMBER			DEFAULT 0,
	quantity	NUMBER			DEFAULT 0
);

COMMENT ON COLUMN book.bookcode IS '상품일련번호';
COMMENT ON COLUMN book.title IS '책 제목';
COMMENT ON COLUMN book.price IS '상품 단가';
COMMENT ON COLUMN book.quantity IS '재고 수량';


-- 판매 정보 테이블
CREATE TABLE sale (
	userid			VARCHAR2(20)	NOT NULL,
	bookcode		NUMBER			NOT NULL,
	purchasecnt		NUMBER			DEFAULT 0,
	purchasedate	DATE			DEFAULT SYSDATE
);

COMMENT ON COLUMN sale.userid IS '구매자 아이디';
COMMENT ON COLUMN sale.bookcode IS '구매 상품 번호';
COMMENT ON COLUMN sale.purchasecnt IS '구매 수량';
COMMENT ON COLUMN sale.purchasedate IS '구매 날짜';


-- 관심 상품 테이블
CREATE TABLE wishlist (
	userid		VARCHAR(20)		NOT NULL,
	bookcode	NUMBER			NOT NULL
);

COMMENT ON COLUMN wishlist.userid IS '회원 아이디';
COMMENT ON COLUMN wishlist.bookcode IS '상품 번호';

CREATE SEQUENCE bookseq;

INSERT INTO book(bookcode, title, price, quantity) VALUES (bookseq.nextVal, 'Java 1.9 따라하기', 10000, 10);
INSERT INTO book(bookcode, title, price, quantity) VALUES (bookseq.nextVal, 'C로 배우는 자료구조', 12000, 10);
INSERT INTO book(bookcode, title, price, quantity) VALUES (bookseq.nextVal, 'HTML5_CSS3', 9000, 10);
INSERT INTO book(bookcode, title, price, quantity) VALUES (bookseq.nextVal, '자바 디자인 패턴', 15000, 10);
INSERT INTO book(bookcode, title, price, quantity) VALUES (bookseq.nextVal, '안드로이드 프로그래밍', 20000, 10);

commit;