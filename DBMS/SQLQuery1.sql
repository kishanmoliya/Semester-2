Create Table Deposit
(
	Actno INt,
	Cname Varchar(50),
	Bname Varchar(50),
	Amount Decimal(8,2),
	Adate Datetime
);

Create Table Branch
(
	Bname Varchar(50),
	City Varchar(50)
);

Create Table Customers
(
	Cname Varchar(50),
	City Varchar(50)
);

Create Table Borrow
(
	Loanno Int,
	Cname Varchar(50),
	Bname Varchar(50),
	Amount Decimal(8,2)
);


Insert Into Deposit values(101,'Anil','Vrce',1000,'1995-03-01')
Insert Into Deposit values(102,'Sunil','Ajni',5000.00,'1996-01-04')
Insert Into Deposit values(103,'Mehul','Karolbagh',3500.00,'1995-11-17')
Insert Into Deposit values(104,'Mahul','Chandi',1200.00,'1995-12-17')
Insert Into Deposit values(105,'Prmod','M.G.Road',3000.00,'1996-03-27')
Insert Into Deposit values(106,'Sandip','Andheri',2000.00,'1996-03-31')
Insert Into Deposit values(107,'Shivani','Virar',1000.00,'1995-09-05')
Insert Into Deposit values(108,'Kranti','NehruPlace',5000.00,'1995-07-02')
Insert Into Deposit values(109,'Minu','Powai',7000.00,'1995-08-10')


Select * From Deposit

Insert Into Branch values('Vrce','Nagpur')
Insert Into Branch values('Ajni','Nagpur')
Insert Into Branch values('Karolbagh','Delhi')
Insert Into Branch values('Chandi','Delhi')
Insert Into Branch values('Dharrampeth','Nagpur')
Insert Into Branch values('M.G>Road','Banglore')
Insert Into Branch values('Andheri','Bombay')
Insert Into Branch values('Virar','Bombay')
Insert Into Branch values('NehruPlace','Delhi')
Insert Into Branch values('Powai','Bombay')

Select * From Branch


Insert Into Customers values('Anil','Calcutta')
Insert Into Customers values('Sunil','Delhi')
Insert Into Customers values('Mehul','Baroda')
Insert Into Customers values('Mandar','Patna')
Insert Into Customers values('Madhuri','Nagpur')
Insert Into Customers values('Pramod','Nagpur')
Insert Into Customers values('Sandip','Surat')
Insert Into Customers values('Shivani','Bombay')
Insert Into Customers values('Kranti','Bombay')
Insert Into Customers values('Naren','Bombay')

Select * From Customers



Insert Into Borrow values(201,'Anil','Varce',1000)
Insert Into Borrow values(206,'Mehul','Ajni',5000)
Insert Into Borrow values(311,'Sunil','Dharanpeth',3000)
Insert Into Borrow values(321,'Madhuri','Andheri',2000)
Insert Into Borrow values(375,'Pramod','Virar',8000)
Insert Into Borrow values(481,'Kranti','NehruPlace',2000)

Select * From Borrow

Select Actno,Cname,Amount From Deposit

Select Loanno,Amount From Borrow

Select * From Borrow Where Bname='Andheri'
