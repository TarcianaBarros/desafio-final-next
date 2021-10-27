package cesar.next.desafio.desafionextcesar.Ententies;

import cesar.next.desafio.desafionextcesar.Enum.FlagProject;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
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

    //@JsonBackReference
    @OneToMany
    @JoinColumn(name = "USER_ID")
    private Set<User> users;


    @Column(name = "FLAG", nullable = false, unique = false)
    @Enumerated(EnumType.STRING)
    private FlagProject flag;

    @OneToMany
    @JoinColumn(name = "COST_CENTER_ID")
    private Set<CostCenter> costCenter;


}


