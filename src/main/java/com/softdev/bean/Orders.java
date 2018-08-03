package com.softdev.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String usr;
    private String kind;

    public Orders(){
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", usr='" + usr + '\'' +
                ", kind='" + kind + '\'' +
                '}';
    }

    public Long getId() {

        return id;
    }

    public String getUsr() {
        return usr;
    }

    public String getKind() {
        return kind;
    }

    public Orders(Long id, String usr, String kind){
        this.id=id;
        this.usr=usr;
        this.kind=kind;

    }


}
