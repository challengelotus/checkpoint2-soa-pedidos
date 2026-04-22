package br.com.fiap3espg.checkpoint2.model;

import java.time.LocalDate;
import java.math.BigDecimal;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Preenchimento do nome é obrigatório!")
    private String clientName;
    private LocalDate orderDate;
    private BigDecimal totalValue;

    public void prePersist() {
        if (orderDate == null) {
            orderDate = LocalDate.now();
        }
    }
}
