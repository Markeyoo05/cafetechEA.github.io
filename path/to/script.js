function updateLoginHeading() {
    alert("Log-in Successfully!");
    var username = document.getElementById('username').value;
    document.getElementById('Loginletter').innerHTML = "Welcome, " + username;
    document.getElementById('userinfo').innerHTML = username +'<span class="smiley">😎</span>';
    document.getElementById("menu").style.display = "block";
   
    
}
function sent(){
    alert("Your message has been successfully sent. Thank you for reaching out to us. We appreciate your inquiry and will get back to you as soon as possible. If you have any further questions or concerns, feel free to let us know. We value your communication and look forward to assisting you. ");
}
function signup(){
    alert("Registration Sucessfully you can now login your account");
}
function toggleCategory(categoryId) {
    var category = document.getElementById(categoryId);
    if (category.style.display === "none") {
        category.style.display = "block";
    } else {
        category.style.display = "none";
    }
}