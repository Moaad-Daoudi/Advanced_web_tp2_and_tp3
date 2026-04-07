<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	body {
		text-align: center;
	}
	.success-msg {
        color: #28a745;
        font-weight: bold;
        text-align: center;
        margin-bottom: 20px;
        font-size: 14px;
    }
	h1 {
		color: #b58900;
	}
	.table-container {
		width: 100%;
        border-collapse: collapse;
        margin-bottom: 20px;
	}
	table {
        width: 100%;
        border-collapse: collapse;
        margin-bottom: 20px;
    }
	th {
        border-bottom: 2px solid #ddd;
        padding: 10px 8px;
        text-align: left;
        font-size: 13px;
        color: #555;
     }
     td {
     	padding: 12px 8px;
        font-size: 13px;
        background-color: #fcfcfc;
        border-bottom: 1px solid #f0f0f0;
        text-align: left;
     }
	.btn-retour {
		background-color: #337ab7;
		color: white;
		text-decoration: none;
		padding: 8px 15px;
        border-radius: 4px;
        font-size: 13px;
        display: inline-block;
	}
	.btn-retour:hover {
        background-color: #286090;
    }
</style>
<body>
	<div class="success-msg">Client ajoutée avec succès</div>
	<h1>Affichage des donnees du client</h1>
	<div class="table_container">
		<table>
			<thead>
				<tr>
					<th>Nom</th>
					<th>Prenom</th>
					<th>Telephone</th>
					<th>E-mail</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${client.nom}</td>
					<td>${client.prenom}</td>
					<td>${client.telephone}</td>
					<td>${client.email}</td>
				</tr>
			</tbody>
		</table>
	</div>
	<a href="inscription.jsp" class="btn-retour">Retourne au formulaire d'ajout</a>
</body>
</html>