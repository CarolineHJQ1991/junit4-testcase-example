package com.caroline.exe.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User: Caroline.Han
 * Date: 2016-11-29
 * Time: 下午6:11
 */
@Entity
//TODO: guzz 这个怎么做
@org.guzz.annotations.Entity(businessName = "user")
@Table(name = "user")
public class User {

    @Id
    private long id;
    private String name;
    private String dept;
    private String website;
    private String phone;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
