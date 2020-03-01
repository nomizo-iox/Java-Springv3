package io.nomizo.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "phone_books")
public class PhoneBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String telephone;

    @ManyToMany
    private Set<Customer> customers;

    public PhoneBook() { super(); }

    public PhoneBook(long id, String telephone, Set<Customer> customers) {
        this.id = id;
        this.telephone = telephone;
        this.customers = customers;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }

    public Set<Customer> getCustomers() { return customers; }
    public void setCustomers(Set<Customer> customerSet) { this.customers = customerSet; }

    @Override
    public String toString() { return ToStringBuilder.reflectionToString(this); }
}
