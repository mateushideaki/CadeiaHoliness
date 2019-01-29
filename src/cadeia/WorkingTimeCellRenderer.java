package cadeia;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class WorkingTimeCellRenderer extends DefaultTableCellRenderer {
	private static final long serialVersionUID = 3624797326034103076L;

	@Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                   boolean hasFocus, int row, int column) {
		
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        PresoTableModel model = (PresoTableModel) table.getModel();

        Color color = model.getLibertos().contains(row) ? Color.GREEN : Color.BLACK;
        c.setForeground(color);

        return c;
    }
}