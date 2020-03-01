//package io.nomizo.model;
//
//import org.apache.commons.lang3.builder.ToStringBuilder;
//
//import javax.persistence.*;
//import java.util.Set;
//
//@Entity
//@Table(name = "phone_number")
//public class PhoneNumber {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long id;
//
//    private String telephoneNumber;
//
//    @ManyToMany(mappedBy = "phoneNumbers")
//    private Set<Customer> customerSet;
//
//
//    public PhoneNumber() { super(); }
//
//    public PhoneNumber(long id, String telephoneNumber, Set<Customer> customerSet) {
//        this.id = id;
//        this.telephoneNumber = telephoneNumber;
//        this.customerSet = customerSet;
//    }
//
//    public long getId() { return id; }
//    public void setId(long id) { this.id = id; }
//
//    public String getTelephoneNumber() { return telephoneNumber; }
//    public void setTelephoneNumber(String telephoneNumber) { this.telephoneNumber = telephoneNumber; }
//
//    public Set<Customer> getCustomerSet() { return customerSet; }
//    public void setCustomerSet(Set<Customer> customerSet) { this.customerSet = customerSet; }
//
//    @Override
//    public String toString() { return ToStringBuilder.reflectionToString(this); }
//}
