Factorial();
function Factorial() {
let fac;
do { 
    fac = parseInt(prompt("Introduce un número"));
    if(isNaN(fac)){
        alert("No es un número válido");
    } else {
    res=1
    for (i=1; i<=fac; i++){
        res *= i;
    }
    alert("El número factorial es " + res);
} 
} while (isNaN(fac))


}