package com.example.calculadora.service;
import org.springframework.stereotype.Service;
@Service
public class CalculadoraService {
public double sum(double a, double b){
    return a+b;

}
public double substract(double a, double b){
    return a-b;
    
}
public double multiply(double a, double b){
    return a*b;
}
public double divide(double a, double b){
    return a/b;
}
}
