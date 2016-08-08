package com.railwaybank.entity;
import javax.persistence.*;

/**
 * Created by Андрей on 27.07.2016.
 */
@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @Column(name = "ad_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int adId;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "address")
    Client client;

    @Column(nullable = false)
    private String city;

    @Column(name = "street_name", nullable = false)
    private String street;

    @Column(name = "house_name", nullable = false)
    private String house;

    @Column(name = "landline_phone", nullable = false)
    private String phone;

    @Column(name = "zip_code", nullable = false)
    private String zipCode;

    public Address() {
    }

    public Address(String city, String street, String house, String phone, String zipCode) {
        
        this.city = city;
        this.street = street;
        this.house = house;
        this.phone = phone;
        this.zipCode = zipCode;
    }


    public int getAdId() {
        return adId;
    }

    public void setAdId(int adId) {
        this.adId = adId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "adId=" + adId +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", phone='" + phone + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

}
