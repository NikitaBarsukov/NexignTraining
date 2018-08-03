package com.softdev.bean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fio;

    public Users(){

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Long getId() {

        return id;
    }

    public String getFio() {
        return fio;
    }

    public Users(Long id, String fio) {
        this.id=id;

        this.fio = fio;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                '}';
    }
}

