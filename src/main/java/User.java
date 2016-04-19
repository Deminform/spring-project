import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "test")
public class User {
    @Id
    @Column(name = "idUser")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nameUser")
    private String name;

    @Column(name = "ageUser")
    private int age;

    @Column(name = "adminUser")
    private boolean admin;

    @Column(name = "createdAteUser")
    private Timestamp createdDate;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isadmin() {
        return admin;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIsadmin(boolean isadmin) {
        this.admin = isadmin;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }
}
