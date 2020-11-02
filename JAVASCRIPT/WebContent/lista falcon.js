
(function(){
	//variables
	var lista=document.getElementById("lista"), 
		tareaInput = document.getElementById("tareaInput"),
		btnNuevaTarea= document.getElementById("btn-agregar");
	
	//funciones
	var agregarTarea=  function(){
		var tarea = tareaInput.value,
			nuevaTarea=document.createElement("li"),
			enlace=document.createElement("a"),
			contenido=document.createTextNode(tarea);
		
		if (tarea=== "") {
			tareaInput.setAttribute("placeholder", "agrega una tarea valida");
			tareaInput.className= "error";
			return false;
			
		}
		//agregamos el contenido al enlace
		enlace.appendChild(contenido);
		//establecemos un atributo href
		enlace.setAttribute("href", "#");
		//agregamos el enlace a la nueva tarea LI
		nuevaTarea.appendChild(enlace);
		//nuevaTarea lo agregamos a la lista
		lista.appendChild(nuevaTarea);
		
		tareaInput.value=""; //esto es para limpiar cuando metemos datos
		
		for (var i = 0; i <= lista.children.length-1; i++) {  //porq cuenta desde el 0
			lista.children[i].addEventListener("click",function(){
				this.parentNode.removeChild(this);
				
			});
	}
		
	};
	
	var comprobarInput =  function(){
		tareaInput.className="";  //elimina la clase
		tareaInput.setAttribute("placeholder","agrega tu tarea")
	};
	
	var eliminarTarea =  function(){
		this.parentNode.removeChild(this);
	};
	
	//eventos
	
	//agregar tarea
	btnNuevaTarea.addEventListener("click",agregarTarea,false);
	
		//comprobar input 
	tareaInput.addEventListener("click",comprobarInput,false);
	
	//borrando elementos de una lista
	for (var i = 0; i < lista.children.length-1; i++) {  //porq cuenta desde el 0
			lista.children[i].addEventListener("click",eliminarTarea,false);
	}
	
}());
