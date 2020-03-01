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

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "customer_phones")
    private Set<PhoneBook> phoneBooks;

    public Customer() { super(); }

    public Customer(long id, String firstName, String lastName, String email, Set<PhoneBook> phoneBooks) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneBooks = phoneBooks;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Set<PhoneBook> getPhoneBooks() { return phoneBooks; }
    public void setPhoneBooks(Set<PhoneBook> phoneBooks) { this.phoneBooks = phoneBooks; }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
