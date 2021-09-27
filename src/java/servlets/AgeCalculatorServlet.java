package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 851649
 */
@WebServlet(urlPatterns = {"/AgeCalculatorServlet"})
public class AgeCalculatorServlet extends HttpServlet {

        @Override
         protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //load up JSP
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }
    
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //retrieve age input from calculator
        String age = request.getParameter("age");
        
        //verification that user input a valid age:
        //check that they input a value at all
        if(age.equals("") || age == null){
        request.setAttribute("message", "You must give your current age");
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return; 
        }
        //check the value is a number
        try {
        Integer.parseInt(age);
        } catch (NumberFormatException e) {
        request.setAttribute("message", "You must enter a number");
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return; 
        }
        
        //parse age as a String into an integer
        int ageNum = Integer.parseInt(age);
        
        //increment age and show it to the user
        ageNum++;
        request.setAttribute("message", "Your age next year will be:");
        request.setAttribute("nextAge", ageNum);
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }
        
}
