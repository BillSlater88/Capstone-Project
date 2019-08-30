package org.launchcode.capstoneproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("round")
public class RoundController {


    @RequestMapping(value = "")
    public String index(Model model) { return "/index"; }


    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String dispalyAddRoundForm(Model model) {
        return "/addround";
    }

    @RequestMapping(value = "wishlist", method = RequestMethod.GET)
    public String displayAddToWishList(Model model) {
        return "/courses-wish-list";
    }


    //@RequestMapping(value = "add", method = RequestMethod.POST)
    //public String processAddRoundForm

}
