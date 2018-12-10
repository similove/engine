package com.zjw.model;

public class Person {
    private Integer id;

    private String name;

    private String age;

    private Integer gender;

    private String email;

    private String phoneNumber;

    private String nativePlace;

    private String familyAddress;

    private String photoUrl;

    private String idCardUrl1;

    private String idCardUrl2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    public String getFamilyAddress() {
        return familyAddress;
    }

    public void setFamilyAddress(String familyAddress) {
        this.familyAddress = familyAddress == null ? null : familyAddress.trim();
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl == null ? null : photoUrl.trim();
    }

    public String getIdCardUrl1() {
        return idCardUrl1;
    }

    public void setIdCardUrl1(String idCardUrl1) {
        this.idCardUrl1 = idCardUrl1 == null ? null : idCardUrl1.trim();
    }

    public String getIdCardUrl2() {
        return idCardUrl2;
    }

    public void setIdCardUrl2(String idCardUrl2) {
        this.idCardUrl2 = idCardUrl2 == null ? null : idCardUrl2.trim();
    }
}