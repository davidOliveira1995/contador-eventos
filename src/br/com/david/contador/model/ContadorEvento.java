package br.com.david.contador.model;

import java.time.Duration;
import java.time.LocalDateTime;

public class ContadorEvento {

    private String nomeDoEvento;
    private LocalDateTime dataDoEvento;

    public ContadorEvento(String nomeDoEvento, LocalDateTime dataDoEvento) {
        this.nomeDoEvento = nomeDoEvento;
        this.dataDoEvento = dataDoEvento;
    }

    public Duration calcularTempoRestante() {

        LocalDateTime dataAtual = LocalDateTime.now();

        Duration.between(dataAtual, this.dataDoEvento);

        return Duration.between(dataAtual, this.dataDoEvento);
    }

    public void exibirContagemRegressiva() {

        Duration duracao = this.calcularTempoRestante();

        if (duracao.isNegative()) {
            System.out.println("O evento '" + this.nomeDoEvento + "' já aconteceu!");
            return;
        }

        long dias = duracao.toDays();
        int horas = duracao.toHoursPart();
        int minutos = duracao.toMinutesPart();
        int segundos = duracao.toSecondsPart();

        System.out.printf(
                "Faltam: %d dias, %d horas, %d minutos e %d segundos para o evento '%s'!%n",
                dias, horas, minutos, segundos, this.nomeDoEvento
        );
    }
}
