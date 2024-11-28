package com.bancolombia.app.datasource;

import com.bancolombia.app.entities.Item;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class ItemRepository {
	
	private final List<Item> lista=new ArrayList<>();
	
	
	 public boolean insert(Item item) {
	  return lista.add(item);
	 }
	 
	 public List<Item> getAll(){
	 return lista;
	 }
}
