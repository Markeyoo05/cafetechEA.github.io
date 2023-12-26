function buyNow2(product,productPrice,quantitysell,name) {
    var quantityInput = document.getElementById(product);
    var priceElement = document.getElementById(productPrice);
    var quantitySellerElement = document.getElementById(quantitysell);
    var productNameElement = document.getElementById(name);

    var quantity = parseInt(quantityInput.value);

    var price = parseFloat(priceElement.textContent.replace('₱', '').replace(',', '').trim());
    var availableQuantity = parseInt(quantitySellerElement.textContent);
    if (quantity > availableQuantity || availableQuantity == 0) {
        alert("Sorry, the requested quantity is not available. Please choose a lower quantity.");
        return ;
    }
    var remainingQuantity = availableQuantity - quantity;
    if (remainingQuantity === 0) {
        quantitySellerElement.innerHTML = remainingQuantity+ "ut Of Stock";
    } else {
        quantitySellerElement.innerHTML = remainingQuantity + " pieces available";
    }

    quantityInput.value = 1;
    var total = quantity * price;
   
    // Add fixed delivery fee
    var deliveryFee = 50.00;
    var totalWithDeliveryFee = total + deliveryFee;

    // Prompt for user details
    while (true) {
    var paymentMethod = prompt("Enter your Payment Method (Available only Gcash and COD): ");
   

    var PaymentMethod = paymentMethod.toLowerCase();
    if (PaymentMethod == 'gcash') {
        var fullName = prompt("Enter your full name:");
        var phoneNumber = prompt("Enter your phone number:");   
        var region = prompt("Enter your region:");
        var province = prompt("Enter your province:");
        var city = prompt("Enter your city:");
        var barangay = prompt("Enter your barangay:");
        var zipCode = prompt("Enter your zip code:");
        var streetName = prompt("Enter your street name:");
        var userDetails = {
                paymentMethod: PaymentMethod,
                fullName: fullName,
                phoneNumber: phoneNumber,
                region: region,
                province: province,
                city: city,
                barangay: barangay,
                zipCode: zipCode,
                streetName: streetName,
                address : function (){
                    return this.streetName + ", "+this.barangay+", " +this.province+", " +this.city;
                }
            };
            var allDetails = "Thank you for your purchase!\n\n";
            allDetails += "Order Details:\n";
            allDetails += "Product Name: "+productNameElement.textContent+"\n";
            allDetails += "Variation: " + selectedVariation + "\n";
            allDetails += "Quantity: " + quantity + "\n";
            allDetails += "Product Price: ₱" + price.toFixed(2)+ "\n";
            allDetails += "Total of Product Price: ₱" + total.toFixed(2) + "\n";
            allDetails += "Delivery Fee: ₱" + deliveryFee.toFixed(2) + "\n";
            allDetails += "Total Price (including Delivery Fee): ₱" + totalWithDeliveryFee.toFixed(2) + "\n\n";
            if (userDetails.paymentMethod == 'gcash') {
                allDetails += "The Gcash Details for your Payment:\n"
                allDetails += "GCash Number: 09632122892\n";
                allDetails += "GCash Account Name: MARK CLEO CALBANG\n\n";
            }
            allDetails += "Delivery Details:\n";
            allDetails += "Payment Method: " + userDetails.paymentMethod + "\n";
            allDetails += "Full Name: " + userDetails.fullName + "\n";
            allDetails += "Phone Number: " + userDetails.phoneNumber + "\n";
            allDetails += "Region: " + userDetails.region + "\n";
            allDetails +="Address: "+userDetails.address()+"\n";
            allDetails += "Zip Code: " + userDetails.zipCode + "\n";
            alert(allDetails);
            break;
    } else if (PaymentMethod == 'cod') {
        var fullName = prompt("Enter your full name:");
        var phoneNumber = prompt("Enter your phone number:");   
        var region = prompt("Enter your region:");
        var province = prompt("Enter your province:");
        var city = prompt("Enter your city:");
        var barangay = prompt("Enter your barangay:");
        var zipCode = prompt("Enter your zip code:");
        var streetName = prompt("Enter your street name:");
        var userDetails = {
            paymentMethod: PaymentMethod,
            fullName: fullName,
            phoneNumber: phoneNumber,
            region: region,
            province: province,
            city: city,
            barangay: barangay,
            zipCode: zipCode,
            streetName: streetName,
            address : function (){
                return this.streetName + ", "+this.barangay+", " +this.province+", " +this.city;
            }
        };
        var allDetails = "Thank you for your purchase!\n\n";
        allDetails += "Order Details:\n";
        allDetails += "Product Name: "+productNameElement.textContent+"\n";
        allDetails += "Variation: " + selectedVariation + "\n";
        allDetails += "Quantity: " + quantity + "\n";
        allDetails += "Product Price: ₱" + price.toFixed(2)+ "\n";
        allDetails += "Total of Product Price: ₱" + total.toFixed(2) + "\n";
        allDetails += "Delivery Fee: ₱" + deliveryFee.toFixed(2) + "\n";
        allDetails += "Total Price (including Delivery Fee): ₱" + totalWithDeliveryFee.toFixed(2) + "\n\n";
        allDetails += "Delivery Details:\n";
        allDetails += "Payment Method: " + userDetails.paymentMethod + "\n";
        allDetails += "Full Name: " + userDetails.fullName + "\n";
        allDetails += "Phone Number: " + userDetails.phoneNumber + "\n";
        allDetails += "Region: " + userDetails.region + "\n";
        allDetails +="Address: "+userDetails.address()+"\n";
        allDetails += "Zip Code: " + userDetails.zipCode + "\n";
      

       
        alert(allDetails);
        break;
    } else {
        alert("Invalid payment method. Please choose either Gcash or COD.");
       
    }
}
}