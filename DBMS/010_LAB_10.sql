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


Select 
	Student.Branch,AVG(SPI)
From Student
Inner Join Result
On Student.RNo=Result.RNo
Group by Branch
Order by avg(SPI) desc


Select 
	Student.Branch,AVG(SPI)
From Student
Inner Join Result
On Student.RNo=Result.RNo
Where Branch In ('CE','ME')
Group By Branch


Select *
	From Student
	Left Outer Join Result
On Student.RNo=Student.RNO
	

Select *
	From Student
	Right Outer Join Result
On Student.RNo=Student.RNO

Select *
	From Student
	Full Outer Join Result
On Student.RNo=Student.RNO


Select 
	E.Name,
	M.Name
From Employee E
Right Outer Join Employee M
On E.EmployeeNo=M.ManagerNo

<----------//////\\\\\\---------->


Create Table City
(
	CityId int Primary Key Identity(1,1),
	CityName Varchar(50) Unique,
	Pincode Varchar(6),
	Remarks Varchar(250)
)

Create Table Village
(
	VillageId int Primary Key Identity(101,1),
	VillageName VArchar(50),
	CityId int Foreign Key References City(CityId)
)


Insert Into City Values('Rajkot','360005','Good')
Insert Into City Values('Surat','335009','VeryGood')
Insert Into City Values('Baroda','390001','Awesome')
Insert Into City Values('Jamnager','361003','Smart')
Insert Into City Values('Junagath','362229','Historic')
Insert Into City Values('Morvi','363641','Ceramic')

Insert Into Village Values('Raiya','1')
Insert Into Village Values('Madhapar','1')
Insert Into Village Values('Dodka','3')
Insert Into Village Values('Falla','4')
Insert Into Village Values('Bhesan','5')
Insert Into Village Values('Dhoraji','5')