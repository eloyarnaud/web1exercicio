package web1exercicio;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ci")
public class calculaIdade extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		   PrintWriter out = resp.getWriter();
 
          String nome = req.getParameter("nome");
          String dataEmTexto=req.getParameter("nasc");
          Calendar dataNascimento = Calendar.getInstance(); 
          try {
        
              Date dataAtual = new Date();
              Date data = new SimpleDateFormat("yyyy-MM-dd").parse(dataEmTexto);        
              dataNascimento = Calendar.getInstance();
              dataNascimento.setTime(data);
             

              int mes = dataNascimento.get(Calendar.MONTH); 
              int ano = dataNascimento.get(Calendar.YEAR);
              int dia = dataNascimento.get(Calendar.DATE);

              int month = Int.parseInt(req.getParameter("mes"));
              int year = Int.parseInt(req.getParameter("ano"));
              int day = Int.parseInt(req.getParameter("dia"));

              
             if (year<=2020 && year>=1500){ 
            	 switch (month) {
            	 case 01:
            		 if(day<=31 && day>=1);
            	          break;
            	 case 03:
            		 if(day<=31 && day>=1);
            		 break;
            	 case 05:
            		 if(day<=31 && day>=1);
            		 break;
            	 case 07:
            		 if(day<=31 && day>=1);
            		 break;
            	 case 11:
            		 if(day<=31 && day>=1);
            	         break;
            	 
            	 case 02:
            		 if(day<=29 && day>=1)	
            	         break;
            	 case 04:
            		 if(day<=30 && day>=1)
            	         break;
            	 case 06:
            		 if(day<=30 && day>=1)
            		 break;
            		 
            	 case 8:
            		 if(day<=30 && day>=1)
            		 break;
            		 
            	 case 10:
            		 if(day<=30 && day>=1)
            			 break;
            		 
            	 case 12:
            		 if(day<=30 && day>=1)
            			 break;
            		 
            	 }
       		  resp.getWriter().println(dataAtual);
       		  
             }       
          
          } catch (ParseException year) {
              out.println("Erro de conversão da data. Ano inválido.");
              return;         
          }  
                   
          super.service(req, resp);         
	}
	private static final long serialVersionUID =5120121212L;
       
   
    public calculaIdade() {
        super();
      
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
}