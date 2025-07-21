package desafio.itau.demo.DTO;

import java.util.DoubleSummaryStatistics;

public class StatisticsResponseDTO {
    private long count;
    private double sum;
    private double avg;
    private double min;
    private double max;

    public StatisticsResponseDTO(DoubleSummaryStatistics stats) {
        this.count = stats.getCount();
        this.sum = stats.getSum();
        this.avg = stats.getAverage();
        this.min = stats.getMin();
        this.max = stats.getMax();
    }

    public long getCount() {
        return count;
    }

    public double getSum() {
        return sum;
    }

    public double getAvg() {
        return avg;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }
}
