Fibo()
function Fibo(){
    let series;
do {
    n=parseInt(prompt("Introduce la series de Fibonacci"))
    series= Array(n)
if(isNaN(n)){
    alert("No es un numero")
} else {
    series.fill(0);
    series[0] = 0;
    series[1] = 1;

    for(i=2;i<=n;i++){
        series[i] = series[i-1] + series [i-2] 
    }
}
    alert(series)
} while(isNaN(n))
}