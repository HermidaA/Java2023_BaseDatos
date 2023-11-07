package testing;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Empleado;
import service.EmpleadosService;

class TestEmpleadosService {
	EmpleadosService service;
	@BeforeEach
	void setUp() throws Exception {
		service=new EmpleadosService();
	}

	@Test
	void testAltaEmpleado() {
		assertTrue(service.altaEmpleado(new Empleado(0,"e1","ei@gmail.com","dep1",2000)));
	}

}
