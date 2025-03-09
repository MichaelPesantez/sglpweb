package com.uisrael.examen.michael.sglpweb.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.uisrael.examen.michael.sglpweb.model.LegalCase;
import com.uisrael.examen.michael.sglpweb.service.ICaseStatusService;
import com.uisrael.examen.michael.sglpweb.service.IClientService;
import com.uisrael.examen.michael.sglpweb.service.impl.LegalCaseService;

import java.util.Date;


@Controller
public class LegalCaseController {

    @Autowired
    private IClientService clientService;

    @Autowired
    private ICaseStatusService caseStatusService;

    @Autowired
    private LegalCaseService legalCaseService;


    @GetMapping("/caso")
    public String listaCasos(Model model){
        model.addAttribute("listaCasos", legalCaseService.findAll());
        return "ListaCasos";
    }

    @GetMapping("/nuevocaso")
    public String crearNuevoCaso (Model model){
        model.addAttribute("nuevoCasoLegal",new LegalCase());
        model.addAttribute("listaClientes", clientService.findAllClients());
        model.addAttribute("listaEstado", caseStatusService.findAll());
        return "NuevoCaso";
    }

    @PostMapping("/guardarcaso")
    public String guardarCaso(@ModelAttribute LegalCase nuevoCaso, RedirectAttributes redirectAttributes){
        nuevoCaso.setBeginDate(new Date());
        legalCaseService.save(nuevoCaso);
        redirectAttributes
            .addFlashAttribute("mensaje", "Caso Numero:"+ nuevoCaso.getId() + " grabado correctamente")
            .addFlashAttribute("clase", "success");
        return "redirect:/caso";
   }

}
