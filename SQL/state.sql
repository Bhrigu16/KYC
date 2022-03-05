DROP TABLE IF EXISTS master.state;

CREATE TABLE master.state (
id integer NOT NULL primary key,
code integer NOT NULL UNIQUE,
version integer NOT NULL,
name character varying(255) NOT NULL,
census_code_2001 character varying(2) NOT NULL,
census_code_2011 character varying(4) NOT NULL,
state_ut_flag char(1) NOT NULL,
is_active boolean NOT NULL,
is_deleted boolean NOT NULL,
created_by bigint NOT NULL,
created_on timestamp without time zone NOT NULL,
updated_by bigint NOT NULL,
updated_on timestamp without time zone NOT NULL
);


insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(1,35,1,'ANDAMAN AND NICOBAR ISLANDS','35','35','U',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(2,28,2,'ANDHRA PRADESH','28','28','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(3,12,1,'ARUNACHAL PRADESH','12','12','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(4,18,1,'ASSAM','18','18','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(5,10,1,'BIHAR','10','10','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(6,4,1,'CHANDIGARH','04','04','U',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(7,22,1,'CHHATTISGARH','22','22','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(8,7,1,'DELHI','07','07','U',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(9,30,1,'GOA','30','30','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(10,24,1,'GUJARAT','24','24','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(11,6,1,'HARYANA','06','06','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(12,2,1,'HIMACHAL PRADESH','02','02','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(13,1,3,'JAMMU AND KASHMIR','01','01','U',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(14,20,1,'JHARKHAND','20','20','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(15,29,1,'KARNATAKA','29','29','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(16,32,1,'KERALA','32','32','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(17,37,1,'LADAKH','','00','U',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(18,31,1,'LAKSHADWEEP','31','31','U',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(19,23,1,'MADHYA PRADESH','23','23','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(20,27,1,'MAHARASHTRA','27','27','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(21,14,1,'MANIPUR','14','14','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(22,17,1,'MEGHALAYA','17','17','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(23,15,1,'MIZORAM','15','15','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(24,13,1,'NAGALAND','13','13','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(25,21,1,'ODISHA','21','21','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(26,34,1,'PUDUCHERRY','34','34','U',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(27,3,1,'PUNJAB','03','03','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(28,8,1,'RAJASTHAN','08','08','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(29,11,1,'SIKKIM','11','11','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(30,33,1,'TAMIL NADU','33','33','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(31,36,1,'TELANGANA','','00','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(32,38,1,'THE DADRA AND NAGAR HAVELI AND DAMAN AND DIU','38','38','U',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(33,16,1,'TRIPURA','16','16','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(34,5,1,'UTTARAKHAND','05','05','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(35,9,1,'UTTAR PRADESH','09','09','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
insert into master.state (id, code,version, name, census_code_2001, census_code_2011,state_ut_flag,is_active, is_deleted, created_by, created_on, updated_by, updated_on) values(36,19,1,'WEST BENGAL','19','19','S',true,false,1,'2016-04-11 05:30:00',1,'2016-04-11 05:30:00');
