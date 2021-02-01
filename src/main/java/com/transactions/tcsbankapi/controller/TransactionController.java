/**
 * 
 */
package com.transactions.tcsbankapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.transactions.tcsbankapi.model.Transaction;
import com.transactions.tcsbankapi.service.TransactionService;

/**
 * @author Sibani Majhi
 *
 */
@RestController
public class TransactionController {

	@Autowired
	private TransactionService transactionService;
	
	@GetMapping("/transactions")
	public ResponseEntity<List<Transaction>> getAllTransaction() {
		return ResponseEntity.ok().body(transactionService.getAllTransaction());
	} 
	
	@GetMapping("/transactions/{id}")
	public ResponseEntity<Transaction> getTransactionById(@PathVariable long id) {
		return ResponseEntity.ok().body(transactionService.getTransactionById(id));
	}
	
	@PostMapping("/transactions")
	public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction transaction) {
		return ResponseEntity.ok().body(this.transactionService.createTransaction(transaction));
	}
	
	@PutMapping("/transactions")
	public ResponseEntity<Transaction> updateTransaction(@PathVariable long id, @RequestBody Transaction transaction) {
		transaction.setTxID(id);
		return ResponseEntity.ok().body(this.transactionService.updateTransaction(transaction));
	}
	
	@DeleteMapping("/transactions/{id}")
	public ResponseEntity<?> deleteTransaction(@PathVariable long id) {
		this.transactionService.deleteTransaction(id);
		return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.OK);
	}
}

















