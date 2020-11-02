"use strict";

/**
 * 
 */
//let pais="China";
//let pais="España";
//console.log("hola " + pais);
//function saludo(){
//	
//	var nombre= "david";
//	return "hola " +  nombre;
//	
//}
//
//console.log(nombre);
//
//var edad =18;
//if (edad>=18) {
//	let esAdulto="true";
//	
//}
//console.log(esAdulto);
//const nombre="carlos";
//nombre ="david";
//console.log(nombre);
var colores = ["rojo", "verde"];
colores.push("amarillo");
console.log(colores);
console.log("array incluye rojo?", colores.includes("rojo"));
console.log("posicion justo verde carac del array?", colores.findIndex(color => color === "verde"));


var texto = "hoy es domingo";
console.log("empieza con h?", texto.toLowerCase().startsWith("h"));
console.log("acaba por o?", texto.toLowerCase().endsWith("o"));
console.log("incluye es?", texto.includes("es"));

