package py.uca.infraestructura;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import py.uca.infraestructura.pojo.User;
import py.uca.infraestructura.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MockServletContext.class)
@WebAppConfiguration
public class UserServiceTest {

	private UserService userService = new UserService();

	// Valida que se este cargando todos los campos de manera correcta.
	@Test
	public void saveUser() throws Exception {
		User savedUser = userService.saveUser(1l, "Juan", "Ruiz", 28, "juan.ruiz@gmail.com");

		Assert.assertNotNull("El nombre del usuario es nulo.", savedUser.getName());
		Assert.assertNotNull("El apellido del usuario es nulo.", savedUser.getLastname());
		Assert.assertNotNull("La edad del usuario es nulo.", savedUser.getAge());
		Assert.assertNotNull("El mail del usuario es nulo.", savedUser.getMail());
		Assert.assertNotNull("El id del usuario es nulo.", savedUser.getId());
	}
}