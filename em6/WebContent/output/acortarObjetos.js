"use strict";

function ownKeys(object, enumerableOnly) { var keys = Object.keys(object); if (Object.getOwnPropertySymbols) { var symbols = Object.getOwnPropertySymbols(object); if (enumerableOnly) symbols = symbols.filter(function (sym) { return Object.getOwnPropertyDescriptor(object, sym).enumerable; }); keys.push.apply(keys, symbols); } return keys; }

function _objectSpread(target) { for (var i = 1; i < arguments.length; i++) { var source = arguments[i] != null ? arguments[i] : {}; if (i % 2) { ownKeys(Object(source), true).forEach(function (key) { _defineProperty(target, key, source[key]); }); } else if (Object.getOwnPropertyDescriptors) { Object.defineProperties(target, Object.getOwnPropertyDescriptors(source)); } else { ownKeys(Object(source)).forEach(function (key) { Object.defineProperty(target, key, Object.getOwnPropertyDescriptor(source, key)); }); } } return target; }

function _defineProperty(obj, key, value) { if (key in obj) { Object.defineProperty(obj, key, { value: value, enumerable: true, configurable: true, writable: true }); } else { obj[key] = value; } return obj; }

//const crearObjeto = (nombre,edad) => {
//	return{
//		nombre,
//		edad,
//		mostrarInfo(){
//			return `${nombre} tiene años ${edad}`
//			
//		}
//	}
//}
//	alert(crearObjeto('sanchez', 9).mostrarInfo());
//function ambito(){
//"use strict";
//
//let a = "ambito generico";
//if (true){
//	let a="ambito bloque";
//	console.log("el ambito del IF es " + a);
//	}
//console.log("el ambito de la funcion 12 es "+ a);
//
//}
//ambito();
//function cambiarArray(){
//	const MIARRAY=[1,2,3];
//	console.log(MIARRAY);
//	MIARRAY[0]="david";
//	console.log(MIARRAY);
//}
//cambiarArray();
//var mifuncion= () => new Date();
//
//console.log(mifuncion());
////var arraysConcatenados =function(array1, array2){
////	return array1.concat(array2); }
////
////console.log(arraysConcatenados([1,2],[3,4,6,7] ));
//
//
//var arraysConcatenados = (array1, array2) => array1.concat(array2); 
//
//console.log(arraysConcatenados([1,2],[3,4,6,7]));
//function multiplicar(a,b){
//	b=typeof b!=='undefined' ?b:2
//			return a +b;
//}
//console.log(multiplicar(5));
//function miList(a,b){
//	console.log("ARGUMENTS");
//	console.log("a="+a);
//	console.log("b="+b);
//	console.log("todos los argumentos=", arguments);
//	console.log("tamaño="+arguments.length);
//	console.log(arguments[2]);
//}
//miList("pera","medias","liguero","tacones","ligas");
//function miList1(a,b,c,...datos){
//	console.log("ARGUMENTS");
////	console.log("a="+a);
////	console.log("b="+b);
//	console.log("todos los argumentos=", datos);
//	console.log("tamaño="+datos.length);
//	console.log(datos[1]);
//}
//miList1("pera","medias","liguero","tacones","ligas");
console.log(Math.max(5, 99, 102));
var array = [5, 99, 1000];
var array2 = [500, 9900, 10000];
console.log(Math.max.apply(Math, array.concat(array2, [500000])));
var arrayResultado = [].concat(array, [array2]);
var arrayCopia = [array2]; //console.log("array resultado: " + arrayResultado);
//console.log("array copia: " + arrayCopia);

var saludo = "Hola, caracola"; //console.log([...saludo]);
//function suma(a,b,c){
//	return a + b+ c;
//}
//const valores=[1,3,5];
//console.log(suma(...valores));

var persona1 = {
  nombre: "adam",
  nacimiento: "1990"
};
var persona2 = {
  nombre2: "peter",
  nacimiento2: "1890"
};

var clon = _objectSpread({}, persona2); //console.log(clon);


var addpersona = _objectSpread(_objectSpread({}, persona1), persona2);

console.log(addpersona);