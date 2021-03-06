package br.com.dclick;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * The Class RESTController.
 */

/**
 * @author lucas.oliveira
 * 
 */
@RequestMapping("contatos")
@Controller
public class RESTController {

	/**
	 * Criar contato.
	 * 
	 * @param nome
	 *            the nome
	 * @param celular
	 *            the celular
	 * @param email
	 *            the email
	 * @param twitter
	 *            the twitter
	 * @param facebook
	 *            the facebook
	 * @return the contato
	 */
	@RequestMapping(value = "/params", method = RequestMethod.POST)
	public Contato criarContato(@RequestParam final String nome,
			@RequestParam final String celular,
			@RequestParam final String email,
			@RequestParam final String twitter,
			@RequestParam final String facebook) {

		Contato contato = new Contato(nome, celular, email, twitter, facebook);
		contato.setId(1L);

		return contato;
	}

	@RequestMapping(value = "/model", method = RequestMethod.POST)
	@ResponseBody
	public Contato criarContatoModel(@RequestBody final Contato contato) {

		// Implementação do método...

		Contato result = new Contato(contato.getNome(), contato.getCelular(),
				contato.getEmail(), contato.getTwitter(), contato.getFacebook());
		result.setId(1L);

		return result;
	}

	@RequestMapping(value = "/model", method = RequestMethod.PUT)
	@ResponseBody
	public Contato atualizarContatoModel(@RequestBody final Contato contato) {

		contato.setNome(contato.getNome() + " Alterado!");

		return contato;
	}

	@RequestMapping(value = "/params", method = RequestMethod.PUT)
	@ResponseBody
	public Contato atualizarContatoParams(@RequestParam final Long id,
			@RequestParam final String nome,
			@RequestParam final String celular,
			@RequestParam final String email,
			@RequestParam final String twitter,
			@RequestParam final String facebook) {

		Contato contato = new Contato(nome + " Alterado!", celular, email,
				twitter, facebook);
		contato.setId(id);

		return contato;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deletarContato(@PathVariable final Long id) {

		System.out.println("Contato deletado!");
		// Deletar contato
	}

	/**
	 * Listar contatos.
	 * 
	 * @return the list< contato>
	 */
	@RequestMapping(method = RequestMethod.GET)
	public List<Contato> listarContatos() {
		List<Contato> contatos = new ArrayList<Contato>();

		contatos.add(new Contato("Maria", "0000-0000", "maria@email.com",
				"@maria", "/maria"));
		contatos.add(new Contato("João", "1111-1111", "joao@email.com",
				"@joao", "/joao"));
		contatos.add(new Contato("José", "2222-2222", "jose@email.com",
				"@jose", "/jose"));
		contatos.add(new Contato("Paula", "3333-3333", "paula@email.com",
				"@paula", "/paula"));
		contatos.add(new Contato("Ana", "4444-4444", "ana@email.com", "@ana",
				"/ana"));

		return contatos;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Contato recuperarContato(@PathVariable final Long id) {

		return new Contato("João", "1111-1111", "joao@email.com", "@joao",
				"/joao");

	}

}
