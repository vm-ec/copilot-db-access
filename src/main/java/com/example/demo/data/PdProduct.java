package com.example.demo.data;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "PD_PRODUCT")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PdProduct {

    @Id
    @Column(name = "PD_PRODUCT_ID", nullable = false)
    private Long pdProductId;

    @Column(name = "PD_PRODUCT_NAME", length = 100)
    private String pdProductName;
}