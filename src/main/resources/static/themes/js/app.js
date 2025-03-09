// //con este evento nos aseguramos que el DOM haya cargado antes de manipularlo
// document.addEventListener("DOMContentLoaded", (event) => {
//     const fecha = document.getElementById("fecha");
//     const now = new Date();
//     fecha.innerText = now.toLocaleDateString();
//   });

var dateControl = document.querySelector('input[type="date"]');
dateControl.valueAsNumber = new Date();
console.log(dateControl.value); // imprime "2017-06-01"
console.log(dateControl.valueAsNumber); // imprime 1496275200000, una marca de fecha (en ms) en JavaScript.