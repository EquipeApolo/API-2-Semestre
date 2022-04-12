/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.GUI;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author jenny
 */
public class WordWrapRenderer extends JTextArea implements TableCellRenderer{

    WordWrapRenderer() {
            setLineWrap(true);
            setWrapStyleWord(true);
    }
    
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int collumn){
        setText((value == null) ? "" : value.toString());
        setSize(table.getColumnModel().getColumn(collumn).getWidth(), table.getRowHeight(row));
        
        int preferredHeight = getPreferredSize().height;
        if(table.getRowHeight(row) != preferredHeight){
                table.setRowHeight(row, preferredHeight);
        }
        
        return this;
    }
    
    
}
