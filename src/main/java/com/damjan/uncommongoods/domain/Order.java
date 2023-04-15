package com.damjan.uncommongoods.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User costumer;
    @Column(nullable = false)
    private LocalDateTime order_date;
    @Column
    private String status;

    public Order() {
    }

    public Order(User costumer, LocalDateTime order_date, String status) {
        this.costumer = costumer;
        this.order_date = order_date;
        this.status = status;
    }

    public Order(Integer id, User costumer, LocalDateTime order_date, String status) {
        this.id = id;
        this.costumer = costumer;
        this.order_date = order_date;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getCostumer() {
        return costumer;
    }

    public void setCostumer(User costumer) {
        this.costumer = costumer;
    }

    public LocalDateTime getOrder_date() {
        return order_date;
    }

    public void setOrder_date(LocalDateTime order_date) {
        this.order_date = order_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(costumer, order.costumer) &&
                Objects.equals(order_date, order.order_date) && Objects.equals(status, order.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, costumer, order_date, status);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", costumer=" + costumer +
                ", order_date=" + order_date +
                ", status='" + status + '\'' +
                '}';
    }
}
