import java.text.DecimalFormat;

import javax.swing.JOptionPane;

class KeyboardCategory implements Shop{ 
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

    public void displayProducts(){
      
        boolean goBackCATEGORYPage = false;
        while (true) {
            String product1 = "A4Tech KR85 USB Business Office Keyboard Desktop Universal Mute Keyboard\n";
                   
            String product2 = "Inplay 68 Key Mechanical RGB Keyboard With Red Switches For PC / Laptop\n";

            String product3 = "Gaming Keyboard Backlit Mechanical 87 Keys Colorful LED Keyboard\n";
                    
            String product4 = "JK GTX350 Gaming Keyboard Computer Laptop Backlight Gamer\n"
                    + "Kit LED Wired Usb Keyboard\n";
            String product5 = "USB Flexible Foldable keyboard for Laptop PC\n" ;

            String product6 = "FIREWOLF K20 K25 Rainbow LED Gaming Keyboard Multi-Media\n"+
            "Online Exclusive Edition\n" ;




            int selectProduct = 0;

            while (true) {
                try {
                    selectProduct = Integer.parseInt(JOptionPane.showInputDialog(
                            "Select a Product:\n" +"[0]BACK TO SELECT CATEGORY\n\n" +"[1] " + product1 + 
                            "\n[2] " + product2 + 
                            "\n[3] " + product3 +
                            "\n[4] "+ product4+
                            "\n[5] "+product5+
                            "\n[6] "+product6
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
                String variation1 = "Black\n";
                String variation2 = "White\n";

                double variation1Price = 260.00;
                int variation1Quantity = 39;

                double variation2Price = 250.00;
                int variation2Quantity = 39; 

                double deliveryfee = 50.00;

                int selectVariation = 0;
                while (true) {
                    try {
                        selectVariation = Integer.parseInt(JOptionPane.showInputDialog(
                                "Select a Variation:\n" +
                                "[0] Back to Select Products\n"+
                                "[1] " +variation1+
                                "[2] "+variation2
                              ));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                    }
                
                   if(selectVariation == 0){
                     break;
                   }else if(selectVariation == 1){
                    processOrder(product1, variation1, variation1Price, variation1Quantity, deliveryfee);

                   }else if(selectVariation == 2){
                    processOrder(product1, variation2, variation2Price, variation2Quantity, deliveryfee);

                   }else{
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number");
                 
                   }
                }
                break;


            case 2:
             String product2variation1 = "Black\n";
             String product2variation2 = "White\n";
             String product2variation3 = "Mix\n";

                double product2variation1Price = 499.00;
                int product2variation1Quantity = 20;

                double product2variation2Price = 510.00;
                int product2variation2Quantity = 23; 

                double product2variation3Price = 659.00;
                int product2variation3Quantity = 16; 

                double product2deliveryfee = 50.00;

                 while (true) {
                    try {
                        selectVariation = Integer.parseInt(JOptionPane.showInputDialog(
                                "Select a Variation:\n" +
                                "[0] Back to Select Products\n"+
                                "[1] " +product2variation1+
                                "[2] "+product2variation2+
                                "[3] "+product2variation3
                              ));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                    }
                } 
                 if(selectVariation == 0){
                    break;
                 }else if(selectVariation == 1){
                    processOrder(product2, product2variation1, product2variation1Price, product2variation1Quantity, product2deliveryfee);

                 }else if(selectVariation == 2){
                    processOrder(product2, product2variation2, product2variation2Price, product2variation2Quantity, product2deliveryfee);

                 }else if(selectVariation == 3){
                    processOrder(product2, product2variation3, product2variation3Price, product2variation3Quantity, product2deliveryfee);

                 }else {
                     JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number");
                  
                 }
                 
                   break;



            case 3:
                String product3variation1 = "Black\n";
                String product3variation2 = "White\n";
                String product3variation3 = "Mix\n";

                double product3variation1Price = 599.00;
                int product3variation1Quantity = 16;

                double product3variation2Price = 610.00;
                int product3variation2Quantity = 18; 

                double product3variation3Price = 689.00;
                int product3variation3Quantity = 11; 

                double product3deliveryfee = 80.00;
               
                while (true) {
                    try {
                        selectVariation = Integer.parseInt(JOptionPane.showInputDialog(
                                "Select a Variation:\n" +
                                "[0] Back to Select Products\n"+
                                "[1] " +product3variation1+
                                "[2] "+product3variation2+
                                "[3] "+product3variation3
                              ));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                    }
                
                }
                 if(selectVariation == 0){
                    break;
                 }else if(selectVariation == 1){
                    processOrder(product3, product3variation1, product3variation1Price, product3variation1Quantity, product3deliveryfee);
                 } else if(selectVariation == 2){
                    processOrder(product3, product3variation2, product3variation2Price, product3variation2Quantity, product3deliveryfee);
                 } else if(selectVariation == 3){
                    processOrder(product3, product3variation3, product3variation3Price, product3variation3Quantity, product3deliveryfee);
                 } else {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                 }
                 
                 break;

             case 4:
                String product4variation1 = "Black\n";
                String product4variation2 = "White\n";
                 String product4variation3 = "Mix\n";

                double product4variation1Price = 299.00;
                int product4variation1Quantity = 15;

                double product4variation2Price = 310.00;
                int product4variation2Quantity = 20; 

                double product4variation3Price = 359.00;
                int product4variation3Quantity = 15; 

                double product4deliveryfee = 50.00;
                while (true) {
                    try {
                        selectVariation = Integer.parseInt(JOptionPane.showInputDialog(
                                "Select a Variation:\n" +
                                "[0] Back to Select Products\n"+
                                "[1] " +product4variation1+
                                "[2] "+product4variation2+
                                "[3] "+product4variation3
                              ));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                    }
                
                }
                  if(selectVariation == 0){
                    break;
                 }else if(selectVariation == 1){
                    processOrder(product4, product4variation1, product4variation1Price, product4variation1Quantity, product4deliveryfee);
                 } else if(selectVariation == 2){
                    processOrder(product4, product4variation2, product4variation2Price, product4variation2Quantity, product4deliveryfee);
                 } else if(selectVariation == 3){
                    processOrder(product4, product4variation3, product4variation3Price, product4variation3Quantity, product4deliveryfee);
                 } else {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                 }
                 break;
            case 5:
              String product5variation1 = "Black\n";
                String product5variation2 = "White\n";

                double product5variation1Price = 160.00;
                int product5variation1Quantity = 30;

                double product5variation2Price = 169.00;
                int product5variation2Quantity = 39; 

                double product5deliveryfee = 50.00;
                 while (true) {
                    try {
                        selectVariation = Integer.parseInt(JOptionPane.showInputDialog(
                                "Select a Variation:\n" +
                                "[0] Back to Select Products\n"+
                                "[1] " +product5variation1+
                                "[2] "+product5variation2
                              ));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                    }
                
                }
                  if(selectVariation == 0){
                    break;
                 }else if(selectVariation == 1){
                    processOrder(product5, product5variation1, product5variation1Price, product5variation1Quantity, product5deliveryfee);
                 } else if(selectVariation == 2){
                    processOrder(product5, product5variation2, product5variation2Price, product5variation2Quantity, product5deliveryfee);
                 }  else {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                 }

                break;
            case 6:
                String product6variation1 = "Black\n";
                String product6variation2 = "White\n";
                String product6variation3 = "Mix\n";

                double product6variation1Price = 259.00;
                int product6variation1Quantity = 12;

                double product6variation2Price = 265.00;
                int product6variation2Quantity = 13; 

                double product6variation3Price = 299.00;
                int product6variation3Quantity = 9; 

                double product6deliveryfee = 80.00;
                 while (true) {
                    try {
                        selectVariation = Integer.parseInt(JOptionPane.showInputDialog(
                                "Select a Variation:\n" +
                                "[0] Back to Select Products\n"+
                                "[1] " +product6variation1+
                                "[2] "+product6variation2+
                                "[3] "+product6variation3
                              ));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                    }
                
                }
                  if(selectVariation == 0){
                    break;
                 }else if(selectVariation == 1){
                    processOrder(product6, product6variation1, product6variation1Price, product6variation1Quantity, product6deliveryfee);
                 } else if(selectVariation == 2){
                    processOrder(product6, product6variation2, product6variation2Price, product6variation2Quantity, product6deliveryfee);
                 } else if(selectVariation == 3){
                    processOrder(product6, product6variation3, product6variation3Price, product6variation3Quantity, product6deliveryfee);
                 } else {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                 }
            break;
            default:
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid operation");
               break;
            }
             if (goBackCATEGORYPage) {
                break; 
                }
    }
}

    public void processOrder(String product, String variation, double variationPrice, int variationQuantity, double deliveryfee){
        DecimalFormat decimal = new DecimalFormat("#,###.00");

        int confirmation = JOptionPane.showConfirmDialog(null,
                "Product Name: " + product + "Variety: " + variation + "Price per unit: ₱" + decimal.format(variationPrice)
                        + "\nQuantity: " + variationQuantity + "\nDelivery fee: ₱" + deliveryfee
                        + "\nAre you sure you want to buy this product?",
                "Confirmation", JOptionPane.YES_NO_OPTION);
        
        if (confirmation == JOptionPane.YES_OPTION) {
            while (true) {
                int quantity = 0;
        
                try {
                    quantity = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Product name:" + product + "Variety: " + variation + "Product Price:₱" + decimal.format(variationPrice)
                                    + "\nProduct Quantity: " + variationQuantity + "\nDelivery Fee:₱" + deliveryfee
                                    + "\nHow many do you want to buy?"));
        
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                }
        
                if (quantity > 0 && quantity <= variationQuantity) {
                    int option = JOptionPane.showConfirmDialog(null,
                            "Product Name: " + product + "Variety: " + variation + "Price per unit: ₱" + decimal.format(variationPrice)
                                    + "\nQuantity: " + quantity + "\nDelivery fee: ₱" + deliveryfee + "\nTotal Price: ₱"
                                    + decimal.format((variationPrice * quantity + deliveryfee)) + "\n\nAre you sure you want to buy this product?",
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
                                        "Product Per Unit:₱" + decimal.format(variationPrice) + 
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
                                        "Product Per Unit:₱" + decimal.format(variationPrice) + 
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
 