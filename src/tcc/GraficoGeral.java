package tcc;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class GraficoGeral extends ApplicationFrame {

    UsuarioDTO usuario;

    public GraficoGeral(String title, UsuarioDTO usuario) {
        super(title);
        this.usuario = usuario;
        setContentPane(createDemoPanel());
    }

    private PieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Fácil", new Double(usuario.getPontF()));
        dataset.setValue("Médio", new Double(usuario.getPontM()));
        dataset.setValue("Difícil", new Double(usuario.getPontD()));
        return dataset;
    }

    private JFreeChart createChart(PieDataset dataset) {
        JFreeChart chart = ChartFactory.createPieChart(
                "Desempenho Geral", // chart title 
                dataset, // data    
                true, // include legend   
                true,
                false);

        return chart;
    }

    public JPanel createDemoPanel() {
        JFreeChart chart = createChart(createDataset());
        return new ChartPanel(chart);
    }

}
