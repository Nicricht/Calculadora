package com.example.calculadora.controller;
import com.example.calculadora.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Calculadora")
public class CalculadoraController {
    @Autowired
    private CalculadoraService CalculadoraService;
    @GetMapping("/sum")
    public double sum(@RequestParam double a,@RequestParam double b) {
        return CalculadoraService.sum(a,b);
    }
    @GetMapping("/substract")
    public double substract(@RequestParam double a,@RequestParam double b) {
        return CalculadoraService.substract(a,b);
    }
    @GetMapping("/multiply")
    public double multiply(@RequestParam double a,@RequestParam double b) {
        return CalculadoraService.multiply(a,b);
    }
    @GetMapping("/divide")
    public double divide(@RequestParam double a,@RequestParam double b) {
        return CalculadoraService.divide(a,b);
    }
}
