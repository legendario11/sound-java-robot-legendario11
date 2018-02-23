package sound;
import java.awt.Color;
import java.awt.event.*;
import sun.audio.*;
import javax.swing.*;
import java.io.*;

public class Sound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
        frame.setSize(100, 100);
        JButton button = new JButton("Play");
        frame.add(button);
        button.addActionListener(new AL());
        frame.show(true);
    }

    public static class AL implements ActionListener {

        public final void actionPerformed(ActionEvent e) {
            music();
        }
    }

    public static void music() {
        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;
        AudioDataStream play = null;

        try {
            BGM = new AudioStream(new FileInputStream("robotsound1.aiff"));
            MD = BGM.getData();
            play = new AudioDataStream(MD);
        } catch (IOException error) {
        }
        System.out.println("thx pik");
		MGP.start(play);
		
		//hier maak je een ifstament deze zorgt ervoor dat als de color sensord rood ziet hij zegt :"de kleur is rood "
    }
}

        