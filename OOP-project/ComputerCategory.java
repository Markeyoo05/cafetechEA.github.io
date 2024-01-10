import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class ComputerCategory implements Shop {
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

    public void displayProducts() {
      
        boolean goBackCATEGORYPage = false;
        while (true) {
            String product1 = "EONE Desktop Computer Set Gaming PC Set SSD Mini Host PC Gaming Computer\n"
                    + "17/19/22/24/27 inch LED Monitor Computer Set sale.\n";
            String product2 = "PC Set Gaming Desktop Computer Set Ryzen 5 5600G Ryzen 3 3200G With 8G/16G\n"
                    + "Memory 60G 120G 240G ssd 500g 1TB hdd DIY Desktop computer with RGB LED.\n";
            String product3 = "Dell Optiplex 3060/3070/5060/7060 micro 8-9th Gen Intel Core i5-i7 16GB RAM 256GB SSD\n"
                    + "Windows 11 PRO\n";

            int selectProduct = 0;

            while (true) {
                try {
                    selectProduct = Integer.parseInt(JOptionPane.showInputDialog(
                            "Select a Product:\n" +"[0]BACK TO SELECT CATEGORY\n\n" +"[1]. " + product1 + 
                            "\n[2] " + product2 + 
                            "\n[3] " + product3 
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
                //i9
                    String variation1 = "Intel i9/16gb/512GB SSD/24inch Monitor\n";
                    String variation2 = "Intel i9/16gb/512GB SSD/19inch Monitor\n";
                    String variation3 = "Intel i9/8gb/256GB SSD/24inch Monitor\n";
                    String variation4 = "Intel i9/8gb/256GB SSD/19inch Monitor\n";

                //i7
                    String variation5 = "Intel i7/16gb/512GB SSD/24inch Monitor\n";
                    String variation6 = "Intel i7/16gb/512GB SSD/19inch Monitor\n";
                    String variation7 = "Intel i7/8gb/256GB SSD/24inch Monitor\n";
                    String variation8 = "Intel i7/8gb/256GB SSD/19inch Monitor\n";
                //i5
                    String variation9 = "Intel i5/16gb/512GB SSD/21inch Monitor\n";
                    String variation10 = "Intel i5/16gb/512GB SSD/17inch Monitor\n";
                    String variation11 = "Intel i3/8gb/256GB SSD/21inch Monitor\n";
                    String variation12 = "Intel i3/8gb/256GB SSD/19inch Monitor\n";
                // i9 prices
                    double variationPrice = 25999.00;
                    int variationQuantity = 13;
                   
                    double variation2Price = 24999.00;
                    int variation2Quantity = 12;
                   
                    double variation3Price = 23999.00;
                    int variation3Quantity = 11;

                    double variation4Price = 23599.00;
                    int variation4Quantity = 15;
                //i7 prices
                    double variation5Price = 21000.00;
                    int variation5Quantity = 12;

                    double variation6Price = 20599.00;
                    int variation6Quantity = 14;

                    double variation7Price = 19899.00;
                    int variation7Quantity = 9;

                    double variation8Price = 19000.00;
                    int variation8Quantity = 5;
                //i5 prices
                    double variation9Price = 15999.00;
                    int variation9Quantity = 12;

                    double variation10Price = 15599.00;
                    int variation10Quantity = 10;

                    double variation11Price = 14999.00;
                    int variation11Quantity = 7;

                     double variation12Price = 14599.00;
                    int variation12Quantity = 10;

                    double deliveryfee = 50.00; 
                    int selectVariation = 0;

                    while (true) {
                        try {
                            selectVariation = Integer.parseInt(JOptionPane.showInputDialog(
                                    "Select a Variation:\n" +
                                    "[0] Back to Select Products\n"+
                                    "[1] " +variation1+
                                    "[2] "+variation2+
                                    "[3] "+variation3+
                                    "[4] "+variation4+"\n"+
                                    "[5] "+variation5+
                                    "[6] "+variation6+
                                    "[7] "+variation7+
                                    "[8] "+variation8+"\n"+
                                    "[9] "+variation9+
                                    "[10] "+variation10+
                                    "[11] "+variation11+
                                    "[12] "+variation12));
                            break;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                        }
                    }
                        if (selectVariation == 0) {
                            break;
                       }else if (selectVariation == 1) { 
                            processOrder(product1, variation1, variationPrice, variationQuantity, deliveryfee);
                        }else if(selectVariation == 2){
                            processOrder(product1, variation2, variation2Price, variation2Quantity, deliveryfee);
                        }else if(selectVariation == 3){
                            processOrder(product1, variation3, variation3Price, variation3Quantity, deliveryfee);
                        }else if(selectVariation == 4 ){
                            processOrder(product1, variation4, variation4Price, variation4Quantity, deliveryfee);
                        }else if(selectVariation == 5 ){
                            processOrder(product1, variation5, variation5Price, variation5Quantity, deliveryfee);
                        }else if(selectVariation == 6 ){
                            processOrder(product1, variation6, variation6Price, variation6Quantity, deliveryfee);
                        }else if(selectVariation == 7 ){
                            processOrder(product1, variation7, variation7Price, variation7Quantity, deliveryfee);
                        }else if(selectVariation == 8 ){
                            processOrder(product1, variation8, variation8Price, variation8Quantity, deliveryfee);
                        }else if(selectVariation == 9 ){
                            processOrder(product1, variation9, variation9Price, variation9Quantity, deliveryfee);
                        }else if(selectVariation == 10 ){
                            processOrder(product1, variation10, variation10Price, variation10Quantity, deliveryfee);
                        }else if(selectVariation == 11 ){
                            processOrder(product1, variation11, variation11Price, variation11Quantity, deliveryfee);
                        }else if(selectVariation == 12 ){
                            processOrder(product1, variation12, variation12Price, variation12Quantity, deliveryfee);
                        }else{
                            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number");
                          
                        }

                    break;
                 case 2: 
                 //rayzen 9 
                    String product2variation1 = "Rayzen 9/32gb/512GB SSD/1TB HDD/27inch Monitor\n";
                    String product2variation2 = "Rayzen 9/16gb/256GB SSD/500 HDD/24inch Monitor\n";
                    String product2variation3 = "Rayzen 9/8gb/256GB SSD/500 HDD/21inch Monitor\n";
                    String product2variation4 = "Rayzen 9/4gb/128GB SSD/320 HDD/19inch Monitor\n";
                //rayzen 7
                    String product2variation5 = "Rayzen 7/32gb/512GB SSD/1TB HDD/27inch Monitor\n";
                    String product2variation6 = "Rayzen 7/16gb/256GB SSD/500 HDD/24inch Monitor\n";
                    String product2variation7 = "Rayzen 7/8gb/256GB SSD/500 HDD/21inch Monitor\n";
                    String product2variation8 = "Rayzen 7/4gb/128GB SSD/320 HDD/19inch Monitor\n";

                    //rayzen 3
                    String product2variation9 = "Rayzen 3/32gb/512GB SSD/1TB HDD/24inch Monitor\n";
                    String product2variation10 = "Rayzen 3/16gb/256GB SSD/500 HDD/21inch Monitor\n";
                    String product2variation11 = "Rayzen 3/8gb/256GB SSD/500 HDD/19inch Monitor\n";
                    String product2variation12 = "Rayzen 3/4gb/128GB SSD/320 HDD/17inch Monitor\n";
                //rayzen 9 prize 
                    double product2variation1Price = 31999.00;
                    int product2variation1Quantity = 13;

                    double product2variation2Price = 28999.00;
                    int product2variation2Quantity = 12;

                    double product2variation3Price = 27999.00;
                    int product2variation3Quantity = 14;

                    double product2variation4Price = 25999.00;
                    int product2variation4Quantity = 11;
                //rayzen 7 prize
                   double product2variation5Price = 20999.00;
                    int product2variation5Quantity = 13;

                    double product2variation6Price = 19999.00;
                    int product2variation6Quantity = 12;

                    double product2variation7Price = 18999.00;
                    int product2variation7Quantity = 10;

                    double product2variation8Price = 18799.00;
                    int product2variation8Quantity = 11;
                //rayzen 7 prize
                 double product2variation9Price = 17999.00;
                    int product2variation9Quantity = 13;

                    double product2variation10Price = 16999.00;
                    int product2variation10Quantity = 12;

                    double product2variation11Price = 15999.00;
                    int product2variation11Quantity = 14;

                    double product2variation12Price = 14599.00;
                    int product2variation12Quantity = 11;

                    double product2deliveryfee = 100.00;
                   while (true) {
                        try {
                            selectVariation = Integer.parseInt(JOptionPane.showInputDialog(
                                    "Select a Variation:\n" +
                                    "[0] Back to Select Products\n"+
                                    "[1] " + product2variation1+
                                    "[2] "+product2variation2+
                                    "[3] "+product2variation3+
                                    "[4] "+product2variation4+"\n"+
                                    "[5] "+product2variation5+
                                    "[6] "+product2variation6+
                                    "[7] "+product2variation7+
                                    "[8] "+product2variation8+"\n"+
                                    "[9] "+product2variation9+
                                    "[10] "+product2variation10+
                                    "[11] "+ product2variation11+
                                    "[12] "+product2variation12));
                            break;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                        }
                    } 
                        if (selectVariation == 0) {
                            break;
                        }else if(selectVariation == 1 ){
                            processOrder(product2, product2variation1, product2variation1Price, product2variation1Quantity, product2deliveryfee);
                        }else if(selectVariation == 2 ){
                            processOrder(product2, product2variation2, product2variation2Price, product2variation2Quantity, product2deliveryfee);
                        }else if(selectVariation == 3){
                            processOrder(product2, product2variation3, product2variation3Price, product2variation3Quantity, product2deliveryfee);

                        }else if(selectVariation == 4){
                            processOrder(product2, product2variation4, product2variation4Price, product2variation4Quantity, product2deliveryfee);

                        }else if(selectVariation == 5){
                            processOrder(product2, product2variation5, product2variation5Price, product2variation5Quantity, product2deliveryfee);

                        }else if(selectVariation == 6){
                            processOrder(product2, product2variation6, product2variation6Price, product2variation6Quantity, product2deliveryfee);

                        }else if(selectVariation == 7){
                            processOrder(product2, product2variation7, product2variation7Price, product2variation7Quantity, product2deliveryfee);

                        }else if(selectVariation == 8){
                            processOrder(product2, product2variation8, product2variation8Price, product2variation8Quantity, product2deliveryfee);

                        }else if(selectVariation == 9){
                            processOrder(product2, product2variation9, product2variation9Price, product2variation9Quantity, product2deliveryfee);

                        }else if(selectVariation == 10){
                            processOrder(product2, product2variation10, product2variation10Price, product2variation10Quantity, product2deliveryfee);

                        }else if(selectVariation == 11){
                            processOrder(product2, product2variation11, product2variation11Price, product2variation11Quantity, product2deliveryfee);

                        }else if(selectVariation == 12){
                            processOrder(product2, product2variation12, product2variation12Price, product2variation12Quantity, product2deliveryfee);

                        }else{
                             JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number");
                            
                        }
                 break;
                 case 3:
                 //intel i7
                    String product3variation1 = "Intel i7/16gb/512GB SSD/24inch Monitor\n";
                    String product3variation2 = "Intel i7/16gb/512GB SSD/19inch Monitor\n";
                    String product3variation3 = "Intel i7/8gb/256GB SSD/24inch Monitor\n";
                    String product3variation4 = "Intel i7/8gb/256GB SSD/19inch Monitor\n";

                    String product3variation5 = "Intel i5/16gb/512GB SSD/21inch Monitor\n";
                    String product3variation6= "Intel i5/16gb/512GB SSD/17inch Monitor\n";
                    String product3variation7 = "Intel i3/8gb/256GB SSD/21inch Monitor\n";
                    String product3variation8 = "Intel i3/8gb/256GB SSD/19inch Monitor\n";
                //intel i7 price
                
                    double product3variation1Price = 24999.00;
                    int product3variation1Quantity = 15;

                    double product3variation2Price = 23999.00;
                    int product3variation2Quantity = 12;

                    double product3variation3Price = 22899.00;
                    int product3variation3Quantity = 10;

                    double product3variation4Price = 22599.00;
                    int product3variation4Quantity = 11;
                //intel i5 price
                  double product3variation5Price = 20999.00;
                    int product3variation5Quantity = 9;

                    double product3variation6Price = 19999.00;
                    int product3variation6Quantity = 9;

                    double product3variation7Price = 17999.00;
                    int product3variation7Quantity = 9;

                    double product3variation8Price = 16999.00;
                    int product3variation8Quantity = 9;

                    double product3deliveryfee = 50.00;

                    while (true) {
                        try {
                            selectVariation = Integer.parseInt(JOptionPane.showInputDialog(
                                    "Select a Variation:\n" +
                                    "[0] Back to Select Products\n"+
                                    "[1] " + product3variation1+
                                    "[2] "+product3variation2+
                                    "[3] "+product3variation3+
                                    "[4] "+product3variation4+"\n"+
                                    "[5] "+product3variation5+
                                    "[6] "+product3variation6+
                                    "[7] "+product3variation7+
                                    "[8] "+product3variation8));
                            break;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                        }
                    } 
                     if (selectVariation == 0) {
                            break;
                        }else if(selectVariation == 1 ){
                            processOrder(product3, product3variation1, product3variation1Price, product3variation1Quantity, product3deliveryfee);
                        }else if(selectVariation == 2){
                            processOrder(product3, product3variation2, product3variation2Price, product3variation2Quantity, product3deliveryfee);
                        } else if(selectVariation == 3){
                            processOrder(product3, product3variation3, product3variation3Price, product3variation3Quantity, product3deliveryfee);
                        }else if(selectVariation == 4){
                            processOrder(product3, product3variation4, product3variation4Price, product3variation4Quantity, product3deliveryfee);
                        }else if(selectVariation == 5){
                            processOrder(product3, product3variation5, product3variation5Price, product3variation5Quantity, product3deliveryfee);
                        } else if(selectVariation == 6){
                            processOrder(product3, product3variation6, product3variation6Price, product3variation6Quantity, product3deliveryfee);
                        } else if(selectVariation == 7){
                            processOrder(product3, product3variation7, product3variation7Price, product3variation7Quantity, product3deliveryfee);
                        }else if(selectVariation == 8){
                            processOrder(product3, product3variation8, product3variation8Price, product3variation8Quantity, product3deliveryfee);
                        }else{
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
    public void processOrder(String product, String variation, double variationPrice, int variationQuantity, double deliveryfee) {
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
                            + decimal.format((variationPrice * quantity + deliveryfee)) + "\nAre you sure you want to buy this product?",
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

