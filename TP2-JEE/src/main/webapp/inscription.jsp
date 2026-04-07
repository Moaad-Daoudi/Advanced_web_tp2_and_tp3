<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	body{
		margin: 0;
	}
	h1 {
		color: #0096FF;
		text-align: center;
	}
	.form-container {
		max-width: 500px;
		margin: 0 auto;
		border-radius: 4px;
		border: 2px solid #ddd;
	}
	.form-header {
		background-color: #f5f5f5;
		padding: 10px 15px;        
		font-size: 25px;
	}
	.form-body {
		padding: 20px;
	}
	.form-group {
		margin-bottom: 15px;
    }
	label {
		display: block;
		margin-bottom: 5px;
		font-weight: bold;
	}
	input {
		width: 100%;
	}
	.btn-submit {
		background-color: #5cb85c;
		color: white;
		width: 100%;
		padding: 10px;
		border-radius: 4px;
	}
	.btn-submit:hover {
		opacity: 0.85;
	}
	.form-footer {
    	background-color: #f9f9f9;
        padding: 10px;
        text-align: center;
        border-top: 1px solid #ddd;
        font-size: 11px;
        color: #777;
    }
</style>
<body>
	<c:if test="${not empty error}">
	    <p style="color:red; text-align:center;">${error}</p>
	</c:if>
	<h1>Ajouter un Client</h1>
	<div class="form-container">
        <div class="form-header">
            Espace client
        </div>
        
        <div class="form-body">
            <form action="creerClient" method="post">
                <div class="form-group">
                    <label for="nom">Nom</label>
                    <input type="text" id="nom" name="nom" value="${param.nom}">
                </div>
                
                <div class="form-group">
                    <label for="prenom">Prénom</label>
                    <input type="text" id="prenom" name="prenom" value="${param.prenom}">
                </div>
                
                <div class="form-group">
                    <label for="telephone">Téléphone</label>
                    <input type="text" id="telephone" name="telephone" value="${param.telephone}">
                </div>
                
                <div class="form-group">
                    <label for="email">E-mail</label>
                    <input type="email" id="email" name="email" value="${param.email}">
                </div>

                <button type="submit" class="btn-submit">Ajouter Client</button>
            </form>
        </div>

        <div class="form-footer">
            Application de gestion des réservations © 2026
        </div>
    </div>
</body>
</html>