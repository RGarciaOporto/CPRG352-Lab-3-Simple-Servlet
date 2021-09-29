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
            
            //read the user input into string variables 
            String inputFirstNumber = request.getParameter("firstNumber");
            String inputSecondNumber = request.getParameter("secondNumber");
            //declare variables for later
            int firstNumber;
            int secondNumber;
            int result = 0;
            
            //verify that  the inputs are numbers only
            if(inputFirstNumber.equals("") || inputSecondNumber.equals("") || inputFirstNumber == null || inputSecondNumber == null){
            request.setAttribute("result", "One or both of the input values are invalid. Please enter only numbers");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            return; 
            }
            
            //convert the string numbers into usable integers
            firstNumber = Integer.parseInt(inputFirstNumber);
            secondNumber = Integer.parseInt(inputSecondNumber);
            
            //determine what calculation has to be made
            if (request.getParameter("add") != null) {
            result = firstNumber + secondNumber;
        } else if (request.getParameter("subtract") != null) {
            result = firstNumber - secondNumber;
        } else if (request.getParameter("multiply") != null) {
            result = firstNumber * secondNumber;
        } else if (request.getParameter("modulus") != null){
            result = firstNumber % secondNumber;
        }
            //display result onto screen
            request.setAttribute("firstNumber", firstNumber);
            request.setAttribute("secondNumber", secondNumber);
            request.setAttribute("result", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
}
}
