package lk.tdm;

//Alien Pojo / Bean

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alien")
public class Alien {

    @Id
    private int id;
    private String name;
    private String color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

/**

 * @Entity:  * This annotation marks the class as a JPA entity, meaning it is mapped to a database table.
            * Hibernate will use this class to perform CRUD operations on the corresponding table.

 * @Table(name = * "alien"): This specifies the name of the database table that the entity maps to.
                 * In this case, the table name is alien. If you omit this annotation,
                 * Hibernate will use the class name as the default table name.

 * @Id: * This annotation designates the id field as the primary key for the entity.
        * The primary key uniquely identifies each record in the table.
 */