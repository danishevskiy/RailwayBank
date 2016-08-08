package com.railwaybank.entity;

import javax.persistence.*;

/**
 * Created by Андрей on 26.07.2016.
 */
@Entity
@Table(name="clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "c_id")
    private int id;

    @Column(nullable = false)
    private String mobile_phone;

    @Column(nullable = false)
    private String password;

    private String email;

    @Column(nullable = false)
    private int status;

    @Column(name = "create_date_time", nullable = false)
    private String createTime;

    @Column(name = "update_date_time", nullable = false)
    private String updateTime;

  // private Byte photo;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "addresses_ad_id", nullable = false)
    private Address address;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cards_id_card", nullable = false)
    private IDCard idCard;

   /* @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "accounts_ac_id", nullable = false)
    private Account account;*/



    public Client() {

    }
    public Client(String mobile_phone, String password,String email, int status, String createTime, String updateTime
                  /*Byte photo*/, Address address, IDCard idCard/* Account account*/) {
        this.mobile_phone = mobile_phone;
        this.password = password;
        this.email = email;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
       // this.photo = photo;
        this.address = address;
        this.idCard = idCard;
        /*this.account = account;*/

    }

    public Client(String mobilePhone, String password, String email) {
        this.status = 0;
        this.createTime = "";
        this.updateTime = "";
       // this.photo = 0;
        this.address = address;
        this.idCard = idCard;
        //this.account = account;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

   /* public Byte getPhoto() {
        return photo;
    }

    public void setPhoto(Byte photo) {
        this.photo = photo;
    }*/

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public IDCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IDCard idCard) {
        this.idCard = idCard;
    }

    /*public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }*/

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", mobile_phone='" + mobile_phone + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +

                ", address=" + address +
                ", idCard=" + idCard +
               // ", account=" + account +
                '}';
    }
}
