//selectionne h1
var titre = document.getElementById("grostitre");
alert(titre);
//selectionne le contenu de h1
var texteTitre= titre.innerHTML;
alert(texteTitre);

//selection le premier paragraphe rencontré
var para1 = document.querySelector("p");
alert(para1);
//selectionne le contenu texte du premier paragraphe
var textep1= para1.textContent;
alert(textep1);

//selectionne tous elements p dans un tableau
var par = document.getElementsByTagName("p");
alert("Notre page contient " + par.length +" paragraphes");

//selectionne les elements de la classe para
var tableau = document.getElementsByClassName("para");
alert("Notre page contient " + tableau.length +" element(s) de la classe para");

//selectionne le lien <a> contenu dans le paragraphe <p>
var lien = document.querySelector("p a");
alert(lien);

//selectionne tous les elements de la classe para
var tableau2 = document.querySelectorAll(".para");
alert("Notre page contient " + tableau2.length +" element(s) de la classe para");