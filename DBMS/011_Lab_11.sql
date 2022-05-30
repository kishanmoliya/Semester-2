Create Table Student2
(
	Rno int,
	Name Varchar(50),
	City Varchar(50),
	Did int
);

Create Table Academic 
(
	Rno int,
	SPI Decimal(4,2),
	Bklog int
);

Create Table Department
(
	Did int,
	DName Varchar(50)
);



insert into Student2 values(101,'raju','rajkot',10)
insert into Student2 values(102,'amit','ahmedabad',20)
insert into Student2 values(103,'sanjay','baroda',40)
insert into Student2 values(104,'neha','rajkot',20)
insert into Student2 values(105,'meera','ahmedabad',30)
insert into Student2 values(106,'mahesh','baroda',10)

insert into Academic values(101,'8.8',0)
insert into Academic values(102,'9.2',2)
insert into Academic values(103,'7.6',1)
insert into Academic values(104,'8.2',4)
insert into Academic values(105,'7.0',2)
insert into Academic values(106,'8.9',3)

insert into Department values(10,'computer')
insert into Department values(20,'electrical')
insert into Department values(30,'mechanical')
insert into Department values(40,'civil')

1.  Select * From Student2 Where Did =
    (Select Did From Department Where DName = 'Computer')

2.  Select Name From Student2 Where Rno IN
    (Select Rno From Academic Where Spi>8)

3.  Select * From Student2 Where City = 'Rajkot' And Did =
	(Select Did From Department Where DName = 'Computer')

4.  Select COUNT(*) From Student2 Where Did IN
	(Select Did From Department Where DName = 'Electrical')

5.  Select Name From Student2 Where Rno In
        (Select Rno From Academic Where SPI In
         Select MAX(SPI) From Academic))

6.  Select Name From Student2 Where Rno IN
	(Select Rno From Academic Where Bklog>1)

7.  Select Name From Student2 Where Rno IN
        (Select Rno From Academic Where SPI In
         (Select MAX(SPI) From Academic Where SPI<(Select MAX(SPI) From Academic)))

8.  Select Name From Student2 Where Did In
	(Select Did From Department Where Dname IN('Computer','Mechanical'))

9.  Select Name From Student2 Where Did In
        (Select Did From Student2 Where Rno=102)


10. Select Name From Student2 Where Rno IN
	(Select Rno From Academic Where SPI>9)
	(Select Did From Department Where Dname = 'Electrical')
