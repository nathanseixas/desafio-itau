package desafio.itau.demo.DTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;

public class TransactionRequestDTO {

    @NotNull
    @Min(0)
    private Double valor;

    @NotNull
    private OffsetDateTime dataHora;


    public Double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
}
