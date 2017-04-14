<%@ page language="java" contentType="text/html; UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; UTF-8">
<title>Ajouter un contact et une adresse</title>
<meta name="viewport" content="width=device-width,initial-scale=1.0" />
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<h2>Ajout des coordonnées</h2>
	<form method="post" action="MaServletAjout">
		<fieldset class="section1">
			<legend>Ajouter un client</legend>
			<label for="nom">Saisir votre nom :</label> <input type="text"
				name="nom" id="nom" /><br /> <label for="prenom">Saisir
				votre prénom :</label> <input type="text" name="prenom" id="prenom" /><br />
			<label for="email">Saisir l'email :</label> <input type="text"
				name="email" id="email" /><br />
		</fieldset>
		<fieldset class="section1">
			<legend>Ajouter une Adresse</legend>
			<label for="numRue">Saisir votre adresse :</label> <input type="text"
				name="numRue" id="numRue" /><br /> <label for="codePostal">Saisir
				votre code postal :</label> <input type="text" name="codePostal"
				id="codePostal" /><br /> <label for="ville">Saisir la
				ville :</label> <input type="text" name="ville" id="ville" /><br />
		</fieldset>
		<input type="submit" value="valider" />
	</form>
</body>
</html>