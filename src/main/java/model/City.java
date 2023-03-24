package model;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

//@Data
@NoArgsConstructor
@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private int cityID;

    @Column(name = "city_name")
    private String cityName;

    @OneToMany(mappedBy = "city")
    private List<Employee> emploeeList;

    public City(int cityID, String cityName) {
        this.cityID = cityID;
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityID=" + cityID +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}