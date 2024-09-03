package lk.tdm;

//Alien Pojo / Bean

import jakarta.persistence.*;

@Entity
@Table(name = "alien")
public class Alien {

    @Id
    private int id;

//    this not will be store in db
@Transient
    private String name;

//change the column name
    @Column(name = "alien-color")
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

