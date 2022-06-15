----> Date Function <----

Select GETDATE()

Select GETDATE()+365

Select CONVERT(Varchar(20),GETDATE())

Select CONVERT(Varchar(20),GETDATE(),106)

Select CONVERT(Varchar(20),GETDATE(),7)

Select DATEDIFF(MONTH,'2008-dec-31','2009-mar-31')

Select DATEDIFF(YEAR,'2010-sep-10','2012-jan-25')

Select DATEDIFF(HOUR,'2012-jan-25 7:00','2012-jan-26 10:30')

Select DAY('2016-05-12'),MONTH('2016-05-12'),YEAR('2016-05-12')

Select DATEADD(YEAR,5,GETDATE())

Select DATEADD(MONTH,-2,GETDATE())

Select DATENAME(MONTH,GETDATE())
Select DATEPART(MONTH,GETDATE())

Select EOMONTH(GETDATE())

Select DATEADD(DAY,30,GETDATE())

Select DAtEDIFF(YEAR,'2003-06-30',GETDATE())
Select DAtEDIFF(MONTH,'2003-06-30',GETDATE())
Select DAtEDIFF(DAY,'2003-06-30',GETDATE())




Create table Student_Marks
(
	Sid int,
	SName Varchar(50),
	Marks int
)

Insert Into Student_Marks Values(1,'John',90)
Insert Into Student_Marks Values(2,'Martin',80)
Insert Into Student_Marks Values(3,'Carol',89)
Insert Into Student_Marks Values(4,'Jack',99)
Insert Into Student_Marks Values(5,'Rose',88)
Insert Into Student_Marks Values(6,'Mary',90)

Select COUNT(*) As TotalStudent From Student_Marks

Select SUM(Marks) As TotalMarks From Student_Marks

Select AVG(Marks) As AvgMarks From Student_Marks

Select MIN(Marks) As MinMarks From Student_Marks

Select MAX(Marks) As axMarks From Student_Marks