package cesar.next.desafio.desafionextcesar.Ententies;

import javax.persistence.*;


@Entity
@Table(name = "USER")
public class User {

    @Id
    @Column(name = "ID", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME", nullable = false, unique = false)
    private String firstName;

    @Column(name = "LASTNAME", nullable = false, unique = false)
    private String lastname;

    @Column(name = "REGISTRATION", nullable = false, unique = false)
    private String registration;

    @Column(name = "OCCUPATION", nullable = false, unique = false)
    private String occupation;

    @Column(name = "BIRTH_DATE", nullable = false, unique = false)
    private String birthDate;

    @ManyToOne
    @JoinColumn(name = "PROJECT_ID", referencedColumnName = "ID")
    private Project project;


}