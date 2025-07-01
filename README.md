## Contador Regressivo de Eventos em Java
Um simples projeto de console para calcular e exibir o tempo restante até um evento futuro. Este projeto foi desenvolvido como um exercício prático para iniciantes aprenderem a utilizar a API de Data e Hora (java.time) do Java.

## 🎯 Sobre o Projeto
O objetivo deste projeto é demonstrar de forma clara e objetiva os conceitos fundamentais da manipulação de datas e horas em Java, introduzidos a partir do Java 8. A aplicação interage com o usuário via console, solicitando o nome e a data de um evento futuro, e então exibe uma contagem regressiva precisa em dias, horas, minutos e segundos.

## ✨ Funcionalidades
Entrada de Dados do Usuário: Solicita o nome e a data/hora de um evento.

Cálculo Preciso: Utiliza as classes LocalDateTime e Duration para calcular com precisão o tempo restante.

Exibição Formatada: Mostra o resultado de forma clara e legível para o usuário.

Validação de Formato: Garante que o usuário insira a data no formato esperado (DD/MM/AAAA HH:mm).

Tratamento de Eventos Passados: Informa ao usuário caso a data inserida já tenha ocorrido.

## 🛠️ Tecnologias e Conceitos Aplicados
Java (JDK 8 ou superior)

API java.time:

LocalDateTime: Para representar a data e hora do evento.

Duration: Para calcular a diferença entre dois momentos.

DateTimeFormatter: Para converter o texto do usuário em uma data válida.

Programação Orientada a Objetos (POO):

Classes, Atributos e Métodos.

Construtores para inicialização de objetos.

Encapsulamento (atributos private).

Tratamento de Exceções:

Bloco try-catch para lidar com DateTimeParseException em caso de formato de data inválido.

Entrada e Saída de Dados no Console:

Uso da classe Scanner para ler a entrada do usuário.

Uso de System.out.println() e System.out.printf() para exibir informações.
