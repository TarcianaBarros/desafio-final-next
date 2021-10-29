package cesar.next.desafio.desafionextcesar.Ententies;

import javax.persistence.*;

@Table(name = "COST_CENTER")
@Entity
public class CostCenter {
    @Id
    @Column(name = "ID", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME", nullable = false, unique = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "PROJECT_ID")
    private Project project;
}
