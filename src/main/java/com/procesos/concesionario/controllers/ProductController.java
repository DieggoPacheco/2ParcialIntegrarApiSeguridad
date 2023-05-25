package com.procesos.concesionario.controllers;

import com.procesos.concesionario.models.Product;
import com.procesos.concesionario.services.ProductService;
import com.procesos.concesionario.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

