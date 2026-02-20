package org.leafground;

public class Datacenter
{
    private String companyname = "Testleaf";
    private String country = "India";
    private String email = "madhanofficial08@gmail.com";
    private String about = "I am Madhan Kumar B , Current Fresher";
    private String lorem = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ";
    private String name = "Madhan";
    private String number = "51";

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLorem() {
        return lorem;
    }

    public void setLorem(String lorem) {
        this.lorem = lorem;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCompanyname()
    {
        return companyname;
    }

    public void setCompanyname(String companyname)
    {
        this.companyname = companyname;
    }
}
