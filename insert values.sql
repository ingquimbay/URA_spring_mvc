INSERT INTO address (street, city, state, zip_code)
VALUES
	('622 E. Pennsylvania Ave.','Ankeny','IA','50023'),
	('27 Mayfair St.','Romeoville','IL','60446'),
	('32 East Spring Dr.','Sugar Land','TX','77478'),
    ('5 Hill Road','Massillon','OH','44646'),
    ('569 Fawn St.','Cartersville','GA','30120');
    
INSERT INTO user (first_name, last_name, email, phone_number, address_id)
VALUES
	('Monty','Widenius','mwidenius@mysql.org','325-503-8589',1),
	('Satoshi','Nakamoto','snakamoto@bc.com','223-407-2308',2),
	('Gabriel','Garcia','ggarcia@macondo.com','214-771-3997',3),
    ('Mary','Cassatt','mcassatt@gmail.com','930-932-3378',4),
    ('Judy','Garland','jgarland@oz.com','515-590-0495',5);