/**
 * hecho por mi pero no ejecuta el confirm
 */
window.onload = iniciar;
function iniciar(){
	document.getElementById("enviar").addEventListener('click', validar,false);
}

function validaNombre(){
	
	var elemento=document.getElementById("nombre");
	if (!elemento.checkValidity()) {  //comprueba q la validacion HTML 5 es correcta   
		if(elemento.validity.valueMissing){
			error2(elemento,"debes instroducir un nombre");
		}
		if(elemento.validity.patternMismatch){
			error2(elemento,"nº de caracteres incorrecto");
		}
		
		//error(elemento);  //acceda a la funcion error pasándole el elemento
		return false;
	}return true;
}

function validarEdad(){
	var elemento=document.getElementById("edad");
	if (!elemento.checkValidity()) {
		
		if(elemento.validity.valueMissing){
			error2(elemento,"debes instroducir una edad");
		}
		if(elemento.validity.rangeOverflow){
			error2(elemento,"el valor debe ser menor de 30");
		}
		
		if(elemento.validity.rangeUnderflow){
			error2(elemento,"el valor debe ser menor de 16");
		}	
		//error(elemento);
		return false;
	}return true;
}
	
function validaTfno(){
	var elemento=document.getElementById("telefono");
	if (!elemento.checkValidity()) {
		if(elemento.validity.valueMissing){  //si no introducimos nada
			error2(elemento,"debes instroducir un tfno");
		}
		if(elemento.validity.patternMismatch){  //no coinciden los datos
			error2(elemento,"debe tener 3 numeros");
		}
		
		//error(elemento);
		return false;
	}return true;
}

function validar(e){  //es necesario q le pasemos un evento
    borrarError();
	if (validaNombre() && validarEdad() && validaTfno() && confirm("deseas enviar el form") ) {
		return true;
	}else{
		e.preventDefault();
		return false;	
	}
}





function error(elemento){
	
	document.getElementById("mensajeError").innerHTML = elemento.validationMessage;
	elemento.className="error";
	elemento.focus();
	
}

function error2(elemento, mensaje){
	
	document.getElementById("mensajeError").innerHTML = mensaje;
	elemento.className="error";
	elemento.focus();
	
}



function borrarError(){
	var formulario=document.forms[0];
	for(var i=0; i < formulario.elements.length;i++){
		formulario.elements[i].className="";
	}
}


	
