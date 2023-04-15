package com.damjan.uncommongoods.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String price;
    @Column(nullable = false)
    private String photo_one;
    @Column(nullable = false)
    private String photo_two;
    @Column(nullable = false)
    private String photo_three;
    @Column(nullable = false)
    private String photo_four;
    @Column(nullable = false)
    private String photo_five;

    public Product() {
    }

    public Product(String name, String description, String price, String photo_one, String photo_two,
                   String photo_three, String photo_four, String photo_five) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.photo_one = photo_one;
        this.photo_two = photo_two;
        this.photo_three = photo_three;
        this.photo_four = photo_four;
        this.photo_five = photo_five;
    }

    public Product(Integer id, String name, String description, String price, String photo_one, String photo_two,
                   String photo_three, String photo_four, String photo_five) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.photo_one = photo_one;
        this.photo_two = photo_two;
        this.photo_three = photo_three;
        this.photo_four = photo_four;
        this.photo_five = photo_five;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPhoto_one() {
        return photo_one;
    }

    public void setPhoto_one(String photo_one) {
        this.photo_one = photo_one;
    }

    public String getPhoto_two() {
        return photo_two;
    }

    public void setPhoto_two(String photo_two) {
        this.photo_two = photo_two;
    }

    public String getPhoto_three() {
        return photo_three;
    }

    public void setPhoto_three(String photo_three) {
        this.photo_three = photo_three;
    }

    public String getPhoto_four() {
        return photo_four;
    }

    public void setPhoto_four(String photo_four) {
        this.photo_four = photo_four;
    }

    public String getPhoto_five() {
        return photo_five;
    }

    public void setPhoto_five(String photo_five) {
        this.photo_five = photo_five;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(name, product.name) &&
                Objects.equals(description, product.description) && Objects.equals(price, product.price) &&
                Objects.equals(photo_one, product.photo_one) && Objects.equals(photo_two, product.photo_two) &&
                Objects.equals(photo_three, product.photo_three) && Objects.equals(photo_four, product.photo_four) &&
                Objects.equals(photo_five, product.photo_five);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, price, photo_one, photo_two, photo_three, photo_four, photo_five);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", photo_one='" + photo_one + '\'' +
                ", photo_two='" + photo_two + '\'' +
                ", photo_three='" + photo_three + '\'' +
                ", photo_four='" + photo_four + '\'' +
                ", photo_five='" + photo_five + '\'' +
                '}';
    }
}

