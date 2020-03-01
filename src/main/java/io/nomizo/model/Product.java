package io.nomizo.model;


import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String productName;

    public Product() { super(); }

    public Product(long id, String productName) {
        this.id = id;
        this.productName = productName;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    @Override
    public String toString() { return ToStringBuilder.reflectionToString(this); }
}
