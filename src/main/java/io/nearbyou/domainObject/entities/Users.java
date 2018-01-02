package io.nearbyou.domainObject.entities;

import io.nearbyou.domainValue.Ranking;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by Kais NEFFATI on 19/12/2017.
 */
@Document(collection = "users")
public class Users extends PersistedEntity {
    private String email;
    @Field("brith_date")
    private Calendar birthDate;
    @Field("first_name")
    private String firstName;
    @Field("last_name")
    private String lastName;
    private String city;
    private String state;
    private String zip;
    private String gender;
    private ArrayList<String> phones;
    @DBRef
    private ArrayList<Deliveries> deliveries;
    @DBRef
    private ArrayList<Deliveries> favorites;
    private Ranking ranking;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ArrayList<String> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<String> phones) {
        this.phones = phones;
    }

    public ArrayList<Deliveries> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(ArrayList<Deliveries> deliveries) {
        this.deliveries = deliveries;
    }

    public Ranking getRanking() {
        return ranking;
    }

    public void setRanking(Ranking ranking) {
        this.ranking = ranking;
    }

    public ArrayList<Deliveries> getFavorites() {
        return favorites;
    }

    public void setFavorites(ArrayList<Deliveries> favorites) {
        this.favorites = favorites;
    }
}
