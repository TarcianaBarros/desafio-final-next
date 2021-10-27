package cesar.next.desafio.desafionextcesar;

import java.util.List;

import cesar.next.desafio.desafionextcesar.Ententies.Project;
import cesar.next.desafio.desafionextcesar.dao.ProjectDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
//@RequestMapping("/project")

public class ProjectController {
    @Autowired
    private ProjectDao projectDao;

    @GetMapping("/projects")
    public List<Project> list() {

        return projectDao.findAll();
    }

    @PostMapping(path = "/projects", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public Project save(@RequestBody Project project) {
        return projectDao.save(project);
    }


}
