package br.com.david.contador.app;

import br.com.david.contador.model.ContadorEvento;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Contador Regressivo para Eventos ---");

        System.out.print("Digite o nome do evento: ");
        String nomeEvento = scanner.nextLine();

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDateTime dataEvento = null;

        while (dataEvento == null) {
            System.out.print("Digite a data e hora do evento (formato DD/MM/AAAA HH:mm): ");
            String dataTexto = scanner.nextLine();

            try {
                dataEvento = LocalDateTime.parse(dataTexto, formatador);
            } catch (DateTimeParseException e) {

                System.out.println("Formato de data inválido! Por favor, tente novamente.");
            }
        }

        ContadorEvento meuContador = new ContadorEvento(nomeEvento, dataEvento);

        meuContador.exibirContagemRegressiva();

        scanner.close();
    }
}