insert into curso (nombre) values ('1A');
insert into curso (nombre) values ('1B');
insert into curso (nombre) values ('2A');
insert into curso (nombre) values ('2B');
insert into curso (nombre) values ('3A');
insert into curso (nombre) values ('3B');
insert into plan (nombre) values ('P2023-2024-1A');
insert into plan (nombre) values ('P2023-2024-1B');
insert into plan (nombre) values ('P2023-2024-2A');
insert into plan (nombre) values ('P2023-2024-2B');
insert into plan (nombre,FK_CURSO) values ('P2023-2024-3A','1A');
insert into plan (nombre,FK_CURSO) values ('P2023-2024-3B','1B');
insert into tutor (nombre,email) values ('Marcos','marcos@educastur.org');
insert into tutor (nombre,email) values ('Javier','javier@educastur.org');
insert into tutor (nombre,email,plan) values ('Maria','maria@educastur.org',3);
insert into tutor (nombre,email,plan) values ('Marta','marta@educastur.org',4);
insert into tutor (nombre,email,plan) values ('Pedro','pedro@educastur.org',5);
insert into tutor (nombre,email,plan) values ('Lucia','lucia@educastur.org',6);


insert into actividad (id,obligatoria,nombre,descripcion) values (1,false,'ALAS','Asfsfdaff');
insert into actividad (id,obligatoria,nombre,descripcion) values (2,false,'BBBB','BBBBBBBBBB');
insert into actividad (id,obligatoria,nombre,descripcion) values (3,true,'ZAR','ZARRRRRRRRR');


insert into enmarca (id,plan,actividad,fecha) values (1,1,1,'20-10-2024');
insert into enmarca (id,plan,actividad,fecha) values (2,2,2,'1-05-2024');
insert into enmarca (id,plan,actividad,fecha) values (3,3,3,'12-03-2024');