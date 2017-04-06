//fonction classique
function multiplication(x, y) 
{
	return x * y;
}
//fonction anonyme : permet de passer la fonction en variable
var carre=function(x){
	return x*x;
}

//appel d'une fonction classique
alert(multiplication(5,2));

//recupération de saisies utilisateurs
var x = prompt("Taper le premier nombre");
var y = prompt("Taper le second nombre");

alert(multiplication(x, y));

var c= prompt("Saisir une valeur")
alert(carre(c));