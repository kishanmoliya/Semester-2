Create Table Employee2
(
	Eid int, 
	Ename Varchar(50),
	Department Varchar(50),
	Salary Decimal(8,2),
	JoiningDate Datetime,
	City Varchar(50)
)

Insert Into Employee2 Values(101,'Rahul','Admin',56000,'1990-Jan-01','Rajkot')
Insert Into Employee2 Values(102,'Hardik','It',18000,'1990-Sep-25','Ahmedabad')
Insert Into Employee2 Values(103,'Bhavin','HR',25000,'1991-May-14','Baroda')
Insert Into Employee2 Values(104,'Bhoomi','Admin',39000,'1991-Feb-08','Rajkot')
Insert Into Employee2 Values(105,'Rohit','It',17000,'1990-Jul-23','Jamnager')
Insert Into Employee2 Values(106,'Priya','It',9000,'1990-Oct-18','Ahmedabad')
Insert Into Employee2 Values(107,'Neha','Hr',34000,'1991-dec-25','Rajkot')

1.  Select MAX(Salary) As Max_Sal,
		MIN(Salary) AS Min_Sal,
		Sum(Salary) As Total_Sal,
		Avg(Salary) As Avg_Sal
   From Employee2

2.  Select COUNT(*) As Total_Record
    From Employee2

3.	Select max(Salary) as Max_Sal_IT
	From Employee2
	Where Department = 'IT'


4.	Select count(Distinct City) as Num_of_City
	From Employee2


5.	Select City, count(*) as Total_Emp
	From Employee2
	Group by City


6.	Select City, count(*) as Total_Emp
	From Employee2
	Group by City
	Having count(*)>1


7.	Select Department, sum(Salary) as Total_Sal
	From Employee2
	Group by Department


8.	Select avg(Salary) as Avg_Sal
	From Employee2
	Group by Department


9.	Select min(Salary) as Min_Sal
	From Employee2
	Where City = 'Ahmedabad'


10.	Select Department, sum(Salary) as Total_Sal
	From Employee2
	Where City = 'Rajkot'
	Group by Department
	Having sum(Salary)>5000


11.	Select count(*) as Total_Emp
	From Employee2
	Where City = 'Rajkot'


12.	Select max(Salary) - min(Salary) as Sal_Difference
	From Employee2


13.	Select count(*) as Hired_Emp
	From Employee2
	Where JoiningDate < '1991-Jan-01'


14.	Select Department, sum(Salary) as Total_Sal
	From Employee2
	Group by Department
	Having sum(Salary)>35000
	Order by sum(Salary)


15.	Select Department, count(*) as Dep_Emp
	From Employee2
	Group by Department
	Having count(*)>2


16.	Select min(Salary) as Min_Sal
	From Employee2
	Where City = 'Rajkot'


17.	Select City, count(*)
	From Employee2 
	Group by City


18.	Select Department, min(Salary) as Min_Sal
	From Employee2
	Group by Department


19.	Select sum(Salary) as Total_Sal
	From Employee2
	Group by City


20.	Select Department, min(Salary) as Min_Sal, 
					   max(Salary) as Max_Sal,
					   sum(Salary) as Total_Sal
	From Employee2
	Group by Department


21.	Select City, Department, min(Salary) as Min_Sal,
							 max(Salary) as Max_Sal
	From Employee2
	Group by City, Department
	Having min(Salary) < 30000