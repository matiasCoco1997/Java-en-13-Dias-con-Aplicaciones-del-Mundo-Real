
-- USO LA BASE DE DATOS QUE CREE
USE estudiantes_db;

-- CRUD - CREATE - READ - UPDATE - DELETE
-- Listamos los estudiantes (READ)
SELECT * FROM estudiante;

-- CREATE (INSERT)
INSERT INTO estudiante(nombre, apellido, telefono, email) VALUES("Matias", "apellido", "11223344", "matias@gmail.com");

-- UPDATE (MODIFICAR)
UPDATE estudiante SET nombre = "Matias Ariel", apellido = "Coco" WHERE id_estudiante = 1;

-- DELETE (ELIMINAR)
DELETE FROM estudiante WHERE id_estudiante = 1;