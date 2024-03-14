import java.awt.event.*;
import java.awt.*;
import javax.swing.Timer;
import javax.swing.*;
import java.util.*;

public class Stopwatch extends JFrame {
    JTextField hoursField, minutesField, secondsField;
    Timer t_timers, t_stopwatch;
    private JButton menu_1_Btn, menu_2_Btn, startBtn, stopBtn, resetBtn, t_startBtn, t_stopBtn, t_resetBtn, addHoursBtn,
            deleteHoursBtn, addMinutesBtn, deleteMinutesBtn, addSecondsBtn, deleteSecondsBtn;
    private JPanel area1, areaStopwatch, areaTimers;
    private Container c;
    private int hours = 0, minutes = 0, seconds = 0, t_hours = 0, t_minutes = 0, t_seconds = 0, totalSeconds,
            s_Seconds = 0;
    private boolean running = false;

    public Stopwatch() {
        super("Clock Digital");
        Refresh f = new Refresh();
        Timers_Refresh tf = new Timers_Refresh();
        t_timers = new Timer(1000, tf);
        // time.start();
        t_stopwatch = new Timer(1000, f);
        setForeground(Color.BLUE);
        setFont(new Font("Century Gothic", Font.BOLD, 40));
        c = getContentPane();
        c.setLayout(new FlowLayout());
        area1 = new JPanel();
        area1.setPreferredSize(new Dimension(320, 70));

        bottomHandler handler = new bottomHandler();
        menu_1_Btn = new JButton("Stopwatch");
        menu_1_Btn.addActionListener(handler);
        menu_2_Btn = new JButton("Timers");
        menu_2_Btn.addActionListener(handler);

        area1.add(menu_1_Btn);
        area1.add(menu_2_Btn);

        c.add(area1);

        areaStopwatch = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                draw(g, 1);
            }
        };
        areaStopwatch.setPreferredSize(new Dimension(320, 260));

        areaStopwatch.add(new JLabel(
                "                                                Stopwatch                                                "));
        startBtn = new JButton("Start");
        startBtn.addActionListener(handler);
        stopBtn = new JButton("Stop");
        stopBtn.addActionListener(handler);
        resetBtn = new JButton("Reset");
        resetBtn.addActionListener(handler);

        areaStopwatch.add(startBtn);
        areaStopwatch.add(stopBtn);
        areaStopwatch.add(resetBtn);

        c.add(areaStopwatch, BorderLayout.CENTER);

        areaTimers = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                draw(g, 2);
            }
        };
        areaTimers.setPreferredSize(new Dimension(320, 260));
        areaTimers.add(new JLabel(
                "                                                Timers                                                "));
        areaTimers.add(new JLabel("Hours"));
        hoursField = new JTextField(5);
        hoursField.setText(String.valueOf(t_hours));
        addHoursBtn = new JButton("Add Hours");
        addHoursBtn.addActionListener(handler);
        deleteHoursBtn = new JButton("Delete Hours");
        deleteHoursBtn.addActionListener(handler);
        areaTimers.add(hoursField);
        areaTimers.add(addHoursBtn);
        areaTimers.add(deleteHoursBtn);

        areaTimers.add(new JLabel("Minutes"));
        minutesField = new JTextField(5);
        minutesField.setText(String.valueOf(t_minutes));
        addMinutesBtn = new JButton("Add Min");
        addMinutesBtn.addActionListener(handler);
        deleteMinutesBtn = new JButton("Delete Min");
        deleteMinutesBtn.addActionListener(handler);
        areaTimers.add(minutesField);
        areaTimers.add(addMinutesBtn);
        areaTimers.add(deleteMinutesBtn);

        areaTimers.add(new JLabel("Seconds"));
        secondsField = new JTextField(5);
        secondsField.setText(String.valueOf(t_seconds));
        addSecondsBtn = new JButton("Add Sec");
        addSecondsBtn.addActionListener(handler);
        deleteSecondsBtn = new JButton("Delete Sec");
        deleteSecondsBtn.addActionListener(handler);
        areaTimers.add(secondsField);
        areaTimers.add(addSecondsBtn);
        areaTimers.add(deleteSecondsBtn);

        t_startBtn = new JButton("Start");
        t_startBtn.addActionListener(handler);
        t_stopBtn = new JButton("Stop");
        t_stopBtn.addActionListener(handler);
        t_resetBtn = new JButton("Reset");
        t_resetBtn.addActionListener(handler);
        areaTimers.add(t_startBtn);
        areaTimers.add(t_stopBtn);
        areaTimers.add(t_resetBtn);

        c.add(areaTimers, BorderLayout.CENTER);
        areaTimers.setVisible(false);

    }

    public void draw(Graphics g, int type) {
        switch (type) {
            case 1:
                // clearArea(areaStopwatch);
                g.setColor(Color.BLUE);
                g.setFont(new Font("Century Gothic", Font.BOLD, 40));
                g.drawString(hours + ":" + minutes + ":" + seconds, 120, 100);
                break;
            case 2:
                g.setColor(Color.BLUE);
                g.setFont(new Font("Century Gothic", Font.BOLD, 40));
                g.drawString(t_hours + ":" + t_minutes + ":" + t_seconds, 120, 200);
                break;

        }
    }

    private class Refresh implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            draw(areaStopwatch.getGraphics(), 1);
            hours = s_Seconds / 3600;
            minutes = (s_Seconds % 3600) / 60;
            seconds = s_Seconds % 60;
            s_Seconds++;

            areaStopwatch.repaint();
        }
    }

    private class Timers_Refresh implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            draw(areaTimers.getGraphics(), 2);
            t_hours = totalSeconds / 3600;
            t_minutes = (totalSeconds % 3600) / 60;
            t_seconds = totalSeconds % 60;
            totalSeconds--;
            if (t_hours == 0 && t_minutes == 0 && t_seconds == 0) {
                t_timers.stop();
            }
            areaTimers.repaint();
        }
    }

    private class bottomHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == menu_1_Btn) {
                paint(getGraphics());
                areaStopwatch.setVisible(true);
                areaTimers.setVisible(false);
            } else if (event.getSource() == menu_2_Btn) {
                areaStopwatch.setVisible(false);
                areaTimers.setVisible(true);
            } else if (event.getSource() == startBtn) {
                t_stopwatch.start();
            } else if (event.getSource() == stopBtn) {
                t_stopwatch.stop();
            } else if (event.getSource() == resetBtn) {
                hours = 0;
                minutes = 0;
                seconds = 0;
                t_stopwatch.stop();
                areaStopwatch.repaint();
            } else if (event.getSource() == t_startBtn) {
                if (running) {
                    t_timers.start();
                    running = false;
                } else {
                    totalSeconds = Integer.parseInt(hoursField.getText()) * 3600
                            + Integer.parseInt(minutesField.getText()) * 60 + Integer.parseInt(secondsField.getText());
                    t_timers.start();
                }
            } else if (event.getSource() == t_stopBtn) {
                t_timers.stop();
                running = true;
            } else if (event.getSource() == t_resetBtn) {
                t_hours = 0;
                t_minutes = 0;
                t_seconds = 0;
                t_timers.stop();
                running = false;
                areaTimers.repaint();
            } else if (event.getSource() == addHoursBtn) {
                int hours = Integer.parseInt(hoursField.getText());
                hours++;
                hoursField.setText(String.valueOf(hours));
            } else if (event.getSource() == deleteHoursBtn) {
                int hours = Integer.parseInt(hoursField.getText());
                hours -= hours <= 0 ? 0 : 1;
                hoursField.setText(String.valueOf(hours));
            } else if (event.getSource() == addMinutesBtn) {
                int minutes = Integer.parseInt(minutesField.getText());
                minutes++;
                minutesField.setText(String.valueOf(minutes));
            } else if (event.getSource() == deleteMinutesBtn) {
                int minutes = Integer.parseInt(minutesField.getText());
                minutes -= minutes <= 0 ? 0 : 1;
                minutesField.setText(String.valueOf(minutes));
            } else if (event.getSource() == addSecondsBtn) {
                int seconds = Integer.parseInt(secondsField.getText());
                seconds++;
                secondsField.setText(String.valueOf(seconds));
            } else if (event.getSource() == deleteSecondsBtn) {
                int seconds = Integer.parseInt(secondsField.getText());
                seconds -= seconds <= 0 ? 0 : 1;
                secondsField.setText(String.valueOf(seconds));
            }
        }
    }

    public static void main(String[] args) {
        Stopwatch window = new Stopwatch();

        window.setSize(450, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
