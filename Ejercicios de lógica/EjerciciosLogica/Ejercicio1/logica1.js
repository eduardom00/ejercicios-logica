a= parseInt(prompt("Introduce el primer número"))
b= parseInt(prompt("Introduce el primer número"))
c= parseInt(prompt("Introduce el primer número"))

if (a>=b && a>=c){
    console.log(a);
    if(b>=c){
        console.log(b);
        console.log(c);
    }
    else {console.log(c);
        console.log(b)};
} else if (b>=a && b>=c){
    console.log(b);
    if(a>=c){
        console.log(a);
        console.log(c);
    } else {console.log(c);
            console.log(a)};
} else if (c>=a && c>=b){
        console.log(c);
        if (a>=b){
            console.log(a);
            console.log(b);
        }
        else console.log(b);
             console.log(a);
        }
    if(a==b || a== c || c==b){
        if (a==b){
        console.log("El número 1: " +a+" Y el número 2: " + b + " son iguales ")};
        if (a==c){
        console.log("El número 1: " +a+" Y el número 3: " + c + " son iguales ")};
        if (b==c){
        console.log("El número 2: " +b+" Y el número 3: " + c + " son iguales ")};
    }