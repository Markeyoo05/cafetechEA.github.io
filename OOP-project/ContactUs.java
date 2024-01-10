import javax.swing.JOptionPane;

class ContactUs  extends cafetechEA{

    @Override
    void displaycontent() {
       JOptionPane.showMessageDialog(null,"===========================CONTACT US============================\n" + 
             "Feel free to reach out to us for further details and inquiries we're here to help.\n"+
             "☎ 0963 212 2892\n"+
             "✉ markcleocalbang22@gmail.com\n");

             int sendMessageOption = JOptionPane.showConfirmDialog(
                null,
                "Do you want to send us a quick message?",
                "Send Message",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );  

            if (sendMessageOption == JOptionPane.YES_OPTION) {
            setName(JOptionPane.showInputDialog("Enter your name:"));
           setContactno(JOptionPane.showInputDialog("Enter your contact number:"));
            setEmail(JOptionPane.showInputDialog("Enter your email:"));
             setMessage(JOptionPane.showInputDialog("How can we help you?"));
     
             // Here, you can process the entered information or display a confirmation message.
             JOptionPane.showMessageDialog(
                     null,
                     "Thank you for your message!\n\n" +
                             "Name: " + getName() + "\n" +
                             "Contact Number: " + getContactno() + "\n" +
                             "Email: " + getEmail() + "\n" +
                             "Message: " + getMessage(),
                     "Message Sent",
                     JOptionPane.INFORMATION_MESSAGE
                 );
            }
        
    }
    
}
