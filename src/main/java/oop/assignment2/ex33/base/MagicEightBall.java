package oop.assignment2.ex33.base;

public class MagicEightBall {
	public int NEXT_RESPONSE;

	public final String[] RESPONSES_LIST= {
			"It is certain." ,
			"It is decidedly so." ,
			"Without a doubt." ,
			"Yes, definitely." ,
			"You may rely on it." ,
			"As I see it, yes." ,
			"Most likely." ,
			"Outlook good." ,
			"Yes." ,
			"Signs point to yes." ,
			"Reply hazy try again." ,
			"Ask again later." ,
			"Better not tell you now." ,
			"Cannot predict now." ,
			"Concentrate and ask again." ,
			"Don't count on it." ,
			"My reply is no." ,
			"My sources say no." ,
			"Outlook not so good." ,
			"Very doubtful." };


	public String response() {
		NEXT_RESPONSE = (int)(Math.random()*19);
		return RESPONSES_LIST[NEXT_RESPONSE];
	}
}
