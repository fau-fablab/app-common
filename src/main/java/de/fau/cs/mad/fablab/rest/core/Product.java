package de.fau.cs.mad.fablab.rest.core;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

/**
 * This class represents a product, which is available in the Fablab
 */

@Entity
@Table(name="product")
public class Product {


    @Id
    @Column(name = "product_id")
    protected long productId;       //TAKE / USE THE OPEN ERP PRODUCT ID!

    @Column(name = "name", nullable = false)
    protected String name;

    @Column(name = "description")
    protected String description;

    @Column(name = "vendor")
    protected String vendor;

    @Column(name = "category_id")
    protected long categoryId;

    @Column(name = "category_string")
    protected String categoryString;

    @Column(name = "price")
    protected double price;

    @Column(name = "available")
    protected int itemsAvailable;

    public Product(){}
    public Product(long productId, String name, double price, long categoryId, String categoryString){
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.categoryId = categoryId;
        this.categoryString = categoryString;
    }

    @JsonProperty
    public long getProductId() {
        return productId;
    }
    public void setProductId(long id) {
        this.productId = productId;
    }

    @JsonProperty
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @JsonProperty
    public int getItemsAvailable() {
        return itemsAvailable;
    }
    public void setItemsAvailable(int itemsAvailable) {
        this.itemsAvailable = itemsAvailable;
    }

    @JsonProperty
    public long getCategoryId(){
        return categoryId;
    }
    public void setCategoryId(long id){this.categoryId = id; }

    @JsonProperty
    public String getCategoryString() {
        return categoryString;
    }
    public void setCategoryString(String cat){this.categoryString = cat;}

    public String toString() {
        return "Product : Name : " + this.getName() + " Price : " + this.getPrice()+ " Category : "+this.categoryString;
    }
}