package co.com.choucair.certification.newexperiencie.model;

public class User {
    private String title,firstname,lastname,email,password,dateofBirth,company,address,address2,city,state,postalCode,country,aditionalInformation,homephone,mobilephone,addressalias;

    public User(String title, String firstname, String lastname, String email, String password, String dateofBirth,String company, String address,String address2, String city, String state, String postalCode, String country,String aditionalInformation, String homephone,String mobilephone, String addressalias) {
        this.title = title;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.dateofBirth = dateofBirth;
        this.company = company;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.aditionalInformation = aditionalInformation;
        this.homephone = homephone;
        this.mobilephone = mobilephone;
        this.addressalias = addressalias;
    }

    public String getTitle() { return title;}

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {this.lastname = lastname; }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddres() {
        return address;
    }

    public void setAddres(String address) {
        this.address = address;
    }
    public String getAddress2() {
        return address;
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAditionalInformation() {return aditionalInformation;}

    public void setAditionalInformation(String aditionalInformation) { this.aditionalInformation = aditionalInformation;}

    public String getHomephone() {return homephone;}

    public void setHomephone(String homephone) {this.homephone = homephone;}

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public String getAddressalias() {
        return addressalias;
    }

    public void setAddressalias(String addressalias) {
        this.addressalias = addressalias;
    }


}
