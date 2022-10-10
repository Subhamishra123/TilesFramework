<%@ page isELIgnored="false" import="java.util.*" %>
<%
	String allImages[]=new String[]{"digjam.jpeg","fabindia.jpeg","raymond.jpeg","siyaram.jpeg"};
	int imageIndex=new Random().nextInt(4);
%>
<img src="images/<%=allImages[imageIndex]%>"/>