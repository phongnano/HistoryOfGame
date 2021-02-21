create table Catalogs (
    idcata      int         primary key ,
    namecata    varchar(30)             
);

create table Questions (
    question    varchar(500)            ,
    key_a       varchar(250)            ,
    key_b       varchar(250)            ,
    key_c       varchar(250)            ,
    key_d       varchar(250)            ,
    key_correct int                     ,
    idcata      int                     ,
    foreign key (idcata) references Catalogs (idcata)
);

insert into Catalogs 
values (0, 'Việt Nam');
insert into Catalogs 
values (1, 'Đông Nam Á');

insert into Questions
values ('30-04-1975 kỷ niệm sự kiện gì trong chiến tranh Việt Nam?', 'Việt Nam thống nhất đất nước', 'Ký kết hiệp định Paris', 'Tổng thống Ngô Đình Diệm bị ám sát', 'Hòa thượng thích Quảng Đức tự thiêu', 1, 0);
insert into Questions
values ('Sài Gòn đổi tên thành TPHCM vào năm nào?', '1975', '1976', '1977', '1978', 2, 0);
insert into Questions
values ('Chiến tranh biên giới phía bắc giữa Việt Nam và Trurng Quốc bắt đầu vào tháng mấy năm 1979?', 'Tháng 2', 'Tháng 3', 'Tháng 4', 'Tháng 5', 1, 0);

insert into Questions
values ('ASEAN được thành lập năm nào?', '1966', '1969', '1967', '1962', 3, 1);
insert into Questions
values ('Đâu là một trong những quốc gia tham gia sáng lập?', 'Brunei', 'Campuchia', 'Vietnam', 'Thailand', 4, 1);
insert into Questions
values ('Đế chế Angkor thuộc quốc gia nào?', 'Malaysia', 'Indonesia', 'Lào', 'Campuchia', 4, 1);

select ques.QUESTION, ques.KEY_CORRECT
from CATALOGS cata, QUESTIONS ques 
where cata.IDCATA = ques.IDCATA and ques.KEY_CORRECT = 1
order by random() offset 0 rows fetch next 1 row only;

select ques.QUESTION, ques.KEY_CORRECT from CATALOGS cata, QUESTIONS ques where cata.IDCATA = ques.IDCATA and cata.IDCATA = 1
order by random() offset 0 rows fetch next 1 row only;

select QUESTION from QUESTIONS order by random() offset 0 rows fetch first 1 rows only;