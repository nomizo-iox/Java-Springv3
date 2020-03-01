package io.nomizo.model;


import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customers")
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private String email;

//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(name = "customer_phones")
//    private Set<PhoneNumber> phoneNumberSet;


    public Customer() { super(); }

//    Set<PhoneNumber> phoneNumberSet


    public Customer(long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
//        this.phoneNumberSet = phoneNumberSet;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

//    public Set<PhoneNumber> getPhoneNumberSet() { return phoneNumberSet; }
//    public void setPhoneNumberSet(Set<PhoneNumber> phoneNumberSet) { this.phoneNumberSet = phoneNumberSet; }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
