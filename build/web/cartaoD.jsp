<%-- 
    Document   : cartãoD
    Created on : Jul 25, 2016, 11:38:46 PM
    Author     : Boss
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Cartão de Identificação do Paciente</title>
        </head>
        <body>
        
            <form>
                <label for="nid">NID:</label><input type="text" id="nid" />  
                
                <fieldset>
                    <legend> Cartão de Identificação do Doente</legend>
                    <label for="nome">Nome:</label> <input type="text" id="nome" readonly/> <label for="apelido">Apelido:</label> <input type="text" id="apelido" readonly/> <br/>
                    <label for="natural">Naturalidade:</label> <input type="text" id="natural"/> <label for="idade">Idade:</label> <input type="text" id="idade"/> <br/>
                    <br/>
                    <label>Assinatura:_______________________________________</label>
                </fieldset>    
            </form>
            
        </body>
    </html>
</f:view>
