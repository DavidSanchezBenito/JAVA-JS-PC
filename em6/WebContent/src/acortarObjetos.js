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
console.log(Math.max(5,99,102));
let array =[5,99,1000];
let array2 =[500,9900,10000];
console.log(Math.max(...array, ...array2, 500000));
let arrayResultado = [...array,array2];
let arrayCopia= [array2];
//console.log("array resultado: " + arrayResultado);
//console.log("array copia: " + arrayCopia);

let saludo ="Hola, caracola";
//console.log([...saludo]);
//function suma(a,b,c){
//	return a + b+ c;
//}
//const valores=[1,3,5];
//console.log(suma(...valores));

let persona1={nombre:"adam", nacimiento: "1990"};
let persona2={nombre2:"peter", nacimiento2:"1890"};


let clon = {...persona2};
//console.log(clon);
let addpersona={...persona1, ...persona2};
console.log(addpersona);




