INSERT INTO Marca (nombre, Pais_Origen) VALUES
('Samsung', 'Corea del Sur'),
('Apple', 'EEUU'),
('Xiaomi', 'China'),
('Huawei', 'China'),
('OnePlus', 'China');



INSERT INTO Movil
(Modelo, Precio, almacenamiento, RAM, Stock, ID_Marca)
VALUES
('Galaxy S23', 899.99, 256, 8, 10, 1),
('iPhone 14', 999.99, 128, 6, 5, 2),
('Redmi Note 12', 299.99, 128, 6, 20, 3),
('P60 Pro', 1099.99, 256, 12, 3, 4),
('OnePlus 11', 799.99, 256, 12, 7, 5),
('Galaxy A54', 449.99, 128, 6, 15, 1);



INSERT INTO Cliente
(DNI, Nombre, PrApellido, SgApellido,
contraseña, telefono, email, direccion)
VALUES
('12345678A', 'Juan', 'García', 'López',
'pass123', '600111222', 'juan@gmail.com', 'Madrid'),

('87654321B', 'Laura', 'Martín', 'Sánchez',
'pass456', '600333444', 'laura@gmail.com', 'Barcelona'),

('11223344C', 'Pedro', 'Ruiz', 'Gómez',
'pass789', '600555666', 'pedro@gmail.com', 'Valencia');



INSERT INTO Pedido
(Fecha, Estado, ID_Cliente)
VALUES
('2025-04-10', 'Enviado', 1),
('2025-04-12', 'Pendiente', 2),
('2025-04-15', 'Entregado', 1);



INSERT INTO Detalle_Pedido
(Cantidad, Precio, ID_Movil, ID_Pedido)
VALUES
(1, 899.30, 1, 1),
(2, 300, 3, 2),
(1, 999.99, 2, 3),
(3, 799.10, 5, 1);



INSERT INTO Envio
(Empresa_Envio, Estado_Envio,
Fecha_Envio, ID_Pedido)
VALUES
('SEUR', 'Entregado', '2025-04-11', 1),
('Correos', 'En tránsito', '2025-04-13', 2),
('DHL', 'Entregado', '2025-04-16', 3);



INSERT INTO Pago
(ID_Pedido, Metodo_Pago,
Fecha_Pago, Importe)
VALUES
(1, 'Tarjeta', '2025-04-10', 1690.50),
(2, 'Bizum', '2025-02-12', 599.00),
(3, 'PayPal', '2026-04-15', 999.99);



INSERT INTO IBAN
(codIban, CodPais, DC, Entidad,
cSucursal, cDCCta, cnumcuenta,
ID_Cliente)
VALUES
(1, 'ES', '12', '2100',
'1234', '56', '1234567890', 1),

(2, 'ES', '34', '2100',
'5678', '90', '0987654321', 2),

(3, 'ES', '56', '2100',
'1111', '22', '1122334455', 3);