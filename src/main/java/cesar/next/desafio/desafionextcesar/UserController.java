package cesar.next.desafio.desafionextcesar;

import java.util.List;

import cesar.next.desafio.desafionextcesar.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cesar.next.desafio.desafionextcesar.Ententies.User;


@RestController
//@RequestMapping
public class UserController {
    @Autowired
    private UserDao userDao;

    @GetMapping("/users")
    public List<User> list(){
        return userDao.findAll();
    }

    @PostMapping("/users")
    public void save(@RequestBody User projeto){
        userDao.save(projeto);
    }

}
