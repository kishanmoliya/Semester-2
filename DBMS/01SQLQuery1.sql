CREATE TABLE Deposit
(Actno INT,Cname VARCHAR(50),Bname VARCHAR(50),Amount DECIMAL(8,2),Adate DATETIME)

CREATE TABLE Branch
(Bname VARCHAR(50),City VARCHAR(50))

CREATE TABLE Customers
(Cname VARCHAR(50),City VARCHAR(50))

CREATE TABLE Borrow
(Loanno INT,Cname VARCHAR(50),Bname VARCHAR(50),Amount DECIMAL(8,2))

--Insert the data into tables using Query as shown below.

--deposit--
INSERT INTO Deposit 
VALUES(101,'anil','vrce',1000,'1/mar/95')
INSERT INTO Deposit 
VALUES(102,'sunil','ajni',5000,'4/jan/96')
INSERT INTO Deposit 
VALUES(103,'mehul','karolbagh',3500,'17/nov/95')
INSERT INTO Deposit 
VALUES(104,'madhuri','chandi',1200,'17/dec/95')
INSERT INTO Deposit 
VALUES(105,'prmod','m.g.road',3000,'27/mar/96')
INSERT INTO Deposit 
VALUES(106,'sandip','andheri',2000,'31/mar/96')
INSERT INTO Deposit 
VALUES(107,'shivani','virar',1000,'5/sep/95')
INSERT INTO Deposit 
VALUES(108,'kranti','nehru place',5000,'2/jul/95')
INSERT INTO Deposit 
VALUES(109,'minu','powai',7000,'10/aug/95')

--branch--
INSERT INTO Branch 
VALUES('vrce','nagpur')
INSERT INTO Branch 
VALUES('ajni','nagpur')
INSERT INTO Branch 
VALUES('karolbagh','delhi')
INSERT INTO Branch 
VALUES('chandi','delhi')
INSERT INTO Branch 
VALUES('dharampeth','nagpur')
INSERT INTO Branch 
VALUES('m.g.road','banglore')
INSERT INTO Branch 
VALUES('andheri','bombay')
INSERT INTO Branch 
VALUES('virar','bombay')
INSERT INTO Branch 
VALUES('nehru place','delhi')
INSERT INTO Branch 
VALUES('powai','bombay')

--customers--
INSERT INTO Customers 
VALUES('anil','culcutta')
INSERT INTO Customers 
VALUES('sunil','dehi')
INSERT INTO Customers 
VALUES('mehul','baroda')
INSERT INTO Customers 
VALUES('mandar','patna')
INSERT INTO Customers 
VALUES('madhuri','nagpur')
INSERT INTO Customers 
VALUES('prmod','nagpur')
INSERT INTO Customers 
VALUES('sandip','surat')
INSERT INTO Customers 
VALUES('shivani','bombay')
INSERT INTO Customers 
VALUES('kranti','bombay')
INSERT INTO Customers 
VALUES('naren','bombay')

--borrow--
INSERT INTO Borrow 
VALUES(201,'anil','vrce',1000)
INSERT INTO Borrow 
VALUES(206,'mehul','ajni',5000)
INSERT INTO Borrow 
VALUES(311,'sunil','dharampeth',3000)
INSERT INTO Borrow 
VALUES(321,'madhuri','andheri',2000)
INSERT INTO Borrow 
VALUES(375,'prmod','virar',8000)
INSERT INTO Borrow 
VALUES(481,'kranti','nehru place',3000)


--> 2.1 <--

Select * from Deposit

Select * from Borrow

Select * from Customers

Select actno,cname,amount from Deposit

Select loanno,amount from Borrow

Select loanno from Borrow
Where bname='Andheri'

Select actno,amount from Deposit
Where actno=106

Select cname from Borrow
Where amount>5000

Select cname from Deposit
Where adate>'1991-12-01'

Select cname from Deposit
Where actno<105

Select cname from Customers
where city='nagpur'
or  city='delhi'
/*where city in('najpur','delhi')*/

Select cname,bname from Deposit
Where amount>4000
and   Actno<105

Select cname from Borrow
Where amount>=3000
or	  amount<=8000
/*where amount between 3000 and 8000*/

Select cname from Borrow
Where bname!='andheri'
/*where bname<>'andheri'*/

Select cname from Borrow
Where Amount is null
 
Select actno,cname,amount from Deposit
Where bname in('ajni','karolbagh','m.g.road')
and actno<104

Select top 5 * from Deposit

Select top 3 * from Deposit
Where amount>1000

Select top 5 loanno,cname from Borrow
Where bname!='andhhei'

Select distinct city from Customers

Select distinct city from Branch

Select * from Customers order by city asc

Select * from Deposit order by Amount asc	/*order by amount desc*/

Select * from Customers order by city desc

Select * from Customers

Select cname as uni_barrowers from Borrow



--> 2.2 <--



Update Deposit Set Amount = 5000
Where Amount = 3000

Update Borrow Set Bname = 'C.G.Road'
Where Bname = 'Vrce'
and Cname = 'Anil'

Update Deposit Set Amount = 5000 , Actno = 111
Where Cname = 'Sandip'

Update Borrow Set Amount = Amount+(Amount*0.1)

Update Deposit Set Amount =5000
Where Actno>103
and Actno<107

Update Borrow Set Amount = Null
Where Loanno = 321

Update Borrow Set Loanno = 401 , Bname = 'Ajni'
Where Loanno = 201 
And Bname = 'Vrce'

Update Customers Set Cname = 'Anil Jain'
Where Cname = 'Anil'

Update Deposit Set Cname = 'Remesh' , Bname = 'Vrce' , Amount = 5500
Where Actno = 102

Update Borrow Set Bname = 'NUll' , Amount = Null
Where Loanno = 481
And Bname ='Kranti'



--> 2.3 <--


Delete From Customers
Where City = 'Bombay'

Delete From Deposit
Where Amount <= 1000

Delete From Borrow
Where Bname = 'Ajni'

Delete From Borrow
Where Loanno > 201
And Loanno < 210

Delete From Deposit
Where Adate > '1996-12-01'

Truncate Table Customers

Delete From Deposit
Where Cname = 'Anil' 
And Actno = 101

Delete From Deposit
Where Bname <> 'Andheri'

Delete From Borrow 
Where Loanno < 2000
And Bname <> 'Vrce'

Drop Table Branch













