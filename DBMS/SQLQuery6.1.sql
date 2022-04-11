------String Function-----

select Len(null)
select Len(' hello ')
select Len('')

select lower('KISHAN')
select upper('kishan')

select left('kishan',3)

select substring('kishan moliya',3,10)

select replace('abc123efg',123,'xyz')
select replace('abcabcabc','c',5)

select ascii('a')
select ascii('A')
select ascii('z')
select ascii('Z')
select ascii(0)
select ascii(9)

select char(97)
select char(65)
select char(122)
select char(90)
select char(48)
select char(57)

select rtrim('   hello world    ')

select ltrim('   hello world   ')

select left('SQLServer',4),right('SQL Server',5)

select cast('1234.56' as decimal(8,2))

select convert(int , 10.58)

select space(10) + 'kishan'

select ('kishan' + 'moliya')
select concat('kishan','moliya') 

select reverse('darshan')

select replicate('kishan',3)

select stuff('kishan',2,3,'html')

select coalesce(null,'xyz','pqr')
select coalesce('xyz',null,null)
select coalesce(null,null,'not null')

select isnumeric('xyz')
select isnumeric(123)

select charindex('t','customer')
select charindex('i','admission',5)
 
 ---------Date Function------

 select getDate()
 select year(getdate())
 select month(getdate())
 select day(getdate())

 select Eomonth(getdate())
 select Eomonth('2021-02-02')


