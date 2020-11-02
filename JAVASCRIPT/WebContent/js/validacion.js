window.onload = iniciar;




function iniciar(){
	document.getElementById("enviar").addEventListener("click",validar,false);
	
}

function validarNombre(){
	
	var elemento= document.getElementById("nombre");
	if (elemento.value==""){
		alert ("el campo no puede estar vacio");
		return false;
		
	}
	return true;
}

function validaTelefono(){
	var elemento= document.getElementById("telefono");
	if (isNaN(elemento.value)){
		alert ("el campo tfno tiene que ser numerico");
		return false;
		
	}
	return true;
}
	function validaFecha(){
		var dia= document.getElementById("dia");
		var mes= document.getElementById("mes");
		var ano= document.getElementById("ano");
		
		var fecha = new Date(ano, mes, dia);
		
		if (isNaN(fecha)){
			alert ("el campo fecha son incorrectos");
			return false;
			
		}
		return true;
	}
	function validaCheck(){
		var campochecked = document.getElementById("mayor");
		if (!campochecked){
			alert("debes ser mayor de edad");
			return false;
			
		}
		return true;
	}
	
	function validar(){
		if (validarNombre () && validaTelefono() && validaFecha() && validaCheck() &&
				confirm ("quieres enviar el form?")){
			return true
		}else{
			e.preventDefault();

		}
	}
	function error(elemento) {
	    elemento.className = "error";
	    elemento.focus();
	}

	function limpiarError(elemento) {
	    elemento.className = "";
	}