package cesar.next.desafio.desafionextcesar.dao;

import cesar.next.desafio.desafionextcesar.Ententies.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {

}
