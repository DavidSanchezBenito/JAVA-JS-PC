class Usuario{
	constructor(nombre, edad,correo){
		this.nombre=nombre,
		this.edad=edad,
		this.correo=correo;

	}
	mostrarSaludo(mensaje){
		return mensaje;
		
	}
	mostrarInfo(){
		return `
			<b>Nombre:</b>  ${this.nombre} <br />
			<b>Edad:</b>  ${this.edad} <br />
			<b>Correo:</b>  ${this.correo} <br />
			<hr/>
			`;
		
	}

}
const persona = new Usuario('david', 60, 'ejemplo@p.es');
document.write(persona.mostrarInfo());



class Student extends Usuario{
	
	constructor(nombre, edad, correo,carrera){
		super(nombre, edad, correo);
		this.carrera=carrera;
	}
	mostrarInfo(){
		return `
			<b>Nombre:</b>  ${this.nombre} <br />
			<b>Edad:</b>  ${this.edad} <br />
			<b>Correo:</b>  ${this.correo} <br />
			<b>Carrera:</b>  ${this.carrera} <br />
			<hr/>
			`;
		
	}
	
}	
	const persona1 = new Student ('ramon', 90,'p@p.es', 'bombero');
	document.write(persona1.mostrarInfo());
	
