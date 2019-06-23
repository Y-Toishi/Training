<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>詳細画面</title>
</head>
<body>


	<form action="/Training/UpdateServlet" method="POST">
		<table border="1">
			<tr>
		<th>トレーニングメニュー</th>

		<td><select  name="menu_id"  >
		<option   value="1"  <c:if test="${User.menu_id=='1'}" >selected</c:if>>ベンチプレス1</option>
		<option   value="2"  <c:if test="${User.menu_id=='2'}" >selected</c:if>>ベンチプレス2</option>
		<option   value="3"  <c:if test="${User.menu_id=='3'}" >selected</c:if>>インクラインダンベルプレス1</option>
		<option   value="4"  <c:if test="${User.menu_id=='4'}" >selected</c:if>>インクラインダンベルプレス2</option>
		<option   value="5"  <c:if test="${User.menu_id=='5'}" >selected</c:if>>チェストフライ1</option>
		<option   value="6"  <c:if test="${User.menu_id=='6'}" >selected</c:if>>チェストフライ2</option>
		<option   value="7"  <c:if test="${User.menu_id=='7'}" >selected</c:if>>ショルダープレス1</option>
		<option   value="8"  <c:if test="${User.menu_id=='8'}" >selected</c:if>>ショルダープレス2</option>
		<option   value="9"  <c:if test="${User.menu_id=='9'}" >selected</c:if>>サイドレイズ1</option>
		<option   value="10" <c:if test="${User.menu_id=='10'}" >selected</c:if>>サイドレイズ2</option>
		<option   value="11" <c:if test="${User.menu_id=='11'}" >selected</c:if>>リアレイズ1</option>
		<option   value="12" <c:if test="${User.menu_id=='12'}" >selected</c:if>>リアレイズ2</option>
		<option   value="13" <c:if test="${User.menu_id=='13'}" >selected</c:if>>ハーフデットリフト1</option>
		<option   value="14" <c:if test="${User.menu_id=='14'}" >selected</c:if>>ハーフデットリフト2</option>
		<option   value="15" <c:if test="${User.menu_id=='15'}" >selected</c:if>>ベントオーバーロウ1</option>
		<option   value="16" <c:if test="${User.menu_id=='16'}" >selected</c:if>>ベントオーバーロウ2</option>
		<option   value="17" <c:if test="${User.menu_id=='17'}" >selected</c:if>>ラットプルダウン1</option>
		<option   value="18" <c:if test="${User.menu_id=='18'}" >selected</c:if>>ラットプルダウン2</option>
		<option   value="19" <c:if test="${User.menu_id=='19'}" >selected</c:if>>バーベルカール</option>
		<option   value="20" <c:if test="${User.menu_id=='20'}" >selected</c:if>>スカルクラッシャー</option>
</select>



		</td>
	</tr>
	<tr>
		<th>重さ</th>
		<td>
		<c:if test="${empty User.inputWeight }">
			<input type="text" name="inputWeight" value="${User.weight}" />

				</c:if>
            <c:if test="${!empty User.inputWeight }">
			<input type="text" name="inputWeight"
				value="<c:out value="${User.inputWeight}" />" />

				</c:if>
		</td>



	<tr>
		<th>回数</th>
		<td>
		<c:if test="${empty User.inputCount }">
			<input type="text" name="inputCount" value="${User.count}" />

				</c:if>
            <c:if test="${!empty User.inputCount }">
			<input type="text" name="inputCount"
				value="<c:out value="${User.inputCount}" />" />

				</c:if>
		</td>


	</tr>

	<tr>
		<th>日付(yyyy-mm-dd)</th>

			<td>
			<c:if test="${empty User.inputDate }">
			<input type="text" name="inputDate"
				value="<fmt:formatDate value="${User.date}"  pattern="yyyy-MM-dd" />" />

				</c:if>
            <c:if test="${!empty User.inputDate }">
			<input type="text" name="inputDate"
				value="<c:out value="${User.inputDate}" />" />

				</c:if>
				</td>
	</tr>



		</table>
		<input type="hidden" name="id" value="<c:out value="${ User.id }" />" />
		<input type="submit" value="登録する" />
	</form>

	<c:forEach items="${User.errorMessages}" var="errorMessage">
・${errorMessage }<br />
	</c:forEach>

	<a href="/Training/SearchServlet">一覧ページへ</a>
</body>
</html>