import java.text.DecimalFormat;

import javax.swing.JOptionPane;

class MouseCategory implements Shop{
    private String fullname;
    private String address;
    private String zipCode;
    private String contactNo;

    public void setFullName(String fullname){
      this.fullname = fullname;
    }
    public String getFullName(){
      return fullname;
    }

    public void setaddress(String address){
      this.address = address;
    }
    public String getaddress(){
      return address;
    }

    public void setZipCode(String zipcode){
      this.zipCode = zipcode;
    }
    public String getZipCode(){
      return zipCode;
    }

    public void setContactNo(String contactno){
      this.contactNo = contactno;
    }
    public String getContactNo(){
      return contactNo;
    }

    @Override
    public void displayProducts(){

        boolean goBackCATEGORYPage = false;
        while (true) {
            String product1 = "SYCAT Y02 Blacklight Mouse USB LED Gaming Mouse For Laptop/PC\n"+
            "Wire/Computer USB Wired RGB Mouse\n";
                   
            String product2 = "Permanenty*New Wireless Mouse Usb Optical Scroll Mice For\n"+
            "Tablet Laptop Computer Finest\n";

            String product3 = "Goldtech Mouse USB for Computer pisonet/piso net/Wired Game Mouse\n";
                    
            String product4 = "Logitech G703 LIGHTSPEED wireless gaming mouse wireless mouse RGB mouse\n"+
            "G703 upgrade HERO sensor\n";

             String product5 = "New Gaming Mouse Wired Mouse 6D 4speed Dpi Rgb Gaming Mouse\n"+
            "For Computer Laptop Gaming Mouse\n" ;
               
            String product6 = "Nexion GM909 New Design RGB 7D Gaming Mouse Six Stage Dpi Ergonomic Design\n"+
            "Wired For Pc laptop\n" ;


            String product7 = "[LHG] Car Model Wireless Optical Mouse Ferrari Shaped Mause Game\n"+
            "1600DPI for PC Laptop new\n" ;


            int selectProduct = 0;

            while (true) {
                try {
                    selectProduct = Integer.parseInt(JOptionPane.showInputDialog(
                            "Select a Product:\n" +"[0]BACK TO SELECT CATEGORY\n\n" +"[1] " + product1 + 
                            "\n[2] " + product2 + 
                            "\n[3] " + product3 +
                            "\n[4] "+ product4+
                            "\n[5] "+product5+
                            "\n[6] "+product6+
                            "\n[7] "+product7
                            ));
                           
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                }
            }

            switch (selectProduct) {
                case 0:
                goBackCATEGORYPage = true;
                break;
                case 1: 
                double deliveryfee = 50.00;
                int selectVariation = 0;
                while (true) {
                  
                    try {
                        selectVariation = Integer.parseInt(JOptionPane.showInputDialog(
                                "Select a Variation:\n" +
                                "[0] Back to Select Products\n"+
                                "[1] Black\n" +
                                "[2] White\n"+
                                "[3] Pink"
                              ));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                       
                    }
                }
                    if(selectVariation == 0){
                        break;
                    }else if(selectVariation == 1){
                        processOrder(product1, "Black", 69.00, 25, deliveryfee);
                        break;
                       }else if(selectVariation == 2){
                        processOrder(product1, "White", 79.00, 25, deliveryfee);
                        break;
                       }else if(selectVariation == 3){
                        processOrder(product1, "Pink",89.00, 22, deliveryfee);
                        break;
                       }
                       else{
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number");
                        
                    }
                break;
                case 2:
                double product2deliveryfee = 60.00;
                  while (true) {
                    try {
                        selectVariation = Integer.parseInt(JOptionPane.showInputDialog(
                                "Select a Variation:\n" +
                                "[0] Back to Select Products\n"+
                                "[1] Black\n" +
                                "[2] White"
                           
                              ));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                    }
                } 
                    if(selectVariation == 0){
                        break;
                    }else if(selectVariation == 1){
                        processOrder(product2, "Black",  95.00, 25, product2deliveryfee);
    
                       }else if(selectVariation == 2){
                        processOrder(product2, "White", 99.00, 30, product2deliveryfee);
    
                       } else{
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number");
                       }
                  
                break;
                case 3: 
                double product3deliveryfee = 50.00;
                while (true) {
                    try {
                        selectVariation = Integer.parseInt(JOptionPane.showInputDialog(
                                "Select a Variation:\n" +
                                "[0] Back to Select Products\n"+
                                "[1] Black\n" +
                                "[2] White"
                           
                              ));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                    }
                } 
                    if(selectVariation == 0){
                        break;
                    }else if(selectVariation == 1){
                        processOrder(product3, "Black",50.00, 25, product3deliveryfee);
    
                       }else if(selectVariation == 2){
                        processOrder(product3, "White", 60.00,25, product3deliveryfee);
    
                       } else{
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number");
                       }
                break;
                case 4:
                double product4deliveryfee = 80.00;
                 while (true) {
                    try {
                        selectVariation = Integer.parseInt(JOptionPane.showInputDialog(
                                "Select a Variation:\n" +
                                "[0] Back to Select Products\n"+
                                "[1] Black\n" +
                                "[2] White "
                           
                              ));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                    }
                } 
                    if(selectVariation == 0){
                        break;
                    }else if(selectVariation == 1){
                        processOrder(product4, "Black", 499.00, 15, product4deliveryfee);
    
                       }else if(selectVariation == 2){
                        processOrder(product4, "White", 510.00, 18, product4deliveryfee);
    
                       } else{
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number");
                       }

                break;

                case 5: 
                double product5deliveryfee = 80.00;
                 while (true) {
                    try {
                        selectVariation = Integer.parseInt(JOptionPane.showInputDialog(
                                "Select a Variation:\n" +
                                "[0] Back to Select Products\n"+
                                "[1] Black" +"\n"+
                                "[2] White"+"\n"+
                                "[3] Pink"+"\n"+
                                "[4] Grey"+"\n"+
                                "[5] Wireless Black"+"\n"+
                                "[6] Wireless White"+"\n"+
                                "[7] Wireless Pink"+"\n"+
                                "[8] Wireless Grey"
                                
                              ));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                    }
                } 
                    if(selectVariation == 0){
                        break;
                    }else if(selectVariation == 1){
                        processOrder(product5, "Black",159.00, 11, product5deliveryfee);
    
                       }else if(selectVariation == 2){
                        processOrder(product5, "White", 169.00, 13, product5deliveryfee);
    
                       }else if(selectVariation == 3){
                        processOrder(product5, "Pink", 179.00, 14, product5deliveryfee);
    
                       }else if(selectVariation == 4){
                        processOrder(product5, "Grey", 189.00, 15, product5deliveryfee);
    
                       }else if(selectVariation == 5){
                        processOrder(product5, "Wireless Black", 200.00, 10, product5deliveryfee);
    
                       }else if(selectVariation == 6){
                        processOrder(product5, "Wireless White", 210.00, 11, product5deliveryfee);
    
                       }else if(selectVariation == 7){
                        processOrder(product5, "Wireless Pink", 220.00, 10, product5deliveryfee);
    
                       }else if(selectVariation == 8){
                        processOrder(product5, "Wireless Grey", 230.00, 11, product5deliveryfee);
    
                       }
                       else{
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number");
                       }

                  break;

                  case 6:
              
                double product6deliveryfee = 70.00;
                 while (true) {
                    try {
                        selectVariation = Integer.parseInt(JOptionPane.showInputDialog(
                                "Select a Variation:\n" +
                                "[0] Back to Select Products\n"+
                                "[1] Black\n" +
                                "[2] White"
                               
                              ));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                    }
                } 
                    if(selectVariation == 0){
                        break;
                    }else if(selectVariation == 1){
                        processOrder(product6, "Black",  399.00, 12, product6deliveryfee);
    
                       }else if(selectVariation == 2){
                        processOrder(product6, "White", 406.00, 11, product6deliveryfee);
    
                       }
                       else{
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number");
                       }
                  break;

                  case 7:
                double product7deliveryfee = 60.00; 
                while (true) {
                    try {
                        selectVariation = Integer.parseInt(JOptionPane.showInputDialog(
                                "Select a Variation:\n" +
                                "[0] Back to Select Products\n"+
                                "[1] Black" +"\n"+
                                "[2] White"+"\n"+
                                "[3] Pink"+"\n"+
                                "[4] Red" 
                               
                              ));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                    }
                } 
                    if(selectVariation == 0){
                        break;
                    }else if(selectVariation == 1){
                        processOrder(product7, "Black", 159.00,  13, product7deliveryfee);
    
                       }else if(selectVariation == 2){
                        processOrder(product7, "White", 169.00, 14, product7deliveryfee);
    
                       }else if(selectVariation == 3){
                        processOrder(product7, "Pink", 179.00, 8, product7deliveryfee);
    
                       }else if(selectVariation == 4){
                        processOrder(product7, "Red", 189.00, 10, product7deliveryfee);
    
                       }
                       else{
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number");
                       }

                break;
                default:
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number");
                    break;
            }
            if (goBackCATEGORYPage) {
                break; 
                }
            }
    }
    @Override
  public void processOrder(String product, String variation, double variationPrice, int variationQuantity, double deliveryfee){
             DecimalFormat decimal = new DecimalFormat("#,###.00");

        int confirmation = JOptionPane.showConfirmDialog(null,
                "Product Name: " + product + 
                "Variety: " + variation + 
                "\nPrice per unit: ₱" + decimal.format(variationPrice) + 
                "\nQuantity: " + variationQuantity + 
                "\nDelivery fee: ₱" + deliveryfee+ 
                "\nAre you sure you want to buy this product?",
                "Confirmation", JOptionPane.YES_NO_OPTION);
        
        if (confirmation == JOptionPane.YES_OPTION) {
            while (true) {
                int quantity = 0;
        
                try {
                    quantity = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Product name:" + product + 
                            "Variety: " + variation + 
                            "\nProduct Price:₱" + decimal.format(variationPrice)+ 
                            "\nProduct Quantity: " + variationQuantity + 
                            "\nDelivery Fee:₱" + deliveryfee+ 
                            "\nHow many do you want to buy?"));
        
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                }
        
                if (quantity > 0 && quantity <= variationQuantity) {
                    int option = JOptionPane.showConfirmDialog(null,
                            "Product Name: " + product + 
                            "Variety: " + variation + 
                            "\nPrice per unit: ₱" + decimal.format(variationPrice) + 
                            "\nQuantity: " + quantity + 
                            "\nDelivery fee: ₱" + deliveryfee + 
                            "\nTotal Price: ₱" + decimal.format((variationPrice * quantity + deliveryfee)) + 
                            "\n\nAre you sure you want to buy this product?",
                            "Confirmation", JOptionPane.YES_NO_OPTION);
        
                    if (option == JOptionPane.YES_OPTION) {
                        double totalPrice = (variationPrice * quantity) + deliveryfee;
        
                        while (true) {
                            String paymentMethod = JOptionPane.showInputDialog(null,
                                    "Enter your payment method (COD or Gcash available only):");
                            String paymentMethodLower = paymentMethod.toLowerCase();
        
                            if (paymentMethodLower.equals("gcash")) {
                                setFullName(JOptionPane.showInputDialog(null, "Enter your full name:")); 
                                setaddress(JOptionPane.showInputDialog(null, "Enter your address (Street, Barangay, Province, City) :"));
                                setZipCode(JOptionPane.showInputDialog(null, "Enter your zip code:"));
                                setContactNo( JOptionPane.showInputDialog(null,"Enter your contact number:"));        
        
                              
                                JOptionPane.showMessageDialog(null,
                                        "Order placed successfully\n\n" + 
                                        "Order Summary\n"+ 
                                        "Product name: " + product + 
                                        "Variety: " + variation+
                                        "\nProduct Per Unit:₱" + decimal.format(variationPrice) + 
                                        "\nQuantity: " + quantity +
                                        "\nDelivery Fee:₱" + deliveryfee+ 
                                        "\nTotal Price:₱" + decimal.format(totalPrice) + 
                                        "\nPayment Method:" + paymentMethodLower + 
                                        "\n\nGCASH DETAILS FOR YOUR PAYMENT"+
                                        "\nGCASH ACCOUNT NAME : " + gcashname + 
                                        "\nGCASH ACCOUNT NUMBER: " + gcashno+ 
                                        "\n\nDetails for delivery:" + 
                                        "\nFull Name: " + getFullName()+ 
                                        "\nAddress: " + getaddress() + 
                                        "\nZip code: " + getZipCode()+
                                        "\nContact No.:" + getContactNo());
                                break;
                            } else if (paymentMethodLower.equals("cod")) {
                                 setFullName(JOptionPane.showInputDialog(null, "Enter your full name:")); 
                                setaddress(JOptionPane.showInputDialog(null, "Enter your address (Street, Barangay, Province, City) :"));
                                setZipCode(JOptionPane.showInputDialog(null, "Enter your zip code:"));
                                setContactNo( JOptionPane.showInputDialog(null,"Enter your contact number:"));        
        
                                JOptionPane.showMessageDialog(null,
                                        "Order placed successfully\n\n" + 
                                        "Order Summary\n"+
                                        "Product name: " + product + 
                                        "Variety: " + variation+
                                        "\nProduct Per Unit:₱" + decimal.format(variationPrice) + 
                                        "\nQuantity: " + quantity +
                                        "\nDelivery Fee:₱" + deliveryfee + 
                                        "\nTotal Price:₱" + decimal.format(totalPrice) + 
                                        "\nPayment Method:" + paymentMethodLower + 
                                        "\n\nDetails for delivery:"+ 
                                        "\nFull Name: " + getFullName() + 
                                        "\nAddress: " + getaddress() + 
                                        "\nZip code: " + getZipCode() + 
                                        "\nContact No.:" + getContactNo());
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null,
                                        "Invalid payment method. Please enter either COD or Gcash.");
                                continue;
                            }
                        }
                        variationQuantity -= quantity;
                        break;
                    } else {
                        break;
                    }
                } else if (quantity <= 0) {
                    JOptionPane.showMessageDialog(null, "Quantity must be greater than 0.");
                } else {
                    JOptionPane.showMessageDialog(null, "Not enough quantity available.");
                }
            }
        }
  }

}
