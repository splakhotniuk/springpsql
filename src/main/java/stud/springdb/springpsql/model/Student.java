package stud.springdb.springpsql.model;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String surname;
    private String name;
    private int teacher_id;
   
    public Student() {
    }

    public Student(int id, String surname, String name, int teacher_id) {

        this.id = id;
        this.surname = surname;
        this.name = name;
        this.teacher_id = teacher_id;;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }
}