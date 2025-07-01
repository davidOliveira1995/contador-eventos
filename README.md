## Contador Regressivo de Eventos em Java
Um simples projeto de console para calcular e exibir o tempo restante até um evento futuro. Este projeto foi desenvolvido como um exercício prático para iniciantes aprenderem a utilizar a API de Data e Hora (java.time) do Java.

## 🎯 Sobre o Projeto
O objetivo deste projeto é demonstrar de forma clara e objetiva os conceitos fundamentais da manipulação de datas e horas em Java, introduzidos a partir do Java 8. A aplicação interage com o usuário via console, solicitando o nome e a data de um evento futuro, e então exibe uma contagem regressiva precisa em dias, horas, minutos e segundos.

## ✨ Funcionalidades
<ul>
<li></li>Entrada de Dados do Usuário: Solicita o nome e a data/hora de um evento.</li>

<li>Cálculo Preciso: Utiliza as classes LocalDateTime e Duration para calcular com precisão o tempo restante.</li>

<li>Exibição Formatada: Mostra o resultado de forma clara e legível para o usuário.</li>

<li>Validação de Formato: Garante que o usuário insira a data no formato esperado (DD/MM/AAAA HH:mm).</li>

<li>Tratamento de Eventos Passados: Informa ao usuário caso a data inserida já tenha ocorrido.</li>
</ul>
## 🛠️ Tecnologias e Conceitos Aplicados
Java (JDK 8 ou superior)

<li>API java.time:</li>
<li>
<li>LocalDateTime: Para representar a data e hora do evento.</li>

<li>Duration: Para calcular a diferença entre dois momentos.</li>

<li>DateTimeFormatter: Para converter o texto do usuário em uma data válida.</li>
</li>
<li>Programação Orientada a Objetos (POO):
<li>
<li>Classes, Atributos e Métodos.</li>

<li>Construtores para inicialização de objetos.</li>

<li>Encapsulamento (atributos private).</li>
</li>
<li>Tratamento de Exceções:</li>
<li>
<li>Bloco try-catch para lidar com DateTimeParseException em caso de formato de data inválido.</li>
</li>
<li>Entrada e Saída de Dados no Console:</li>
<li>
<li>Uso da classe Scanner para ler a entrada do usuário.</li>

<li>Uso de System.out.println() e System.out.printf() para exibir informações.</li>
</li>
