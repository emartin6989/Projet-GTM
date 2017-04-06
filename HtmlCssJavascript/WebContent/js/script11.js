//cibler le premier paragraphe
var p1=document.querySelector("p");

//ajouter un ecouteur d'evenement concernant le premier paragraphe
p1.addEventListener("mouseover",Fonction1);

//definir la fonction
function Fonction1(){
	//concerne le paragraphe selectionné
	this.innerHTML="Cliquez sur moi maintenant";
	this.style.backgroundColor="orange";
}

p1.addEventListener("mouseout",Reset1);
function Reset1(){
	//concerne le paragraphe selectionné
	this.innerHTML="Passez sur moi";
	this.style.backgroundColor="";
}

//evenement quand on presse la souris
p1.addEventListener("mousedown",Fonction2);
function Fonction2(){
	//concerne le paragraphe selectionné
	this.innerHTML="Bravo";
	this.className="styledown";
}

p1.addEventListener("mouseup",Reset2);
function Reset2(){
	//concerne le paragraphe selectionné
	this.innerHTML="Cliquez sur moi maintenant";
	this.className="styleup";
}