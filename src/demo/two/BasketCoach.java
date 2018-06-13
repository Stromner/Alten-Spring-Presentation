package demo.two;

public class BasketCoach implements Coach {
	private FortuneService fortuneService;
	
	public BasketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getName() {
		return "BasketCoach getName(): My name is Eva";
	}
	
	public String getFortune() {
		return "BasketCoach getFortune(): " + fortuneService.getFortune();
	}
}
