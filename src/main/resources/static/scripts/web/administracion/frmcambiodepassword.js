function changePassword() {
    var newPassword = document.getElementById('newPassword').value;
    var confirmPassword = document.getElementById('confirmPassword').value;

    if (newPassword === confirmPassword) {

        alert('Contraseña cambiada exitosamente');
    } else {
        alert('Las contraseñas no coinciden. Por favor, inténtalo de nuevo.');
    }
}