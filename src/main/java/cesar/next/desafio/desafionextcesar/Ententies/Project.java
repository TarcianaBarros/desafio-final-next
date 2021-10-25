package cesar.next.desafio.desafionextcesar.Ententies;

import cesar.next.desafio.desafionextcesar.Enum.FlagProject;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "PROJETO")
@Entity
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true)
    private Integer id;

    @Column(name = "NOME_DO_PROJETO", nullable = false, unique = false)
    private String projectName;

    @Column(name = "DATA_DE_INICIO", nullable = false, unique = false)
    private String startDate;

    @Column(name = "DATA_FINAL", nullable = false, unique = false)
    private String finalDate;

    @Column(name = "STATUS", nullable = false, unique = false)
    private String status;

    @OneToMany
    @JoinColumn(name = "usuario_id")
    private Users users;

    @Column(name = "FLAG", nullable = false, unique = false)
    private FlagProject colors;

    public Project(){

    }
    public Project(Integer id, String projectName, String startDate, String finalDate, String status, Users users, FlagProject colors){
        this.id = id;
        this.projectName = projectName;
        this.startDate = startDate;
        this.finalDate = finalDate;
        this.users = users;
        this.colors = colors;

    }


    public void setId(Integer id) {
        this.id = id;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setFinalDate(String finalDate) {
        this.finalDate = finalDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public void setColors(FlagProject colors) {
        this.colors = colors;
    }

    public Integer getId() {
        return id;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getFinalDate() {
        return finalDate;
    }

    public String getStatus() {
        return status;
    }

    public Users getUsers() {
        return users;
    }

    public FlagProject getColors() {
        return FlagProject.toEnum(colors);
    }



}


