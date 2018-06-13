package demo.two;

public class SwimCoach implements Coach{
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getName() {
		return "SwimCoach getName(): My name is Adam";
	}
	
	public String getFortune() {
		return "SwimCoach getFortune(): " + fortuneService.getFortune();
	}
}
