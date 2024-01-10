import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
      
         cafetechEA About = new About();
         cafetechEA Services = new Services();
         cafetechEA ContactUs = new ContactUs();

         Shop computerShop  = new ComputerCategory();
         Shop laptopShop  = new LaptopCategory();
         Shop keyboardShop  = new KeyboardCategory();
         Shop mouseShop  = new MouseCategory();
   
       
        int option = JOptionPane.showConfirmDialog(
            null,
            "Welcome to Cafetech Entrepreneurs Association!\n" +
                    "We are excited to have you here.\n" +
                    "Do you want to proceed to the program?",
            "Welcome",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE
    );
            if (option == JOptionPane.YES_OPTION) {
            for(;;){
                try {
                    
                    String input = JOptionPane.showInputDialog(
                                "HOME PAGE\n"+
                                "[1] About\n" +
                                "[2] Shop\n" +
                                "[3] Services\n"+
                                "[4] Contact\n"+
                                "[5] Exit\n\n" +
                                "Thank you for entering our program!,\nWe are so much excited to have you here\n"+
                                "Enjoy exploring our Program! <3\n\n"
                );
                    int choice = Integer.parseInt(input);


                    switch (choice) {
                        
                        case 1:
                            About.displaycontent();
                            break;
                        case 2:  
                        while(true){
                        try{
                        int categoryChoice = Integer.parseInt(JOptionPane.showInputDialog(
                            "Select a category:\n" +
                                    "[0] Back to Home Page\n"+
                                    "[1] Computer category\n" +
                                    "[2] Laptop category\n" +
                                    "[3] Keyboard category\n" +
                                    "[4] Mouse category\n"
                                    ));
                                switch (categoryChoice) {
                                    case 0:
                                    break;        
                                    case 1:
                                    computerShop.displayProducts();
                                        break;
                                    case 2:
                                    laptopShop.displayProducts();
                                        break;
                                    case 3:
                                    keyboardShop.displayProducts();
                                       break;
                                    case 4:
                                    mouseShop.displayProducts();
                                      break;
                                   
                                   
                                    default:
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid operation");

                                        break;
                                }
                                if (categoryChoice == 0) {
                                    break;
                                }
                            }catch(NumberFormatException e){
                                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");

                            }
                        }
                            break;
                        case 3:
                            Services.displaycontent();
                            break;
                        case 4:
                            ContactUs.displaycontent();
                            break;
                        case 5:
                        int exitConfirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit the program?", "Confirmation", JOptionPane.YES_NO_OPTION);
                                if (exitConfirmation == JOptionPane.YES_OPTION) {
                                    JOptionPane.showMessageDialog(null, "Thank you for visiting our program, comeback soon again!.\nGood Bye!");
                                    System.exit(0);
                                }
                            break;
                        default:
                        JOptionPane.showMessageDialog(null, "Invalid choice!");
                        break;
                    }
                
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                                
                }
            }
            }
 }
 
}