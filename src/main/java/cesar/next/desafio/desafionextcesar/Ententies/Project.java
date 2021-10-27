package cesar.next.desafio.desafionextcesar.Ententies;

import cesar.next.desafio.desafionextcesar.Enum.FlagProject;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PROJECT")
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true)
    private Integer id;

    @Column(name = "PROJECT_NAME", nullable = false, unique = false)
    private String projectName;

    @Column(name = "START_DATE", nullable = false, unique = false)
    private String startDate;

    @Column(name = "FINAL_DATE", nullable = false, unique = false)
    private String finalDate;

    @Column(name = "STATUS", nullable = false, unique = false)
    private String status;

    @OneToMany
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
    private User users;


    @Column(name = "FLAG", nullable = false, unique = false)
    @Enumerated(EnumType.STRING)
    private FlagProject colors;



}


