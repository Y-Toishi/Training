<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>最大値</title>
</head>
<body>
<table>
	<tr>

		<td>メニュー</td>
	<td>
		 <c:if test="${User.menu_id=='1'}" >ベンチプレス1</c:if>
		 <c:if test="${User.menu_id=='2'}" >ベンチプレス2</c:if>
		 <c:if test="${User.menu_id=='3'}" >インクラインダンベルプレス1</c:if>
		 <c:if test="${User.menu_id=='4'}" >インクラインダンベルプレス2</c:if>
		 <c:if test="${User.menu_id=='5'}" >チェストフライ1</c:if>
		 <c:if test="${User.menu_id=='6'}" >チェストフライ2</c:if>
		 <c:if test="${User.menu_id=='7'}" >ショルダープレス1</c:if>
		 <c:if test="${User.menu_id=='8'}" >ショルダープレス2</c:if>
		 <c:if test="${User.menu_id=='9'}" >サイドレイズ1</c:if>
		 <c:if test="${User.menu_id=='10'}" >サイドレイズ2</c:if>
		 <c:if test="${User.menu_id=='11'}" >リアレイズ1</c:if>
		 <c:if test="${User.menu_id=='12'}" >リアレイズ2</c:if>
		 <c:if test="${User.menu_id=='13'}" >ハーフデットリフト1</c:if>
		 <c:if test="${User.menu_id=='14'}" >ハーフデットリフト2</c:if>
		 <c:if test="${User.menu_id=='15'}" >ベントオーバーロウ1</c:if>
		 <c:if test="${User.menu_id=='16'}" >ベントオーバーロウ2</c:if>
		 <c:if test="${User.menu_id=='17'}" >ラットプルダウン1</c:if>
		 <c:if test="${User.menu_id=='18'}" >ラットプルダウン2</c:if>
		 <c:if test="${User.menu_id=='19'}" >バーベルカール</c:if>
		 <c:if test="${User.menu_id=='20'}" >スカルクラッシャー</c:if>

		</td>
		</tr>
		<tr>
	<th>重量</th>
		<td><c:out value="${User.weight}"/>kg</td>
		</tr>
		<tr>
	<th>回数</th>
		<td><c:out value="${User.count}"/>回</td>
		</tr>
		<tr>
	<td>最大値(重さ×回数)</td>
		<td><c:out value="${User.maxWeight}"/></td>
		</tr>



</table>

<a href="/Training/index.jsp">Topページへ</a>
</body>
</html>