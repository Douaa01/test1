package web;

import java.io.IOException;
import java.util.List;

import Metier.ImetierCatalogue;
import Metier.MetierImpl;
import Metier.Produit;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(name="cs", urlPatterns={"*.do"})
public class ControleurServlet extends HttpServlet {
	private ImetierCatalogue metier;
@Override
public void init() throws ServletException {
	metier=new MetierImpl();
}
@Override
protected void doPost(HttpServletRequest request,
		HttpServletResponse response)
				throws ServletException, IOException {
	String mc=request.getParameter("motCle");
	ProduitModele mod = new ProduitModele();
	mod.setMotCle(mc);
	List<Produit> prods = metier.getProduitsParMotCle(mc);
	mod.setProduits(prods);
	request.setAttribute("modele",mod);
	request.getRequestDispatcher("ProduitsView.jsp").forward(request,response);
	}
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
req.getRequestDispatcher("ProduitsView.jsp").forward(req, resp);
}
	}
