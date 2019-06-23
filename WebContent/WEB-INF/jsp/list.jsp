<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>トレーニング一覧</title>
</head>
<body>
<table border="1">
	<tr>

		<th>トレーニングメニュー</th>
		<th>重さ</th>
		<th>回数</th>
		<th>日付</th>
		<th>訂正画面へ</th>

	</tr>
	<c:forEach items="${list}" var="vo">
	<tr>
	    <td><c:out value="${vo.name}" /></td>

		<td><c:out value="${vo.weight}" /></td>
		<td><c:out value="${vo.count}" /></td>
		<td> <fmt:formatDate value="${vo.date}"  pattern="yyyy年MM月dd日" /></td>



	<td>
	<a href="/Training/DetailServlet?id=<c:out value="${vo.id}" />">訂正画面へ</a></td>
	</tr>
	</c:forEach>
</table>
<a href="/Training/index.jsp">戻る</a>
</body>
</html>