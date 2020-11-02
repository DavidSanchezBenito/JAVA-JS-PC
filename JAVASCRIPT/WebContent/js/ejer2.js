
function muestraOpcion(){
	
var opciones = document.getElementsByName("sexo");
console.log(opciones);
for (var i = 0; i < opciones.length; i++) {

	if (opciones[i].checked) {
		alert(opciones[i].value)
	} else {

	}
	
}};

// function david(){
// var info1 = document.getElementById("hombre");
// var info2 = document.getElementById("mujer");
// info1.addEventListener("click",hombre,false);
// info2.addEventListener("click",mujer,false);
// function hombre(){
// 	alert("boton hombre");
	
// }

// function mujer(){
// 	alert("boton mujer");
	
// }
// };




