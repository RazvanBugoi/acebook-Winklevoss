-- This file must be named 'data.sql' and will be used to populate test database when using @Entity (JPA) for tests

-- This is seed data for users table
TRUNCATE TABLE "users" RESTART IDENTITY CASCADE;

INSERT INTO "users" ("username", "password", "enabled") VALUES
('Benjamin', 'helloworld78', 'true'),
('Chris', '12345678@', 'true'),
('Sophia', 'helloworld78', 'true'),
('Xiaoyu', 'tekkenrules99', 'true'),
('Walter White', 'ihatemywife123', 'true'),
('Timothy', 'timtamareyum123', 'true'),
('Dave The Rave', 'illegalusernamelul55', 'true'),
('Yasmin', 'QuEeNyAsMiN01', 'true'),
('Scarlet', 'istomponurcorpse777', 'true'),
('Aoife', 'itspronouncedeefa!!!', 'true'),
('Eoin', 'itspronouncedowen!!!', 'true'),
('Mario', 'itsamemario!', 'true');

-- This is seed data for friends table
TRUNCATE TABLE "friends" RESTART IDENTITY CASCADE;

INSERT INTO "friends" ("requester_id", "requestee_id", "request_status") VALUES
('1', '4', 'accepted'),
('1', '3', 'pending'),
('5', '6', 'blocked'),
('7', '8', 'accepted'),
('4', '12', 'accepted'),
('12', '9', 'pending'),
('5', '4', 'blocked'),
('8', '10', 'pending'),
('11', '1', 'accepted'),
('7', '12', 'accepted'),
('11', '10', 'pending'),
('1', '8', 'pending');

-- This is seed data for authorities table
TRUNCATE TABLE "authorities" RESTART IDENTITY CASCADE;

INSERT INTO "authorities" ("username", "authority") VALUES
('Benjamin', 'ROLE_USER'),
('Chris', 'ROLE_USER'),
('Sophia', 'ROLE_USER'),
('Xiaoyu', 'ROLE_USER'),
('Walter White', 'ROLE_USER'),
('Timothy', 'ROLE_USER'),
('Dave The Rave', 'ROLE_USER'),
('Yasmin', 'ROLE_USER'),
('Scarlet', 'ROLE_USER'),
('Aoife', 'ROLE_USER'),
('Eoin', 'ROLE_USER'),
('Mario', 'ROLE_USER');