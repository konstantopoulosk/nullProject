import javax.swing.*;
class Hello{
    public static void main(String args[]){
       JFrame frame = new JFrame("Button");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(400,300);
       JButton button = new JButton("Press");
       frame.getContentPane().add(button);
       frame.getContentPane().add(button); // Adds Button to content pane of frame
       frame.setVisible(true);
       System.out.print("\n\n\n\n************************************************");
    }
}