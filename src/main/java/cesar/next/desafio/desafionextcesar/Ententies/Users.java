package cesar.next.desafio.desafionextcesar.Ententies;

import javax.persistence.*;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NOME", nullable = false, unique = false)
    private String firstName;

    @Column(name = "SOBRENOME", nullable = false, unique = false)
    private String lastname;

    @Column(name = "MATRÍCULA", nullable = false, unique = false)
    private String registration;

    @Column(name = "ATIVIDADE", nullable = false, unique = false)
    private String occupation;

    @Column(name = "DATA_DE_NASCIMENTO", nullable = false, unique = false)
    private String birthDate;

    @ManyToOne
    @JoinColumn(name = "Projeto_id")
    private Project project;


}