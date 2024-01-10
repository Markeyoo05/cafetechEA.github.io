import javax.swing.JOptionPane;
import java.text.DecimalFormat;
class LaptopCategory implements Shop {
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
            String product1 = "ICON Laptop Intel Core i7 - i5- i3 | 16GB / 8GB / 4GB Memory | 512G / 256G / 128G SSD\n";
                   
            String product2 = "MSI Cyborg 15 A12UDX-496PH Gaming Laptop (i5-12450H / \n"
                    + "RTX 3050 6GB / 8GB RAM / 512GB SSD /15.6\\\" FHD).\n";

            String product3 = "HP ELITEbook 430 ultraslim laptop intel core i5 500GB-8GB-\n"
                    + "fingerprint backlit- with original charge\n";

            String product4 = "Acer Predator Helios Neo 16 2023 i5/i7 RTX4050/RTX4060 16\" 16GB\n"
                    + "DDR5 512GB SSD ZZM Trading\n";

            int selectProduct = 0;

            while (true) {
                try {
                    selectProduct = Integer.parseInt(JOptionPane.showInputDialog(
                            "Select a Product:\n" +"[0]BACK TO SELECT CATEGORY\n\n" +"[1] " + product1 + 
                            "\n[2] " + product2 + 
                            "\n[3] " + product3 +
                            "\n[4] "+ product4
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
                String variation1 = "Intel i7/16gb/512GB SSD/16 inches/ROSEGOLD\n";
                String variation2 = "Intel i7/16gb/512GB SSD/16 inches/Silver\n";
                String variation3 = "Intel i7/8gb/256GB SSD/16 inches/ROSEGOLD\n";
                String variation4 = "Intel i7/8gb/256GB SSD/16 inches/Silver\n";
                String variation5= "Intel i7/4gb/128GB SSD/16 inches/ROSEGOLD\n";
                String variation6 = "Intel i7/4gb/128GB SSD/16 inches/Silver\n";

                double variation1Price = 28999.00;
                int variation1Quantity = 5;
               
                double variation2Price = 28599.00;
                int variation2Quantity = 6;
               
                double variation3Price = 27999.00;
                int variation3Quantity = 9;

                double variation4Price = 27599.00;
                int variation4Quantity = 10;

                double variation5Price = 25999.00;
                int variation5Quantity = 11;

                double variation6Price = 25599.00;
                int variation6Quantity = 11;

                String variation7 = "Intel i5/16gb/512GB SSD/16 inches/ROSEGOLD\n";
                String variation8 = "Intel i5/16gb/512GB SSD/16 inches/Silver\n";
                String variation9 = "Intel i5/8gb/256GB SSD/16 inches/ROSEGOLD\n";
                String variation10 = "Intel i5/8gb/256GB SSD/16 inches/Silver\n";
                String variation11 = "Intel i5/4gb/128GB SSD/16 inches/ROSEGOLD\n";
                String variation12 = "Intel i5/4gb/128GB SSD/16 inches/Silver\n";

                double variation7Price = 26999.00;
                int variation7Quantity = 5;

                double variation8Price = 26899.00;
                int variation8Quantity = 6;

                double variation9Price = 25999.00;
                int variation9Quantity = 8;

                double variation10Price = 25899.00;
                int variation10Quantity = 10;

                double variation11Price = 24999.00;
                int variation11Quantity = 12;

                double variation12Price = 24899.00;
                int variation12Quantity = 13;

                String variation13 = "Intel i3/16gb/512GB SSD/16 inches/ROSEGOLD\n";
                String variation14 = "Intel i3/16gb/512GB SSD/16 inches/Silver\n";
                String variation15 = "Intel i3/8gb/256GB SSD/16 inches/ROSEGOLD\n";
                String variation16 = "Intel i3/8gb/256GB SSD/16 inches/Silver\n";
                String variation17 = "Intel i3/4gb/128GB SSD/16 inches/ROSEGOLD\n";
                String variation18 = "Intel i3/4gb/128GB SSD/16 inches/Silver\n";

                double variation13Price = 23999.00;
                int variation13Quantity = 15;

                double variation14Price = 23899.00;
                int variation14Quantity = 13;

                double variation15Price = 22999.00;
                int variation15Quantity = 12;

                double variation16Price = 21999.00;
                int variation16Quantity = 12;

                double variation17Price = 21899.00;
                int variation17Quantity = 15;

                double variation18Price = 20999.00;
                int variation18Quantity = 15;

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
                                "[4] "+variation4+
                                "[5] "+variation5+
                                "[6] "+variation6+"\n"+
                                "[7] "+variation7+
                                "[8] "+variation8+
                                "[9] "+variation9+
                                "[10] "+variation10+
                                "[11] "+variation11+
                                "[12] "+variation12+"\n"+
                                "[13] "+variation13+
                                "[14] "+variation14+
                                "[15] "+variation15+
                                "[16] "+variation16+
                                "[17] "+variation17+
                                "[18] "+variation18));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                    }
                } 
                   if(selectVariation == 0){
                    break;
                   }else if(selectVariation == 1){
                    processOrder(product1, variation1, variation1Price, variation1Quantity, deliveryfee);
                   }else if(selectVariation == 2){
                    processOrder(product1, variation2, variation2Price, variation2Quantity, deliveryfee);
                   }else if(selectVariation == 3){
                    processOrder(product1, variation3, variation3Price, variation3Quantity, deliveryfee);
                   }else if(selectVariation == 4){
                    processOrder(product1, variation4, variation4Price, variation4Quantity, deliveryfee);
                   }else if(selectVariation == 5){
                    processOrder(product1, variation5, variation5Price, variation5Quantity, deliveryfee);
                   }else if(selectVariation == 6){
                    processOrder(product1, variation6, variation6Price, variation6Quantity, deliveryfee);
                   }else if(selectVariation == 7){
                    processOrder(product1, variation7, variation7Price, variation7Quantity, deliveryfee);
                   }else if(selectVariation == 8){
                    processOrder(product1, variation8, variation8Price, variation8Quantity, deliveryfee);
                   }else if(selectVariation == 9){
                    processOrder(product1, variation9, variation9Price, variation9Quantity, deliveryfee);
                   }else if(selectVariation == 10){
                    processOrder(product1, variation10, variation10Price, variation10Quantity, deliveryfee);
                   }else if(selectVariation == 11){
                    processOrder(product1, variation11, variation11Price, variation11Quantity, deliveryfee);
                   }else if(selectVariation == 12){
                    processOrder(product1, variation12, variation12Price, variation12Quantity, deliveryfee);
                   }else if(selectVariation == 13){
                    processOrder(product1, variation13, variation13Price, variation13Quantity, deliveryfee);
                   }else if(selectVariation == 14){
                    processOrder(product1, variation14, variation14Price, variation14Quantity, deliveryfee);
                   }else if(selectVariation == 15){
                    processOrder(product1, variation15, variation15Price, variation15Quantity, deliveryfee);
                   }else if(selectVariation == 16){
                    processOrder(product1, variation16, variation16Price, variation16Quantity, deliveryfee);
                   }else if(selectVariation == 17){
                    processOrder(product1, variation17, variation17Price, variation17Quantity, deliveryfee);
                   }else if(selectVariation == 18){
                    processOrder(product1, variation18, variation18Price, variation18Quantity, deliveryfee);
                   }else {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number");
                  
                   }
               
            break;
            case 2:
                String product2variation1 = "Intel i7/16gb/512GB SSD/Black\n";
                String product2variation2 = "Intel i7/16gb/512GB SSD/Silver\n";
                String product2variation3 = "Intel i7/8gb/256GB SSD/Black\n";
                String product2variation4 = "Intel i7/8gb/256GB SSD/Silver\n";
                String product2variation5= "Intel i7/4gb/128GB SSD/Black\n";
                String product2variation6 = "Intel i7/4gb/128GB SSD/Silver\n";
                
                double product2variation1Price = 59999.00;
                int product2variation1Quantity = 5;
               
                double product2variation2Price = 59599.00;
                int product2variation2Quantity = 6;
               
                double product2variation3Price = 58999.00;
                int product2variation3Quantity = 9;

                double product2variation4Price = 58599.00;
                int product2variation4Quantity = 10;

                double product2variation5Price = 57999.00;
                int product2variation5Quantity = 11;

                double product2variation6Price = 57599.00;
                int product2variation6Quantity = 11;

                String product2variation7 = "Intel i5/16gb/512GB SSD/Black\n";
                String product2variation8 = "Intel i5/16gb/512GB SSD/Silver\n";
                String product2variation9 = "Intel i5/8gb/256GB SSD/Black\n";
                String product2variation10 = "Intel i5/8gb/256GB SSD/Silver\n";
                String product2variation11 = "Intel i5/4gb/128GB SSD/Black\n";
                String product2variation12 = "Intel i5/4gb/128GB SSD/Silver\n";

                 double product2variation7Price = 52999.00;
                int product2variation7Quantity = 5;

                double product2variation8Price = 52599.00;
                int product2variation8Quantity = 6;

                double product2variation9Price = 51999.00;
                int product2variation9Quantity = 8;

                double product2variation10Price = 51599.00;
                int product2variation10Quantity = 10;

                double product2variation11Price = 50999.00;
                int product2variation11Quantity = 12;

                double product2variation12Price = 50599.00;
                int product2variation12Quantity = 13;

                String product2variation13 = "Intel i3/16gb/512GB SSD/Black\n";
                String product2variation14 = "Intel i3/16gb/512GB SSD/Silver\n";
                String product2variation15 = "Intel i3/8gb/256GB SSD/Black\n";
                String product2variation16 = "Intel i3/8gb/256GB SSD/Silver\n";
                String product2variation17 = "Intel i3/4gb/128GB SSD/Black\n";
                String product2variation18 = "Intel i3/4gb/128GB SSD/Silver\n";

                double product2variation13Price = 49999.00;
                int product2variation13Quantity = 15;

                double product2variation14Price = 49599.00;
                int product2variation14Quantity = 13;

                double product2variation15Price = 48999.00;
                int product2variation15Quantity = 12;

                double product2variation16Price = 48599.00;
                int product2variation16Quantity = 12;

                double product2variation17Price = 47999.00;
                int product2variation17Quantity = 15;

                double product2variation18Price = 47599.00;
                int product2variation18Quantity = 15;
                
                double  product2deliveryfee = 148.00;

                
                while (true) {
                    try {
                        selectVariation = Integer.parseInt(JOptionPane.showInputDialog(
                                "Select a Variation:\n" +
                                "[0] Back to Select Products\n"+
                                "[1] " +product2variation1+
                                "[2] "+product2variation2+
                                "[3] "+product2variation3+
                                "[4] "+product2variation4+
                                "[5] "+product2variation5+
                                "[6] "+product2variation6+"\n"+
                                "[7] "+product2variation7+
                                "[8] "+product2variation8+
                                "[9] "+product2variation9+
                                "[10] "+product2variation10+
                                "[11] "+product2variation11+
                                "[12] "+product2variation12+"\n"+
                                "[13] "+product2variation13+
                                "[14] "+product2variation14+
                                "[15] "+product2variation15+
                                "[16] "+product2variation16+
                                "[17] "+product2variation17+
                                "[18] "+product2variation18));
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
                   }else if(selectVariation == 13){
                    processOrder(product2, product2variation13, product2variation13Price, product2variation13Quantity, product2deliveryfee);
                   }else if(selectVariation == 14){
                    processOrder(product2, product2variation14, product2variation14Price, product2variation14Quantity, product2deliveryfee);
                   }else if(selectVariation == 15){
                    processOrder(product2, product2variation15, product2variation15Price, product2variation15Quantity, product2deliveryfee);
                   }else if(selectVariation == 16){
                    processOrder(product2, product2variation16, product2variation16Price, product2variation16Quantity, product2deliveryfee);
                   }else if(selectVariation == 17){
                    processOrder(product2, product2variation17, product2variation17Price, product2variation17Quantity, product2deliveryfee);
                   }else if(selectVariation == 18){
                    processOrder(product2, product2variation18, product2variation18Price, product2variation18Quantity, product2deliveryfee);
                   }else {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number");
                   }

            break;
            case 3:
                String product3variation1 = "Intel i7/16gb/512GB SSD/16 inches/GOLD\n";
                String product3variation2 = "Intel i7/16gb/512GB SSD/16 inches/Silver\n";
                String product3variation3 = "Intel i7/8gb/256GB SSD/16 inches/GOLD\n";
                String product3variation4 = "Intel i7/8gb/256GB SSD/16 inches/Silver\n";
                String product3variation5= "Intel i7/4gb/128GB SSD/16 inches/ROSEGOLD\n";
                String product3variation6 = "Intel i7/4gb/128GB SSD/16 inches/Silver\n";

                double product3variation1Price = 27999.00;
                int product3variation1Quantity = 10;
               
                double product3variation2Price = 27599.00;
                int product3variation2Quantity = 11;
               
                double product3variation3Price = 26999.00;
                int product3variation3Quantity = 12;

                double product3variation4Price = 26599.00;
                int product3variation4Quantity = 13;

                double product3variation5Price = 25999.00;
                int product3variation5Quantity = 14;

                double product3variation6Price = 25599.00;
                int product3variation6Quantity = 15;

                String product3variation7 = "Intel i5/16gb/512GB SSD/16 inches/GOLD\n";
                String product3variation8 = "Intel i5/16gb/512GB SSD/16 inches/Silver\n";
                String product3variation9 = "Intel i5/8gb/256GB SSD/16 inches/GOLD\n";
                String product3variation10 = "Intel i5/8gb/256GB SSD/16 inches/Silver\n";
                String product3variation11 = "Intel i5/4gb/128GB SSD/16 inches/GOLD\n";
                String product3variation12 = "Intel i5/4gb/128GB SSD/16 inches/Silver\n";

                double product3variation7Price = 24999.00;
                int product3variation7Quantity = 16;

                double product3variation8Price = 24599.00;
                int product3variation8Quantity = 10;

                double product3variation9Price = 23999.00;
                int product3variation9Quantity = 9;

                double product3variation10Price = 23599.00;
                int product3variation10Quantity = 10;

                double product3variation11Price = 22999.00;
                int product3variation11Quantity = 12;

                double product3variation12Price = 22599.00;
                int product3variation12Quantity = 11;

                String product3variation13 = "Intel i3/16gb/512GB SSD/16 inches/GOLD\n";
                String product3variation14 = "Intel i3/16gb/512GB SSD/16 inches/Silver\n";
                String product3variation15 = "Intel i3/8gb/256GB SSD/16 inches/GOLD\n";
                String product3variation16 = "Intel i3/8gb/256GB SSD/16 inches/Silver\n";
                String product3variation17 = "Intel i3/4gb/128GB SSD/16 inches/GOLD\n";
                String product3variation18 = "Intel i3/4gb/128GB SSD/16 inches/Silver\n";
                
                double product3variation13Price = 21999.00;
                int product3variation13Quantity = 15;

                double product3variation14Price = 21599.00;
                int product3variation14Quantity = 16;

                double product3variation15Price = 20999.00;
                int product3variation15Quantity = 17;

                double product3variation16Price = 20599.00;
                int product3variation16Quantity = 18;

                double product3variation17Price = 19999.00;
                int product3variation17Quantity = 19;

                double product3variation18Price = 19599.00;
                int product3variation18Quantity = 11;

                double product3deliveryfee = 80.00;
                   while (true) {
                    try {
                        selectVariation = Integer.parseInt(JOptionPane.showInputDialog(
                                "Select a Variation:\n" +
                                "[0] Back to Select Products\n"+
                                "[1] " +product3variation1+
                                "[2] "+product3variation2+
                                "[3] "+product3variation3+
                                "[4] "+product3variation4+
                                "[5] "+product3variation5+
                                "[6] "+product3variation6+"\n"+
                                "[7] "+product3variation7+
                                "[8] "+product3variation8+
                                "[9] "+product3variation9+
                                "[10] "+product3variation10+
                                "[11] "+product3variation11+
                                "[12] "+product3variation12+"\n"+
                                "[13] "+product3variation13+
                                "[14] "+product3variation14+
                                "[15] "+product3variation15+
                                "[16] "+product3variation16+
                                "[17] "+product3variation17+
                                "[18] "+product3variation18));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                    }
                }  
                 if(selectVariation == 0){
                    break;
                   }else if(selectVariation == 1){
                    processOrder(product3, product3variation1, product3variation1Price, product3variation1Quantity, product3deliveryfee);
                   }else if(selectVariation == 2){
                    processOrder(product3, product3variation2, product3variation2Price, product3variation2Quantity, product3deliveryfee);
                   }else if(selectVariation == 3){
                    processOrder(product3, product3variation3, product3variation3Price, product3variation3Quantity, product3deliveryfee);
                   }else if(selectVariation == 4){
                    processOrder(product3, product3variation4, product3variation4Price, product3variation4Quantity, product3deliveryfee);
                   }else if(selectVariation == 5){
                    processOrder(product3, product3variation5, product3variation5Price, product3variation5Quantity, product3deliveryfee);
                   }else if(selectVariation == 6){
                    processOrder(product3, product3variation6, product3variation6Price, product3variation6Quantity, product3deliveryfee);
                   }else if(selectVariation == 7){
                    processOrder(product3, product3variation7, product3variation7Price, product3variation7Quantity, product3deliveryfee);
                   }else if(selectVariation == 8){
                    processOrder(product3, product3variation8, product3variation8Price, product3variation8Quantity, product3deliveryfee);
                   }else if(selectVariation == 9){
                    processOrder(product3, product3variation9, product3variation9Price, product3variation9Quantity, product3deliveryfee);
                   }else if(selectVariation == 10){
                    processOrder(product3, product3variation10, product3variation10Price, product3variation10Quantity, product3deliveryfee);
                   }else if(selectVariation == 11){
                    processOrder(product3, product3variation11, product3variation11Price, product3variation11Quantity, product3deliveryfee);
                   }else if(selectVariation == 12){
                    processOrder(product3, product3variation12, product3variation12Price, product3variation12Quantity, product3deliveryfee);
                   }else if(selectVariation == 13){
                    processOrder(product3, product3variation13, product3variation13Price, product3variation13Quantity, product3deliveryfee);
                   }else if(selectVariation == 14){
                    processOrder(product3, product3variation14, product3variation14Price, product3variation14Quantity, product3deliveryfee);
                   }else if(selectVariation == 15){
                    processOrder(product3, product3variation15, product3variation15Price, product3variation15Quantity, product3deliveryfee);
                   }else if(selectVariation == 16){
                    processOrder(product3, product3variation16, product3variation16Price, product3variation16Quantity, product3deliveryfee);
                   }else if(selectVariation == 17){
                    processOrder(product3, product3variation17, product3variation17Price, product3variation17Quantity, product3deliveryfee);
                   }else if(selectVariation == 18){
                    processOrder(product3, product3variation18, product3variation18Price, product3variation18Quantity, product3deliveryfee);
                   }else {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number");
                  
                   }
               
                
                
             break;
             case 4:
                String product4variation1 = "Intel i9/16gb/512GB SSD/16 inches/Black\n";
                String product4variation2 = "Intel i9/16gb/512GB SSD/16 inches/Silver\n";
                String product4variation3 = "Intel i9/8gb/256GB SSD/16 inches/Black\n";
                String product4variation4 = "Intel i9/8gb/256GB SSD/16 inches/Silver\n";
                String product4variation5= "Intel i9/4gb/128GB SSD/16 inches/Black\n";
                String product4variation6 = "Intel i9/4gb/128GB SSD/16 inches/Silver\n";
                double product4variation1Price = 68999.00;
                int product4variation1Quantity = 5;
               
                double product4variation2Price = 68599.00;
                int product4variation2Quantity = 6;
               
                double product4variation3Price = 67999.00;
                int product4variation3Quantity = 7;

                double product4variation4Price = 67599.00;
                int product4variation4Quantity = 7;

                double product4variation5Price = 66999.00;
                int product4variation5Quantity = 6;

                double product4variation6Price = 66599.00;
                int product4variation6Quantity = 5;
                
                String product4variation7 = "Intel i7/16gb/512GB SSD/16 inches/Black\n";
                String product4variation8 = "Intel i7/16gb/512GB SSD/16 inches/Silver\n";
                String product4variation9 = "Intel i7/8gb/256GB SSD/16 inches/Black\n";
                String product4variation10 = "Intel i7/8gb/256GB SSD/16 inches/Silver\n";
                String product4variation11 = "Intel i7/4gb/128GB SSD/16 inches/Black\n";
                String product4variation12 = "Intel i7/4gb/128GB SSD/16 inches/Silver\n";
                 
                double product4variation7Price = 65999.00;
                int product4variation7Quantity = 5;

                double product4variation8Price = 65599.00;
                int product4variation8Quantity = 6;

                double product4variation9Price = 64999.00;
                int product4variation9Quantity = 8;

                double product4variation10Price = 64599.00;
                int product4variation10Quantity = 10;

                double product4variation11Price = 63999.00;
                int product4variation11Quantity = 11;

                double product4variation12Price = 63599.00;
                int product4variation12Quantity = 13;
                
                String product4variation13 = "Intel i5/16gb/512GB SSD/16 inches/Black\n";
                String product4variation14 = "Intel i5/16gb/512GB SSD/16 inches/Silver\n";
                String product4variation15 = "Intel i5/8gb/256GB SSD/16 inches/Black\n";
                String product4variation16 = "Intel i5/8gb/256GB SSD/16 inches/Silver\n";
                String product4variation17 = "Intel i5/4gb/128GB SSD/16 inches/Black\n";
                String product4variation18 = "Intel i5/4gb/128GB SSD/16 inches/Silver\n";

                 
                double product4variation13Price = 62999.00;
                int product4variation13Quantity = 15;

                double product4variation14Price = 62599.00;
                int product4variation14Quantity = 13;

                double product4variation15Price = 61999.00;
                int product4variation15Quantity = 12;

                double product4variation16Price = 61599.00;
                int product4variation16Quantity = 12;

                double product4variation17Price = 60999.00;
                int product4variation17Quantity = 15;

                double product4variation18Price = 60599.00;
                int product4variation18Quantity = 15;

                double product4deliveryfee = 120.00;
                 while (true) {
                    try {
                        selectVariation = Integer.parseInt(JOptionPane.showInputDialog(
                                "Select a Variation:\n" +
                                "[0] Back to Select Products\n"+
                                "[1] " +product4variation1+
                                "[2] "+product4variation2+
                                "[3] "+product4variation3+
                                "[4] "+product4variation4+
                                "[5] "+product4variation5+
                                "[6] "+product4variation6+"\n"+
                                "[7] "+product4variation7+
                                "[8] "+product4variation8+
                                "[9] "+product4variation9+
                                "[10] "+product4variation10+
                                "[11] "+product4variation11+
                                "[12] "+product4variation12+"\n"+
                                "[13] "+product4variation13+
                                "[14] "+product4variation14+
                                "[15] "+product4variation15+
                                "[16] "+product4variation16+
                                "[17] "+product4variation17+
                                "[18] "+product4variation18));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                    }
                } 
                   if(selectVariation == 0){
                    break;
                   }else if(selectVariation == 1){
                    processOrder(product4, product4variation1, product4variation1Price, product4variation1Quantity, product4deliveryfee);
                   }else if(selectVariation == 2){
                    processOrder(product4, product4variation2, product4variation2Price, product4variation2Quantity, product4deliveryfee);
                   }else if(selectVariation == 3){
                    processOrder(product4, product4variation3, product4variation3Price, product4variation3Quantity, product4deliveryfee);
                   }else if(selectVariation == 4){
                    processOrder(product4, product4variation4, product4variation4Price, product4variation4Quantity, product4deliveryfee);
                   }else if(selectVariation == 5){
                    processOrder(product4, product4variation5, product4variation5Price, product4variation5Quantity, product4deliveryfee);
                   }else if(selectVariation == 6){
                    processOrder(product4, product4variation6, product4variation6Price, product4variation6Quantity, product4deliveryfee);
                   }else if(selectVariation == 7){
                    processOrder(product4, product4variation7, product4variation7Price, product4variation7Quantity, product4deliveryfee);
                   }else if(selectVariation == 8){
                    processOrder(product4, product4variation8, product4variation8Price, product4variation8Quantity, product4deliveryfee);
                   }else if(selectVariation == 9){
                    processOrder(product4, product4variation9, product4variation9Price, product4variation9Quantity, product4deliveryfee);
                   }else if(selectVariation == 10){
                    processOrder(product4, product4variation10, product4variation10Price, product4variation10Quantity, product4deliveryfee);
                   }else if(selectVariation == 11){
                    processOrder(product4, product4variation11, product4variation11Price, product4variation11Quantity, product4deliveryfee);
                   }else if(selectVariation == 12){
                    processOrder(product4, product4variation12, product4variation12Price, product4variation12Quantity, product4deliveryfee);
                   }else if(selectVariation == 13){
                    processOrder(product4, product4variation13, product4variation13Price, product4variation13Quantity, product4deliveryfee);
                   }else if(selectVariation == 14){
                    processOrder(product4, product4variation14, product4variation14Price, product4variation14Quantity, product4deliveryfee);
                   }else if(selectVariation == 15){
                    processOrder(product4, product4variation15, product4variation15Price, product4variation15Quantity, product4deliveryfee);
                   }else if(selectVariation == 16){
                    processOrder(product4, product4variation16, product4variation16Price, product4variation16Quantity, product4deliveryfee);
                   }else if(selectVariation == 17){
                    processOrder(product4, product4variation17, product4variation17Price, product4variation17Quantity, product4deliveryfee);
                   }else if(selectVariation == 18){
                    processOrder(product4, product4variation18, product4variation18Price, product4variation18Quantity, product4deliveryfee);
                   }else {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number");
               
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
    @Override
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
                                setaddress(JOptionPane.showInputDialog(null, "Enter your address (Street, Barangay, Province, City):"));
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
                                        "\nDelivery Fee:₱" + deliveryfee+ 
                                        "\nTotal Price:₱" + decimal.format(totalPrice) + 
                                        "\nPayment Method:" + paymentMethodLower + 
                                        "\n\nDetails for delivery:" + 
                                        "\nFull Name: " + getFullName()+ 
                                        "\nAddress: " + getaddress() + 
                                        "\nZip code: " + getZipCode()+
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
        
   
