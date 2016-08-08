package com.railwaybank.entity;

import javax.persistence.*;

/**
 * Created by Андрей on 27.07.2016.
 */
@Entity
@Table(name = "id_cards")
public class IDCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_card")
    private int IDCard;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "idCard")
    private Client client;

    private String name;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "surname")
    private String surName;

    private String dateOfBirth;

    private String seriesIDCard;

    private String numberIDCard;

    private String taxNumber;

    public IDCard() {
    }

    public IDCard(String name, String lastName, String surName, String dateOfBirth, String seriesIDCard, String numberIDCard, String taxNumber) {
        this.name = name;
        this.lastName = lastName;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
        this.seriesIDCard = seriesIDCard;
        this.numberIDCard = numberIDCard;
        this.taxNumber = taxNumber;
    }

    public int getIDCard() {
        return IDCard;
    }

    public void setIDCard(int IDCard) {
        this.IDCard = IDCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSeriesIDCard() {
        return seriesIDCard;
    }

    public void setSeriesIDCard(String seriesIDCard) {
        this.seriesIDCard = seriesIDCard;
    }

    public String getNumberIDCard() {
        return numberIDCard;
    }

    public void setNumberIDCard(String numberIDCard) {
        this.numberIDCard = numberIDCard;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    @Override
    public String toString() {
        return "IDCard{" +
                "IDCard=" + IDCard +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", surName='" + surName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", seriesIDCard='" + seriesIDCard + '\'' +
                ", numberIDCard='" + numberIDCard + '\'' +
                ", taxNumber='" + taxNumber + '\'' +
                '}';
    }
}
