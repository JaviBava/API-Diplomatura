DROP TABLE IF EXISTS Usuario;
CREATE TABLE Usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    edad INT NOT NULL


INSERT INTO Usuario (nombre, apellido, edad) VALUES
('Juan', 'Pérez', 30),
('Ana', 'Gómez', 25);

SELECT * FROM Usuario;

ALTER TABLE Usuario DROP COLUMN email;


