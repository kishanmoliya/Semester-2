Insert into Student Values(101,'Raju','CE')
Insert into Student Values(102,'Amit','CE')
Insert into Student Values(103,'Sanjay','ME')
Insert into Student Values(104,'Neha','EC')
Insert into Student Values(105,'Meera','EE')
Insert into Student Values(106,'Mahesh','ME')

Insert Into Result Values(101,8.8)
Insert Into Result Values(102,9.2)
Insert Into Result Values(103,7.6)
Insert Into Result Values(104,8.2)
Insert Into Result Values(105,7.0)
Insert Into Result Values(107,8.9)

Insert Into Employee Values('E01','Tarun',null)
Insert Into Employee Values('E02','Rohan','E02')
Insert Into Employee Values('E03','Priya','E01')
Insert Into Employee Values('E04','Milan','E03')
Insert Into Employee Values('E05','Jay','E01')
Insert Into Employee Values('E06','Anjana','E04')

Select *
	From Student
	Cross Join Result

Select 
	Student.RNo,
	Student.Name,
	Student.Branch,
	Result.SPI
From Student
Inner Join Result
On Student.RNo=Result.RNo
Where Branch='CE'

Select 
	Student.RNo,
	Student.Name,
	Student.Branch,
	Result.SPI
From Student
Inner Join Result
On Student.RNo=Result.RNo
Where Branch='CE'

Select 
	Student.Branch,AVG(SPI)
From Student
Inner Join Result
On Student.RNo=Result.RNo
Group by Branch