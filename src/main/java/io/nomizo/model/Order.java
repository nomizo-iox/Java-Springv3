package io.nomizo.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.EAGER, mappedBy = "order")
    private List<Item> itemList;

    public Order() { super(); }


    public Order(long id, Date createdAt, Customer customer, List<Item> itemList) {
        this.id = id;
        this.createdAt = createdAt;
        this.customer = customer;
        this.itemList = itemList;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public List<Item> getItemList() { return itemList; }
    public void setItemList(List<Item> itemList) { this.itemList = itemList; }

    @Override
    public String toString() { return ToStringBuilder.reflectionToString(this); }
}
