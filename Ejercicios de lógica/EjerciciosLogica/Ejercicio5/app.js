let aleatorio = Math.floor(
    Math.random() * (Math.floor(100) - Math.ceil(0) +1) +Math.ceil(0) 
    );
    console.log(aleatorio);   
let intento = [];
let numero=0;

adivinar(aleatorio);

function adivinar(aleatorio){
    do{
        
        numero = parseInt(prompt("Adivina el numero aleatorio entre el 0 y 100"));
        if(numero==101){
            alert(aleatorio)
        }
        else if(isNaN(numero)){
            alert("El dato ingresado no es un número")
        }
        else if(numero==aleatorio){
            alert("Felicidades, adivinaste el número secreto")
            alert(intento)
        }
        else {
            alert("Ups, el número secreto es incorrecto, vuelve a intentarlo")
            intento.push(numero)
            alert("escribe 101 para conocer el numero");

    }
}   while (isNaN(numero)||numero!=aleatorio)
}
