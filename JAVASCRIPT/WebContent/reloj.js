/**
 * 
 */

(function(){
	
	
	var actualizarHora = function(){
		var fecha = new Date();
		var hora = fecha.getHours();
		var minutos = fecha.getMinutes();
		var segundos = fecha.getSeconds();
		var año= fecha.getFullYear();
		var mes = fecha.getMonth();
		var dia = fecha.getDate(),
			diadelasemana= fecha.getDay(),
			ampm
			;
	var pHoras = document.getElementById("horas"),
		pAmpm= document.getElementById("ampm"),
		pMinutos=document.getElementById("minutos"),
		pSegundos= document.getElementById("segundos"),
		pAño=document.getElementById("year"),
		pMes=document.getElementById("mes"),
		pDia=document.getElementById("dia"),
		pDiadelasemana= document.getElementById("diaSemana");
		
		
	var semana = ['Domingo', 'Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sabado'];
	pDiadelasemana.textContent=semana[diadelasemana];
	pDia.textContent=dia;
	var meses = ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'];
	pMes.textContent=meses[mes];
	pAño.textContent=año;
	pHoras.textContent=hora;
	if (hora>=12) {
		hora=hora-12;
		ampm="PM";
	}else{
		ampm="AM";

	}
	if (hora == 0) {
		hora = 12;
	}
	if (minutos<10) {
		minutos="0"+minutos;
		
	}
	if (segundos<10) {
		segundos="0"+segundos;
		
	}
	
	pAmpm.textContent=ampm;
	pMinutos.textContent=minutos;
	pSegundos.textContent=segundos;
	};
	
	actualizarHora();
	var intervalo =setInterval(actualizarHora,1000);
	
}())