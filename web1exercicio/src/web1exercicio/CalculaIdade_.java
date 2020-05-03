package web1exercicio;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class AddServlet extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse res ) throws IOException
{
PrintWriter out = res.getWriter();

try{
int anoAtual = Integer.parseInt(req.getParameter("num1"));
int anoNascimento = Integer.parseInt(req.getParameter("num2"));

int mesAtual = Integer.parseInt(req.getParameter("num3"));
int mesNascimento = Integer.parseInt(req.getParameter("num5"));

int diaAtual = Integer.parseInt(req.getParameter("num4"));
int diaNascimento = Integer.parseInt(req.getParameter("num6"));

int ano = anoAtual - anoNascimento ;
int mes = mesAtual - mesNascimento;
int dia = 0;

if (ano>=1700 && ano <= 2020 ) {
switch(mes) {
case 01:
if(dia<=31 && dia>=1);
break;
case 02:
if(dia>=1 && dia<29);
break;
case 03:
if(dia<=31 && dia>=1);
break;
case 04:
if(dia>=1 && dia<=30);
break;
case 05:
if(dia<=31 && dia>=1);
break;
case 06:
if(dia>=1 && dia<=30);
break;
case 07 :
if(dia<=31 && dia>=1);
break;
case 8 :
if(dia<=31 && dia>=1);
break;
case 9 :
if(dia<=30 && dia>=1);
break;
case 10:
if(dia<=31 && dia>=1);
break;
case 11 :
if(dia<=30 && dia>=1);
break;
case 12 :
if(dia<=31 && dia>=1);
break;
}
}

if (diaAtual > diaNascimento) {
dia = diaAtual - diaNascimento;
}else dia = diaNascimento - diaAtual;

//PrintWriter out = res.getWriter();

out.println("Voce tem " +ano+" anos, "+ mes+" meses e "+ dia +" dias");

}catch (ParseException e) {
out.println("Erro de conversão de data");
throw;
}
}




}