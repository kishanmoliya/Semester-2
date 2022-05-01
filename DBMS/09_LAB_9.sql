--------------- SET OPERATORS --------------

Create Table Computer
(
	RollNo int,
	Name varchar(50)
);

Create Table Electrical
(
	RollNo int,
	Name varchar(50)
);




---- Records ----

Insert into Computer values (101, 'Ajay')
Insert into Computer values (109, 'Haresh')
Insert into Computer values (115, 'Manish')


Insert into Electrical values (105, 'Ajay')
Insert into Electrical values (107, 'Mahesh')
Insert into Electrical values (115, 'Manish')


-------------------------------------------------------------

1.	Select Name from Computer
	Union
	Select Name from Electrical


2.	Select Name from Computer
	Union all
	Select Name from Electrical


3.	Select Name from Computer
	Intersect
	Select Name from Electrical


4.	Select Name from Computer
	Except
	Select Name from Electrical
	

5.	Select Name from Electrical
	Except
	Select Name from Computer


6.	Select * from Computer
	Union
	Select * from Electrical


7.	Select * from Computer
	Intersect
	Select * from Electrical


Create Table Cricket
(
	Name Varchar(50),
	City Varchar(50),
	Age int
);

Insert Into Cricket Values('Sachin Tendulkar','Mumbai',30)
Insert Into Cricket Values('Rahul Dravid','Bombay',35)
Insert Into Cricket Values('M.s.Dhoni','Jharkhand',31)
Insert Into Cricket Values('Suresh Raina','Gujarat',30)

Select * Into World_Cup From Cricket

Select Name,City Into T20 From Cricket
Where 1 = 2

Select * Into IPL From Cricket
Where 1 = 2

Insert Into IPL 
Select * From Cricket
Where Name Like '_A_____'

Truncate Table TPL

Delete From Cricket
Where City = 'JarKhand'

Sp_Rename 'IPL','IPL2018'

Drop Table T20
