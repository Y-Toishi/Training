<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TOP画面</title>
</head>
<body>
<a href="/Training/SearchServlet">全件表示</a><br>
<a href="/Training/RegisterServlet">新規追加</a><br>
最大重量を求める
<form action="/Training/MaxServlet"  method="post">



		<select  name="menu_id"  >
		<option   value="1" >ベンチプレス1</option>
		<option  value="2" >ベンチプレス2</option>
		<option  value="3" >ショルダープレス1</option>
		<option  value="4" >ショルダープレス2</option>
		<option  value="5" >チェストフライ1</option>
		<option  value="6" >チェストフライ2</option>
		<option  value="7" >ショルダープレス1</option>
		<option  value="8" >ショルダープレス2</option>
		<option  value="9" >サイドレイズ1</option>
		<option  value="10" >サイドレイズ2</option>
		<option  value="11" >リアレイズ1</option>
		<option  value="12" >リアレイズ2</option>
		<option  value="13" >ハーフデットリフト1</option>
		<option  value="14" >ハーフデットリフト2</option>
		<option  value="15" >ベントオーバーロウ1</option>
		<option  value="16" >ベントオーバーロウ2</option>
		<option  value="17" >ラットプルダウン1</option>
		<option  value="18" >ラットプルダウン2</option>
		<option  value="19" >バーベルカール</option>
		<option  value="20" >スカルクラッシャー</option>


</select>
<input type="submit" value="送信">
</form>
</body>
</html>