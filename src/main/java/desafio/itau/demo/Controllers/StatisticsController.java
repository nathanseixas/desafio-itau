package desafio.itau.demo.Controllers;

import desafio.itau.demo.DTO.StatisticsResponseDTO;
import desafio.itau.demo.Services.TransactionServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.DoubleSummaryStatistics;

@RestController
@RequestMapping("/estatisticas")
public class StatisticsController {

    private final TransactionServices transactionServices;

    public StatisticsController(TransactionServices transactionServices) {
        this.transactionServices = transactionServices;
    }

    @GetMapping
    public ResponseEntity<StatisticsResponseDTO> getStatistics() {
        DoubleSummaryStatistics stats = transactionServices.getStatistics();

        return ResponseEntity.ok(new StatisticsResponseDTO(stats));

    }
}
