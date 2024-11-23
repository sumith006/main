package com.example.expt18;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;
@RestController

public class Controller {

	ArrayList<Integer> a = new ArrayList<>();
	private List<Details> data = new ArrayList<>();
	
	public Controller() {
		a.add(1);
		a.add(2);
	}
	@GetMapping("/hello/{name}/{age}")
	public void insert(@PathVariable("name")String name, @PathVariable("age")int age) {
		System.out.println(name);
		System.out.println(age);
		
	}
	@DeleteMapping("/hello/{id}")
	public void deleteById(@PathVariable("id")int id) {
		a.remove(Integer.valueOf(id));
		print();
	}
	@PostMapping("/EnterDetails")
	public String insert(@RequestBody Details ob) {
		data.add(new Details(ob.getNumber(), ob.getName()));
		for (Details obd : data) {
			System.out.println(obd.getName() + " " + obd.getNumber());
		}
		return "Data Inserted";
	}
	
	void print() {
		for (int elements : a) {
			System.out.print(elements + " ");
		}
		System.out.println();
	}
	
}