package aula1208;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class AtividadeClass {
    public static void main(String[] args) {
        String file = "index.html";

        String top = """
                <html lang="pt-BR">
                <head>
                    <meta charset="UTF-8">
                    <title>Gráfico</title>
                    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
                    <script type="text/javascript">
                        google.charts.load('current', { 'packages': ['corechart'] });
                        google.charts.setOnLoadCallback(drawChart);
                
                        function drawChart() {
                            var data = google.visualization.arrayToDataTable([
                                ['x', 'Valor'],
                """;
        String bottom = """
                            ]);
                
                            var options = {
                                title: 'Gráfico',
                                curveType: 'function',
                                legend: { position: 'bottom' }
                            };
                
                            var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));
                
                            chart.draw(data, options);
                        }
                    </script>
                </head>
                <body>
                    <div id="curve_chart" style="width: 900px; height: 500px"></div>
                </body>
                </html>
                """;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o intervalo");
        System.out.println("Inicio");
        int in = input.nextInt();
        System.out.println("Fim");
        int fim = input.nextInt();
        System.out.println("Quantidade de aleatórios");
        int qntA = input.nextInt();
        input.close();

        if (in > fim) {
            int aux = in;
            in = fim;
            fim = aux;
        }

        StringBuilder content = new StringBuilder();
        Random ale = new Random();
        int rand =0;
        for(int i =0; i<qntA;i++) {
            rand = ale.nextInt(in, fim);
            String aux = "[" + i + "," + rand + "],";
            content.append(aux);
        }

        String html = top + content + bottom;

        try {
            FileWriter writer = new FileWriter(file);
            writer.write(html);
            writer.close();
            System.out.println("Arquivo criado!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro");
        }
    }
}