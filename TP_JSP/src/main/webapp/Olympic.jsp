<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Détail Médail</title>
<style>
body {
	font-family: Arial, sans-serif;
}

form {
	max-width: 400px;
	margin: 20px auto;
}

label, select, input {
	display: block;
	margin-bottom: 10px;
}

input[type="submit"] {
	background-color: #4caf50;
	color: white;
	cursor: pointer;
}

input[type="submit"]:hover {
	background-color: #45a049;
}
</style>
</head>
<body>
	<jsp:useBean id="olympicBean"
		class="imt.nordeurope.douai.j2ee.tp.piat.beans.OlympicBean.OlympicBean"
		scope="request" />
	<h2>Formulaire POST avec Choix</h2>

	<form action='http://localhost:8080/TP_JSP/JSPOlympic' method='post'>
		<label for="pays">Sélectionnez un pays :</label> <select id="pays"
			name="pays" required>
			<option value=<%=olympicBean.getCountry(0)%>><%=olympicBean.getCountry(0)%></option>
			<option value=<%=olympicBean.getCountry(1)%>><%=olympicBean.getCountry(1)%></option>
			<option value=<%=olympicBean.getCountry(2)%>><%=olympicBean.getCountry(2)%></option>
		</select> <input type="submit" value="Envoyer">
	</form>
	<form id="monFormulaire" action="" method="post">
		<label for="pays">Choix de langue</label> <select id="langue"
			name="langue" required>
			<option value="France">France</option>
			<option value="English">English</option>
		</select> <input type="submit" >

	</form>
	<%
	boolean isPostRequest = "POST".equalsIgnoreCase(request.getMethod());
	%>

	<%
	if (isPostRequest) {
	%>
	<p>
		Le pays
		<%=request.getParameter("pays")%>
		dont la capitale est
		<%=olympicBean.getCapitalesCountry(request.getParameter("pays"))%>
		à
		<%=olympicBean.getMedalsCountCountry(request.getParameter("pays"))%>
		médaille olympicsc à ce jour
	</p>
	<img
		src='http://localhost:8080/Tp_1/GraphicOlympic?pays=<%=request.getParameter("pays")%>'>
	<%
	}
	%>

</body>
</html>