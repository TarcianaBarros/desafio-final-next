package cesar.next.desafio.desafionextcesar;

import cesar.next.desafio.desafionextcesar.Ententies.CostCenter;
import cesar.next.desafio.desafionextcesar.dao.CostCenterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CostCenterController {

    @Autowired
    private CostCenterDao costCenterDao;

    @GetMapping("/costCenter")
    public List<CostCenter> list() {

        return costCenterDao.findAll();
    }

    @PostMapping(path = "/costCenter", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public CostCenter save(@RequestBody CostCenter costCenter) {
        return costCenterDao.save(costCenter);
    }
}
