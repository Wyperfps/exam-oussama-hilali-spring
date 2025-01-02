package com.example.exam.web;

import com.example.exam.dao.entities.Action;
import com.example.exam.dao.entities.Don;
import com.example.exam.dao.entities.Donateur;
import com.example.exam.dto.DonateurDto;
import com.example.exam.mapper.DonateurMapper;
import com.example.exam.service.DonateurService;
import com.example.exam.dao.entities.Organisateur;
import com.example.exam.service.ActionService;
import com.example.exam.service.DonService;
import com.example.exam.service.OrganisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/actchars")
public class ActionController {

    private ActionService actionService;
    private OrganisateurService organisateurService;
    private DonService donService;


    @GetMapping
    public String listActChars(Model model) {
        List<Action> action = actionService.getAllAction();
        model.addAttribute("action", action);
        return "action";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        Action action = new Action();
        List<Organisateur> organisateur = organisateurService.getAllOrganisateurs();
        model.addAttribute("action", action);
        model.addAttribute("organisateurs", organisateur);
        return "createAction";
    }

    @PostMapping("/new")
    public String createActChar( @ModelAttribute Action action, BindingResult result) {
        if (result.hasErrors()) {
            return "createAction";
        }
        actionService.addAction(action);
        return "redirect:/action";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        Action action = actionService.getActionById(id);
        if (action == null) {
            return "redirect:/actcion";
        }
        List<Organisateur> organisateurs = organisateurService.getAllOrganisateurs();
        model.addAttribute("actChar", action);
        model.addAttribute("organisations", organisateurs);
        return "actcharedit";
    }
    @GetMapping("/{id}/dons")
    public String listDons(@PathVariable Integer id,Model model) {
        List<Don> dons = donService.getDonsByActionsId(id);
        model.addAttribute("action", dons);
        return "actiondon";
    }

    @GetMapping("/delete/{id}")
    public String deleteAction(@PathVariable Integer id) {
        actionService.deleteAction(id);
        return "redirect:/action";
    }

    @GetMapping("/{id}")
    public String viewAction(@PathVariable Integer id, Model model) {
        Action action = actionService.getActionById(id);
        if (action == null) {
            return "redirect:/action";
        }
        model.addAttribute("action", action);
        return "action";
    }
}