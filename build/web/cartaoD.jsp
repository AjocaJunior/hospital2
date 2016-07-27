
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="doentes.rdi.com.*" %>

    <html>
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>        
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link rel="stylesheet" type="text/css" href="WEB-INF/addIt/css/style.css"/>
            <title>Cartão de Identificação do Paciente</title>
          
        </head>
        <body>
            
          <%! DoentesConstrutor doente = new DoentesConstrutor(); %>
           
            
            
            <form>
                <label for="nid">NID:</label><input type="text" id="nid" />  
                
                <fieldset>
                    <legend> Cartão de Identificação do Doente</legend>
                    <label>Nome:</label> ${param.nome}  <label>Apelido:</label> ${param.apelido}<br/>
                    <label>Naturalidade:</label> ${param.naturalidade} <label>Idade:</label>${param.datan} <br/>
                    <br/>
                    <label>Assinatura:_______________________________________</label>
                </fieldset>    
            </form>
            
        </body>
    </html>
