package desafio.itau.demo.Controllers;

import desafio.itau.demo.DTO.TransactionRequestDTO;
import desafio.itau.demo.Services.TransactionServices;
import desafio.itau.demo.model.Transaction;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.OffsetDateTime;

@RestController
@RequestMapping("/transacao")
public class TransactionController {

    private final TransactionServices transactionServices;

    public TransactionController(TransactionServices transactionServices) {
        this.transactionServices = transactionServices;
    }

    @PostMapping
    public ResponseEntity<Void> createTransaction( @Valid @RequestBody TransactionRequestDTO request) {

        if (request.getDataHora().isAfter(OffsetDateTime.now()) || request.getValor() <= 0) {
            return ResponseEntity.unprocessableEntity().build();
        }
        transactionServices.addTrassaction(new Transaction(request.getValor(), request.getDataHora()));


        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping
    public ResponseEntity<Void> clearTransactions() {
        transactionServices.clearTransaction();
        return ResponseEntity.ok().build();
    }

}
