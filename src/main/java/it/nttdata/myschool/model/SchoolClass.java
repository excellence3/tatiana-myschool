package it.nttdata.myschool.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SchoolClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    

    @OneToMany(mappedBy = "schoolClass")
    private List<Student> students= new ArrayList<Student>();

    /*CONSTRUCTOR*/

    public SchoolClass(){};
    public SchoolClass(String name){
        this.name = name;
    }

/*GETTER&SETTER*/

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getStudentNumber() {
        return students.size();
    }
    
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
   

}
