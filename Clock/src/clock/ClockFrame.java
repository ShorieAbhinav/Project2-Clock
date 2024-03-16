package clock;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClockFrame extends JFrame{
	
	Calendar calendar; // get current date and time
	SimpleDateFormat timeFormat; //set format for clock
	SimpleDateFormat dateFormat;
	SimpleDateFormat dayFormat;
	JLabel dateLabel;
	JLabel timeLabel;
	JLabel dayLabel;
	String time;
	String date;
	String day;
	
	public ClockFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Clock Program");
		this.setLayout(new FlowLayout());
		this.setSize(350,200);
		this.setResizable(false);
		this.getContentPane().setBackground(Color.BLACK);
		
		
		timeFormat = new SimpleDateFormat("hh:mm:ss a z");
		timeLabel = new JLabel();
		timeLabel.setFont(new Font("Monospaced", Font.PLAIN,30));
		timeLabel.setForeground(Color.GREEN);
		timeLabel.setBackground(Color.BLACK);
		timeLabel.setOpaque(true);
		
		dateFormat = new SimpleDateFormat("MMMMMMMMM dd y \n");
		dateLabel = new JLabel();
		dateLabel.setFont(new Font("Monospaced", Font.PLAIN,30));
		dateLabel.setForeground(Color.GREEN);
		dateLabel.setBackground(Color.BLACK);
		dateLabel.setOpaque(true);
		
		dayFormat = new SimpleDateFormat("EEE");
		dayLabel = new JLabel();
		dayLabel.setFont(new Font("Monospaced", Font.PLAIN,30));
		dayLabel.setForeground(Color.GREEN);
		dayLabel.setBackground(Color.BLACK);
		dayLabel.setOpaque(true);
		
		
		this.add(timeLabel);
		this.setVisible(true);
		
		this.add(dateLabel);
		this.setVisible(true);
		
		this.add(dayLabel);
		this.setVisible(true);
		
		setTime();
	}

	public void setTime() {
		
		while(true) {
			time = timeFormat.format(Calendar.getInstance().getTime());
			timeLabel.setText(time);	
		
			date = dateFormat.format(Calendar.getInstance().getTime());
			dateLabel.setText(date);
			
			day = dayFormat.format(Calendar.getInstance().getTime());
			dayLabel.setText(day);	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
