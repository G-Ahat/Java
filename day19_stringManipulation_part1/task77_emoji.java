package day19_stringManipulation_part1;

public class task77_emoji {

	public static void main(String[] args) {
		//create an emoji program: if emoji has 2 characters
		//if it is not print "invalid emoji
		//valid emojis: starting with : => :) Smile, :(Sad, :/Upset, :p Playful, otherwise invalid
		// starting with ; => ;) Wink, ;0 Surprised, otherwise invalid
		
		String emoji=":)";
		if(emoji.length()!=2) {
			System.out.println("invalid emoji");
			return; //stop execution
		}
		//if codes reaches this point,then emoji is 2 chars
		//get first and second chars and assign to variables
		
		char first=emoji.charAt(0);
		char second=emoji.charAt(1);
		
		if(first==':') {
			if(second==')') {
				System.out.println("smile");
			}else if(second=='(') {
				System.out.println("sad");
			}else if(second=='/') {
				System.out.println("upset");
			}else if(second=='p') {
				System.out.println("playful");
			}else {
				System.out.println("invalid emoji");
			}
			
			}else if(first==';') {
				if(second==')') {
					System.out.println("wink");
				}else if(second=='0') {
					System.out.println("suprised");
				}else {
				System.out.println("unkmown emoji");
				}
			
			
			
			
			
		}else {
			System.out.println("invalid");
		}

	}

}
