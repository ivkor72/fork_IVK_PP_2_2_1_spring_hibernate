package hiber.model;

import javax.persistence.*;

@Entity
@Table (name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String model;

    @Column
    private int series;

    public Car() {}

    public Car (String model, int series) {
        this.model = model;
        this.series = series;
    }

    @OneToOne
    private User user;

    public Car (User user){
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setId(int series) {
        this.series = series;
    }

    public User setUser (User user){
        this.user = user;
        return user;
    }

    @Override
    public String toString() {
        return "Car: " + model + ", series: " + series;

    }
}
