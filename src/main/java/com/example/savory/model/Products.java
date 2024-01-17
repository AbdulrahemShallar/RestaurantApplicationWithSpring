package com.example.savory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Products {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO,generator = "system-uuid")
    @GenericGenerator(name = "system-uuid",strategy = "uuid2")
    private String id;
    private String name;
    private String shortDescription;

    private String fullDescription;

    private String price;
    private String path;

    private Integer numberOfOrdering;
    public Integer getNumberOfOrdering() {
        return numberOfOrdering;
    }

    public void setNumberOfOrdering(Integer numberOfOrdering) {
        this.numberOfOrdering = numberOfOrdering;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
