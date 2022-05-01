Create Table Student4
(
	 Rno int,
	 Name Varchar(50),
	 Branch Varchar(50),
	 Spi Decimal(4,2),
	 Bklog int
);

insert into Student4 values(101,'raju','ce','8.80',0)
insert into Student4 values(102,'amit','ce','2.20',3)
insert into Student4 values(103,'sanjay','me','1.50',6)
insert into Student4 values(104,'neha','ec','7.65',1)
insert into Student4 values(105,'meera','ee','5.52',2)
insert into Student4 values(106,'mahesh','ec','4.50',3)


Create View Personal
AS
Select * From Student4
Select * From Personal