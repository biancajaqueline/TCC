/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class GraficoAreaGeral extends ApplicationFrame {

    UsuarioDTO usuario;

    public GraficoAreaGeral(String applicationTitle, UsuarioDTO usuario) {
        super(applicationTitle);
        this.usuario = usuario;

        setContentPane(createDemoPanel());
    }

    public JPanel createDemoPanel() {
        JFreeChart chart = createChart(createDataset());
        return new ChartPanel(chart);
    }

    private JFreeChart createChart(CategoryDataset dataset) {
        JFreeChart barChart = ChartFactory.createBarChart(
                "Desempenho Geral por Área",
                "Categoria",
                "Pontos",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(600, 600));
        return barChart;
    }

    private CategoryDataset createDataset() {

        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(usuario.getPontuacaoA1() + .0, "Química", "Química");
        dataset.addValue(usuario.getPontuacaoA2() + .0, "Física", "Física");
        dataset.addValue(usuario.getPontuacaoA3() + .0, "História", "História");
        dataset.addValue(usuario.getPontuacaoA4() + .0, "Geografia", "Geografia");
        dataset.addValue(usuario.getPontuacaoA5() + .0, "Biologia", "Biologia");
        dataset.addValue(usuario.getPontuacaoA6() + .0, "Sociologia", "Sociologia");
        dataset.addValue(usuario.getPontuacaoA7() + .0, "Filosofia", "Filosofia");
        dataset.addValue(usuario.getPontuacaoA8() + .0, "Matemática", "Matemática");
        dataset.addValue(usuario.getPontuacaoA9() + .0, "Português", "Português");

        return dataset;
    }

}
