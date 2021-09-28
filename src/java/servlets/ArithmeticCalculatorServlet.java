package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 851649
 */

@WebServlet(urlPatterns = {"/ArithmeticCalculatorServlet"})

public class ArithmeticCalculatorServlet extends HttpServlet {
    
    @Override
         protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //load up JSP
         request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }
          @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            String inputFirstNumber = request.getParameter("firstNumber");
            String inputSecondNumber = request.getParameter("secondNumber");
            int firstNumber;
            int secondNumber;
            
            if(inputFirstNumber.equals("") || inputSecondNumber.equals("") || inputFirstNumber == null || inputSecondNumber == null){
            request.setAttribute("result", "One or both of the input values are invalid. Please enter only numbers");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            return; 
            }
            
            firstNumber = Integer.parseInt(inputFirstNumber);
            secondNumber = Integer.parseInt(inputSecondNumber);
            
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
}
}
