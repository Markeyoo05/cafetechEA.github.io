import javax.swing.JOptionPane;

class About extends cafetechEA{

    @Override
    public void displaycontent(){
         JOptionPane.showMessageDialog(null,
          "============================ABOUT US============================\n"+
          "The CafeTech Entrepreneurs Association is a dedicated community\n" + 
          "of internet cafe proprietors and tech-savvy individuals,\n"+
          "united by a shared passion for advancing the internet cafe industry.\n"+
          "Our association provides a platform for cafe owners to connect, collaborate,\n"+
          "and access valuable resources aimed at enhancing their businesses.\n"+
          "Through networking events, knowledge sharing, and support programs,\n" +
          "we empower entrepreneurs to navigate the evolving landscape of technology and cafe \n"+
          "management. Join us in shaping the future of internet cafes and leveraging the\n"+
          "collective expertise of our association's members.\n\n"+
          "=========================The Entreprenuers=========================\n\n" +
          "Names:                        Age:                       Occupation:\n"+
          "Mark Cleo Calbang        20              Software  Engineer\n"+
          "Clarence Simoran         33              Business Man \n"+
          "Karl Noynay                   20              IT specialist\n"+
          "John Richard Mepieza    20            Computer Technician\n"
         ); 

    }
    
}
