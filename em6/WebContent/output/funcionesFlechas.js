"use strict";

//const nombres = ['david','pe', 'gaymiro'];
//const numeros_caract = nombres.map(nombre => 
//`${nombre} tiene ${nombre.length} letras de caracteres`);
//
//console.log(numeros_caract);
var usuario = {
  nombre: 'david',
  edad: 20,
  pais: 'canada'
};
var nombre = usuario.nombre,
    _usuario$profesion = usuario.profesion,
    profesion = _usuario$profesion === void 0 ? 'desempleado' : _usuario$profesion,
    _usuario$email = usuario.email,
    email = _usuario$email === void 0 ? "sin facilitar" : _usuario$email;

var mostrarInfo = function mostrarInfo(_ref) {
  var nombre = _ref.nombre,
      _ref$profesion = _ref.profesion,
      profesion = _ref$profesion === void 0 ? 'matematico' : _ref$profesion;
  return alert("su nombre es ".concat(nombre, " y la profesion ").concat(profesion));
};

mostrarInfo(usuario);