Create table City_Master
(
	Cityid int primary key identity(101,1),
	Cityname varchar(20) unique,
	Pincode varchar(10) null,
	Stdcode varchar(10)
)

Create table Student_master0
(
	Studentid int primary key identity(101,1),
	Enrollment_no varchar(20) unique,
	Name varchar(25),
	Cpi decimal(5,2) null check(cpi<=10),
	Joiningdate datetime default getdate(),
	Bklog int check(Bklog>0),
	Cityid int foreign key references City_master(Cityid),
	Statename varchar(50) default 'Gujarat'
)

