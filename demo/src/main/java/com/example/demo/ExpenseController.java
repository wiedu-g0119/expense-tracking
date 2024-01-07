package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://special-trout-977x779v445vf7q6g-5173.app.github.dev")
@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {
    @Autowired
    private ExpenseService service;

    @GetMapping
    public List<Expense> getAllExpenses() {
        // curl -X GET http://localhost:8080/api/expenses
        return service.getAllExpenses();
    }

    @GetMapping("/{id}")
    public Expense getExpenseById(@PathVariable("id") Long id) {
        // curl -X GET http://localhost:8080/api/expenses/{id}
        return service.getExpenseById(id);
    }

    @PostMapping
    public Expense createExpense(@RequestBody Expense expense) {
        // curl -X POST -H "Content-Type: application/json" -d '{"name":"Expense Name","amount":100}' http://localhost:8080/api/expenses
        return service.createExpense(expense);
    }

    @PutMapping("/{id}")
    public Expense updateExpense(@PathVariable("id") Long id, @RequestBody Expense expense) {
        // curl -X PUT -H "Content-Type: application/json" -d '{"name":"Updated Expense Name","amount":200}' http://localhost:8080/api/expenses/{id}
        return service.updateExpense(id, expense);
    }

    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable("id") Long id) {
        // curl -X DELETE http://localhost:8080/api/expenses/{id}
        service.deleteExpense(id);
    }
}