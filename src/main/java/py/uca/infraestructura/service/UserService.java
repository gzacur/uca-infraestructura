package py.uca.infraestructura.service;

import py.uca.infraestructura.pojo.User;

public class UserService {

	public User saveUser(Long id, String name, String lastname, Integer age, String mail) {

		User u = new User();
		u.setId(id);
		u.setName(name);
		u.setLastname(lastname);
		u.setMail(mail);
		u.setAge(age);

		return u;
	}

}
