function validateLogin() {
    var name = document.getElementById("name").value;
    var password = document.getElementById("password").value;
    if (name === '' || password === '') {
        alert('Please enter a valid name.');
        return false;
    } else {
        return true;
    }
}