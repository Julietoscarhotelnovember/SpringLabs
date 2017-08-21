<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>    
<!DOCTYPE html>
<html>
<head>
<link href='<tiles:getAsString name="css"/>' type="text/css" rel="stylesheet"/>

<meta charset="UTF-8">
	<title>
		<tiles:getAsString name="title"/>
	</title>
</head>
<body>
		<table style="width: 100%;padding: 0" border="1">
			<tr>
				<td>
					<tiles:insertAttribute name="header" />
				</td>
			</tr>
			<tr>
				<td>
					<tiles:insertAttribute name="body" />
				</td>
			</tr>
			<tr>
				<td>
				    <tiles:insertAttribute name="footer" />
				</td>
			</tr>
		</table>
</body>
</html>