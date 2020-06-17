CREATE TABLE login_info (
user_name varchar2(20),
password varchar2(20));
	
INSERT INTO login_info VALUES ('spaceorphan', 'qwerty');
INSERT INTO login_info VALUES ('nincompoop', 'qazqaz');


CREATE TABLE product (
prod_id varchar2(30),
prod_name varchar2(30),
prod_category varchar2(30),
prod_price Number(30));

INSERT INTO product VALUES ('p001', 'Thors Hammer', 'Asgardian', 500000000);
INSERT INTO product VALUES ('p002', 'Iron Man Armour', 'Human', 50000000);
INSERT INTO product VALUES ('p003', 'Captains Sheild', 'Wakandan', 25000000);
INSERT INTO product VALUES ('p004', 'Meeras crown', 'Atalantian', 500000);
