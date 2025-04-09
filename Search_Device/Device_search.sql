create database if not exists Laptop;

use Laptop;
drop table Ordinateur;

create table if not exists Ordinateur(
Num_Serie varchar(10) primary key,
Email varchar(60),
Marque varchar(30),
Nom_Proprietaire varchar(30),
Num_Tel numeric(10),
Date_Perte date
);
delete from Ordinateur;

INSERT INTO Ordinateur (Num_Serie, Email, Marque, Nom_Proprietaire, Num_Tel, Date_Perte) VALUES
('L0001', 'jeanpierre@gmail.com', 'Dell', 'Jean Pierre', 670123456, '2025-03-01'),
('L0002', 'marieclaire@gmail.com', 'HP', 'Marie Claire', 678234567, '2025-03-02'),
('L0003', 'paulmbarga@gmail.com', 'Acer', 'Paul Mbarga', 675345678, '2025-03-03'),
('L0004', 'luciengo@gmail.com', 'Apple', 'Lucie Ngo', 690456789, '2025-03-04'),
('L0005', 'hervebiya@gmail.com', 'Lenovo', 'Hervé Biya', 674567890, '2025-03-05'),
('L0006', 'nadineeko@gmail.com', 'Asus', 'Nadine Eko', 672678901, '2025-03-06'),
('L0007', 'richardtalla@gmail.com', 'MSI', 'Richard Talla', 676789012, '2025-03-07'),
('L0008', 'carolinefoe@gmail.com', 'Samsung', 'Caroline Foé', 677890123, '2025-03-08'),
('L0009', 'simonebene@gmail.com', 'Toshiba', 'Simon Ebène', 671901234, '2025-03-09'),
('L0010', 'estellebeyi@gmail.com', 'Sony', 'Estelle Beyi', 675012345, '2025-03-10'),
('L0011', 'jacquesowono@gmail.com', 'Dell', 'Jacques Owono', 676123456, '2025-03-11'),
('L0012', 'audreyatem@gmail.com', 'HP', 'Audrey Atem', 671234567, '2025-03-12'),
('L0013', 'francknoah@gmail.com', 'Acer', 'Franck Noah', 679345678, '2025-03-13'),
('L0014', 'sylviemendouga@gmail.com', 'Apple', 'Sylvie Mendouga', 678456789, '2025-03-14'),
('L0015', 'pierrenguim@gmail.com', 'Lenovo', 'Pierre Nguim', 677567890, '2025-03-15'),
('L0016', 'claudinendikou@gmail.com', 'Asus', 'Claudine Ndikou', 674678901, '2025-03-16'),
('L0017', 'marcekanga@gmail.com', 'MSI', 'Marc Ekanga', 679789012, '2025-03-17'),
('L0018', 'laurengono@gmail.com', 'Samsung', 'Laure Ngono', 678890123, '2025-03-18'),
('L0019', 'boriskengne@gmail.com', 'Toshiba', 'Boris Kengne', 673901234, '2025-03-19'),
('L0020', 'giseleetoundi@gmail.com', 'Sony', 'Gisèle Etoundi', 675012345, '2025-03-20');

select * from Ordinateur;
