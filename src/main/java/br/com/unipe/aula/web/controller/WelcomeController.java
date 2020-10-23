package br.com.unipe.aula.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.unipe.aula.model.Banco;
import br.com.unipe.aula.model.Torcedor;

@Controller
public class WelcomeController {
	
	@RequestMapping(value = "/teste", method = RequestMethod.GET)
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping(value = "/outraforma", method = RequestMethod.GET)
	public ModelAndView outraforma() {
		ModelAndView view = new ModelAndView("welcome");
		
		view.addObject("mensagem", "View com parâmetro funcionando com sucesso!");
		
		return view;
	}
	
	@RequestMapping(value = "/formulario", method = RequestMethod.GET)
	public ModelAndView formulario(Model model) {
		model.addAttribute("torcedor", new Torcedor());
		return new ModelAndView("formulario");
	}
	
	@RequestMapping(value = "/formulario", method = RequestMethod.POST)
	public ModelAndView exibeTime(@ModelAttribute Torcedor torcedor) {
		ModelAndView view = new ModelAndView("formulario");
		
		view.addObject("mensagem", torcedor.getNome() + " torce para o " + torcedor.getTime());
		
		return view;
	}
	
	@RequestMapping(value = "/conversor", method = RequestMethod.GET)
	public ModelAndView conversor(Model model) {
		model.addAttribute("banco", new Banco());
		return new ModelAndView("conversor");
	}
	
	@RequestMapping(value = "/conversor", method = RequestMethod.POST)
	public ModelAndView exibeTime(@ModelAttribute Banco banco) {
		ModelAndView view = new ModelAndView("conversor");
		
		view.addObject("mensagem", " O seu valor em reais é  R$" + banco.getCotacaoDollar() *  banco.getDollar());
		
		return view;
	}
	
	
	
	
	
}
