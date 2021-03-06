package tcc;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class GráficoSessao extends ApplicationFrame {

    UsuarioDTO usuario;

    public GráficoSessao(String applicationTitle, UsuarioDTO usuario) {
        super(applicationTitle);
        this.usuario = usuario;
        setContentPane(createDemoPanel());
    }
    private JFreeChart createChart(CategoryDataset dataset) {
        JFreeChart barChart = ChartFactory.createBarChart(
                "Gráfico da Sessão",
                "Categoria",
                "Pontos",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(600, 600));
        return barChart;
    }
    
    public JPanel createDemoPanel() {
        JFreeChart chart = createChart(createDataset());
        return new ChartPanel(chart);
    }

    private CategoryDataset createDataset() {

        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(usuario.getPontSessaoA1() + .0, "Química", "Química");
        dataset.addValue(usuario.getPontSessaoA2() + .0, "Física", "Física");
        dataset.addValue(usuario.getPontSessaoA3() + .0, "História", "História");
        dataset.addValue(usuario.getPontSessaoA4() + .0, "Geografia", "Geografia");
        dataset.addValue(usuario.getPontSessaoA5() + .0, "Biologia", "Biologia");
        dataset.addValue(usuario.getPontSessaoA6() + .0, "Sociologia", "Sociologia");
        dataset.addValue(usuario.getPontSessaoA7() + .0, "Filosofia", "Filosofia");
        dataset.addValue(usuario.getPontSessaoA8() + .0, "Matemática", "Matemática");
        dataset.addValue(usuario.getPontSessaoA9() + .0, "Português", "Português");

        return dataset;
    }

}
