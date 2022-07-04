package com.uptc.prg3.roulette.client.view;

import javax.swing.*;

public class JDialogScoreTable extends JDialog {
    private JLabel labTittle;
    private JButton btnExit;
    private JTable table;


//    public FrameScores(ArrayList<Object[]> table, ActionListener listener) {
//        super("TOP 10 puntuaciones");
//        initComponents(table,listener);
//    }
//
//    private void initComponents(ArrayList<Object[]> table,ActionListener listener) {
//        GridBagConstraints gbc = new GridBagConstraints();
//        labTittle = new JLabel("TOP 10 MEJORES PUNTUACIONES");
//		labTittle.setFont(new Font("Tahoma", Font.BOLD, 25));
//		gbc.gridx = 0;
//		gbc.gridy = 0;
//        this.add(tittleWelcome, gbc);
//
//        table = new JTable(initJTable(table));
//		table.setDefaultRenderer(Object.class, new Render());
//	//	table.setPreferredScrollableViewportSize(new Dimension(1100, 300));
//		table.setFillsViewportHeight(true);
//        gbc.gridx = 0;
//		gbc.gridy = 1;
//        this.add(table, gbc);
//
//        btnExit = new JButton("volver");
//        btnExit.addActionListener(listener);
//		btnExit.setActionCommand(Constants.EXIT_BTN_TO_MAIN);
//		gbc.gridx = 0;
//		gbc.gridy = 3;
//        this.add(btnExit, gbc);
//    }
//
//    public DefaultTableModel initJTable(ArrayList<Object[]> table) {
//		DefaultTableModel model = new DefaultTableModel() {
//			public boolean isCellEditable(int row,int columns) {
//				boolean[] options = new boolean[]{true,true};
//				return options[columns];
//			}
//		};
//		Object[] nameColumns = Constants.HEADERS;
//		getColumns(model,nameColumns);
//		getRows(model,table);
//		return model;
//	}
//
//	private void getColumns(DefaultTableModel model,Object[] nameColumns) {
//		for (Object object : nameColumns) {
//			model.addColumn(object);
//		}
//	}
//
//    private void getRows(DefaultTableModel model,ArrayList<Object[]> table) {
//		for (int i = 0; i < table.size(); i++) {
//			String nickname = String.valueOf(option[0]);
//			String score = String.valueOf(option[1]);
//			Object[] result = new Object[] {nickname , score};
//			model.addRow(result);
//		}
//
//
//
//	}
//
//
//	public void refreshTable(DefaultTableModel model) {
//		table.setModel(model);
//	}
//
//
}
