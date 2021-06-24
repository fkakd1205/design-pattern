import command.*;
import drawer.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
    // 그림 그리기 이력
    private MacroCommand history = new MacroCommand();
    // 그림 그리기 영역
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    // 삭제 버튼
    private JButton clearButton  = new JButton("clear");
    // undo 버튼                                       
    private JButton undoButton  = new JButton("undo");      

    // 생성자
    public Main(String title) {
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);
        undoButton.addActionListener(this);         

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(undoButton);                  
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        show();
    }

    // ActionListener용
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            history.clear();
            canvas.repaint();
        } else if (e.getSource() == undoButton) {       
            history.undo();       // 가장 마지막에 그려진 점을 지운다                      
            canvas.repaint();       // 다 지우고 다시 실행(제일 뒤 지워진 것 빼고 그려진다) - history의 저장된 command에 따라 그려짐                    
        }
    }

    // MouseMotionListener용
    public void mouseMoved(MouseEvent e) {
    }
    
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();
    }

    // WindowListener용
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
    
    public void windowActivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowOpened(WindowEvent e) {}

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }
}
