//const nombres = ['david','pe', 'gaymiro'];
//const numeros_caract = nombres.map(nombre => 
//`${nombre} tiene ${nombre.length} letras de caracteres`);
//
//console.log(numeros_caract);


const usuario = {
		
		nombre:'david',
		edad: 20,
		pais: 'canada',
		
}

const {nombre,profesion='desempleado', email="sin facilitar"} = usuario;



const mostrarInfo = ({nombre, profesion='matematico'}) => alert(`su nombre es ${nombre} y la profesion ${profesion}`);
	

mostrarInfo(usuario);




		
		

