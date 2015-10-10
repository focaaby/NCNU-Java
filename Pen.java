/*
*File Name:Homework2-1
*ID:100213014
*Author:龍志雄
*Since:2012/03/03
*Toolkit:UltraEdit
*/
import java.awt.*;
import javax.swing.*;
public class Pen {
    private LocalPaint pc;
    private int cx, cy;
    public static void main(String[] argv) {
        Pen p = new Pen();
        for (int i = 30; i < 600; i += 30) {
            for (int j = 20; j < 800;j +=40) {
                p.flyTo(j, i);
                p.runTo(j+20,i);
            }
        }
    }
    public Pen() {
        JFrame f = new JFrame("程式設計下範例:");
        f.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE );
        f.getContentPane().add(new JScrollPane(pc = new LocalPaint()));
        f.setSize(850,650);
        f.setVisible(true);
    }
    /**
     * Set cursor to (x,y)
     */
    public void flyTo(int x, int y) {
        cx = x;
        cy = y;
    }
    /**
     *Draw a line from cursor to (x,y), then set cursor to (x,y)
     */
    public void runTo(int x, int y) {
        Graphics g = pc.getGraphics();
        g.drawLine(cx, cy, x ,y);
        cx = x;
        cy = y;
        pc.repaint();
    }
    class LocalPaint extends JComponent {
        private Image tmp;
        public void paint(Graphics g) {
            g.drawImage(tmp, 0, 0, null);
        }
        public Dimension getPreferredSize() {
            return new Dimension(800, 600);
        }
        public Graphics getGraphics() {
            if (tmp == null)
                tmp = createImage(800, 600);
                return tmp.getGraphics();
        }
    }
}