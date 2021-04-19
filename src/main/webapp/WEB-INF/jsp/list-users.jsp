<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
<title>User Registration Application</title>
</head>
<body>
	<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
		<header class="mb-auto">
		<div>
			<h3 class="float-md-start mb-0">URA</h3>
			<nav class="nav nav-masthead justify-content-center float-md-end">
			<a class="nav-link " aria-current="page" href="/">Home</a> <a
				class="nav-link active" href="/user/list">Users</a> </nav>
		</div>
		</header>

		<main class="px-3">
		<h1>Registered Users</h1>
		<form:form action="search" method="get">
                Search user: <input type="text" name="searchWord" />
			<select name="option">
				<option>First Name</option>
				<option>Last Name</option>
				<option>email</option>
				<option>Phone number</option>
				<option>Address</option>
			</select>
			<input type="submit" value="Search" class="add-button" />
		</form:form>
		<table class="table">
			<thead>
				<tr>
					<th>#</th>
					<th>First</th>
					<th>Last</th>
					<th>Email</th>
					<th>Phone</th>
					<th>Address</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="user" items="${usersList}">
					<c:url var="updateLink" value="/user/updateUser">
						<c:param name="userId" value="${user.id}"></c:param>
					</c:url>
					<c:url var="deleteLink" value="/user/deleteUser">
						<c:param name="userId" value="${user.id}"></c:param>
					</c:url>
					<tr>
						<td><c:out value="${user.id}" /></td>
						<td><c:out value="${user.first_name}" /></td>
						<td><c:out value="${user.last_name}" /></td>
						<td><c:out value="${user.email}" /></td>
						<td><c:out value="${user.phone_number}" /></td>
						<td><c:out value="${user.address}" /></td>

						<td><a href="${updateLink}" class="btn btn-light">Update</a></td>
						<td><a href="${deleteLink}" class="btn btn-danger"
							onclick="if (!(confirm('Confirm deletion'))) return false">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<a href="/user/addUser" class="btn btn-primary">Register User</a>
		</div>
		</main>

		<footer class="mt-auto text-white-50"></footer>
</body>
</html>