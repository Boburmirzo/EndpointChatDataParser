package ru.task.snapengageEndpoint.domainobject;


import javax.persistence.*;
import java.util.List;
/**
 * Created by bumurzaqov on 28.04.2018.
 */
@Entity
@Table(name = "requesterDetailsDO")
public class RequesterDetailsDO {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;
    @ElementCollection
    @CollectionTable(name="emails", joinColumns=@JoinColumn(name="id"))
    @Column(name="email")
    private List<String> emails;
    @Column
    private String nameProfileLink;
    @ElementCollection
    @CollectionTable(name="phones", joinColumns=@JoinColumn(name="id"))
    @Column(name="phone")
    private List<String> phones;
    @Column
    private String address;
    @Column
    private String address2;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private String zip;
    @Column
    private String country;
    @Column
    private String companyName;
    @Column
    private String companyProfileLink;
    @Column
    private String employees;
    @Column
    private String revenue;
    @Column
    private String title;
    @Column
    private String website;
    @ElementCollection
    @CollectionTable(name="socialProfileLinks", joinColumns=@JoinColumn(name="id"))
    @Column(name="socialProfileLink")
    private List<String> socialProfileLinks;
    @Column
    private String gender;
    @Column
    private int age;
    @Column
    private String influencerScore;
    @Column
    private String notes;
    @Column
    private String industry;
    @ElementCollection
    @CollectionTable(name="avatars", joinColumns=@JoinColumn(name="id"))
    @Column(name="avatar")
    private List<String> avatars;
    @ElementCollection
    @CollectionTable(name="otherDatas", joinColumns=@JoinColumn(name="id"))
    @Column(name="otherData")
    private List<String> otherDatas;

    public RequesterDetailsDO(){}

    public RequesterDetailsDO(String name, List<String> emails, String nameProfileLink, List<String> phones, String address, String address2, String city, String state, String zip, String country, String companyName, String companyProfileLink, String employees, String revenue, String title, String website, List<String> socialProfileLinks, String gender, int age, String influencerScore, String notes, String industry, List<String> avatars, List<String> otherDatas) {
        this.name = name;
        this.emails = emails;
        this.nameProfileLink = nameProfileLink;
        this.phones = phones;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.companyName = companyName;
        this.companyProfileLink = companyProfileLink;
        this.employees = employees;
        this.revenue = revenue;
        this.title = title;
        this.website = website;
        this.socialProfileLinks = socialProfileLinks;
        this.gender = gender;
        this.age = age;
        this.influencerScore = influencerScore;
        this.notes = notes;
        this.industry = industry;
        this.avatars = avatars;
        this.otherDatas = otherDatas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public String getNameProfileLink() {
        return nameProfileLink;
    }

    public void setNameProfileLink(String nameProfileLink) {
        this.nameProfileLink = nameProfileLink;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyProfileLink() {
        return companyProfileLink;
    }

    public void setCompanyProfileLink(String companyProfileLink) {
        this.companyProfileLink = companyProfileLink;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public List<String> getSocialProfileLinks() {
        return socialProfileLinks;
    }

    public void setSocialProfileLinks(List<String> socialProfileLinks) {
        this.socialProfileLinks = socialProfileLinks;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfluencerScore() {
        return influencerScore;
    }

    public void setInfluencerScore(String influencerScore) {
        this.influencerScore = influencerScore;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public List<String> getAvatars() {
        return avatars;
    }

    public void setAvatars(List<String> avatars) {
        this.avatars = avatars;
    }

    public List<String> getOtherDatas() {
        return otherDatas;
    }

    public void setOtherDatas(List<String> otherDatas) {
        this.otherDatas = otherDatas;
    }
}
