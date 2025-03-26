package com.fatura.apifatura.model;


import jakarta.persistence.*;
import lombok.*;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

@Entity
@Table(name = "faturas")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Fatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @NotNull(message = "O cartão não pode estar em branco")
    @Digits(integer = 16, fraction = 4, message = "O cartão deve possuir 16 digitos")
    private String numeroCartao;



    @NotNull(message = "O nome do titular deve ter entre 3 e 100 caracteres")
    @Size(min = 3, max = 100)
    private String nomeTitular;



    @NotNull(message = "Mínimo 10.00, máximo 5000.00")
    @DecimalMin(value="10.00", message = "O valor minimo é 10.00")
    @DecimalMax(value = "5000.00", message = "O valor máximo é 5000.00")
    private Double valor;

    @NotNull(message = "A data não pode ser nula")
    @FutureOrPresent(message = "A data de vencimento deve ser a data atual ou futura")
    private LocalDate dataPagamento;

    @NotNull(message = "O email não pode estar em branco")
    @Email(message = "O e-mail deve ser válido")
    private String email;





}
