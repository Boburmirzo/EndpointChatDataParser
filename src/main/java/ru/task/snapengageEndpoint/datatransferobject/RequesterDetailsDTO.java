
package ru.task.snapengageEndpoint.datatransferobject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
/**
 * Created by bumurzaqov on 28.04.2018.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "emails",
    "name_profile_link",
    "phones",
    "address",
    "address_2",
    "city",
    "state",
    "zip",
    "country",
    "company_name",
    "company_profile_link",
    "employees",
    "revenue",
    "title",
    "website",
    "social_profile_links",
    "gender",
    "age",
    "influencer_score",
    "notes",
    "industry",
    "avatars",
    "other_data"
})
public class RequesterDetailsDTO {

    @JsonProperty("name")
    private String name;
    @JsonProperty("emails")
    private List<String> emails = null;
    @JsonProperty("name_profile_link")
    private String nameProfileLink;
    @JsonProperty("phones")
    private List<String> phones = null;
    @JsonProperty("address")
    private String address;
    @JsonProperty("address_2")
    private String address2;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("zip")
    private String zip;
    @JsonProperty("country")
    private String country;
    @JsonProperty("company_name")
    private String companyName;
    @JsonProperty("company_profile_link")
    private String companyProfileLink;
    @JsonProperty("employees")
    private String employees;
    @JsonProperty("revenue")
    private String revenue;
    @JsonProperty("title")
    private String title;
    @JsonProperty("website")
    private String website;
    @JsonProperty("social_profile_links")
    private List<String> socialProfileLinks = null;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("age")
    private Integer age;
    @JsonProperty("influencer_score")
    private String influencerScore;
    @JsonProperty("notes")
    private String notes;
    @JsonProperty("industry")
    private String industry;
    @JsonProperty("avatars")
    private List<String> avatars = null;
    @JsonProperty("other_data")
    private List<String> otherData = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public RequesterDetailsDTO() {
    }

    /**
     * 
     * @param influencerScore
     * @param zip
     * @param website
     * @param state
     * @param otherData
     * @param companyProfileLink
     * @param address2
     * @param emails
     * @param companyName
     * @param nameProfileLink
     * @param phones
     * @param city
     * @param country
     * @param title
     * @param address
     * @param age
     * @param name
     * @param socialProfileLinks
     * @param avatars
     * @param gender
     * @param industry
     * @param notes
     * @param revenue
     * @param employees
     */
    public RequesterDetailsDTO(String name, List<String> emails, String nameProfileLink, List<String> phones, String address, String address2, String city, String state, String zip, String country, String companyName, String companyProfileLink, String employees, String revenue, String title, String website, List<String> socialProfileLinks, String gender, Integer age, String influencerScore, String notes, String industry, List<String> avatars, List<String> otherData) {
        super();
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
        this.otherData = otherData;
    }

    @Override
    public String toString() {
        return "RequesterDetailsDTO [name=" + name +", emails=" + emails + ", nameProfileLink=" + nameProfileLink + ", phones=" + phones + ", address=" + address+ ", address2=" + address2;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public RequesterDetailsDTO withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("emails")
    public List<String> getEmails() {
        return emails;
    }

    @JsonProperty("emails")
    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public RequesterDetailsDTO withEmails(List<String> emails) {
        this.emails = emails;
        return this;
    }

    @JsonProperty("name_profile_link")
    public String getNameProfileLink() {
        return nameProfileLink;
    }

    @JsonProperty("name_profile_link")
    public void setNameProfileLink(String nameProfileLink) {
        this.nameProfileLink = nameProfileLink;
    }

    public RequesterDetailsDTO withNameProfileLink(String nameProfileLink) {
        this.nameProfileLink = nameProfileLink;
        return this;
    }

    @JsonProperty("phones")
    public List<String> getPhones() {
        return phones;
    }

    @JsonProperty("phones")
    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public RequesterDetailsDTO withPhones(List<String> phones) {
        this.phones = phones;
        return this;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    public RequesterDetailsDTO withAddress(String address) {
        this.address = address;
        return this;
    }

    @JsonProperty("address_2")
    public String getAddress2() {
        return address2;
    }

    @JsonProperty("address_2")
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public RequesterDetailsDTO withAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public RequesterDetailsDTO withCity(String city) {
        this.city = city;
        return this;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public RequesterDetailsDTO withState(String state) {
        this.state = state;
        return this;
    }

    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    public RequesterDetailsDTO withZip(String zip) {
        this.zip = zip;
        return this;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public RequesterDetailsDTO withCountry(String country) {
        this.country = country;
        return this;
    }

    @JsonProperty("company_name")
    public String getCompanyName() {
        return companyName;
    }

    @JsonProperty("company_name")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public RequesterDetailsDTO withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    @JsonProperty("company_profile_link")
    public String getCompanyProfileLink() {
        return companyProfileLink;
    }

    @JsonProperty("company_profile_link")
    public void setCompanyProfileLink(String companyProfileLink) {
        this.companyProfileLink = companyProfileLink;
    }

    public RequesterDetailsDTO withCompanyProfileLink(String companyProfileLink) {
        this.companyProfileLink = companyProfileLink;
        return this;
    }

    @JsonProperty("employees")
    public String getEmployees() {
        return employees;
    }

    @JsonProperty("employees")
    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public RequesterDetailsDTO withEmployees(String employees) {
        this.employees = employees;
        return this;
    }

    @JsonProperty("revenue")
    public String getRevenue() {
        return revenue;
    }

    @JsonProperty("revenue")
    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }

    public RequesterDetailsDTO withRevenue(String revenue) {
        this.revenue = revenue;
        return this;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public RequesterDetailsDTO withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
    }

    public RequesterDetailsDTO withWebsite(String website) {
        this.website = website;
        return this;
    }

    @JsonProperty("social_profile_links")
    public List<String> getSocialProfileLinks() {
        return socialProfileLinks;
    }

    @JsonProperty("social_profile_links")
    public void setSocialProfileLinks(List<String> socialProfileLinks) {
        this.socialProfileLinks = socialProfileLinks;
    }

    public RequesterDetailsDTO withSocialProfileLinks(List<String> socialProfileLinks) {
        this.socialProfileLinks = socialProfileLinks;
        return this;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    public RequesterDetailsDTO withGender(String gender) {
        this.gender = gender;
        return this;
    }

    @JsonProperty("age")
    public Integer getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(Integer age) {
        this.age = age;
    }

    public RequesterDetailsDTO withAge(Integer age) {
        this.age = age;
        return this;
    }

    @JsonProperty("influencer_score")
    public String getInfluencerScore() {
        return influencerScore;
    }

    @JsonProperty("influencer_score")
    public void setInfluencerScore(String influencerScore) {
        this.influencerScore = influencerScore;
    }

    public RequesterDetailsDTO withInfluencerScore(String influencerScore) {
        this.influencerScore = influencerScore;
        return this;
    }

    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(String notes) {
        this.notes = notes;
    }

    public RequesterDetailsDTO withNotes(String notes) {
        this.notes = notes;
        return this;
    }

    @JsonProperty("industry")
    public String getIndustry() {
        return industry;
    }

    @JsonProperty("industry")
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public RequesterDetailsDTO withIndustry(String industry) {
        this.industry = industry;
        return this;
    }

    @JsonProperty("avatars")
    public List<String> getAvatars() {
        return avatars;
    }

    @JsonProperty("avatars")
    public void setAvatars(List<String> avatars) {
        this.avatars = avatars;
    }

    public RequesterDetailsDTO withAvatars(List<String> avatars) {
        this.avatars = avatars;
        return this;
    }

    @JsonProperty("other_data")
    public List<String> getOtherData() {
        return otherData;
    }

    @JsonProperty("other_data")
    public void setOtherData(List<String> otherData) {
        this.otherData = otherData;
    }

    public RequesterDetailsDTO withOtherData(List<String> otherData) {
        this.otherData = otherData;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public RequesterDetailsDTO withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
