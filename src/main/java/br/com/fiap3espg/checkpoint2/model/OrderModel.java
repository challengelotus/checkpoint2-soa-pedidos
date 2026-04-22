package br.com.fiap3espg.checkpoint2.model;

import java.time.LocalDate;
import java.math.BigDecimal;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrderModel {
    @Id
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
