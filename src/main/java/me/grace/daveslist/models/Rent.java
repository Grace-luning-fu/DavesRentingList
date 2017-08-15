package me.grace.daveslist.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min=2, max=30)
    private String description;
    private String rules;
    private String cable;
    private Boolean bathroom;
    //when changed to camel case, have problem when generate setter and getter
    private Boolean isrented;

//    private Boolean isRented;
//    public Boolean getRented() {
//        return isRented;
//    }
//    public void setRented(Boolean rented) {
//        isRented = rented;
//    }



    public void setRentinfo(String description, String rules, String cable, Boolean bathroom, Boolean isRented)
    {
        this.description = description;
        this.rules = rules;
        this.cable= cable;
        this.bathroom = bathroom;
        this.isrented = isrented;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getCable() {
        return cable;
    }

    public void setCable(String cable) {
        this.cable= cable;
    }

    public Boolean getBathroom() {
        return bathroom;
    }

    public void setBathroom(Boolean bathroom) {
        this.bathroom = bathroom;
    }

    public Boolean getIsrented() {
        return isrented;
    }

    public void setIsrented(Boolean isrented) {
        this.isrented = isrented;
    }



}
