package work.myproject.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( nullable = false, updatable = false)
    private Long id;
    private String name;
    private  String email;
    private String jobTitle ;
    private String phone;
    private String imageUrl;
    private String employeeCode;

    public Employee(String name , String email, String jobTitle , String phone , String imageUrl , String employeeCode)
    {
        this.name=name;
        this.email=email;
        this.jobTitle=jobTitle;
        this.phone=phone;
        this.imageUrl=imageUrl;
        this.employeeCode=employeeCode;
    }

}
