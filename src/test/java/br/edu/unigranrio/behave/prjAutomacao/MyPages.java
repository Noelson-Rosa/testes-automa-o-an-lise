package br.edu.unigranrio.behave.prjAutomacao;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;
import br.gov.frameworkdemoiselle.behave.runner.ui.CheckBox;
import br.gov.frameworkdemoiselle.behave.runner.ui.Link;
import br.gov.frameworkdemoiselle.behave.runner.ui.Radio;
import br.gov.frameworkdemoiselle.behave.runner.ui.Select;
import br.gov.frameworkdemoiselle.behave.runner.ui.TextField;

@ScreenMap(name = "cadastro de clientes", location = "https://docs.google.com/forms/d/1xY89R-3Z_TLE_fERipKUox2eIsBG3AJV69vKAPlBCrw/viewform")
public class MyPages {
	
	@ElementMap(name = "nome", locatorType = ElementLocatorType.Id, locator = "entry_646741483")
	private TextField nome;
	
	@ElementMap(name = "endereco", locatorType = ElementLocatorType.Id, locator = "entry_932228774")
	private TextField endereco;
	
	@ElementMap(name = "uf", locatorType = ElementLocatorType.Id, locator = "entry_584569158")
	private Select uf;
	
	@ElementMap(name = "mes", locatorType = ElementLocatorType.Id, locator = "entry.502536648_month")
	private Select mes;
	
	@ElementMap(name = "dia", locatorType = ElementLocatorType.Id, locator = "entry.502536648_day")
	private Select dia;
	
	@ElementMap(name = "ano", locatorType = ElementLocatorType.Id, locator = "entry.502536648_year")
	private Select ano;
	
	@ElementMap(name = "Masculino", locatorType = ElementLocatorType.Id, locator = "group_1316821743_1")
	private Radio sexoMasculino;
		
	@ElementMap(name = "Feminino", locatorType = ElementLocatorType.Id, locator = "group_1316821743_2")
	private Radio sexoFeminino;
	
	@ElementMap(name = "estado civil", locatorType = ElementLocatorType.Id, locator = "entry_636900932")
	private Select estadoCivil;
	
	@ElementMap(name = "Internet", locatorType = ElementLocatorType.Id, locator = "group_1519677571_1")
	private CheckBox internet;
	
	@ElementMap(name = "TV", locatorType = ElementLocatorType.Id, locator = "group_1519677571_2")
	private CheckBox tv;
	
	@ElementMap(name = "Jornais e revistas", locatorType = ElementLocatorType.Id, locator = "group_1519677571_3")
	private CheckBox jer;
	
	@ElementMap(name = "Outra forma", locatorType = ElementLocatorType.Id, locator = "group_1519677571_4")
	private CheckBox oForma;
	
	@ElementMap(name = "Enviar", locatorType = ElementLocatorType.Id, locator = "ss-submit")
	private Button enviar;


}
