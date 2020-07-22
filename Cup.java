package kitchen;

import liquids.Juice;

public class Cup {

	private Juice content;
	
	public Cup(){}

	public Cup(Juice content){
		setContent(content);
	}
	
	public Juice getContent() {
		return content;
	}

	public void setContent(Juice content) {
		if( content.equals(null))
			System.out.println("Uncorrect content name");
	    else
	    	this.content = content;
	}
	
	public void addContent(Juice content) {
			int previousContent = content.getVolume();
			this.content.setVolume(previousContent + this.content.getVolume());
		}
}
