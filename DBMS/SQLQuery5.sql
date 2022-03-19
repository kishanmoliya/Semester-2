Create table Students
(
Stuid int,
FirstName Varchar(25),
LastName Varchar(25),
Website Varchar(25),
City Varchar(25),
Division Varchar(20)
);


insert into Students values(1011,'Keyur','Patel','Techonthenet.com','Rajkot','II-BCX')
insert into Students values(1022,'Hardik','Shah','Digminecraft.com','Ahmedabad','I-BYC')
insert into Students values(1033,'Kajal','Trivedi','Bigactivities.com','Baroda','IV-DCX')
insert into Students values(1044,'Bhoomi','Gajera','CHeckyourmath.com','Ahmedabad','II-DCW')
insert into Students values(1055,'Harmit','Mitel',null,'Rajkot','II-BCY')
insert into Students values(1066,'Ashok','Jani',null,'Baroda','II-BCZ')


Select  * From Students Where FirstName like 'k%'

Select  * From Students Where FirstName like '_____'

Select FirstName, LastName From Students Where City Like '_____a'

Select  * From Students Where LastName like '%tel'

Select  * From Students Where FirstName like 'ha%t'

Select  * From Students Where FirstName like 'k_y%'

Select  * From Students Where Website is null and FirstName like '_____'

Select  * From Students Where LastName like '%jer%'

Select  * From Students Where City like '[r,b]%'

Select  * From Students Where Website is not null

Select  * From Students Where FirstName like '[a-h]%'

Select  * From Students Where FirstName like '_[a,e,i,o,u]%'

Select  * From Students Where City like '%rod%'

Select FirstName,LastName From Students Where Website like 'bi%'

Select  * From Students Where LastName like '______'

Select  * From Students Where City not like 'ba%' and city like'_____'

Select  * From Students Where Division like 'II%'

Select  FirstName From Students Where Division like '%bc%'

Select  Stuid,City From Students Where Division like '______' and Website is not null

Select  * From Students Where FirstName not like '__[a,e,i,o,u]'















 

