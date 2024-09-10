package task1;

public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private Company company;
    private Address address;
    private String phone;
    private String website;

   public User(int id, String name, String username, String email, String phone, String website, Company company, String street, String suite,String city, String zipcode, Geo geo) {
       this.id = id;
       this.name = name;
       this.username = username;
       this.email = email;
       this.phone = phone;
       this.website = website;
       this.company = company;
       this.address = new Address(street, suite, city, zipcode, geo);
   }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        this.company = company;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return id + ", name: " + name + ", username: " + username + ", email: " + email + ", company: " + company + ", address: "+ address  + ", phone: " + phone  + ", website: " + website;
    }
}
