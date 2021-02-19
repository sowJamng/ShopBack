package org.sid.catservice;

import java.util.List;

import org.sid.catservice.dao.ProduitRepository;
import org.sid.catservice.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ProduitRestServices {
	@Autowired
	private ProduitRepository produitRepository;
	@GetMapping(value = "/listproduits")
	public List<Produit> listProduits() {
		return produitRepository.findAll();
	}

	@GetMapping(value = "listproduits/{id}")
	public Produit getProduit(@PathVariable(name = "id") Long id) {
		return produitRepository.findById(id).get();
	}

	@PutMapping(value = "listproduits/{id}")
	public Produit update(@PathVariable(name = "id") Long id, @RequestBody Produit p) {
		p.setId(id);
		return produitRepository.save(p);

	}

	@PostMapping(value = "listproduits/{id}")
	public Produit save(@RequestBody Produit p) {
		return produitRepository.save(p);
	}

	@DeleteMapping(value = "lisproduit/{id}")
	public void delete(@PathVariable(name = "id") Long id) {
		produitRepository.deleteById(id);
	}

}
