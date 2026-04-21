Create Databases CatalogoMobile

Use CatalogoMobile

Create table Marca(
    ID_Marca varchar(50) not null,
    Primary key (ID_Marca),
    nombre varchar(20) not null,
    Pais_Origen varchar(20) not null
)
Create table Movil(
    ID_Movil varchar(50) not null,
    Primary key (ID_Movil),
    Modelo varchar(20)not null,
    Precio decimal (10,2),
    almacenimiento varchar(20) not null,
    RAM varchar(20) not null,
    Stock varchar(20) not null,
    foreign key (ID_Movil) references Marca(ID_Movil)
);

Create table Cliente(
    ID_Cliente varchar(50) not null,
    Primary key (ID_Cliente),
    DNI varchar(8) not null,
    Nombre varchar(20) not null,
    PrApellido varchar(30) not null,
    SgApellido varchar(30) not null,
    telefono varchar (15) not null,
    email varchar(30) not null,
    direccion varchar(30) not null
);

Create table Envio(
    ID_ENVIO varchar(50) not null,
    primary key(ID_ENVIO),
    
)

