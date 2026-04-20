package br.com.fiap3espg.checkpoint2.model;

import jakarta.persistence.Entity;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class OrderModel {
    private Long id;
    private String clientName;
    private LocalDate orderDate;
    private BigDecimal totalValue;

    public void prePersist() {
        if (orderDate == null) {
            orderDate = LocalDate.now();
        }
    }
}
