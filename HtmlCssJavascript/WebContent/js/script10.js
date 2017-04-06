//ajouter html au contenu de h1
document.getElementById("grostitre").innerHTML+=" HTML";
//changer le lien contenu dans <p>
document.querySelector("a").href ="http://www.wikipedia.fr"; 
//changer le nom de classe du premier paragraphe p
document.querySelector("p").className = "para1";

document.querySelector("h1").className = "styleTitre";
//on peut aussi faire document.querySelector("h1").style.color ="red";

//changer l'image
document.querySelector("img").src ="img/maxresdefault.jpg"; 

//pour ajouter un nouveau paragraphe avec un texte à notre fichier html via javascript
//créer un nouveau paragraphe avec un id "nouveau"
var newPara = document.createElement("p");
newPara.id="nouveau";

//créer le texte Texte inséré
var texte = document.createTextNode("Texte inséré")

//Insérer le texte dans le nouvel élément p
newPara.appendChild(texte);

//Insérer le nouvel élément p dans le body de notre document
document.body.appendChild(newPara);

//on créé un nouveau paragraphe avec du texte pour utiliser insertBefore
var newPara2 = document.createElement("p");
newPara2.id="nouveau2";
var texte = document.createTextNode("Texte inséré")
newPara2.appendChild(texte);

//je sélectionne le paragraphe 1 pour pouvoir insérer mon nouveau paragraphe devant
var para1=document.querySelector("p");

//Insérer le nouvel élément p dans le body de notre document mais avant le paragraphe1
document.body.insertBefore(newPara2,para1);

//suppression h2
//on sélectionne l'élément h2 à supprimer
var supprh2= document.querySelector("h2")
//on applique la suppression à l'élément sélectionné
document.body.removeChild(supprh2)

//on attribue une classe à h3 pour que le style css s'y applique
document.querySelector("h3").className = "texteDroite";