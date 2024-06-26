package cn.com.wysha.cards;

import cn.com.wysha.GUI.WarnView;
import cn.com.wysha.Main;
import cn.com.wysha.online.Room;

import javax.swing.*;

public class NewRoomPanel{
    public final String cardName=this.getClass().getName();
    public JPanel panel;
    private JButton startButton;
    private JSpinner width;
    private JSpinner height;
    private JTextField name;

    public NewRoomPanel() {
        startButton.addActionListener(e -> {
            int w=(Integer) width.getValue();
            int h=(Integer) height.getValue();
            if (w>=5&&h>=5){
                Main.mainForm.setEnabled(false);
                new Room(name.getText(),w , h);
            }else {
                new WarnView("无效的棋盘大小,棋盘大小至少为5*5").setVisible(true);
            }
        });
    }
}
