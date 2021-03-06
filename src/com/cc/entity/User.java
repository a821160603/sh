package com.cc.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_account", schema = "db_account")
public class User {
    private Integer id;
    private String user;
    private String paw;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user")
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Basic
    @Column(name = "paw")
    public String getPaw() {
        return paw;
    }

    public void setPaw(String paw) {
        this.paw = paw;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(this.user, user.user) &&
                Objects.equals(paw, user.paw);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, paw);
    }
}
