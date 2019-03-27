--Delete previous tables
DROP TABLE Entity;

create table Entity
(
	ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	name VARCHAR(50),
);

-- Insert sample records
insert into Entity (name) VALUES ('entity 1');
insert into Entity (name) VALUES ('entity 2');
insert into Entity (name) VALUES ('entity 3');
insert into Entity (name) VALUES ('entity 4');
