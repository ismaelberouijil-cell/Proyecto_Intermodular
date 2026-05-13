INSERT INTO Marca (nombre, Pais_Origen) VALUES
('Samsung', 'Corea del Sur'),
('Apple', 'EEUU'),
('Xiaomi', 'China'),
('Huawei', 'China'),
('OnePlus', 'China');

INSERT INTO Movil (ID_Movil, Modelo, Precio, almacenamiento, RAM, Stock, ID_Marca) VALUES
('M001', 'Galaxy S23', 899.99, 256, 8, 10, 1),
('M002', 'iPhone 14', 999.99, 128, 6, 5, 2),
('M003', 'Redmi Note 12', 299.99, 128, 6, 20, 3),
('M004', 'P60 Pro', 1099.99, 256, 12, 3, 4),
('M005', 'OnePlus 11', 799.99, 256, 12, 7, 5),
('M006', 'Galaxy A54', 449.99, 128, 6, 15, 1);

INSERT INTO Cliente (ID_Cliente, DNI, Nombre, PrApellido, SgApellido, contraseña, telefono, email, direccion) VALUES
('C001', '12345678A', 'Juan', 'García', 'López', 'pass123', '600111222', 'juan@gmail.com', 'Madrid'),
('C002', '87654321B', 'Laura', 'Martín', 'Sánchez', 'pass456', '600333444', 'laura@gmail.com', 'Barcelona'),
('C003', '11223344C', 'Pedro', 'Ruiz', 'Gómez', 'pass789', '600555666', 'pedro@gmail.com', 'Valencia');

INSERT INTO Pedido (ID_Pedido, Fecha, Estado, ID_Cliente) VALUES
('P001', '2025-04-10', 'Enviado', 'C001'),
('P002', '2025-04-12', 'Pendiente', 'C002'),
('P003', '2025-04-15', 'Entregado', 'C001');

INSERT INTO Detalle_Pedido (ID_DetallePedido, Cantidad, Precio, ID_Movil, ID_Pedido) VALUES
('D001', 1, 899.30, 'M001', 'P001'),
('D002', 2, 300, 'M003', 'P002'),
('D003', 1, 999.99, 'M002', 'P003'),
('D004', 3, 799.10, 'M005', 'P001');

INSERT INTO Envio (ID_ENVIO, Empresa_Envio, Estado_Envio, Fecha_Envio, ID_Pedido) VALUES
('E001', 'SEUR', 'Entregado', '2025-04-11', 'P001'),
('E002', 'Correos', 'En tránsito', '2025-04-13', 'P002'),
('E003', 'DHL', 'Entregado', '2025-04-16', 'P003');

INSERT INTO Pago (ID_Pago, ID_Pedido, Metodo_Pago, Fecha_Pago, Importe) VALUES
('PA001', 'P001', 'Tarjeta', '2025-04-10', 1690.50),
('PA002', 'P002', 'Bizum', '2025-02-12', 599.00),
('PA003', 'P003', 'PayPal', '2026-04-15', 999.99);

INSERT INTO IBAN (codIban, CodPais, DC, Entidad, cSucursal, cDCCta, cnumcuenta, ID_Cliente) VALUES
(1, 'ES', '12', '2100', '1234', '56', '1234567890', 'C001'),
(2, 'ES', '34', '2100', '5678', '90', '0987654321', 'C002'),
(3, 'ES', '56', '2100', '1111', '22', '1122334455', 'C003');

INSERT INTO Usuario (ID_Marca, Nombre, Pais_Origen) VALUES
(1, 'diego', 'España'),
(2, 'gabriel', 'Francia'),
(3, 'Ismael', 'Marruecos'),
(4, 'Marta', 'España')
