package guru.springframework.recipecollection.controller;

import guru.springframework.recipecollection.domain.Category;
import guru.springframework.recipecollection.domain.UnitOfMeasure;
import guru.springframework.recipecollection.repositories.CategoryRepository;
import guru.springframework.recipecollection.repositories.UnitOfMeasureRepository;
import guru.springframework.recipecollection.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author frank
 * @create 2020-12-16
 */
@Controller
public class IndexController {
    @Resource
    private RecipeService recipeService;

    @RequestMapping({"","/", "/index","/index.html"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
