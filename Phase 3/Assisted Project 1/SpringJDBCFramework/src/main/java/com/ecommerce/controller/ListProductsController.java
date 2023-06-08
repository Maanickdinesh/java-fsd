package com.ecommerce.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.ecommerce.dao.EProductDAO;
import com.ecommerce.entity.EProduct;

@Controller
public class ListProductsController {

    private EProductDAO productDAO;

    @Autowired
    public void setProductDAO(EProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @RequestMapping("/listProducts")
    public String listProducts(Model model) {
        // Fetch the list of products from the DAO or any other data source
        List<EProduct> productList = productDAO.getProducts();

        // Add the product list to the model
        model.addAttribute("list", productList);

        // Return the view name to display the list of products
        return "listProducts";
    }
}
