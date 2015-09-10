package br.com.youtube.angularjs.contato;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListaTelefonicaController {
	
	@RequestMapping(path="/contatos")
	public List<Contato> findContatos(){
		List<Contato> contatos = new ArrayList<>();
		
		Operadora operadora = criaOperadora("Vivo", 0.99f);
		
		Contato contato = new Contato();
		contato.setNome("Ricardo");
		contato.setTelefone("88123321");
		contato.setOperadora(operadora);
		contato.setData(new Date());
		
		contatos.add(contato);
		return contatos;
	}
	
	@RequestMapping(path="/contatos", method=RequestMethod.POST )
	public void postContato(@RequestBody Contato contato){
		System.out.println(contato.toString());
	}

	@RequestMapping(path="operadoras")
	public List<Operadora> findOperadoras(){
		List<Operadora>  operadoras = new ArrayList<>();
		operadoras.add(criaOperadora("Vivo", 0.99f));
		operadoras.add(criaOperadora("Claro", 0.85f));
		return operadoras;
	}

	private Operadora criaOperadora(String nome, Float valor) {
		Operadora operadora = new Operadora();
		operadora.setNome(nome);
		operadora.setPreco(valor);
		return operadora;
	}
}
