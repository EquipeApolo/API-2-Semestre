package projeto.GUI;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.TableCellRenderer;

public class WordWrapRenderer extends JTextArea implements TableCellRenderer{
    
    public WordWrapRenderer(){
        setLineWrap(true);
        setWrapStyleWord(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        setText( (value == null) ? "" : value.toString() );
        setSize(table.getColumnModel().getColumn(column).getWidth(), table.getRowHeight(row));

        int preferredHeight = getPreferredSize().height;

        if (table.getRowHeight(row) != preferredHeight){
            table.setRowHeight(row, preferredHeight);
        }

        return this;
    }
}