package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepository repository;

    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }

    public Expense getExpenseById(Long id) {
        Optional<Expense> expense = repository.findById(id);
        return expense.orElse(null);
    }

    public Expense createExpense(Expense expense) {
        return repository.save(expense);
    }

    public Expense updateExpense(Long id, Expense updatedExpense) {
        Optional<Expense> expense = repository.findById(id);
        if (expense.isPresent()) {
            Expense existingExpense = expense.get();
            existingExpense.setName(updatedExpense.getName());
            existingExpense.setAmount(updatedExpense.getAmount());
            // Update other fields as needed
            return repository.save(existingExpense);
        }
        return null;
    }

    public void deleteExpense(Long id) {
        repository.deleteById(id);
    }
}