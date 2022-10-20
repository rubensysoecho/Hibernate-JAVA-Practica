-- Insertar en tabla `medicos`
INSERT INTO `medicos`(`nombre`, `apellido1`, `apellido2`, `dni`) VALUES ("Manuel","Valle","Ramirez","12341234A");
INSERT INTO `medicos`(`nombre`, `apellido1`, `apellido2`, `dni`) VALUES ("Raúl","Sanchez","Trujillo","22222222B");

-- Insertar en tabla `pacientes`
INSERT INTO `pacientes`(`medicoID`, `nombre`, `dni`) VALUES (11,"Ramón","34343434C");
INSERT INTO `pacientes`(`medicoID`, `nombre`, `dni`) VALUES (12,"Julián","98989898D");

-- Insertar en tabla `citas`
INSERT INTO `citas`(`medicoID`, `pacienteID`, `fecha`) VALUES (11,1,"2023-12-12");
INSERT INTO `citas`(`medicoID`, `pacienteID`, `fecha`) VALUES (12,2,"2022-07-11");
