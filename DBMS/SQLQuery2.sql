Create Table Student

(Enrollment_no Varchar(20),
 Name Varchar(25),
 CPI Decimal(5,2),
 Birthdate Datetime
);


Alter Table Student Add City Varchar(20) null , Backlog Int not null

Alter Table Student Alter Column Name Varchar(35)

Alter Table Student Alter Column CPI int

SP_Rename 'Student.Enrollment_no' , 'ENO' , 'Column'

Alter Table Student Drop Column City

SP_Rename 'Student' , 'Student_Master'

Alter Table Student_Master Drop Column Backlog

Alter Table Student_Master Alter Column Name Varchar(35) Not null 

SP_Rename 'Student_Master.Birthdate' , 'Bdate' , 'Column'

Alter Table Student_Master Alter Column ENO Varchar(12)


