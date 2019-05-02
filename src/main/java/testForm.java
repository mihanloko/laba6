import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class testForm extends JFrame {
    private JPanel panel1;
    private JTable table1;
    private JScrollPane scroll;

    public testForm() {
        Object[] headers = {"name", "address", "telephone"};
        Object[][] data = {};


        DefaultTableModel model = new DefaultTableModel(data, headers);
        //table1 = new JTable(model);

        //scroll = new JScrollPane(table1);
        table1.setModel(model);

        //panel1.add(scroll, BorderLayout.CENTER);


        setContentPane(panel1);
        setSize(new Dimension(800, 600));

        setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void addRow(Object[] dat) {
        DefaultTableModel model = (DefaultTableModel) (table1.getModel());
        model.addRow(dat);
    }
}