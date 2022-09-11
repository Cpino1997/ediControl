function showReg(){
    document.getElementById("regg").style.display="block";
    document.getElementById("loginn").style.display="none";
}
function showLog(){
    document.getElementById("regg").style.display="none";
    document.getElementById("loginn").style.display="block";
}
function alerta(){
    alert("Solicitud Enviada Con Exito!, Un Administrador Te Contactara Pronto Para Habilitar La Cuenta");
    showLog();
}

