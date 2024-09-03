package lk.tdm;

//Alien Pojo / Bean

import jakarta.persistence.*;

@Entity
@Table(name = "alien")
public class Alien {

    @Id
    private int id;

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

    @Override
    public String toString() {
        return "Alien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

